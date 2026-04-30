public class main {
    public static void main(String[] args) {

        CD cd1 = new CD("Thriller", "Michael Jackson", 9, 42);

        TocaDisco aparelho = new TocaDisco();

        aparelho.ligar();
        aparelho.inserirCD(cd1);
        aparelho.play();
        aparelho.pause();
        aparelho.play();
        aparelho.stop();
        aparelho.ejetarCD();
        aparelho.desligar();
    }
}