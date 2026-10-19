import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Olá, seja bem vindo!----- ");
        System.out.println("-----Ao Menu Principal-----");
        System.out.println("Aviso: a cada 3 itens colocado na sua lista iremos perguntar a você se desejar continuar.");
        System.out.println("1. Vamos começar a montar a sua lista de compras? ");
        System.out.println("2. Desejar vê a sua lista.");
        System.out.println("3. Desejar vê o total final.");
        System.out.println("4. Fazer conta de preço: ");
        System.out.println("5. Mostra tudo: ");
        System.out.println("6. Mostra novamente o menu?");
        System.out.println("7. Desejar para o programa: ");
        System.out.println("Qual das opções você desejar? ");
        String continua = input.next();
        Ate comeca = new Ate();
        comeca.inicio(continua, input);
        input.close();
    }
}
