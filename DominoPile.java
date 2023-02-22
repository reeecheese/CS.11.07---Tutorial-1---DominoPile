import java.util.ArrayList;import java.util.Random;

public class DominoPile {
    ArrayList<Integer> pile;
    DominoPile(){
        pile.clear();
    }


    public void newStack6(){
        int secCount = 0;
        for (int first = 0; first <= 6; first++){
            for (int sec = secCount; sec <=6; sec++){
                pile.add(first, sec);
            }
            secCount++;}}

    public void shuffleOptionOne(){          //method 1
        ArrayList<Integer> newPile = null;
        Random rand = new Random();
        for (int amountLeft = pile.size(); amountLeft > 0; amountLeft--){
            int random = rand.nextInt(amountLeft);
            newPile.add(pile.get(random));
        }
        pile = newPile;
    }
    public void shuffleOptionTwo(){          //method 1
        ArrayList<Integer> newPile = null;
        Random rand = new Random();
        for (int amountLeft = pile.size(); amountLeft > 0; amountLeft--){
            int random = rand.nextInt(amountLeft);
            newPile.add(pile.get(random));
        }
        pile = newPile;
    }
    public ArrayList getPile(){
        return pile;
    }
}
