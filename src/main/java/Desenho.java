class Desenho {

  // MÉTODO SEM PARAMETRO
  public void mostrar() {
    for (int i = 0; i < 10; i++) {
      System.out.println("*");
    }
  }

  // MÉTODO COM UM PARAMETRO
  public void mostrar(char simbolo) {
    for (int i = 0; i < 10; i++) {
      System.out.println(simbolo);
    }
  }

  // MÉTODO COM DOIS PARAMETRO
  public void mostrar(char simbolo, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(simbolo);
    }
  }

}