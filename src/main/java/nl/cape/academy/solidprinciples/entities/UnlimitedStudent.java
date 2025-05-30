package nl.cape.academy.solidprinciples.entities;

import java.util.UUID;

public class UnlimitedStudent extends Student {
    
    public UnlimitedStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
        setMonthlyEbookAllowance(0);
    }

    @Override
    public void addBonusAllowance() {
        throw new UnsupportedOperationException("A bonus on the monthly allowance is not applicable to an unlimited student.");
    }
}
