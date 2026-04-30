public class CD {
    private String titulo;
    private String artista;
    private int numeroDeFaixa;
    private int duracaoTotal;

    public CD( String titulo, String artista, int numeroDeFaixa, int duracaoTotal ) {
        this.titulo = titulo;
        this.artista = artista;
        this.numeroDeFaixa = numeroDeFaixa;
        this.duracaoTotal = duracaoTotal;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Faixas: " + numeroDeFaixa);
        System.out.println("Duração: " + duracaoTotal + " minutos");
    }
}
