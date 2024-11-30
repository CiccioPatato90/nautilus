package org.codemaison.app.Repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.codemaison.app.model.Reparti;
import org.codemaison.app.model.Utente;

import java.util.List;

@ApplicationScoped
public class UtentiRepository implements PanacheRepository<Utente> {
    public List<Utente> list() {
        return listAll();
    }

    public void save(Utente utente) {}

    public Utente findById(int id) {
        return find("id", id).firstResult();
    }

    public Utente findByName(String name) {
        return find("firstName", name).firstResult();
    }

    public void add(Utente ut) {
        persist(ut);
    }
}
