import java.util.Scanner;

public class Ex5Extra {

    private double xa, ya; // Coordenadas do ponto A
    private double xb, yb; // Coordenadas do ponto B
    private double distanciaEuclidiana; // Distância entre os pontos

    public Ex5Extra(double xa, double ya, double xb, double yb) {
        this.xa = xa;
        this.ya = ya;
        this.xb = xb;
        this.yb = yb;
        this.distanciaEuclidiana = calcularDistancia();
    }

    private double calcularDistancia() {
        return Math.sqrt(Math.pow(yb - ya, 2) + Math.pow(xb - xa, 2));
    }

    @Override
    public String toString() {
        return String.format("A(%.2f, %.2f) e B(%.2f, %.2f)\nDistância Euclidiana: %.2f",
                xa, ya, xb, yb, distanciaEuclidiana);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as coordenadas do ponto A (Xa Ya): ");
        double xa = scanner.nextDouble();
        double ya = scanner.nextDouble();

        System.out.print("Digite as coordenadas do ponto B (Xb Yb): ");
        double xb = scanner.nextDouble();
        double yb = scanner.nextDouble();

        Ex5Extra distancia = new Ex5Extra(xa, ya, xb, yb);
        System.out.println(distancia);

        scanner.close();
    }
}