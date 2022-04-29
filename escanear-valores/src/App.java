import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        String x;
        int y;
        y = sc.nextInt();
        x = sc.next();
        System.out.println("Seu nome é " + x + " e a idade " + y);
        
        sc.close();
    }
}
