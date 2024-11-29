package org.codemaison.app.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import org.codemaison.app.model.Reparti;
import org.codemaison.app.service.RepartiService;

@Path("/reparti")
public class RepartiController {
    @Inject
    RepartiService repartiService; // Dependency injection can replace this.

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reparti> list() {
        return repartiService.getAllReparti();
    }

    @POST
    @Path("/{repartoId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Reparti getById(@PathParam("repartoId") int repartoId) {
        return repartiService.getRepartoById(repartoId);
    }


    /*@POST
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Reparti getById(String name) {
        Optional<Reparti> reparto = repartiService.getRepartoByName(name);
        if (reparto.isPresent()) {
            System.out.println("FOUND" + reparto.get().getName());
            return reparto.get();
        }else{
            System.out.println("NOTHING FOUND");
            return null;
        }
    }*/
}
