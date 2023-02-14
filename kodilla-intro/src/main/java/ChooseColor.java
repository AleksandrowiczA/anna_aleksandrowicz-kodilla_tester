import java.util.Scanner;

public class ChooseColor {

    public static String  getColor()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first letter of color: ");
        String letter = scanner.nextLine().trim().toUpperCase();
        return letter;

    }
}
