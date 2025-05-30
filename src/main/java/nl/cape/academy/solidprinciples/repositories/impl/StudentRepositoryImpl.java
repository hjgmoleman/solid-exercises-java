package nl.cape.academy.solidprinciples.repositories.impl;

import nl.cape.academy.solidprinciples.entities.Student;
import nl.cape.academy.solidprinciples.repositories.StudentReadRepository;
import nl.cape.academy.solidprinciples.repositories.StudentWriteRepository;

public class StudentRepositoryImpl implements StudentReadRepository, StudentWriteRepository {
    @Override
    public void add(Student student) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean exists(String emailAddress) {
        throw new UnsupportedOperationException();
    }
}