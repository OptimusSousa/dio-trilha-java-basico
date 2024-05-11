public class Case1 {
    public static void main(String[] args) throws Exception {
    
        System.out.println("Processo seletivo");
        
        double salarioBase = 2000.00;
        double salarioCandidato = 2500.00;

        if (salarioBase > salarioCandidato) {
            System.out.println("Ligar para o candidato");
        }
        else if (salarioBase == salarioCandidato) {
                System.out.println("Ligar para o candidato, com contra proposta");
        }
        else {
                System.out.println("Aguardando resultado dos demais candidatos");
        }
        
    }
}
