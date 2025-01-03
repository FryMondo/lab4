class deleteLetter {
    public static String deleteLetter(String text) {
        // Створюємо масив із слів використовуючи RegEx
        // Текст розділяється на слова, а "розділювачем" є пробіл
        String[] words = text.split(" ");

        // Створюємо змінну для запису результату
        String result = "";

        // Циклом for-each проходимося по всім словам
        for (String word : words) {
            // Якщо слово складається з одного символу
            if (word.length() == 1) {
                result += word + " ";
                continue;
            }

            // Якщо речення закінчується на 3 крапки
            if (word.endsWith("...")) {
                result += word.substring(0, word.length() - 4) + "... ";
                continue;
            }

            // Якщо речення містить розділовий знак або "!", "?", "."
            char lastChar = word.charAt(word.length() - 1);
            if (lastChar == '.' || lastChar == '!' || lastChar == '?' || lastChar == ',' || lastChar == ';' ||
                    lastChar == ':') {
                result += word.substring(0, word.length() - 2) + lastChar + " ";
                continue;
            }

            // Для звичайних слів
            result += word.substring(0, word.length() - 1) + " ";
        }
        return result.trim();
    }
}