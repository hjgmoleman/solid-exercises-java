package nl.cape.academy.solidprinciples.services;

import java.util.List;

import nl.cape.academy.solidprinciples.entities.Student;

public interface StudentQueryService {
    List<Student> getStudentsByUniversity();
    List<Student> getStudentsByCurrentlyBorrowedEbooks();
    List<Student> getStudents();
}