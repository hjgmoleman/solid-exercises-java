package nl.cape.academy.solidprinciples.entities;

import java.util.UUID;

public abstract class LimitedStudent extends Student {
    public LimitedStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
    }

    public abstract void addBonusAllowance();
}
