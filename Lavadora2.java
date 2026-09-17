
public class Lavadora2 {
    private boolean encendida;
    private int temperatura;
    private int tiempoLavado;
    private boolean centrifugado;BTBJKCC
    private boolean secado;
    private boolean detergente;
    private boolean suavizante;
        
        public Lavadora2() {
            this.encendida = false;
            this.temperatura = 30;
            this.tiempoLavado = 30;
            this.centrifugado = false;
            this.secado = false;
            this.detergente = false;
            this.suavizante = false;
        }

        public void encender() {
            this.encendida = true;
        }

        public void apagar() {
            this.encendida = false;
        }

        public void setTemperatura(int temperatura) {
            this.temperatura = temperatura;
        }

        public void setTiempoLavado(int tiempoLavado) {
            this.tiempoLavado = tiempoLavado;
        }

        public void setCentrifugado(boolean centrifugado) {
            this.centrifugado = centrifugado;
        }

        public void setSecado(boolean secado) {
            this.secado = secado;
        }

        public void setDetergente(boolean detergente) {
            this.detergente = detergente;
        }

        public void setSuavizante(boolean suavizante) {
            this.suavizante = suavizante;
        }

        public void iniciarLavado() {
            if (this.encendida) {
                System.out.println("Lavando a " + this.temperatura + " grados durante " + this.tiempoLavado + " minutos.");
                if (this.centrifugado) {
                    System.out.println("Centrifugando...");
                }
                if (this.secado) {
                    System.out.println("Secando...");
                }
                if (this.detergente) {
                    System.out.println("Usando detergente.");
                }
                if (this.suavizante) {
                    System.out.println("Usando suavizante.");
                }
            } else {
                System.out.println("La lavadora está apagada. Por favor, enciéndala primero.");
            }
        }
}


