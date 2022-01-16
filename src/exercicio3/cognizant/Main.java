package exercicio3.cognizant;

public class Main {
    public static void main(String[] args) {

        System.out.println("Quadriláteros com estrutura de interrupção return");

        double areaQuadrado = Quadrilateros2.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilateros2.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilateros2.area(7,6,9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }

}
