import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {

    public static String agency;
    public static String customerName;
    public static Random random = new Random();
    public static int number = random.nextInt(10000);
    public static double bankBalance = random.nextDouble(10000);
    public static String formattedBankBalance = String.format("%.2f", bankBalance);

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Bem vindo ao banco Dinheiro Certo!\n\nPor favor, digite o número da sua Agência!");

        agency = reader.nextLine();

        System.out.println("Digite o seu nome completo.");

        customerName = reader.nextLine();

        information();

    }

    public static void information(){
        System.out.println("Olá " + customerName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + formattedBankBalance + " já está disponível para saque");
    }

}