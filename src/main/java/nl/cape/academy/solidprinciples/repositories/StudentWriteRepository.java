package nl.cape.academy.solidprinciples.repositories;

import nl.cape.academy.solidprinciples.entities.Student;

public interface StudentWriteRepository {
    void add(Student student);
}