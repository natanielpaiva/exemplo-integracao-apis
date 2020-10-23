package exemplointegracao.aula2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario2")
public class UsuarioController {

    @Autowired
    UsuarioAula1 usuarioAula1;

    @GetMapping
    public UsuarioResponse retornaUsuario(){
        return usuarioAula1.retornaUsuario();
    }

}
