package exemplointegracao.aula2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "usuario", url = "http://localhost:8080/usuario")
public interface UsuarioAula1 {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    UsuarioResponse retornaUsuario();
}
