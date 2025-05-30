package nl.cape.academy.solidprinciples.repositories;

public interface StudentReadRepository {
    boolean exists(String emailAddress);
}