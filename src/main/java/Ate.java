import java.util.ArrayList;
import java.util.Scanner;

public class Ate{
    public void inicio(String continua,Scanner input){
        ArrayList<String> lista = new ArrayList<>();
        continua = continua;
        double valort= 0;
        while(!continua.equals("7")){
            if(continua.equals("1")){
                for (int i = 0; i < 3; i++) {
                    System.out.print("Produto: ");
                    String produto = input.next();
                    produto = Character.toUpperCase(produto.charAt(0)) + produto.substring(1).toLowerCase();
                    System.out.print("Valor do produto: ");
                    double valor = input.nextDouble();
                    valort= valor+valort;
                    System.out.println("o valor total ta dando: "+valort);
                    lista.add(produto+"-R$"+valor);
                }
                System.out.println("Desejar continuar, digite 1");
                System.out.println("Digite 6 para parar: ");
                continua= input.next();
            } else if (continua.equalsIgnoreCase("2")){
                System.out.println(lista);
                System.out.println("Qual opção deseja agora? Caso deseje rever as opções digite 6: ");
                continua = input.next();
            } else if (continua.equalsIgnoreCase("3")){
                System.out.println("R$"+valort);
                System.out.println("Qual opção deseja agora? Caso deseje rever as opções digite 6: ");
                continua = input.next();
            }else if (continua.equalsIgnoreCase("4")) {
                System.out.println("Olá, sejá bem vindo! A calculador de preço.");
                System.out.println("Informe por favor o preço do primeiro item: ");
                double preco1 = input.nextDouble();
                System.out.println("Agora do seu peso, litro, medida ou unidade: ");
                double unidade1 =  input.nextDouble();
                double precop1= preco1/unidade1;
                System.out.println("Informe por favor o preço do segundo item: ");
                double preco2 = input.nextDouble();
                System.out.println("Agora do seu peso, litro, medida ou unidade: ");
                double unidade2 =  input.nextDouble();
                double precop2= preco2/unidade2;
                if(precop1>precop2){
                    System.out.println("O primeiro item é mais caro que o item dois, o preco um deu "+precop1+" e o preço dois deu "+precop2);
                } else if (precop2>precop1) {
                    System.out.println("O segundo item é mais caro que o item um, o preco um deu " + precop2 + " e o preço um deu " + precop1);
                }
                System.out.println("Qual opção deseja agora? Caso deseje rever as opções digite 6: ");
                continua = input.next();
            }else if (continua.equalsIgnoreCase("5")) {
                System.out.println(lista+"-R$"+valort);
                System.out.println("Qual opção deseja agora? Caso deseje rever as opções digite 6: ");
                continua = input.next();
            } else if (continua.equalsIgnoreCase("6")) {
                System.out.println("-----Ao Menu Principal-----");
                System.out.println("Aviso: a cada 3 itens colocado na sua lista iremos perguntar a você se desejar continuar.");
                System.out.println("1. Vamos começar a montar a sua lista de compras? ");
                System.out.println("2. Desejar vê a sua lista.");
                System.out.println("3. Desejar vê o total final.");
                System.out.println("4. Fazer conta de preço: ");
                System.out.println("5. Mostra tudo: ");
                System.out.println("6. Desejar para o programa: ");
                System.out.println("Qual das opções você desejar? ");
                continua = input.next();
            }else{
                System.out.println("Numero invalido");
                System.out.println("Voltando ao loob principal...");
                System.out.println("loading.....");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("-----Ao Menu Principal-----");
                System.out.println("Aviso: a cada 3 itens colocado na sua lista iremos perguntar a você se desejar continuar.");
                System.out.println("1. Vamos começar a montar a sua lista de compras? ");
                System.out.println("2. Desejar vê a sua lista.");
                System.out.println("3. Desejar vê o total final.");
                System.out.println("4. Fazer conta de preço: ");
                System.out.println("5. Mostra tudo: ");
                System.out.println("6. Desejar para o programa: ");
                System.out.println("Qual das opções você desejar? ");
                continua = input.next();
            }
        }
    }
}
