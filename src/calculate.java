import java.util.Scanner;
public class calculate {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first number: ");
        float x = scanner.nextInt();

        System.out.println("Insert the second number: ");
        float y = scanner.nextInt();

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
    static void sum (float x, float y){
        System.out.println(x+y);
    }
    static void minus (float x, float y){

        System.out.println(x-y);

    }

    static void divide (float x, float y){
        double c = x/y;
        System.out.println(c);
    }

    static void multipli (float x, float y){

        System.out.println(x*y);

    }

}
