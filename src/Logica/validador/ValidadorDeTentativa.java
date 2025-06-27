package Logica.validador;

import Logica.palavras.PalavraDoDia;
import Logica.palavras.Tentativa;

public class ValidadorDeTentativa {
    private PalavraDoDia resposta;
    private Tentativa tentativa;

    public ValidadorDeTentativa(PalavraDoDia resposta, Tentativa tentativa) {
        this.resposta = resposta;
        this.tentativa = tentativa;

        String palavraResposta = resposta.getPalavra().toLowerCase();
        String palavraTentativa = tentativa.getPalavraDaTentativa().toLowerCase();

        for (int i = 0; i < 5; i++) {
            char letraTentativa = palavraTentativa.charAt(i);

            if (letraTentativa == palavraResposta.charAt(i)) {
                System.out.print("\u001B[32m" + letraTentativa + "\u001B[0m");
            } else if (palavraResposta.contains(String.valueOf(letraTentativa))) {
                System.out.print("\u001B[33m" + letraTentativa + "\u001B[0m");
            } else {
                System.out.print("\u001B[31m" + letraTentativa + "\u001B[0m");
            }
        }

        System.out.println();
    }
}
