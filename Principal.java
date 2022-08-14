
public class Principal {

 public static void main(String[] args) {

  // inicia o EVENTO
  Evento evento = new Evento();
  // inicia o um novo ingresso 
  Ingresso ingresso = new Ingresso(
    "cleir de castro e costa filho",
    "000.000.000-00",
    TipoIngresso.PISTA,
    evento.getnomeEvento()
    );
    System.out.printf("%n ---------------------- ------%n");
// calcula valor do ingresso 
    ingresso.calcularValorIngresso(evento.getValorUnicoEvento());
// imprimir valor do ingresso 
    ingresso.imprimirIngressoValor();
// imprime resumo do ingresso
    ingresso.mostraResumo();
// vende o ingresso inserindo na lista de ingresso 
    evento.venderIngresso(ingresso);
// exibe a quantidade de ingressos vendidos e a capaxidade maxima de ingressos
  evento.quantidadeIngressosVendidos();
    System.out.printf("%n ---------------------- ------%n");
// INICIA A INSCRIÇÃO DO 2 INGRESSO
 // inicia o um novo ingresso 
 Ingresso ingresso2 = new Ingresso(
  "PESSOA 2",
  "000.000.000-00",
  TipoIngresso.VIP,
  evento.getnomeEvento()
  );
  // calcula valor do ingresso 
  ingresso2.calcularValorIngresso(evento.getValorUnicoEvento());
  // imprimir valor do ingresso 
  ingresso2.imprimirIngressoValor();
  // imprime resumo do ingresso
  ingresso2.mostraResumo();
  // vende o ingresso inserindo na lista de ingresso 
  evento.venderIngresso(ingresso2);
  // exibe a quantidade de ingressos vendidos e a capacidade maxima de ingressos
  evento.quantidadeIngressosVendidos();
  System.out.printf("%n ---------------------- ------%n");
  // INICIA A INSCRIÇÃO DO 3 INGRESSO DEL
  Ingresso ingresso3 = new Ingresso(
  "PESSOA 3",
  "000.000.000-00",
  TipoIngresso.CAMAROTE,
  evento.getnomeEvento()
  );
  // calcula valor do ingresso 
  ingresso3.calcularValorIngresso(evento.getValorUnicoEvento());
  // imprimir valor do ingresso 
  ingresso3.imprimirIngressoValor();
  // imprime resumo do ingresso
  ingresso3.mostraResumo();
  // vende o ingresso inserindo na lista de ingresso 
  evento.venderIngresso(ingresso3);
  // exibe a quantidade de ingressos vendidos e a capacidade maxima de ingressos
  evento.quantidadeIngressosVendidos();
  System.out.printf("%n ---------------------- ------%n");
  // INICIA A INSCRIÇÃO DO QUARTO INGRESSO (ESSE EXIBE AVISO DE INGRESSO ESGOTADO)
  Ingresso ingresso4 = new Ingresso(
    "PESSOA 4",
    "000.000.000-00",
    TipoIngresso.PISTA,
    evento.getnomeEvento()
    );
    // calcula valor do ingresso 
    ingresso4.calcularValorIngresso(evento.getValorUnicoEvento());
    // imprimir valor do ingresso 
    ingresso4.imprimirIngressoValor();
    // imprime resumo do ingresso
    ingresso4.mostraResumo();
    // vende o ingresso inserindo na lista de ingresso 
    evento.venderIngresso(ingresso4);
    // exibe a quantidade de ingressos vendidos e a capacidade maxima de ingressos
    System.out.printf("%n ---------------------- ------%n");
    evento.quantidadeIngressosVendidos();
    System.out.printf("%n ---------------------- ------%n");
    //exibe ingressos vendidos
    evento.exibirIngressosVendidos();

   
 }
}