package sustitucionliskov;

public class Cuadrado extends Rectangulo {
    public Cuadrado() {
    }

    public Cuadrado(double ancho, double alto) {
        super(ancho, alto);
    }

    @Override
    public void setAlto(double alto) {
        super.setAlto(alto);
        super.setAncho(alto);
    }

    @Override
    public void setAncho(double ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
    }
}
