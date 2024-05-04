public class Relacionais {
    public static void main(String[] args) {
        
        String nomeUm = "Sousa";
        String nomeDois = new String("Sousa");

        System.err.println(nomeUm == nomeDois);
        System.err.println(nomeUm.equals(nomeDois));

         
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.err.println("a nossa condição é verdadeira");
        }

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é igual diferente de numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior do que o numero2? " + simNao);

    
    }
}
