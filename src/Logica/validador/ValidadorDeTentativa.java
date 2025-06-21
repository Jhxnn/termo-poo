package Logica.validador;

import Logica.palavras.PalavraDoDia;
import Logica.palavras.Tentativa;

import java.util.ArrayList;
import java.util.Objects;

public class ValidadorDeTentativa {
    private PalavraDoDia resposta;
    private Tentativa tentativa;

    public ValidadorDeTentativa() {
        this.resposta = new PalavraDoDia();
        this.tentativa = new Tentativa();

        String corDaLetra = null;
        ArrayList<String> resultadoDaTentativa = new ArrayList<String>();

        for (int indice = 0; indice < 5; indice++) {
            if (Objects.equals(resposta.getLetra(indice), tentativa.getLetra(indice))) {
                corDaLetra = "\u001B[32m"; //verde
            }
            else {
                corDaLetra = "\u001B[31m"; // vermelho
            }

            resultadoDaTentativa.add(corDaLetra);
            resultadoDaTentativa.add(tentativa.getLetra(indice));
        }

        System.out.println(String.join("", resultadoDaTentativa));

    }
}
