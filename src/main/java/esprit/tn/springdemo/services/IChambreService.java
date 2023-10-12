package esprit.tn.springdemo.services;

import esprit.tn.springdemo.entities.Chambre;

import java.util.List;

public interface IChambreService {

    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c); // ajouter l’équipe avec son détail

    Chambre updateChambre(Chambre c);

    Chambre retrieveChambre(long idChambre);

}