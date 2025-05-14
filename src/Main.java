import Iphone.Funcoes.ChamadaTelefonica;
import Iphone.Funcoes.NavegadorInternet;
import Iphone.Funcoes.ReprodutorMusical;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        NavegadorInternet navegadorInternet = url -> System.out.println("\nExibindo pagina: " + url);
        navegadorInternet.navegar("https://linkedIn.com\n");

        List<String> musicas = Arrays.asList("Death","Necrophagist","Metallica");


        ReprodutorMusical tocarMusica = musica -> System.out.println("Tocando: " + musica);

        System.out.println("---- music player  ----\n");
        musicas.forEach(tocarMusica::tocar);

        ChamadaTelefonica ligar = numero -> System.out.println("\nDiscando para: " + numero);
        ligar.FazerChamada("11978657840");
    }
    }

