
import java.util.Scanner;

public class Ingresso extends Evento {

  Scanner scan = new Scanner(System.in);
  
  private String nome;
  private String CPF;
  private String eventoRelacionado;
  private TipoIngresso categoriaIngresso;
  private float ingressoPista;
  private float ingressoVip;
  private float ingressoCamarote;

  
  
  /// construtor
  public Ingresso(String nome, String CPF, TipoIngresso tipo, String qualEvento){
    this.nome = nome;
    this.CPF = CPF;
    this.categoriaIngresso = tipo;
    this.eventoRelacionado = qualEvento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String cPF) {
    CPF = cPF;
  }

  public String getEventoRelacionado() {
    return eventoRelacionado;
  }

  public void setEventoRelacionado(String eventoRelacionado) {
    this.eventoRelacionado = eventoRelacionado;
  }
  public TipoIngresso getCategoriaIngresso() {
    return categoriaIngresso;
  }

  public void setCategoriaIngresso(TipoIngresso categoriaIngresso) {
    this.categoriaIngresso = categoriaIngresso;
  }
 
  // metodo para calcular o valor do ingresso
  public void calcularValorIngresso(float valorUnico){
    this.ingressoCamarote = (float) (valorUnico + (valorUnico * 0.6));
    this.ingressoVip = (float) (valorUnico + (valorUnico * 0.3));
    this.ingressoPista = valorUnico;
  }
  // imprime no console o valor do ingresso
  public void  imprimirIngressoValor() {
    System.out.printf("%n O valor do ingresso pista é: %f:",this.ingressoPista);
    System.out.printf("%n O valor do ingresso VIP é: %f:",this.ingressoVip);
    System.out.printf("%n O valor do ingresso Camarote é: %f:",this.ingressoCamarote);
  }
  // mostra o resumo do ultimo ingresso vendido 
  public void mostraResumo(){
    System.out.printf("%n --------Dados do ingresso ------%n");
    System.out.printf("%n Nome:%s%n",getNome());
    System.out.printf("%n CPF:%s",this.CPF);
    System.out.printf("%n CPF:%s",this.categoriaIngresso);
    System.out.printf("%n --------Dados do Evento ------%n");
    System.out.printf("%n Nome do evento é: %s:",getnomeEvento());
    System.out.printf("%n Data do evento: %s%n:",getDataEvento());
  }
  
}
