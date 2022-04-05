import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class businessCard {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);

        System.out.println("Wprowadź imię");
        String name = mySc.nextLine();

        System.out.println("Wprowadź nazwisko");
        String surname = mySc.nextLine();

        System.out.println("Wprowadź telefon");
        String phone = mySc.nextLine();

        System.out.println("Wprowadź miasto");
        String adress = mySc.nextLine();

        String upperLine = "* " + name + " " + surname;
        String lowerLine = "* tel. " + phone + " adress: " + adress;

        int upperLineLength = upperLine.length();
        int lowerLineLength = lowerLine.length();

        int lineLength = Math.max(upperLineLength, lowerLineLength) + 4;
        int diff = lineLength - Math.min(upperLineLength, lowerLineLength);

        if (upperLineLength > lowerLineLength) {
            lowerLine = lowerLine + " ".repeat(diff)+"*";
            upperLine = upperLine+ "    *";
        } else {
            upperLine = upperLine +" ".repeat(diff) + "*";
            lowerLine = lowerLine + "    *";

        }
        String stars = "*".repeat(lineLength+1);


        System.out.println(stars);
        System.out.println(upperLine);
        System.out.println(lowerLine);
        System.out.println(stars);
    }
}
