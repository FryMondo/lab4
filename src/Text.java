import java.util.ArrayList;
import java.util.List;

class Text {
    private List<Sentence> sentences;

    public Text(String text) {
        sentences = new ArrayList<>();
        String[] sentenceArray = text.split("(?<=[.!?])\s*");
        for (String s : sentenceArray) {
            sentences.add(new Sentence(s.trim()));
        }
    }

    public String getText() {
        StringBuilder text = new StringBuilder();
        for (Sentence sentence : sentences) {
            text.append(sentence.getSentence()).append(" ");
        }
        return text.toString().trim();
    }

    public void processText() {
        for (Sentence sentence : sentences) {
            sentence.processWords();
        }
    }
}