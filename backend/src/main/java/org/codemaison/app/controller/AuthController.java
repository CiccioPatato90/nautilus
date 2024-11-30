package org.codemaison.app.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.codemaison.app.model.Nurse;
import org.codemaison.app.model.Utente;
import org.codemaison.app.service.AuthService;
import org.codemaison.app.service.NurseService;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import java.util.List;
import java.util.Map;

@Path("/login")
public class AuthController {
    @Inject
    AuthService authService; // Dependency injection can replace this.

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String login(@RequestBody Utente utente) {
        // Log or print the request data
        System.out.println("Received request: " + utente);
        int loginRes = authService.login(utente);
        // Return a response for testing
        return "{\"message\": \"Login request received!\"}";
    }
}
