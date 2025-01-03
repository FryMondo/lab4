class Validation {
    // Перевірка чи текст не порожній
    public static void textValidation(String text) {
        if (text.trim().isEmpty()) {
            throw new IllegalArgumentException("Empty string!");
        }
    }
}