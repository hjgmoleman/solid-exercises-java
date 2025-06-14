package nl.cape.academy.solidprinciples.services;

import java.util.List;
import java.util.UUID;

import nl.cape.academy.solidprinciples.entities.Student;
import nl.cape.academy.solidprinciples.entities.University;
import nl.cape.academy.solidprinciples.entities.UniversityPackage;
import nl.cape.academy.solidprinciples.repositories.StudentRepository;
import nl.cape.academy.solidprinciples.repositories.UniversityRepository;

public class StudentService {
    public boolean add(String emailAddress, UUID universityId) {
        System.console().writer().println(String.format("Log: Start add student with email '%s'", emailAddress));
 
        if ("".equals(emailAddress) || emailAddress == null) {
            return false;
        }
 
        StudentRepository studentRepository = new StudentRepository();
        if (studentRepository.exists(emailAddress)) {
            return false;
        }
 
        UniversityRepository universityRepository = new UniversityRepository();
        University university = universityRepository.getById(universityId);
 
        Student student = new Student(emailAddress, universityId);
         
        if (university.getUniversityPackage() == UniversityPackage.STANDARD) {
            student.setMonthlyEbookAllowance(10);
        } else if (university.getUniversityPackage() == UniversityPackage.PREMIUM) {
            student.setMonthlyEbookAllowance(10 * 2);
        }
         
        studentRepository.add(student);
 
        System.console().writer().println(String.format("Log: End add student with email '%s'", emailAddress));
 
        return true;
    }
     
    public List<Student> getStudentsByUniversity() {
        throw new UnsupportedOperationException();
    }
 
    public List<Student> getStudentsByCurrentlyBorrowedEbooks() {
        throw new UnsupportedOperationException();
    }
}
