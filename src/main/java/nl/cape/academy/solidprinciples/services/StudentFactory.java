package nl.cape.academy.solidprinciples.services;

import nl.cape.academy.solidprinciples.entities.University;
import nl.cape.academy.solidprinciples.entities.Student;

public class StudentFactory {
    public Student createStudent(String emailAddress, University university) {
        return new Student(emailAddress, university.getId(), university.getUniversityPackage());
    }
}
