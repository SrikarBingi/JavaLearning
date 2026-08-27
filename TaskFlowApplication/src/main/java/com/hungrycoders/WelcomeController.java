package com.hungrycoders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Our first controller. A controller handles incoming web requests
 * and decides what to send back.
 *
 * @RestController tells Spring two things:
 *   1. This class handles web requests (it's a "controller").
 *   2. The return value of each method should be written directly into
 *      the HTTP response body (typically as JSON), rather than being
 *      treated as the name of a page to render.
 */

@RestController
public class WelcomeController {
	
	 /**
     * A record is a compact way to declare an immutable data class.
     * In one line we get fields, a constructor, getters, equals, hashCode,
     * and toString. We'll use records heavily for API responses later.
     */
    public record WelcomeResponse(String application, String status, String message) {}

    /**
     * Returns structured data instead of plain text.
     *
     * Because this is a @RestController, Spring Boot automatically converts
     * the returned record into JSON. This conversion happening for free is
     * an example of auto-configuration at work: the web starter brought in
     * a JSON library and Boot wired it up without any setup from us.
     */
    @GetMapping("/")
    public WelcomeResponse welcome() {
        return new WelcomeResponse(
            "TaskFlow",
            "running",
            "Welcome! Your Spring Boot foundation is ready."
        );
    }
	
}
