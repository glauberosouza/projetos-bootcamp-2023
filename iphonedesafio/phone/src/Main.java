package iphonedesafio.phone.src;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical player = new ReprodutorMusical();
        AparelhoTelefonico phone = new AparelhoTelefonico();
        NavegadorInternet browser = new NavegadorInternet();

        player.tocar();
        phone.ligar();
        browser.exibirPagina();
    }
}
