import java.util.Date;
import java.text.SimpleDateFormat;  

public class Ingrediente {
	public String nome;
	public Date dataValidade;
  SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

  public Ingrediente(String nome, String dataValidade){
    try {
      Date dataFormatada = formato.parse(dataValidade); 
      this.nome = nome;
      this.dataValidade = dataFormatada;
    } catch(java.text.ParseException ex) {
      ex.printStackTrace();
    } 
  }
}