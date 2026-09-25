package aula_refeita_sb.techx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoResponse {
    private String nome;
    private String curso;
    private int ra;
}
