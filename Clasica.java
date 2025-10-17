public class Clasica extends Musica {

    public Clasica(String titulo, String artista) {
        super(titulo, artista);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo clasica: " + titulo + " de " + artista);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo clasica: " + titulo + " de " + artista);
    }
    
}
