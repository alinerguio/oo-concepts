public class Funcionario {
  public String nome;
  public String atividade; 

  public Funcionario (String nome, String atividade) {
    this.nome = nome;
    this.atividade = atividade;
    try {
      setAtividade(atividade);
    } catch (FuncionarioException e) {
      System.out.println(e);
    } 
  }

  public void setAtividade(String valorAtividade) throws FuncionarioException{
    if (valorAtividade == "Cozinheirx" || valorAtividade == "Ajudante" || valorAtividade == "Equipe de Limpeza") {
      atividade = valorAtividade;
    } else {
      throw new FuncionarioException(valorAtividade);
    }   
  }

}