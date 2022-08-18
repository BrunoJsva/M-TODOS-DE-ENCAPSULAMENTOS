class Param {
    void primitivo(double a){
        return;
    }
    void referencia(Object o){
        return;
    }
    void teste(int a, int b){
        return;
    }
}

class ComMetodos{
    //Todo Método precisa ter:
    //1 Retorno nesse caso int
    //2 Nome do método nesse caso getNumero
    //3 Parenteses para receber os parâmetros
    //4 Parâmetros
    //5 O bloco que é o corpo representado por chaves {}

    int getNumero() throws RuntimeException {
        return 5;
    }

    //Também existem modificares de acessos
    //default
    //public
    //private
    //protected

    //Também existem modificadores de métodos
    //final se a classe for herdada o método não vai poder ser sobrescrito
    //ABSTRACT significa que e so a assinatura do método só a definição sem corpo.
    //static que o método pertence a classe e não ao objeto
    //synchronize acesso ao método e sincronizado, bloqueia trad para acessar o método.
    //native assim com ABSTRACT 
}

public class TestaMetodos {
    
    public static void main(String[] args){
        Param p = new Param();
        int a = 1;
        p.primitivo('z');
        p.referencia(new Object());
        p.referencia("Bruno Silva");
        p.primitivo(a);
        p.teste(1,2);
    }
}
