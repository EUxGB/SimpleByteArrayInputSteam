import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        String str = scanner.next();
        String str2 = scanner.nextLine();

        System.out.printf("Number %d  Float %2f  String %s  Line %s ", i,f,str,str2);

    }
}
