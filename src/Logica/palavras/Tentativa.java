package Logica.palavras;

import Logica.interfaces.Letra;

import java.util.Scanner;

public class Tentativa implements Letra {
    private String palavraDaTentativa;
    private String[] letraTentativa;

    public Tentativa() {
        Scanner sc = new Scanner(System.in);

        this.palavraDaTentativa = sc.nextLine();
        this.letraTentativa = palavraDaTentativa.split("");
    }

    @Override
    public String getLetra(int indice) {
        return letraTentativa[indice];
    }

}

// ADICIONAR TRY CATCH PARA DETETCTAR SE A PALAVRA TEM 5 LETRAS
