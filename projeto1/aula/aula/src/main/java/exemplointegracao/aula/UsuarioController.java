package exemplointegracao.aula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @GetMapping
    public UsuarioResponse retornaUsuario(){
        return UsuarioResponse.builder().id(1L).nome("Nataniel Paiva").idade(29).build();
    }

}
