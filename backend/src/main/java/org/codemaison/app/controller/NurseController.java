package org.codemaison.app.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.codemaison.app.model.Nurse;
import org.codemaison.app.service.NurseService;

import java.util.List;

@Path("/nurses")
public class NurseController {
    @Inject
    NurseService nurseService; // Dependency injection can replace this.

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Nurse> list() {
        List<Nurse> list = nurseService.getAllNurses();
        return list;
    }

    @POST
    @Path("/{nurseId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Nurse getById(@PathParam("nurseId") int nurseId) {
        return nurseService.getNurseById(nurseId);
    }


    /*@DELETE
    public Set<Nurse> delete(Nurse nurse) {
        return nurseService.deleteNurse(nurse);
    }*/
}
