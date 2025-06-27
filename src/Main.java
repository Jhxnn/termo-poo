import Logica.palavras.PalavraDoDia;
import Logica.palavras.Tentativa;
import Logica.validador.ValidadorDeTentativa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalavraDoDia palavra = new PalavraDoDia(); // mesma palavra nas 5 tentativas

        for (int i = 0; i < 5; i++) {
            String tentativaStr;

            while (true) {
                System.out.print("Tentativa " + (i + 1) + ": ");
                tentativaStr = scanner.nextLine().trim().toLowerCase();

                if (tentativaStr.length() != 5) {
                    System.out.println("❌ A palavra deve conter exatamente 5 letras.");
                } else {
                    break; // entrada válida
                }
            }

            Tentativa tentativa = new Tentativa(tentativaStr);
            new ValidadorDeTentativa(palavra, tentativa);

            if (tentativaStr.equals(palavra.getPalavra().toLowerCase())) {
                System.out.println("🎉 Parabéns! Você acertou!");
                return;
            }
        }

        System.out.println("💀 Fim de jogo! A palavra era: " + palavra.getPalavra());
        scanner.close();
    }
}
