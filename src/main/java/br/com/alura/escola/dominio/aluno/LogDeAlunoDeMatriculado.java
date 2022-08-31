package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;
import br.com.alura.escola.dominio.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoDeMatriculado extends Ouvinte {

    @Override
    protected void reageAo(Evento evento) {
        String momentoFormatado = ((AlunoMatriculado) evento).getMomento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.printf("Aluno com %s matriculado em: %s", ((AlunoMatriculado) evento).getCpfDoAluno(), momentoFormatado);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
