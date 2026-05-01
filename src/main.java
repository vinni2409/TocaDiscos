public class main {
    public static void main(String[] args) {

        EstanteCds estante = new EstanteCds();

        CD cd1 = new CD("Thriller", "Michael Jackson", 9, 42);
        CD cd2 = new CD("circles", "Post Malone", 10, 3);

        TocaDisco aparelho = new TocaDisco();
        estante.guardaCd(cd1);
        estante.guardaCd(cd2);
        estante.listarCds();

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