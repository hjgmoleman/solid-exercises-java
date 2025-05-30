package nl.cape.academy.solidprinciples.entities;

import java.util.UUID;

public class PremiumStudent extends LimitedStudent {
    public PremiumStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
        this.setMonthlyEbookAllowance(STANDARD_ALLOWANCE * 2);
    }

    @Override
    public void addBonusAllowance() {
        this.setMonthlyEbookAllowance(this.getMonthlyEbookAllowance() + 10);
    }
}
