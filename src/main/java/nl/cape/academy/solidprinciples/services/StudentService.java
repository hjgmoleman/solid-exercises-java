package nl.cape.academy.solidprinciples.services;

import java.util.List;
import java.util.UUID;

import nl.cape.academy.solidprinciples.entities.LimitedStudent;
import nl.cape.academy.solidprinciples.entities.Student;
import nl.cape.academy.solidprinciples.entities.University;
import nl.cape.academy.solidprinciples.repositories.StudentRepository;
import nl.cape.academy.solidprinciples.repositories.UniversityRepository;

public class StudentService {
    public boolean add(String emailAddress, UUID universityId) {       
        Logger logger = new Logger();
        logger.logMessage("Log: Start add student with email '%s'", emailAddress);
 
        if ("".equals(emailAddress) || emailAddress == null) {
            return false;
        }
 
        StudentRepository studentRepository = new StudentRepository();
        if (studentRepository.exists(emailAddress)) {
            return false;
        }
 
        UniversityRepository universityRepository = new UniversityRepository();
        University university = universityRepository.getById(universityId);
 
        StudentFactory studentFactory = new StudentFactory();
        Student student = studentFactory.createStudent(emailAddress, university);
         
        studentRepository.add(student);
 
        logger.logMessage("Log: End add student with email '%s'", emailAddress);
 
        return true;
    }
    
    public void addBonusAllowances() {
        for (Student student : getStudents()) {
            if (student instanceof LimitedStudent) {
                LimitedStudent limitedStudent = (LimitedStudent)student;
                limitedStudent.addBonusAllowance();
            }
        }
    }

    public List<Student> getStudentsByUniversity() {
        throw new UnsupportedOperationException();
    }
 
    public List<Student> getStudentsByCurrentlyBorrowedEbooks() {
        throw new UnsupportedOperationException();
    }

    public List<Student> getStudents() {
        throw new UnsupportedOperationException();
    }
}
