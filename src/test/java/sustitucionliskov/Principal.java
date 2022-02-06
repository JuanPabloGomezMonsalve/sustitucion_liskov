package sustitucionliskov;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.comer();
        animal.dormir();
        animal.saltar();
    }
}

