package Logica.validador;

import Logica.palavras.PalavraDoDia;
import Logica.palavras.Tentativa;

import java.util.ArrayList;
import java.util.Objects;

public class ValidadorDeTentativa {
    private PalavraDoDia resposta;
    private Tentativa tentativa;
    private int numeroDeTentativas;

    public ValidadorDeTentativa() {
        String corDaLetra = null;
        ArrayList<String> resultadoDaTentativa = new ArrayList<String>();

        for (int indice = 0; indice < 5; indice++) {
            if (Objects.equals(resposta.getLetra(indice), tentativa.getLetra(indice))) {
                corDaLetra = "\u001B[32m"; //verde
            }
            if (!resposta.getLetra(indice).equals(tentativa.getLetra(indice))) {
                corDaLetra = "\u001B[31m";
            }

            resultadoDaTentativa.add(corDaLetra);
            resultadoDaTentativa.add(tentativa.getLetra(indice));
        }

        System.out.println(String.join("+", resultadoDaTentativa));

    }
}
