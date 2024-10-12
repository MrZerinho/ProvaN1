import java.util.ArrayList;
import java.util.Scanner;

public class Ex3
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int totalAlunos = 0;
        int aprovados = 0, reprovados = 0, exames = 0;
        double somaMedias = 0.0;

        String nomeMaiorMedia = "";
        String nomeMenorMedia = "";
        double maiorMedia = Double.MIN_VALUE;
        double menorMedia = Double.MAX_VALUE;

        ArrayList<String> alunos = new ArrayList<>();

        char continuar;

        do
        {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.next();
            alunos.add(nome);

            double nota1, nota2;

            do
            {
                System.out.print("Digite a 1ª nota (0.0 a 10.0): ");
                nota1 = scanner.nextDouble();
            } while (nota1 < 0.0 || nota1 > 10.0);

            do
            {
                System.out.print("Digite a 2ª nota (0.0 a 10.0): ");
                nota2 = scanner.nextDouble();
            } while (nota2 < 0.0 || nota2 > 10.0);

            double media = (nota1 + nota2) / 2.0;
            somaMedias += media;
            totalAlunos++;

            System.out.printf("%s obteve média: %.2f\n", nome, media);

            if (media < 4.0)
            {
                System.out.println("Situação: Reprovado");
                reprovados++;
            } else if (media < 6.0)
            {
                System.out.println("Situação: Exame");
                exames++;
            } else
            {
                System.out.println("Situação: Aprovado");
                aprovados++;
            }

            if (media > maiorMedia)
            {
                maiorMedia = media;
                nomeMaiorMedia = nome;
            }

            if (media < menorMedia)
            {
                menorMedia = media;
                nomeMenorMedia = nome;
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next().charAt(0);
        }
        
        while (Character.toUpperCase(continuar) == 'S');

        System.out.println("\n=== Estatísticas Finais ===");
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Exame: " + exames);
        
        if (totalAlunos > 0)
        {
            double mediaClasse = somaMedias / totalAlunos;
            System.out.printf("Média da classe: %.2f\n", mediaClasse);
            System.out.printf("Aluno com maior média: %s (%.2f)\n", nomeMaiorMedia, maiorMedia);
            System.out.printf("Aluno com menor média: %s (%.2f)\n", nomeMenorMedia, menorMedia);
        }

        scanner.close();
    }
}
