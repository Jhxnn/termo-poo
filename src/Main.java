import Logica.PalavraDoDia;

public class Main {
    public static void main(String[] args) {
        PalavraDoDia palavra = new PalavraDoDia();
        System.out.println(palavra.getPalavra());
        for(String letra : palavra.getLetras()) {
            System.out.println(letra);
        }

    }
}
