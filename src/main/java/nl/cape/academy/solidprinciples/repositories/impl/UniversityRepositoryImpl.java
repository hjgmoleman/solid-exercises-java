package nl.cape.academy.solidprinciples.repositories.impl;

import java.util.UUID;

import nl.cape.academy.solidprinciples.entities.University;
import nl.cape.academy.solidprinciples.repositories.UniversityReadRepository;

public class UniversityRepositoryImpl implements UniversityReadRepository {
    public University getById(UUID universityId) {
        throw new UnsupportedOperationException();
    }
}