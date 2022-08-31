package br.com.alura.escola.dominio.aluno;

public class LimiteTelefones extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LimiteTelefones() {
        super("Limite maximo de telefones atingido");
    }

}
