public class WordMatch {
    private String secret;
    //Input lowercase word
    public WordMatch(String word) {
        secret = word;
    }
    //Returns a guess
    public int scoreGuess(String guess) {
        int score = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if(secret.substring(i, i + guess.length()).equals(guess)) score++;
        }
        return score * guess.length() * guess.length();
    }
    // returns better of two guesses
    public String findBetterGuess(String guess1, String guess2) {
        return null;
    }
}
