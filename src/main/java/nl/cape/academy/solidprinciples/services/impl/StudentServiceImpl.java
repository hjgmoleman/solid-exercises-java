package nl.cape.academy.solidprinciples.services.impl;

import java.util.List;
import java.util.UUID;

import nl.cape.academy.solidprinciples.entities.LimitedStudent;
import nl.cape.academy.solidprinciples.entities.Student;
import nl.cape.academy.solidprinciples.entities.University;
import nl.cape.academy.solidprinciples.repositories.UniversityReadRepository;
import nl.cape.academy.solidprinciples.repositories.impl.StudentRepositoryImpl;
import nl.cape.academy.solidprinciples.repositories.impl.UniversityRepositoryImpl;
import nl.cape.academy.solidprinciples.services.Logger;
import nl.cape.academy.solidprinciples.services.StudentAllowanceService;
import nl.cape.academy.solidprinciples.services.StudentFactory;
import nl.cape.academy.solidprinciples.services.StudentPersistService;
import nl.cape.academy.solidprinciples.services.StudentQueryService;

public class StudentServiceImpl implements StudentQueryService, StudentPersistService, StudentAllowanceService {
    public boolean add(String emailAddress, UUID universityId) {       
        Logger logger = new Logger();
        logger.logMessage("Log: Start add student with email '%s'", emailAddress);
 
        if ("".equals(emailAddress) || emailAddress == null) {
            return false;
        }
 
        StudentRepositoryImpl studentRepository = new StudentRepositoryImpl();
        if (studentRepository.exists(emailAddress)) {
            return false;
        }
 
        UniversityReadRepository universityRepository = new UniversityRepositoryImpl();
        University university = universityRepository.getById(universityId);
 
        StudentFactory studentFactory = new StudentFactory();
        Student student = studentFactory.createStudent(emailAddress, university);
         
        studentRepository.add(student);
 
        logger.logMessage("Log: End add student with email '%s'", emailAddress);
 
        return true;
    }
    
    @Override
    public void addBonusAllowances() {
        for (Student student : getStudents()) {
            if (student instanceof LimitedStudent) {
                LimitedStudent limitedStudent = (LimitedStudent)student;
                limitedStudent.addBonusAllowance();
            }
        }
    }

    @Override
    public List<Student> getStudentsByUniversity() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Student> getStudentsByCurrentlyBorrowedEbooks() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Student> getStudents() {
        throw new UnsupportedOperationException();
    }
}