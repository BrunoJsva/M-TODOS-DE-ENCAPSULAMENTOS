class Abc {

    int i = 10;
    String nome = "Beru";
    String sobreNome = "Silva";
    int tamanhoNome = tamanhoDoNome();

    Abc(String nome){
        imprimeNome();
        this.nome = nome;
    }
    private void imprimeNome(){
        System.out.println(nome);
    }

    int tamanhoDoNome(){
        return nome.length();
    }

    //O construtor precisa de argumentos sempre.
    Abc(){ 
    }
}

public class TestaConstrutores {
    public static void main(String[] args){

        Abc a = new Abc();

        Abc b = new Abc("Bruno");

        System.out.println(b.i);
    }
}
