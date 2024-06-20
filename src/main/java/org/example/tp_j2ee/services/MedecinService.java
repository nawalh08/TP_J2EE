package org.example.tp_j2ee.services;

import org.example.tp_j2ee.interfaces.Repository;
import org.example.tp_j2ee.model.Medecin;
import org.hibernate.query.Query;

import java.util.List;

public class MedecinService extends BaseService implements Repository {
    @Override
    public boolean create(Object o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Object o) {
        return false;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    public Medecin getByparams(String nom , String adresseMail , String motDePasse){
        session = sessionFactory.openSession();
        Medecin userFind = null ;
        Query<Medecin> usersQuery = session.createQuery("from Medecin where nom = :nom and adresseMail = :adresseMail and motDePasse= :motDePasse ");
        usersQuery.setParameter("nom", nom);
        usersQuery.setParameter("adresseMail", adresseMail);
        usersQuery.setParameter("motDePasse" , motDePasse);
        userFind = usersQuery.uniqueResult();
        session.close();
        return userFind;
    }

}
