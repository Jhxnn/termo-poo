package Logica.palavras;

import Logica.interfaces.Letra;

import java.util.Scanner;

public class Tentativa implements Letra {
    private String palavraDaTentativa;
    private String[] letraTentativa;

    public Tentativa() {

            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("tentativa: ");
                String tentativa = sc.nextLine();

                if (tentativa == null || tentativa.trim().isEmpty()) {
                    throw new IllegalArgumentException("A palavra não pode ser nula ou vazia");
                }
                if (tentativa.length() != 5) {
                    throw new IllegalArgumentException(("A palavra deve conter exatamente 5 letras"));
                }

                this.palavraDaTentativa = tentativa;
                this.letraTentativa = palavraDaTentativa.split("");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
    }

    @Override
    public String getLetra(int indice) {
        return letraTentativa[indice];
    }

}

// ADICIONAR TRY CATCH PARA DETETCTAR SE A PALAVRA TEM 5 LETRAS
