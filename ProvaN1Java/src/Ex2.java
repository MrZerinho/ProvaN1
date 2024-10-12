import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada x0 do ponto P: ");
        double x0 = scanner.nextDouble();
        System.out.print("Digite a coordenada y0 do ponto P: ");
        double y0 = scanner.nextDouble();

        System.out.print("Digite o coeficiente a da reta: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b da reta: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c da reta: ");
        double c = scanner.nextDouble();
        
        double numerador = Math.abs(a * x0 + b * y0 + c);
        double denominador = Math.sqrt((a * a) + (b * b));
        double distancia = numerador / denominador;

        System.out.printf("A distância entre o ponto P e a reta s é: %.4f\n", distancia);

        scanner.close();
    }
}