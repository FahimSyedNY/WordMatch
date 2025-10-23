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
            if(secret.startsWith(guess, i)) score++;
        }
        return score * guess.length() * guess.length();
    }
    // returns better of two guesses
    public String findBetterGuess(String guess1, String guess2) {
        if (scoreGuess(guess1) > scoreGuess(guess2)) return guess1;
        if (scoreGuess(guess2) > scoreGuess(guess1)) return guess2;
        if (guess1.compareTo(guess2) > 0) return guess2;
        return guess1;
    }
}
