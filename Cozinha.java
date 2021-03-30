import java.util.List;
import java.util.ArrayList;

public class Cozinha {
  public int horaAbertura;
  public int horaFechamento;
  public String pratoPrincipal;
  public List<Ingrediente> listaIngredientes;
  public List<Funcionario> listaFuncionarios;

  public Cozinha(int horaAbertura, int horaFechamento, String pratoPrincipal){
    this.horaAbertura = horaAbertura;
    this.horaFechamento = horaFechamento;
    this.pratoPrincipal = pratoPrincipal;
    listaIngredientes = new ArrayList(); 
    listaFuncionarios = new ArrayList(); 
  }

  public void inserirIngrediente(Ingrediente ingrediente) {
    listaIngredientes.add(ingrediente);
  }

  public void inserirFuncionario(Funcionario funcionario) {
    listaFuncionarios.add(funcionario); 
  }

  private void imprimirFuncionarios() {
    for(Funcionario func: listaFuncionarios) {
      System.out.println("Nome: " + func.nome);
      System.out.println("Atividade: " + func.atividade);
    }
  }

  private void imprimirIngredientes() {
    for(Ingrediente ingr: listaIngredientes) {
      System.out.println("Nome: " + ingr.nome);
      System.out.println("Data de Validade: " + ingr.dataValidade);
    }
  }

  public void imprimirDados(){
    System.out.println("Hora da Abertura: " + horaAbertura);
    System.out.println("Hora de Fechamento: " + horaFechamento);
    System.out.println("Prato Principal: " + pratoPrincipal);
    System.out.println("Lista de Ingredientes: ");
    imprimirIngredientes();
    System.out.println("Lista de Funcionarios: ");
    imprimirFuncionarios();
    System.out.println("");
  }
}
