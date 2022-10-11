import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(System.in);
        System.out.println("insira a temperatura em graus fahrenheit");
        Float fahrenheit = S.nextFloat();

        // transformar em graus celsius 
        Float celsius = 5 * ( ( fahrenheit-32 ) /9);
        System.out.println(fahrenheit+ "graus fahrenheit, equivalem a" + celsius + "graus celsius" );

    }
}