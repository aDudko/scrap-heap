import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int index = 0;
        String winner = "";

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            boolean accept = StdRandom.bernoulli(1 / (index + 1.0));
            if (accept) {
                winner = word;
            }
            index++;
        }
        StdOut.println(winner);
    }
}
