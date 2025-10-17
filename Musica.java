public abstract class Musica {

    protected String titulo;
    protected String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    
    //Metodo abstracto, cada genero lo implementa a su manera
    public abstract void reproducir();
    public abstract void detener();

    
}