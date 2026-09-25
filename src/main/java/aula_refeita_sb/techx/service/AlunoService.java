package aula_refeita_sb.techx.service;

import aula_refeita_sb.techx.dto.AlunoRequest;
import aula_refeita_sb.techx.model.Aluno;
import aula_refeita_sb.techx.repository.AlunoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> buscar(){
        return alunoRepository.findAll();
    }

    public void create(AlunoRequest alunoRequest){
        Aluno entity = new Aluno();
        BeanUtils.copyProperties(alunoRequest, entity);

        alunoRepository.save(entity);
    }

    public Aluno findById(Long id){
        return alunoRepository.findById(id).orElseThrow();
    }
}
