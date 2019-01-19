
package Grupo4Egg.BuscaOficios.repositorios;

import Grupo4Egg.BuscaOficios.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
