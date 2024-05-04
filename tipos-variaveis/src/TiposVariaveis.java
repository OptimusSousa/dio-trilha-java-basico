public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
		System.out.print(numero);


        /* 
        Para declarar uma variável como uma constante, utilizamos a palavra final, mas por convenção, esta variável deverá ser escrita toda em caixa alta.
        */ 
        final double VALOR_DE_PI = 3.14;


        /** 
        Exemplos:
        byte idade = 123;
        short ano = 2024;
        int cep = 21070333; Se começar com zero, talvez seja necessário utilizar outro tipo
        long cpf = 98765432109L; Se começar com zero, talvez seja necessário utilizar outro tipo  
        float pi = 3.14f;
        double salario = 1275.33;
        char sexo = 'M';
        boolean doadorOrgao = false;
        date dataNascimento = new Date ();

        obs: nos casos do tipo long e float, no final deverá acrescentar as letras L e f respectivamente.
        **/
    }
}
