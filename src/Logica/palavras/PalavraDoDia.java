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
            List<String> palavras = Files.readAllLines(Paths.get("/home/asaas/termo/src/Logica/palavras/palavras.txt"), StandardCharsets.UTF_8);
            if (palavras.isEmpty()) {
                System.out.println("O arquivo está vazio.");
                return;
            }
            Random random = new Random();
            int indiceSorteado = random.nextInt(palavras.size());
            this.palavra = palavras.get(indiceSorteado);
            this.letraResposta = this.palavra.split("");
        } catch (IOException e) {
            e.printStackTrace(); // MUDAR O RETORNO DO CATCH
        }
    }

    @Override
    public String getLetra(int indice) {
        return letraResposta[indice];
    }

}
