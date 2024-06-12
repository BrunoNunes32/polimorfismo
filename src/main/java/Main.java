public class Main {
  public static void main(String[] args) {

    // AULA 01/04 (CONCEITOS DE POLIMORFISMO) - METODOS COM O MESMO NOME, COM AÇÕES
    // DIFERENTES
    // Quadrado q1 = new Quadrado();
    // q1.desenhar();
    // Circulo c1 = new Circulo();
    // c1.desenhar();

    // AULA 02/04 (SOBRECARGA DE MÉTODOS) - CLASSES COM MESMO NOME, MAS COM
    // ARGUMENTOS DIFERENTES
    // Desenho d1 = new Desenho();
    // d1.mostrar();
    // System.out.println("-------");
    // d1.mostrar('$');
    // System.out.println("-------");
    // d1.mostrar('%', 5);

    // AULA 03/04 (SOBRESCRITA DE MÉTODOS) - HERDA CARACTERISTICAS, MAS MODIFICA
    // ALGUMAS PROPRIEDADES
    // Java j1 = new Java();
    // j1.mostrarInformacao();
    // Linguagem l1 = new Linguagem();
    // l1.mostrarInformacao();

    // AULA 04/04 (MÉTODO toString)
    String primeira = "Java";
    String segunda = "Csharp";
    String terceira = new String("Pyton");
    System.out.println(primeira.toUpperCase());
    System.out.println(segunda.length());
    System.out.println(terceira);

    //COMPARAR A PRIMEIRA COM A SEGUNDA STRING
    boolean result = primeira.equals(segunda);
    System.out.println("Primeira é igual a segunda? " + result);

    //COMPARAR A SEGUNDA COM A TERCEIRA STRING
    result = segunda.equals(terceira);
    System.out.println("Segunda é igual a terceira? " + result);

    

  }
}