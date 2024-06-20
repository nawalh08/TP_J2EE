package org.example.tp_j2ee.services;

import org.example.tp_j2ee.interfaces.Repository;

import java.util.List;

public class ConsultationService extends BaseService implements Repository {
    @Override
    public boolean create(Object o) {
        return false;
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
}
