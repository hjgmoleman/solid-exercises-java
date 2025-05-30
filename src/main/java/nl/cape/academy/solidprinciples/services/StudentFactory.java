package nl.cape.academy.solidprinciples.services;

import nl.cape.academy.solidprinciples.entities.PremiumStudent;
import nl.cape.academy.solidprinciples.entities.StandardStudent;
import nl.cape.academy.solidprinciples.entities.Student;
import nl.cape.academy.solidprinciples.entities.University;
import nl.cape.academy.solidprinciples.entities.UniversityPackage;

public class StudentFactory {
    public Student createStudent(String emailAddress, University university) {
        UniversityPackage universityPackage = university.getUniversityPackage();

        if (universityPackage == UniversityPackage.PREMIUM) {
            return new PremiumStudent(emailAddress, university.getId());
        }

        return new StandardStudent(emailAddress, university.getId());
    }
}
