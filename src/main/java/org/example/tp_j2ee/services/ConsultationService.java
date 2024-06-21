package org.example.tp_j2ee.services;

import org.example.tp_j2ee.interfaces.ConsultationRepository;
import org.example.tp_j2ee.interfaces.Repository;
import org.example.tp_j2ee.model.Consultation;

import java.sql.SQLException;
import java.util.List;

public class ConsultationService extends BaseService implements Repository {

    private ConsultationRepository consultationRepository = new ConsultationRepository();
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

        return consultationRepository.findById(id);
    }

    @Override
    public List findAll() {
        return null;
    }
}
