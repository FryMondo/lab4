import java.util.ArrayList;
import java.util.List;

class Sentence {
    // Клас для речень в тексті
    // Може містити в собі слова, розділові знаки та знаки закінчення
    private List<Object> elements; // Can hold both Word and Character (punctuation)

    public Sentence(String sentence) {
        elements = new ArrayList<>();
        String[] parts = sentence.split("(?<=\\W)|(?=\\W)");
        for (String part : parts) {
            if (part.matches("\\w+")) {
                elements.add(new Word(part));
            } else {
                elements.add(part.charAt(0));
            }
        }
    }

    public String getSentence() {
        StringBuilder sentence = new StringBuilder();
        for (Object element : elements) {
            if (element instanceof Word) {
                sentence.append(((Word) element).getWord());
            } else if (element instanceof Character) {
                sentence.append((Character) element);
            }
        }
        return sentence.toString();
    }

    public void processWords() {
        for (Object element : elements) {
            if (element instanceof Word) {
                ((Word) element).removeLastLetter();
            }
        }
    }
}