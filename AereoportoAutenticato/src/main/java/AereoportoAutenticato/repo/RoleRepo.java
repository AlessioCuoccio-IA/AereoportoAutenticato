package AereoportoAutenticato.repo;

import AereoportoAutenticato.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepo extends MongoRepository<Role, String> {
    Role findByNome(String nome);
}
