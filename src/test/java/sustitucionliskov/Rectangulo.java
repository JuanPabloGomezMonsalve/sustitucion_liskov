package sustitucionliskov;

public class Rectangulo {

    private double ancho;
    private double alto;

    public Rectangulo() {

    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea() {
        return alto * ancho;
    }
}
