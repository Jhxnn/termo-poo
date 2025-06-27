package Logica.palavras;

import Logica.interfaces.Letra;

public class Tentativa implements Letra {
    private String palavraDaTentativa;
    private String[] letraTentativa;

    public Tentativa(String tentativa) {
        this.palavraDaTentativa = tentativa;
        this.letraTentativa = tentativa.split("");
    }

    @Override
    public String getLetra(int indice) {
        return letraTentativa[indice];
    }

    public String getPalavraDaTentativa() {
        return palavraDaTentativa;
    }

    public String[] getLetraTentativa() {
        return letraTentativa;
    }
}
