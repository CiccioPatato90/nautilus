package org.codemaison.app.service;

import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.codemaison.app.Repository.RepartiRepository;
import org.codemaison.app.model.Reparti;

import java.util.List;

@ApplicationScoped
public class RepartiService {
    @Inject
    JPAStreamer jpaStreamer;

    @Inject
    RepartiRepository repartiRepository;

    public List<Reparti> getAllReparti() {
        return repartiRepository.list();
    }

    public Reparti getRepartoById(int repartoId) {
        return repartiRepository.findById(repartoId);
    }

    /*public Optional<Set<Reparti>> getAllReparti() {
        return Optional.of(jpaStreamer.stream(Reparti.class)
                .collect(Collectors.toSet()));
    }

    public Optional<Reparti> getRepartoById(int repartoId) {
        return jpaStreamer.stream(Reparti.class)
                .filter(Reparti$.id.equal(repartoId))
                .findFirst();
    }*/
}