package com.hungrycoders;

/** What a client sends to create or replace a task. No id — the server owns that. */
public record TaskRequest(String title, boolean completed) {}
