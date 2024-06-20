package org.example.tp_j2ee.services;

import org.example.tp_j2ee.interfaces.Repository;
import org.example.tp_j2ee.model.Patient;

import org.hibernate.query.Query;
import java.util.List;

public class PatientService extends BaseService implements Repository<Patient> {

    public PatientService(){
        super();
    }

    @Override
    public boolean create(Patient o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Patient o) {
        return false;
    }

    @Override
    public boolean delete(Patient o) {
        return false;
    }

    @Override
    public Patient findById(int id) {
        return null;
    }

    @Override
    public List<Patient> findAll() {
        List<Patient> patientList = null;
        session = sessionFactory.openSession();
        Query<Patient> patientQuery = session.createQuery("from Patient ");
        patientList = patientQuery.list();
        session.close();
        return patientList;
    }
}
