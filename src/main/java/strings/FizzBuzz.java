package strings;

import java.util.Arrays;

/**
 * For each number divisible by three the computer will display the word “fizz”,
 *  For each number divisible by five the computer will display the word “buzz”,
 * For each number divisible by three and by five the computer will display the word “fizz-buzz”,
 * FizzBuzz = Fizz*Buzz
 */

public class FizzBuzz {

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String FIZZBUZZ = "FizzBuzz";

    private int from;
    private int to;
    private int fizz;
    private int buzz;


    private String[] game;

    public FizzBuzz(int from, int to, int fizz, int buzz){

        this.from = from;
        this.to = to;
        this.fizz = fizz;
        this.buzz = buzz;
        this.game = new String[to - from + 1];

    }

    public void setGame(){
        for(int ind = 0; ind < this.game.length; ind++) {
            if ((ind + this.from) % (fizz * buzz) == 0) {
                game[ind] = FIZZBUZZ;
            } else if ((ind + this.from) % (fizz) == 0) {
                game[ind] = FIZZ;
            } else if ((ind + this.from) % (fizz) == 0) {
                game[ind] = FIZZ;
            } else {
                game[ind] = String.valueOf(ind + this.from);
            }
        }
    }

    public String[] getGame() {
        return game;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz(1, 15, 3, 5 );
        fb.setGame();
        System.out.println(Arrays.toString(fb.getGame()));
    }
}
