public class Quest2 {
       /*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

*/

    static long fibo(int n) {
        int F = 0;     // atual
        int ant = 0;   // anterior

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }

        }

        return F;
    }
    public static void main(String[] args) {
        int number;
        System.out.println("Informe o número para verificar se está ou não na sequência da Fibonacci: ");
        number = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < number; i++) {
            System.out.print("(" + i + "):" + fibo(i) + "\t");
            if(number == fibo(i)){
                System.out.println("O NÚMERO ESTÁ NA SEQUÊNCIA DA FIBONACCI");
            }else
                System.out.println("NÃO ESTÁ NA SEQUÊNCIA");
        }








    }

}
