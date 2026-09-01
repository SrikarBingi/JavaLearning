package com.hungrycoders;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

/**
 * @Service marks this class as a bean. Spring discovers it during component
 * scanning, creates a single instance, and stores it in the context.
 */
@Service
public class TaskService {
	
	// A thread-safe in-memory store. Replaced by a real database in Phase 3.
    private final Map<Long, Task> store = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(0);

    // In-memory data for now; a real database arrives in Phase 3.
//    private final List<Task> tasks = List.of(
//        new Task(1L, "Learn Inversion of Control", true),
//        new Task(2L, "Understand Dependency Injection", false),
//        new Task(3L, "Wire TaskFlow's first layers", false)
//    );

    public List<Task> findAll() {
        return List.copyOf(store.values());
    }
    
    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }
    
    public Task create(TaskRequest request) {
        long id = sequence.incrementAndGet();              // server assigns the id
        Task task = new Task(id, request.title(), request.completed());
        store.put(id, task);
        return task;
    }

    /** Full replacement. Returns empty if the task doesn't exist. */
    public Optional<Task> replace(Long id, TaskRequest request) {
        if (!store.containsKey(id)) {
            return Optional.empty();
        }
        Task updated = new Task(id, request.title(), request.completed());
        store.put(id, updated);
        return Optional.of(updated);
    }

    /** Returns true if something was actually removed. */
    public boolean delete(Long id) {
        return store.remove(id) != null;
    }
}
