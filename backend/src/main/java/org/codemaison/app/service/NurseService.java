package org.codemaison.app.service;

import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.codemaison.app.Repository.NurseRepository;
import org.codemaison.app.model.Nurse;

import java.util.*;
import java.util.stream.Collectors;

@ApplicationScoped
public class NurseService {
    @Inject
    JPAStreamer jpaStreamer;

    @Inject
    NurseRepository nurseRepository;

    public List<Nurse> getAllNurses() {
        return jpaStreamer.stream(Nurse.class)
                .collect(Collectors.toList());
    }

    public Nurse getNurseById(int nurseId) {
        /*return jpaStreamer.stream(Nurse.class)
                        .filter(Nurse$.id.equal(nurseId))
                        .findFirst();*/

        return nurseRepository.findById(nurseId);
    }

    /*public Set<Nurse> addNurse(Nurse nurse) {
        nurses.add(nurse);
        return nurses;
    }

    public Set<Nurse> deleteNurse(Nurse nurse) {
        nurses.removeIf(existingNurse -> existingNurse.getFirstName().contentEquals(nurse.getFirstName()));
        return nurses;
    }*/
}
