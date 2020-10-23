package exemplointegracao.aula2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioResponse {

    private Long id;
    private String nome;
    private int idade;
}
