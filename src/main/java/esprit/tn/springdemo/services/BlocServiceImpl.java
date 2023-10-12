package esprit.tn.springdemo.services;

import esprit.tn.springdemo.entities.Bloc;

import java.util.List;

public class BlocServiceImpl implements IBlocService {
    IBlocService blocService;

    @Override
    public List<Bloc> retrieveBlocs() {
        return blocService.retrieveBlocs();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocService.removeBloc(idBloc);
    }
}
