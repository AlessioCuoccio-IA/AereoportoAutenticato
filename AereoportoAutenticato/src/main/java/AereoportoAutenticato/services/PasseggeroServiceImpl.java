package AereoportoAutenticato.services;

import AereoportoAutenticato.model.Passeggero;
import AereoportoAutenticato.repo.PasseggeroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasseggeroServiceImpl implements PasseggeroService {
    private final PasseggeroRepo passeggeroRepository;

    @Autowired
    public PasseggeroServiceImpl(PasseggeroRepo passeggeroRepository) {
        this.passeggeroRepository = passeggeroRepository;
    }

    @Override
    public List<Passeggero> getPasseggeri() {
        return passeggeroRepository.findAll();
    }

    @Override
    public Passeggero getPasseggeroByEmail(String email) {
        return passeggeroRepository.findPasseggeroByEmail(email);
    }

    @Override
    public void deletePasseggero(String idPasseggero) {
        passeggeroRepository.deleteById(idPasseggero);
    }

    @Override
    public void savePasseggero(Passeggero passeggero) {
        passeggeroRepository.save(passeggero);
    }
}
