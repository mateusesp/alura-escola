package escola.infra.aluno;

import escola.dominio.aluno.Aluno;
import escola.dominio.aluno.AlunoNaoEncontrado;
import escola.dominio.aluno.Cpf;
import escola.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCpf(Cpf cpf) {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
