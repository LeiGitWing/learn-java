public class TestCompartTo {
    public static void main(String[] args) {
        String guess = "2";
        String card1 = "\n\t##\n\t##\n\t##\n\t1";
        String card2 = "\n\t##\n\t##\n\t##\n\t2";
        int compare1 = guess.compareTo(card1);
        int compare2 = guess.compareTo(card2);

        System.out.println("compare guess 2 to card 1" + compare1 + "\ncompare guess 2 to card 2" + compare2);
        

    }
}