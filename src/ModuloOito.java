import java.util.Scanner;

public class ModuloOito {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /* 1. Nome */
        System.out.println("\nDigite seu nome:");
        String nome = sc.nextLine();

        /* 2. Número positivo */
        System.out.println("\nDigite um número positivo:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido. Reinicie.");
            return;
        }

        /* 3. Crescente (0 até n) */
        System.out.println("\nCrescente:\n");
        for (int x = 0; x <= n; x++) {
            System.out.println(x);
        }

        /* 4. Decrescente (n até 0) */
        System.out.println("\nDecrescente:\n");
        for (int y = n; y >= 0; y--) {
            System.out.println(y);
        }
        /* 5. Nome */
        if (nome.length() > 6){
            System.out.println("\nNome repetido " + n + " vezes:\n");
            for (int z = 0; z < n; z++){
                System.out.println(nome);
            }
        } else {
            System.out.println("\n\nNome uma unica vez: " + nome);
        }
    }
}




