package nl.cape.academy.solidprinciples.services;

import java.util.UUID;

public interface StudentPersistService {
    boolean add(String emailAddress, UUID universityId);
}