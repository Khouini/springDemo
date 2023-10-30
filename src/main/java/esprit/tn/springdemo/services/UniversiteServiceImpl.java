package esprit.tn.springdemo.services;

import esprit.tn.springdemo.entities.Foyer;
import esprit.tn.springdemo.entities.Universite;
import esprit.tn.springdemo.repositories.FoyerRepo;
import esprit.tn.springdemo.repositories.UniversiteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    private final UniversiteRepo universiteRepo;
    private final FoyerRepo foyerRepo;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepo.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return universiteRepo.findById(idUniversity).orElse(null);
    }

    @Override
    public Universite affectFoyer(long idUniversity, long idFoyer) {
        Universite universite = retrieveUniversity(idUniversity);
        if (universite == null) return null;
        Foyer foyer = foyerRepo.findById(idFoyer).orElse(null);
        if (foyer == null) return null;
        foyer.setUniversite(universite);
        Foyer updatedFoyer = foyerRepo.save(foyer);
        System.out.println("updatedFoyer = " + updatedFoyer);
        Universite updatedUniversite = universiteRepo.getById(idUniversity);
        System.out.println("updatedUniversite = " + updatedUniversite);
        return updatedUniversite;
    }
}
