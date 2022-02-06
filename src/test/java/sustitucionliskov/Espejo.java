package sustitucionliskov;

import org.junit.Assert;
import org.junit.Test;

public class Espejo {

    @Test
    public void testEspejoRequeridoPorCliente() {
        Rectangulo rectangulo = new Cuadrado();
        rectangulo.setAlto(10);
        rectangulo.setAncho(20);
        Assert.assertEquals(200, rectangulo.calcularArea(), 0);
    }
}
