package nl.cape.academy.solidprinciples.entities;

import java.util.UUID;

public class Student {
    private String emailAddress;
    private UUID universityId;
    private int monthlyEbookAllowance;
    private int currentlyBorrowedEbooks;

    public Student(String emailAddress, UUID universityId) {
        this.emailAddress = emailAddress;
        this.universityId = universityId;
        this.monthlyEbookAllowance = 0;
        this.currentlyBorrowedEbooks = 0;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public UUID getUniversityId() {
        return this.universityId;
    }

    public int getMonthlyEbookAllowance() {
        return this.monthlyEbookAllowance;
    }

    public void setMonthlyEbookAllowance(int allowance) {
        this.monthlyEbookAllowance = allowance;
    }

    public int getCurrentlyBorrowedEbooks() {
        return this.currentlyBorrowedEbooks;
    }
}
