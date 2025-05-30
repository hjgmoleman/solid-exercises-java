package nl.cape.academy.solidprinciples.entities;

import java.util.UUID;

public class UnlimitedStudent extends Student {
    
    public UnlimitedStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
        setMonthlyEbookAllowance(0);
    }
}
