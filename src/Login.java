import java.util.Scanner;

public class Login {

    public static void Login1(){

        String password = "12345";

        System.out.println("Digite a sua senha:");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        System.out.println(pass.equals(password));

    }



}
