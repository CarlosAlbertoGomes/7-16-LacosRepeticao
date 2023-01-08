/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package lacosRepeticao;

import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {

        int idade = 0, contador21 = 0, contador50 = 0;
        Scanner entrada = new Scanner(System.in);

        while (idade != -99) {
            System.out.println("Digite a idade: \n ");
            idade = entrada.nextInt();

            if (idade < 21){
                contador21++;
            }
            if (idade > 50){
                contador50++;
            }

            System.out.println("Digite -99 para encerrar): \n ");
        }

        System.out.println("O total de pessoas com menos de 21 anos é de:\n " + contador21);
        System.out.println("O total de pessoas com mais de 50 anos é de:\n " + contador50);
    }
}
