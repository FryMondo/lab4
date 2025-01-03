import java.util.ArrayList;
import java.util.List;

class Word {
    // Клас для слів речення
    private List<Letter> letters;

    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    public String getWord() {
        StringBuilder word = new StringBuilder();
        for (Letter letter : letters) {
            word.append(letter.getValue());
        }
        return word.toString();
    }

    public void removeLastLetter() {
        if (letters.size() > 1) {
            letters.remove(letters.size() - 1);
        }
    }
}