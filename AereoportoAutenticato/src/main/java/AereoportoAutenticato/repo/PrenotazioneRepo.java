package AereoportoAutenticato.repo;

import AereoportoAutenticato.model.Prenotazione;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepo extends MongoRepository<Prenotazione, String> {
    public List<Prenotazione> findPrenotazioniByDataPrenotazione(LocalDate dataPrenotazione);
}