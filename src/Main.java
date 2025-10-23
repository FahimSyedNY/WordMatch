public class Main {
    public static void main(String[] args) {
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

    }
}