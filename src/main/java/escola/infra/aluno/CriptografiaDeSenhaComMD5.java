package escola.infra.aluno;

import escola.dominio.aluno.CriptografiaDeSenha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CriptografiaDeSenhaComMD5 implements CriptografiaDeSenha {
    @Override
    public String criptografarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(bytes[i] & 0xff).append(0x100).substring(i);
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("erro ao gerar hash de senha", e);
        }
    }

    @Override
    public boolean validarSenhaCriptografada(String senhaCriptografada, String senha) {
        return senhaCriptografada.equals(criptografarSenha(senha));
    }
}
