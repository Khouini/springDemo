package esprit.tn.springdemo.controllers;

import esprit.tn.springdemo.entities.Chambre;
import esprit.tn.springdemo.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambres")
@AllArgsConstructor
public class ChambreController {
    private final IChambreService iChambreService;

    @GetMapping("")
    public List<Chambre> retrieveAllChambres() {
        return iChambreService.retrieveAllChambres();
    }

    @PostMapping("")
    public Chambre addChambre(@RequestBody Chambre c) {
        return iChambreService.addChambre(c);
    }

    @PutMapping("")
    public Chambre updateChambre(@RequestBody Chambre c) {
        return iChambreService.updateChambre(c);
    }

    @GetMapping("/{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre) {
        return iChambreService.retrieveChambre(idChambre);
    }
}