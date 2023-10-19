package esprit.tn.springdemo.services;

import esprit.tn.springdemo.entities.Chambre;
import esprit.tn.springdemo.entities.Reservation;
import esprit.tn.springdemo.repositories.ChambreRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    ChambreRepo chambreRepo;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepo.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepo.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> getChambreByReservationAnneeUniversitaire(Date dateDebut, Date dateFin) {
        List<Chambre> chambres = null;
        for (Chambre c : chambreRepo.findAll()) {
            for (Reservation r : c.getReservations()) {
                if (r.getAnneeUniversitaire().after(dateDebut) && r.getAnneeUniversitaire().before(dateFin)) {
                    //return chambreRepo.findAll();
                    chambres.add(c);
                }
            }
        }
        return chambres;
    }


}
