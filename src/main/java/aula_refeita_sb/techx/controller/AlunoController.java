package aula_refeita_sb.techx.controller;

import aula_refeita_sb.techx.dto.AlunoRequest;
import aula_refeita_sb.techx.dto.AlunoResponse;
import aula_refeita_sb.techx.model.Aluno;
import aula_refeita_sb.techx.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/aluno")


public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> getALL(){
        return alunoService.buscar();
    }

    @PostMapping
    public void create(@RequestBody AlunoRequest alunoRequest){
        alunoService.create(alunoRequest);
    }

    @GetMapping("/{id}")
    public AlunoResponse getById(@PathVariable Long id){
        Aluno aluno = alunoService.findById(id);

        return new AlunoResponse(
                aluno.getNome(),
                aluno.getCurso(),
                aluno.getRa()
        );
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id,
                       @RequestBody AlunoRequest alunoRequest){
        alunoService.uptade(id, alunoRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        alunoService.deleteById(id);
    }
}
