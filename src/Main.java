import java.util.Scanner;

//Faça um programa que leia um nome, idade e peso e imprima na tela as informações da
//seguinte forma:
//NOME:
//IDADE:
//PESO:
public class Main {

    static void imprimeDetalhesPessoa(String nome, int idade, double peso){
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.println("Peso: " + peso);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Lê o nome
        System.out.println("Digite um nome:");
        String nome = sc.nextLine();

        //Lê a idade
        System.out.println("Digite a idade:");
        int idade = sc.nextInt();

        //Lê o peso
        System.out.println("Digite o peso:");
        double peso = sc.nextDouble();

        //Chama a função para imprimir tudo na tela
        imprimeDetalhesPessoa(nome, idade, peso);

    }
}