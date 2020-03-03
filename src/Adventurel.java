import java.util.Scanner;

public class Adventurel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer1, answer2, answer3, response;
        response = "";

        System.out.print("WELCOME TO LEIGITWING'S TINY ADVENTURE!\nYou are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?\n> ");
        answer1 = keyboard.next();

        if (answer1.equals("kitchen")) {
            System.out.print("\nThere is a long countertop with dirty dishes everywehre. Off to one side there is, as you'd expect, a fridge. You may open the \"fridge\" or look in a \"cabinet\".\n> ");
            answer2 = keyboard.next();

            if (answer2.equals("fridge")) {
                System.out.print("\nInside the fridge you see food and stuff. It looks pretty nesty.\nWould you like to eat some of the food? (\"yes\" or \"no\")\n> ");
                answer3 = keyboard.next();
            
                if (answer3.equals("no")) {
                    response = "You die of starvation... eventuall.";
                } else {
                    response = "You hear a song by Post Malone, 'Goodbyes, Goodbyes, Goodyes...'";
                }
            } else if (answer2.equals("cabinet")){
                System.out.print("\nInside the cabinet you see a box. It looks pretty shiny.\nWould you open it?(\"yes\" or \"no\")\n> ");
                answer3 = keyboard.next();

                if (answer3.equals("no")) {
                    response = "You put the box back where you found it when you turned around. And you found a gold!";
                } else {
                    response = "BOOM!";
                }
            }    
        } else if (answer1.equals("upstairs")) {
            System.out.print("\nUpstairs you see a hallway. Ath the end of the hallway is the master \"bedroom\". Ther is also a \"bathroom\" off the hallway. Where would you like to go?\n> ");
            answer2 = keyboard.next();

            if(answer2.equals("bedroom")) {
                System.out.print("\nYou are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")\n> ");
                answer3 = keyboard.next();

                if (answer3.equals("no")) {
                    response = "Well, then I guess you'll never know what was in there.\nI'm tired of making nested if statements.";
                } else {
                    response = "You just fall asleep, and never awake.";
                }
            } else if (answer2.equals("bathroom")) {
                System.out.print("\nYou found a window in the bathroom. Would you jump from it? (\"yes\" or \"no\")\n> ");
                answer3 = keyboard.next();

                if (answer3.equals("no")) {
                    response = "You starve in the bathroom.";
                } else {
                    response = "Finally, you escape this creepy house!";
                }
            }
        }
        System.out.println(response);
    }
}