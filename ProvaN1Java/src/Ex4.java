import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        final int N = 5;
        double[] V1 = new double[N];
        double[] V2 = new double[N];
        char[] Op = new char[N];
        double[] Resul = new double[N];

        System.out.println("Digite os elementos do vetor V1:");
        for (int i = 0; i < N; i++)
        {
            System.out.printf("V1[%d]: ", i);
            V1[i] = scanner.nextDouble();
        }
        System.out.println("Digite os elementos do vetor V2:");
        for (int i = 0; i < N; i++)
        {
            System.out.printf("V2[%d]: ", i);
            V2[i] = scanner.nextDouble();
        }

        System.out.println("Digite os operadores (+, -, *, /):");
        for (int i = 0; i < N; i++)
        {
            System.out.printf("Op[%d]: ", i);
            Op[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < N; i++)
        {
            switch (Op[i])
            {
                case '+':
                    Resul[i] = V1[i] + V2[i];
                    break;
                case '-':
                    Resul[i] = V1[i] - V2[i];
                    break;
                case '*':
                    Resul[i] = V1[i] * V2[i];
                    break;
                case '/':
                    if (V2[i] != 0)
                    {
                        Resul[i] = V1[i] / V2[i];
                    } else
                    {
                        System.out.println("Erro: Divisão por zero na posição " + i);
                        Resul[i] = Double.NaN;
                    }
                    break;
                default:
                    System.out.println("Operação inválida na posição " + i);
                    Resul[i] = Double.NaN;
            }
        }

        System.out.println("\nVetor Resul:");
        for (int i = 0; i < N; i++)
        {
            System.out.printf("Resul[%d]: %.2f\n", i, Resul[i]);
        }

        scanner.close();
    }
}
