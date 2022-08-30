import escola.aplicacao.matricular.MatricularAluno;
import escola.aplicacao.matricular.MatricularAlunoDto;
import escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class Application {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.executa(new MatricularAlunoDto(nome, cpf, email));
    }
}
