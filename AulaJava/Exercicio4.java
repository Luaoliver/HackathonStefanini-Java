import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha uma opcao: 1 - arara; 2 - almanaque; 3 - ana; 4 - reviver.");
        int opcaoEscolhida =  entrada.nextInt();

        System.out.println("Sua escolha foi: " + opcaoEscolhida);  

        switch(opcaoEscolhida){  

            case 1: System.out.println("arara e um palindromo");
            break; 
            case 2: System.out.println("almanaque nao e um palindromo");
            break;   
            case 3: System.out.println("ana e um palindromo");
            break; 
            case 4: System.out.println("reviver e um palindromo");
            break;   
            default:System.out.println("opcao invalida");
        }
    }
}