package maps;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

    private static Map<String, String> morseDict = new HashMap<>();

    public String Translate(String morseString) {

        String output = "";

        String[] words = morseString.split(" ");

        for (String word : words) {
            output += morseDict.get(word);
        }
        return "The translation of " + morseString + " is: " + output;
    }

    public MorseTranslator() {

        morseDict.put(".-", "A");
        morseDict.put("-...", "B");
        morseDict.put("-.-.", "C");
        morseDict.put("-..", "D");
        morseDict.put(".", "E");
        morseDict.put("..-.", "F");
        morseDict.put("--.", "G");
        morseDict.put("....", "H");
        morseDict.put("..", "I");
        morseDict.put(".---", "J");
        morseDict.put("-.-", "K");
        morseDict.put(".-..", "L");
        morseDict.put("--", "M");
        morseDict.put("-.", "N");
        morseDict.put("---", "O");
        morseDict.put(".--.", "P");
        morseDict.put("--.-", "Q");
        morseDict.put(".-.", "R");
        morseDict.put("...", "S");
        morseDict.put("-", "T");
        morseDict.put("..-", "U");
        morseDict.put("...-", "V");
        morseDict.put(".--", "W");
        morseDict.put("-..-", "X");
        morseDict.put("-.--", "Y");
        morseDict.put("--..", "Z");
        morseDict.put("/", " ");

    }
}
