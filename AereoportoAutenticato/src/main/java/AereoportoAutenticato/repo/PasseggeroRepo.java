package AereoportoAutenticato.repo;

import AereoportoAutenticato.model.Passeggero;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasseggeroRepo extends MongoRepository<Passeggero, String> {
    Passeggero findPasseggeroByEmail(String email);
}
