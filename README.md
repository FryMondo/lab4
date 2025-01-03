# Lab4 Repository
## Виконав
- Студент групи ІА-22
- Птачик Роман
- Варіант: 15 (С11 = 4)
## How to launch project
### Clone the repository:
```
git clone https://github.com/FryMondo/lab4.git
```
### Running project
If you use IDE, open project and run ***TextProcessor.java***
### Running project via console
Move to the directory
```
lab4/src
```
Run next commands
```
javac *.java
java TextProcessor
```
## Project Structure
### TextProcessor.java
- Executes the main logic of the program.
- Reads input text and replaces sequences of tabs and spaces with a single space.
- Validates the text to ensure it is not empty.
- Converts the text into a Text object consisting of sentences, words, and letters.
- Processes the text by removing the last letter of each word (except words with a single character).
- Outputs the processed text and the sequence of last letters from each word.
### Letter.java
- Represents a single letter as a class.
- Contains a field to store the letter and a getter to access it.
### Word.java
- Represents a word as a collection of Letter objects.
- Parses a string into individual letters to create the word.
- Provides methods to:
  - Retrieve the full word as a string.
  - Remove the last letter of the word (if it contains more than one letter).
  - Access the last letter of the word.
### Sentence.java
- Represents a sentence as a collection of Word objects and punctuation marks.
- Parses a string into words and punctuation using regular expressions.
- Provides methods to:
  - Retrieve the full sentence as a string.
  - Process the sentence by removing the last letter of each word.
  - Extract the last letters of all words in the sentence.
### Text.java
- Represents a text as a collection of Sentence objects.
- Parses a string into sentences using punctuation delimiters (e.g., ., ?, !).
- Provides methods to:
  - Retrieve the full text as a string.
  - Process all sentences in the text by removing the last letter of each word.
  - Extract the last letters of all words across the text.
### DelLetter.java
- Contains a static method to extract all the last letters of words in a Text object.
- Gathers the letters from processed words and combines them into a single string.
### Validation.java
- Validates the input text to ensure it is not null or empty after trimming.
- Throws an IllegalArgumentException for invalid input.
