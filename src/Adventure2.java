import java.util.Scanner;

public class Adventure2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // opening marks
        int nextRoom = 1;
        String response = "";
        String answer1, answer2, answer3;
        answer1 = "";
        answer2 = "";
        answer3 = "";
        
        System.out.println("LEIGITWING'S TINY ADVENTURE2!\n");

        while (nextRoom != 0) {

            // in the central, decide go to kitchen or go upstairs
            if (nextRoom == 1) {
                System.out.print("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?\n> ");
                answer1 = keyboard.next();
                if (answer1.equals("kitchen")) {
                    nextRoom = 2;
                }
                else if(answer1.equals("upstairs")) {
                    nextRoom = 5;
                }
            }
            // when in the kitchen, decide fridge or cabinet
            if (nextRoom == 2) {
                System.out.print("\nThere is a long countertop with dirty dishes everywehre. Off to one side there is, as you'd expect, a fridge. You may open the \"fridge\" or go \"back\" or look in a \"cabinet\".\n> ");
                answer2 = keyboard.next();
                if(answer2.equals("fridge")) {
                    nextRoom = 3;
                }
                else if(answer2.equals("back")) {
                    nextRoom = 1;
                }
                else if (answer2.equals("cabinet")) {
                    nextRoom = 4;
                }
            }
            if (nextRoom == 3) {
                System.out.print("\nInside the fridge you see food and stuff. It looks pretty nesty.\nWould you like to eat some of the food? (\"yes\" or \"no\")\n> ");
                answer3 = keyboard.next();
            
                if (answer3.equals("no")) {
                    response = "You die of starvation... eventuall.";
                } else {
                    response = "You hear a song by Post Malone, 'Goodbyes, Goodbyes, Goodyes...'";
                }
                nextRoom = 0;
            }
                
            
            if (nextRoom == 4) {
                System.out.print("\nInside the cabinet you see a box. It looks pretty shiny.\nWould you open it?(\"yes\" or \"no\")\n> ");
                answer3 = keyboard.next();

                if (answer3.equals("no")) {
                    response = "You put the box back where you found it when you turned around. And you found a gold!";
                } else {
                    response = "BOOM!";
                }
                nextRoom = 0;
            }
                  
            if (nextRoom == 5) {
                System.out.print("\nUpstairs you see a hallway. Ath the end of the hallway is the master \"bedroom\". Ther is also a \"bathroom\" off the hallway. Where would you like to go?\n> ");
                answer2 = keyboard.next();

                if (answer2.equals("bedroom")) {
                    nextRoom = 6;
                }
                else if (answer2.equals("bathroom")) {
                    nextRoom = 7;
                }
            }

            if (nextRoom == 6) {
                System.out.print("\nYou are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")\n> ");
                answer3 = keyboard.next();

                if (answer3.equals("no")) {
                    response = "Well, then I guess you'll never know what was in there.\nI'm tired of making nested if statements.";
                } else {
                    response = "You just fall asleep, and never awake.";
                }
                nextRoom = 0;

            }

            if (nextRoom == 7) {
                System.out.print("\nYou found a window in the bathroom. Would you jump from it? (\"yes\" or \"no\")\n> ");
                answer3 = keyboard.next();

                if (answer3.equals("no")) {
                    response = "You starve in the bathroom.";
                } else {
                    response = "Finally, you escape this creepy house!";
                }
                nextRoom = 0;

            }
                
                
        }
    
        System.out.println(response);

    }
}