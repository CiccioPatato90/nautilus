package org.codemaison.app.Repository;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.codemaison.app.model.Reparti;

import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.find;

// Repository Pattern
@ApplicationScoped
public class RepartiRepository implements PanacheRepository<Reparti> {
    public List<Reparti> list() {
        return listAll();
    }

    public Reparti findById(int id) {
        return find("id", id).firstResult();
    }
}