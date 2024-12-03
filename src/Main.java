import java.util.ArrayList;
import java.util.Scanner;
import livro.Livro;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> livros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (true) {
            System.out.println("1 para adicionar livro");
            System.out.println("2 para ver livros");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o nome do autor");
                    String autor = sc.nextLine();
                    System.out.println("Digite o gênero do livro");
                    String genero = sc.nextLine();

                    Livro livro = new Livro(titulo, autor, genero);
                    livros.add(livro.toString());
                    break;

                case 2:
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        System.out.println("======================Lista de Livros======================");
                        for(int i = 0; i < livros.size(); i++) {
                            System.out.printf("%s\n", livros.get(i));
                        }
                        System.out.println("===========================================================");
                    }
                    System.out.println("Deseja encerrar o sistema? 1 para sim, 2 para não");
                    opcao = sc.nextInt();

                    if (opcao == 1) {
                        System.out.println("Encerrando o sistema...");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
