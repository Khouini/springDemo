package esprit.tn.springdemo.controllers;

import esprit.tn.springdemo.entities.Bloc;
import esprit.tn.springdemo.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blocs")
@AllArgsConstructor
public class BlocController {
    private final IBlocService iBlocService;

    @GetMapping("")
    public List<Bloc> getBlocs() {
        return iBlocService.retrieveBlocs();
    }

    @PostMapping("")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        System.out.println("bloc = " + bloc.getNom());
        return iBlocService.addBloc(bloc);
    }
}
