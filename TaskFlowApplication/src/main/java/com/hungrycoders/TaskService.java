package com.hungrycoders;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @Service marks this class as a bean. Spring discovers it during component
 * scanning, creates a single instance, and stores it in the context.
 */
@Service
public class TaskService {

    // In-memory data for now; a real database arrives in Phase 3.
    private final List<Task> tasks = List.of(
        new Task(1L, "Learn Inversion of Control", true),
        new Task(2L, "Understand Dependency Injection", false),
        new Task(3L, "Wire TaskFlow's first layers", false)
    );

    public List<Task> getAllTasks() {
        return tasks;
    }
}
