public class Rock extends Musica {

    public Rock(String titulo, String artista) {
        super(titulo, artista);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo rock: " + titulo + " de " + artista);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo rock: " + titulo + " de " + artista);
    }
    
}
