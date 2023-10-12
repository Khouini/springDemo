package esprit.tn.springdemo.services;

import esprit.tn.springdemo.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversities();

    Universite addUniversity(Universite u);

    Universite updateUniversity(Universite u);

    Universite retrieveUniversity(long idUniversity);
}
