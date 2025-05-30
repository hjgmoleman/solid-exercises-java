package nl.cape.academy.solidprinciples.services;

import nl.cape.academy.solidprinciples.entities.Student;
import nl.cape.academy.solidprinciples.entities.University;

public class StudentFactory {
    public Student createStudent(String emailAddress, University university) {
        return new Student(emailAddress, university.getId(), university.getUniversityPackage());
    }
}
