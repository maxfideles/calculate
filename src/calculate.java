import java.util.Scanner;
public class calculate {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first number: ");
        int x = scanner.nextInt();

        System.out.println("Insert the second number: ");
        int y = scanner.nextInt();

        System.out.println("Select the math operation: +, -, / or * ");
        String operation = scanner.next();


        if (operation.equals("+")){
            sum(x,y);
        } else if (operation.equals("-")) {
            minus(x,y);
        } else if (operation.equals("/")){
            divide(x,y);
        } else if (operation.equals("*")) {
            multipli(x,y);
        } else {
            System.out.println("Option unknown");
        }
    }
    static void sum (int x, int y){
        System.out.println(x+y);
    }
    static void minus (int x, int y){

        System.out.println(x-y);

    }

    static void divide (int x, int y){
        double c = x/y;
        System.out.println(c);
    }

    static void multipli (int x, int y){

        System.out.println(x*y);

    }

}
