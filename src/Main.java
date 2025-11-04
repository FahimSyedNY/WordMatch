import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));
        WordMatch game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));
        WordMatch abctest = new WordMatch("");
        System.out.println(abctest.findBetterGuess("z", "a"));
        System.out.println(abctest.findBetterGuess("a", "z"));
        System.out.println(abctest.findBetterGuess("bbba", "a"));
        System.out.println(abctest.findBetterGuess("a", "bbba"));
        System.out.println(abctest.findBetterGuess("abc", "cba"));
        System.out.println(abctest.findBetterGuess("cba", "abc"));
        System.out.print("------------------\n\n\n------------------\n");
        System.out.println("Total Score: " + totalScore());
    }
    public static int totalScore() throws FileNotFoundException {
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);
        String[] words;
        WordMatch solver;
        int score = 0;
        while (s.hasNextLine()) {
            words = s.nextLine().split(" ");
            solver = new WordMatch(words[0]);
//            Test what is stored in the vars:
//            System.out.println("{" + words[0] + ", " + words[1] + ", " + words[2] + "}");
//            System.out.println(solver.findBetterGuess(words[1], words[2]));
            score += solver.scoreGuess(solver.findBetterGuess(words[1], words[2]));
        }
        return score;
    }
}