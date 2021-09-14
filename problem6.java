import java.util.Calendar;
import java.util.Scanner;


public class problem6 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner x = new Scanner(System.in);
        System.out.println("What is your current age?");
        int ans = x.nextInt();
        System.out.println("At what age would you like to retire?");
        int ans2 = x.nextInt();
        int out = ans2 - ans;
        int outYear = cal.get(Calendar.YEAR) + out;

        System.out.println("You have " + out
                + " years left until you can retire.\n" + "It's "
                + cal.get(Calendar.YEAR) + ", so you can retire in " + outYear + ".");
    }
}
