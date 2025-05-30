package nl.cape.academy.solidprinciples.services;

import nl.cape.academy.solidprinciples.entities.Student;
import nl.cape.academy.solidprinciples.entities.University;

public interface StudentFactory {
    Student createStudent(String emailAddress, University university);
}