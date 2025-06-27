package Logica.palavras;

import Logica.interfaces.Letra;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class PalavraDoDia implements Letra {
    private String palavra;
    private String[] letraResposta;

    public PalavraDoDia() {
        try {
            List<String> palavras = Files.readAllLines(
                    Paths.get("src/Logica/palavras/palavras.txt"),
                    StandardCharsets.UTF_8
            );

            if (palavras.isEmpty()) {
                throw new IllegalArgumentException("O arquivo está vazio.");
            }

            Random random = new Random();
            this.palavra = palavras.get(random.nextInt(palavras.size()));

            this.letraResposta = this.palavra.split("");
        } catch (IOException | IllegalArgumentException e) {
        throw new RuntimeException("Erro ao inicializar PalavraDoDia: " + e.getMessage(), e);
    }
    }

    @Override
    public String getLetra(int indice) {
        if (letraResposta == null || indice < 0 || indice >= letraResposta.length) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return letraResposta[indice];
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String[] getLetraResposta() {
        return letraResposta;
    }

    public void setLetraResposta(String[] letraResposta) {
        this.letraResposta = letraResposta;
    }
}
