public class FuncionarioException extends Exception{
    public FuncionarioException(String atividade) {
       super(atividade + " é uma atividade inválida! Atividades disponíveis são: Cozinheirx, Ajudante ou Equipe de Limpeza");
    }
}