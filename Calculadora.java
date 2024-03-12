public class Calculadora {

    public static void main(String[] args) {

        System.out.println("-------------------");
        System.out.println("Projeto Calculadora");
        System.out.println("-------------------");

        Scanner display = new Scanner (System.in);
        String nome;
        int conta;
        System.out.println("Olá usuário, tudo bem? Por favor se identifique:");
        nome = display.nextline();
        System.out.println("Olá" + nome + "Digite qual a operação que deseja realizar, sendo 1 para soma, " +
                "2 para multiplicação, 3 para divisão, e 4 para subtração");
        conta = display.nextint();

        double numero1, numero2;
        double soma, multiplicacao, divisao, subtracao;

        if (conta == 1){
            System.out.println("Você escolheu soma!");
            System.out.println("Digite o primeiro número:" + numero1);
            System.out.println("Digite o segundo número:" + numero2);
            soma = numero1 + numero2;
        }

        if (conta == 2) {
            System.out.println("Você escolheu multiplicação!");
            System.out.println("Digite o primeiro número:" + numero1);
            System.out.println("Digite o segundo número:" + numero2);
            multiplicacao = numero1 * numero2;
        }

        if (conta == 3) {
            System.out.println("Você escolheu divisão!");
            System.out.println("Digite o primeiro número:" + numero1);
            System.out.println("Digite o segundo número:" + numero2);
            multiplicacao = numero1 / numero2;
        }

        if (conta == 4) {
            System.out.println("Você escolheu subtração!");
            System.out.println("Digite o primeiro número:" + numero1);
            System.out.println("Digite o segundo número:" + numero2);
            multiplicacao = numero1 - numero2;
        }


    }

}
