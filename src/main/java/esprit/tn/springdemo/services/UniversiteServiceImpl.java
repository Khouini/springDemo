package esprit.tn.springdemo.services;

import esprit.tn.springdemo.entities.Universite;
import esprit.tn.springdemo.repositories.UniversiteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    private final UniversiteRepo universiteRepo;

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
}
