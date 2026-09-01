package com.hungrycoders;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * @RequestMapping("/tasks") sets the base path for every method here, so each
 * mapping below is relative to /tasks. This keeps the controller DRY.
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    /** Constructor injection: Spring supplies the managed TaskService bean. */
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /** GET /tasks — return the whole collection. */
    @GetMapping
    public List<Task> list() {
        return taskService.findAll();
    }
    
    /** GET /tasks/{id} — return one task, or 404 if it doesn't exist. */
    @GetMapping("/{id}")
    public ResponseEntity<Task> getOne(@PathVariable Long id){
    	return taskService.findById(id)
    			.map(ResponseEntity::ok)
    			.orElse(ResponseEntity.notFound().build());
    }
    
    /** POST /tasks — create a task, return 201 with a Location header. */
    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskRequest request) {
        Task created = taskService.create(request);
        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(created.id())
            .toUri();                                        // e.g. /tasks/1
        return ResponseEntity.created(location).body(created);
    }

    /** PUT /tasks/{id} — replace a task entirely, or 404 if it doesn't exist. */
    @PutMapping("/{id}")
    public ResponseEntity<Task> replace(@PathVariable Long id,
                                        @RequestBody TaskRequest request) {
        return taskService.replace(id, request)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    /** DELETE /tasks/{id} — remove a task, return 204, or 404 if absent. */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return taskService.delete(id)
            ? ResponseEntity.noContent().build()             // 204 No Content
            : ResponseEntity.notFound().build();             // 404
    }
}
