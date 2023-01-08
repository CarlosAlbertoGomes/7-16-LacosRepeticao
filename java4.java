/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

package lacosRepeticao;

import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, sexo, comportamento, incremento = 0;
        int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, pessoasNervosasMais40 = 0, pessoasCalmasMenos18 = 0;

        while (incremento < 150) {
            incremento++;

            System.out.println("Informe a sua idade: \n ");
            idade = entrada.nextInt();

            System.out.println("Informe o número correspondente ao seu sexo (\n1-Feminino / \n2-Masculino / \n3-Outros): ");
            sexo = entrada.nextInt();

            System.out.println("Informe o número correspondente ao seu comportamento (\n1-Calma / \n2-Nervosa / \n3-Agressiva): ");
            comportamento = entrada.nextInt();

            if (comportamento == 1) {
                pessoasCalmas++;
            }

            if (sexo == 2 && comportamento == 2) {
                mulheresNervosas++;
            }

            if (sexo == 1 && comportamento == 3) {
                homensAgressivos++;
            }

            if (sexo == 3 && comportamento == 1) {
                outrosCalmos++;
            }

            if (idade > 40 && comportamento == 2) {
                pessoasNervosasMais40++;
            }

            if (idade < 18 && comportamento == 1) {
                pessoasCalmasMenos18++;
            }

            incremento++;
        }
        System.out.println("O número de pessoas calmas é: " + pessoasCalmas);
        System.out.println("O número de mulheres nervosas é: " + mulheresNervosas);
        System.out.println("O número de homens agressivos é: " + homensAgressivos);
        System.out.println("O número de outros calmos é: " + outrosCalmos);
        System.out.println("O número de pessoas nervosas com mais de 40 anos: " + pessoasNervosasMais40);
        System.out.println("O número de pessoas calmas com menos de 18 anos: " + pessoasCalmasMenos18);
    }
}
