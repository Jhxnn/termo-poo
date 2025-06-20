package Logica;

import java.util.Scanner;

public class Tentativa {
    private int tentativasRealizadas;
    private String palavraDaTentativa;
    private String[] letrasDaTentativa;

    public Tentativa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("tentativa " + tentativasRealizadas + ": ");

        this.palavraDaTentativa = sc.nextLine();
        this.letrasDaTentativa = palavraDaTentativa.split("");
    }

    public String getPalavraDaTentativa() {
        return palavraDaTentativa;
    }

    public String[] getLetrasDaTentativa() {
        return letrasDaTentativa;
    }

    public int getTentativasRealizadas() {
        return tentativasRealizadas;
    }

    public void setTentativasRealizadas(int tentativasRealizadas) {
        this.tentativasRealizadas = tentativasRealizadas;
    }
}
