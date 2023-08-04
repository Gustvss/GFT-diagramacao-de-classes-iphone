package domain;

import java.util.Scanner;

import domain.service.InternetService;
import domain.service.MusicService;
import domain.service.PhoneService;
import domain.service.iphone.InternetServiceImpl;
import domain.service.iphone.MusicServiceImpl;
import domain.service.iphone.PhoneServiceImpl;

public class Smartphone {
    public static void main(String[] args) {

        MusicService music = new MusicServiceImpl();
        InternetService internet = new InternetServiceImpl();
        PhoneService phone = new PhoneServiceImpl();
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            String InitialMessage = """
                    ESCOLHA UM APLICATIVO:

                    [1] MUSICA
                    [2] INTERNET
                    [3] TELEFONE

                    """;
            System.out.println(InitialMessage);

            int option = sc.nextInt();
            if (option == 1) {
                music.tocarMusica();
                music.pausarMusica();
                music.selecionarMusica();
            } else if (option == 2) {
                internet.exibirPagina();
                internet.adicionarNovaAba();
                internet.atualizarPagina();
            } else if (option == 3) {
                phone.atender();
                phone.ligar();
                phone.iniciarCorreioDeVoz();
            }

            System.out.print("Deseja continuar? (S/N): ");
            String resposta = sc.next();

            continuar = resposta.equalsIgnoreCase("S");
        }
        sc.close();
        System.out.println("Desligando Celular!");
    }

}
