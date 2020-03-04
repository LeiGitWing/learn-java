import java.util.Random;

public class FortunesCookies {
    public static void main(String[] args) {
        Random r = new Random();
        int choice = r.nextInt(7);
        int lotto1 = r.nextInt(54) + 1;
        int lotto2 = r.nextInt(54) + 1;
        int lotto3 = r.nextInt(54) + 1;
        int lotto4 = r.nextInt(54) + 1;
        int lotto5 = r.nextInt(54) + 1;
        int lotto6 = r.nextInt(54) + 1;
        String response = "";

        if (choice == 0) {
            response = "You will find happiness with a new love.";
        }
        else if (choice == 1) {
            response = "Stick with your wife.";
        }
        else if (choice == 2) {
            response = "Get lost in the right direction.";
        }
        else if (choice == 3) {
            response = "There are no rules.";
        }
        else if (choice == 4) {
            response = "Be kind to other human beings.";
        }
        else if (choice == 5) {
            response = "Stop saying yes to things you don't want to do.";
        }
        else if (choice == 6) {
            response = "Nobody ever got anywhere by standing still.";
        }
        System.out.println("Fortune cookie says: " + response + "\n\t" + lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6);
    }
}