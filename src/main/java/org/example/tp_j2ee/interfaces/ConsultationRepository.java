package org.example.tp_j2ee.interfaces;

import jakarta.transaction.Transaction;
import org.example.tp_j2ee.model.Consultation;

import java.util.List;

public class ConsultationRepository extends Repository<Consultation> {
    public ConsultationRepository() {
        super();
    }


    @Override
    public boolean create(Consultation o) {
        return false;
    }

    @Override
    public boolean update(Consultation o) {
        return false;
    }

    @Override
    public boolean delete(Consultation o) {
        return false;
    }

    @Override
    public Consultation findById(int id) {
        return null;
    }

    @Override
    public List<Consultation> findAll() {
        return List.of();
    }
}
