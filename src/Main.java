class Main {
  public static void main(String[] args) {
   // construção da Cozinha Mineira com informações básicas 
    Cozinha cozMin = new Cozinha(14, 20, "Feijoada");

    // ingredientes 
    cozMin.inserirIngrediente(new Ingrediente("Feijão", "02/04/2021"));
    cozMin.inserirIngrediente(new Ingrediente("Farinha", "02/04/2021"));
    cozMin.inserirIngrediente(new Ingrediente("Arroz", "31/12/2021"));
    cozMin.inserirIngrediente(new Ingrediente("Carne de Porco", "29/03/2021"));
    cozMin.inserirIngrediente(new Ingrediente("Linguiça", "29/03/2021"));

    // funcionários
    cozMin.inserirFuncionario(new Funcionario("José", "Cozinheirx"));
    cozMin.inserirFuncionario(new Funcionario("Maria", "Ajudante"));
    cozMin.inserirFuncionario(new Funcionario("João", "Ajudante"));
    cozMin.inserirFuncionario(new Funcionario("Luiz", "Equipe de Limpeza"));

    // construção da Cozinha Chinesa com informações básicas 
    Cozinha cozChi = new Cozinha(10, 21, "Yakissoba");

    // ingredientes 
    cozChi.inserirIngrediente(new Ingrediente("Champignon", "02/04/2021"));
    cozChi.inserirIngrediente(new Ingrediente("Brócolis", "02/04/2021"));
    cozChi.inserirIngrediente(new Ingrediente("Macarrão", "31/12/2021"));
    cozChi.inserirIngrediente(new Ingrediente("Carne", "29/03/2021"));

    // funcionários
    cozChi.inserirFuncionario(new Funcionario("Alice", "Cozinheirx"));
    cozChi.inserirFuncionario(new Funcionario("Luisa", "Ajudante"));
    cozChi.inserirFuncionario(new Funcionario("Fernanda", "Equipe de Limpeza"));

    // construção da Cozinha Italiana com informações básicas 
    Cozinha cozIta = new Cozinha(13, 22, "Macarronada"); // estava Yakissoba no enunciado - mas acho que foi por falta de modificação

    // ingredientes 
    cozIta.inserirIngrediente(new Ingrediente("Molho", "05/05/2021"));
    cozIta.inserirIngrediente(new Ingrediente("Macarrão", "03/07/2021"));
    cozIta.inserirIngrediente(new Ingrediente("Carne", "02/04/2021"));

    // funcionários
    cozIta.inserirFuncionario(new Funcionario("Márcia", "Cozinheirx"));
    cozIta.inserirFuncionario(new Funcionario("Carlos", "Ajudante"));


    // imprimindo informações 
    System.out.println("Dados Cozinha Mineira");
    cozMin.imprimirDados();

    System.out.println("Dados Cozinha Chinesa");
    cozChi.imprimirDados();
    
    System.out.println("Dados Cozinha Italiana");
    cozIta.imprimirDados();
  }
}