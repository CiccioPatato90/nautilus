package org.codemaison.app.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.codemaison.app.Repository.UtentiRepository;
import org.codemaison.app.model.Utente;

import java.beans.Transient;
import java.util.Map;

@ApplicationScoped
public class AuthService {
    @Inject
    UtentiRepository utentiRepository;

    @Transactional
    public int login(Utente utente){
        Utente res = utentiRepository.findByName(utente.getFirstName());

        if(res==null){
//            Utente ut = new Utente();
//            ut.setFirstName(utente.getFirstName());
//            ut.setLastName(utente.getLastName());
//            ut.setPassword(utente.getPassword());
//            ut.setEmail(utente.get("password"));
//            utentiRepository.add(ut);
//            return 1;
            return 0;
        }else {
            return res.getId();
        }
    }
}
