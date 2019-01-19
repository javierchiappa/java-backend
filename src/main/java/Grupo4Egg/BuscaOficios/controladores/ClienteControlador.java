
package Grupo4Egg.BuscaOficios.controladores;

import Grupo4Egg.BuscaOficios.Cliente;
import Grupo4Egg.BuscaOficios.repositorios.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/cliente")
public class ClienteControlador {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @GetMapping("/inicio")
    public ModelAndView inicio(@RequestParam(required=false) Integer idCliente) {
        Cliente cliente = new Cliente();
        if(idCliente != null) {
            cliente = clienteRepository.findById(idCliente).get();
        }
        
        ModelAndView modelo = new ModelAndView();
        modelo.setViewName("cliente-formulario.html");
        modelo.addObject("cliente", cliente);
        return modelo;
    }
    
    @GetMapping("/listado")
    public ModelAndView listado() {
        ModelAndView modelo = new ModelAndView();
        
        List<Cliente> clientes = clienteRepository.findAll();
        modelo.addObject("clientes", clientes);
        modelo.setViewName("cliente-listado.html");
        
        return modelo;
    }
}
