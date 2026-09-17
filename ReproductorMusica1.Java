public interface IReproductorMusica1 <T> {
void reproducir();
void parar();
void pausar();
void agregarCancion(T cancion);
T siguienteCancion();
boolean isReproduciendo();

}