package Data_Strutures_LluviaVillanueva;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;
    private String genero;
    private String album;
    
     public Cancion ( String titulo, String artista, int duracion, String genero, String album){
     this.titulo= titulo;
     this.artista = artista;
     this.duracion= duracion;
     this.genero = genero;
     this.album = album;}

     public String getTitulo(){
        return titulo;
     }

     public String getArtista(){
        return artista;
     }

     public int getDuracion(){
        return duracion;
     }

     public String getGenero(){
        return genero;
     }

     public String getAlbum(){
        return album;
     }
     

}







