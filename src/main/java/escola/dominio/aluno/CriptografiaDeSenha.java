package escola.dominio.aluno;

public interface CriptografiaDeSenha {

    String criptografarSenha(String senha);

    boolean validarSenhaCriptografada(String senhaCriptografada, String senha);
}
