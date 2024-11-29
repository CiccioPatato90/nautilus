package org.codemaison.app.Repository;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.codemaison.app.model.Nurse;

import java.util.List;

import static io.quarkus.hibernate.orm.panache.PanacheEntityBase.find;

// Repository Pattern
@ApplicationScoped
public class NurseRepository implements PanacheRepository<Nurse> {

    public List<Nurse> list() {
        return listAll();
    }

    public Nurse findById(int id) {
        return find("id", id).firstResult();
    }
}
