package nl.cape.academy.solidprinciples.repositories;

import java.util.UUID;

import nl.cape.academy.solidprinciples.entities.University;

public interface UniversityReadRepository {
    University getById(UUID universityId);
}