package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoSelecionarCandidato {
    public static void main(String[] args) {
        imprimirSelecionados();

    }
    static void imprimirSelecionados() {
        double salarioBase = 2000.0;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int totalSelecionados = 0;
        int totalConsultados = 0;
        for(String candidato: candidatos) {
            totalConsultados++;
            double valorPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " está pedindo " + valorPretendido);
            if(valorPretendido > salarioBase) {
                System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");

            }else {
                System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
                totalSelecionados++;
            }

        }
        System.out.println("Total de selecionados: " + totalSelecionados);
        System.out.println("Total de consultados: " + totalConsultados);
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
