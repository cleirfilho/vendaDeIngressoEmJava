
import java.util.ArrayList;

public class Evento {
  private String nomeEvento;
  private String dataEvento;
  private float valorUnicoEvento;
  private int capacidadeMaximaEvento;
  private ArrayList<Ingresso> listaDeIngressosVendidos ;
  

   // contrutor 
   public Evento(){
    this.nomeEvento = "Show de Comédia";
    this.dataEvento ="01/09/2022";
    this.valorUnicoEvento = 20;
    this.capacidadeMaximaEvento = 3;
    this.listaDeIngressosVendidos = new ArrayList<Ingresso>();
  }

  public String getnomeEvento() {
    return nomeEvento;
  }

  public void setnomeEvento(String nomeEvento) {
    this.nomeEvento = nomeEvento;
  }

  public String getDataEvento() {
    return dataEvento;
  }

  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  public float getValorUnicoEvento() {
    return valorUnicoEvento;
  }

  public void setValorUnicoEvento(float valorUnicoEvento) {
    this.valorUnicoEvento = valorUnicoEvento;
  }

  public int getCapacidadeMaximaEvento() {
    return capacidadeMaximaEvento;
  }

  public void setCapacidadeMaximaEvento(int capacidadeMaximaEvento) {
    this.capacidadeMaximaEvento = capacidadeMaximaEvento;
  }

  public ArrayList<Ingresso> getListaDeIngressosVendidos() {
    return listaDeIngressosVendidos;
  }

  public void setListaDeIngressosVendidos(Ingresso lista) {
    this.listaDeIngressosVendidos.add(lista);
  }
  // vender ingressos 
  public void venderIngresso(Ingresso in) {
    ArrayList<Ingresso> lista = this.getListaDeIngressosVendidos();
    int tamanhoLista = lista.size();
    int tamanhoEvento = this.getCapacidadeMaximaEvento();
    if(tamanhoLista < tamanhoEvento){   
        this.setListaDeIngressosVendidos(in);
    }else{
      System.out.printf("%n Ingressos Esgotados! %n");
    }
  }
  public void exibirIngressosVendidos(){
    for (Ingresso i : this.listaDeIngressosVendidos) {
      System.out.println(i.getNome());
      System.out.println(i.getEventoRelacionado());
      System.out.println(i.getCategoriaIngresso());
      System.out.printf("%n------------------------%n ");

    }
  }
  // mostrar quantidade de ingressos vendidos
  public void quantidadeIngressosVendidos(){
    System.out.printf("%n O numero de ingressos vendidos é:%d%n", this.getListaDeIngressosVendidos().size());
    System.out.printf("%n A quantidade de ingressos que ainda podem ser vendidos:%d%n",this.getCapacidadeMaximaEvento() - this.getListaDeIngressosVendidos().size());
  }
}
