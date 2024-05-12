
import java.util.Scanner;



public class contaTerminal{

    //Método que limpa a tela 
    public static void limparTela (){

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) throws Exception {


        System.out.println ("----------------Sistema Bancário------------------");
        System.out.println ("--------------------------------------------------");
        

        Scanner inputScanner = new Scanner (System.in);

        System.out.println("Por favor digite o número da Agência: ");
        String numeroAgencia= inputScanner.nextLine();

     
        limparTela();

        System.out.println("Digite o número da Conta: ");
        int numeroConta= inputScanner.nextInt();

        limparTela();

        inputScanner.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nome= inputScanner.nextLine(); 

        //Exige que o cliente digite apenas espaços e letras não aceitando números. 

        while (!nome.matches("[a-zA-Z\\s]+")) {
            System.out.println("Por favor, digite apenas letras. Tente novamente: ");
            nome = inputScanner.nextLine();
        }

        limparTela();
        System.out.println("Digite o valor: ");
        String valorString= inputScanner.nextLine();

        //Aceita que o usuário digite . ou ,
        valorString = valorString.replace(',', '.');

        // Converte a string para double
        double valor = Double.parseDouble(valorString);

        limparTela();

        System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco, sua agência é: [%s] Conta: [%d] e seu saldo de: [%.2f] já está disponível para saque :)%n", nome, numeroAgencia, numeroConta, valor);
        System.out.println();
        System.out.println();
        System.out.println("               Agradecemos a preferência!               ");
        
        
        System.out.println();
        System.out.println();
        System.out.println();


    }
}
