package samucaguimaraes.apirestjava.repository;

import org.springframework.data.repository.CrudRepository;
import samucaguimaraes.apirestjava.model.PessoaModel;

public interface PessoaRepository extends CrudRepository<PessoaModel, Long> {

}
