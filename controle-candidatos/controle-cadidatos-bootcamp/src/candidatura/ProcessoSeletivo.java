package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {
                "João", "Glauber", "Fernando",
                "Renato", "Marcelo" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas + " tentativa");
        } else
            System.out.println(
                    "Não conseguimos contato com " + candidato + ", Numero maximo tentativas " + tentativasRealizadas);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {
                "João", "Glauber", "Fernando",
                "Renato", "Marcelo" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
                "João", "Glauber", "Fernando",
                "Renato", "Marcelo", "Fabricio", "Daniel", "Marcio", "Felipe", "Augusto" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salaBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = ValorPretendido();

            System.out.println("O candidato "
                    + candidato
                    + " Solicitou esse valor de salário "
                    + salarioPretendido);
            if (salaBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    private static double ValorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
