import java.util.Scanner;
public class businessCard {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("Wprowadź imię");
        String name = mySc.nextLine();
        System.out.println("Wprowadź nazwisko");
        String surname = mySc.nextLine();
        System.out.println("Wprowadź telefon");
        String tel = mySc.nextLine();
        System.out.println("Wprowadź miasto");
        String city = mySc.nextLine();

        String upperLine = "* " + name + " " + surname;
        String lowerLine = "* tel. " + phone + " adress: " + adress;

        int upperLineLength = upperLine.length();
        int lowerLineLength = lowerLine.length();

        int lineLength = Math.max(upperLineLength, lowerLineLength);

        String stars = "*".repeat(lineLength);

        System.out.println(stars);
        System.out.println(upperLine);
        System.out.println(lowerLine);
        System.out.println(stars);
    }
}
