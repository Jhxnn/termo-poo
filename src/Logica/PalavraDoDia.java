package Logica;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class PalavraDoDia {
    private String palavra;

    public PalavraDoDia() {
        try {
            List<String> palavras = Files.readAllLines(Paths.get("/home/asaas/termo/src/Logica/palavras.txt"), StandardCharsets.UTF_8);
            if (palavras.isEmpty()) {
                System.out.println("O arquivo está vazio.");
                return;
            }
            Random random = new Random();
            int indiceSorteado = random.nextInt(palavras.size());
            this.palavra = palavras.get(indiceSorteado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPalavra() {
        return palavra;
    }
}
