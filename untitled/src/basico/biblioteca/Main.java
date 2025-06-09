package basico.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int cod_livro, exemplares;
        String titulo;

        System.out.print("Insira o código do livro: ");
        cod_livro = input.nextInt();

        input.nextLine();

        System.out.print("Insira o título do livro: ");
        titulo = input.nextLine();

        System.out.print("Existe quantidade inicial de exemplares (s/n)? ");
        char resp = input.next().charAt(0);
        if (resp == 's') {
            System.out.print("Insira a quantidade inicial de exemplares: ");
            exemplares = input.nextInt();
        } else {
            exemplares = 0;
        }

        Livro livro = new Livro(cod_livro, titulo, exemplares);

        livro.mostrarLivro();

        System.out.print("\nInsira a quantidade de exemplares para repor: ");
        int novos_exemplares = input.nextInt();
        livro.reporExemplares(novos_exemplares);
        livro.mostrarLivro();

        System.out.print("\nInsira a quantidade de exemplares para empréstimo: ");
        int exemplares_emprestados = input.nextInt();
        livro.emprestarExemplares(exemplares_emprestados);
        livro.mostrarLivro();
    }
}
