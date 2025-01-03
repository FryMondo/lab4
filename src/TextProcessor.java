public class TextProcessor {
    public static void main(String[] args) {
        // Оголошення тексту типу String
        String text = "Сонце вже заходило; небо ставало темнішим. Вітерець дув з півдня, несучи з собою прохолоду. " +
                "Несподівано, перед ним з'явився кіт. Що ж робити: залишитися вдома чи все-таки піти на прогулянку? " +
                "Крок за кроком, він наближався до свого рішення...";

        // Заміна послідовності табуляції та пробілів на 1 пробіл
        text = text.replaceAll("\\s+", " ").trim();

        try {
            // Викликаємо метод валідації
            Validation.textValidation(text);

            // Обробка тексту
            Text processedText = new Text(text);
            processedText.processText();

            // Виводимо оброблений текст в якому прибирається останній символ в слові, окрім слів в яких 1 символ
            System.out.println(deleteLetter.deleteLetter(processedText.getText()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


