package Logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Logica {
    private String palavra;
    private Usuario usuario;
    private int tentativa;

    public boolean setPalavra() {
        String[] palavras = null;

        try (BufferedReader br = new BufferedReader(new FileReader("src/Logica/palavras.csv"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                palavras = linha.split(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();

        int numero = random.nextInt(palavras.length);
        this.palavra = palavras[numero];
        return false;
    }


    // GETTERS E SETTERS

    public String getPalavra() {
        return palavra;
    }

    public int getTentativa() {
        return tentativa;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }
}
