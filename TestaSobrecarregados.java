class Overloader {

  public void metodo(int a) {
    System.out.println("Com int");
  }

  public void metodo(String a) {
    System.out.println("Com String");
  }

  public void metodo(Object a) {
    System.out.println("Com Object");
  }

  public void metodo(double b) {
    System.out.println("Com double");
  }

  public void metodo(double b, int ba) {
    System.out.println("Com double");
  }

  public void metodo(int b, double ba) {
    System.out.println("Com double");
  }

  public void metodo() {
    System.out.println("Sem nada");
  }
}

public class TestaSobrecarregados {

  public static void main(String[] args) {
    //Quando o método esta sobrecarregado ele vai procura o mais específico possível.

    new Overloader().metodo("Bruno");

    new Overloader().metodo(5.5, 5);

    new Overloader().metodo(5, 5.5);

    new Overloader().metodo(new Object());
    //Com int
    new Overloader().metodo(25);
    //Sem nda
    new Overloader().metodo();
    //Oque muda e que um recebe parâmetros e outro não!
    //O compilador faz a separação.
    new Overloader().metodo(25.3);
  }
}
