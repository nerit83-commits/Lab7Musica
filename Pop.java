public class Pop extends Musica {

    public Pop(String titulo, String artista) {
        super(titulo, artista);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo pop: " + titulo + " de " + artista);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo pop: " + titulo + " de " + artista);
    }
    
}
 
