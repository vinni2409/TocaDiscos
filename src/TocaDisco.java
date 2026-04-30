public class TocaDisco {
    private CD cdAtual;
    private boolean ligado;
    private boolean tocando;
    private boolean pausado;

    public TocaDisco() {
        this.cdAtual = null;
        this.ligado = false;
        this.tocando = false;
        this.pausado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Toca-discos ligado.");
    }

    public void desligar() {
        stop();
        ligado = false;
        System.out.println("Toca-discos desligado.");
    }

    public void play(){
        if(!ligado){
            System.out.println("Ligue o toca discos primeiro");
            return;
        }
        if(cdAtual == null){
            System.out.println("insira o cd primeiro");
            return;
        }
        tocando = true;
        pausado = false;
        System.out.println("Tocando: " + cdAtual.getTitulo() + " - " + cdAtual.getArtista());
    }

    public void pause() {
        if (!tocando) {
            System.out.println("Nenhuma música tocando.");
            return;
        }
        tocando = false;
        pausado = true;
        System.out.println("Música pausada.");
    }

    public void stop() {
        tocando = false;
        pausado = false;
        System.out.println("Reprodução parada.");
    }

    public void inserirCD(CD cd) {
        this.cdAtual = cd;
        System.out.println("CD inserido: " + cd.getTitulo());
    }

    public void ejetarCD() {
        stop();
        cdAtual = null;
        System.out.println("CD ejetado.");
    }

}
