package Data_Strutures_CarloMtz;

public interface IReproductorMusica2 <T> {

    void reproducir();
    void parar();
    void pausar();
    void agregarCancion(T cancion);
    T siguienteCancion();
    boolean isReproduciendo();

}