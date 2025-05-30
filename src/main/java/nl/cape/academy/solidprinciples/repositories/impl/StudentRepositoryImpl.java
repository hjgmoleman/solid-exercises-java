package nl.cape.academy.solidprinciples.repositories.impl;

import nl.cape.academy.solidprinciples.entities.Student;
import nl.cape.academy.solidprinciples.repositories.StudentRepository;

public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public void add(Student student) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean exists(String emailAddress) {
        throw new UnsupportedOperationException();
    }
}