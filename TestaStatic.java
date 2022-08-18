class Moto{
    //O static aqui quer dizer que o valor não é fixo, pode se ter outros valores diferentes.
    public static int totalDeMotos = 0;
    public static final int PADRAO_TOTAL_MOTOS = 10;

    String marca; 

    public static int getTotalDeMotos() {
        return Moto.totalDeMotos;
    }
}

public class TestaStatic {
    public static void main(String[] args){

        Moto.totalDeMotos = 3;
        System.out.println(Moto.getTotalDeMotos());


    }
}


class A {
    public static void main(String[] args) {
        int x = b(15);
        System.out.println(x);
        System.out.println(15);
        System.out.println(15.0);
    }
    static int b(int i) { return i; } 
    static double b(double i) { return i; } 
}

