public class MoreVariablesAndPrinting {
        public static void main(String[] args) {
            String myName, myEyes, myTeeth, myHair;
            int myAge, myHeight, myWeight;

            myName = "Leigitwing";
            myAge = 22;  // not a lie
            myHeight = 60;  // inches
            myWeight = 100;  //lbs
            myEyes = "Black";
            myTeeth = "yellow";
            myHair = "Black";

            System.out.println("Let's talk about " + myName + ".");
            System.out.println("He's " + myHeight + " inches " + "(or " + myHeight*2.54 + " cm) tall.");
            System.out.println("He's " + myWeight + " pounds " + "(or " + myWeight*0.45359237 + " kg) heavy.");
            System.out.println("Actually, that's not too heavy.");
            System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");

            //This line is tricky; try to get it exactly right.
            System.out.println("If i add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + "."); 
        }
}