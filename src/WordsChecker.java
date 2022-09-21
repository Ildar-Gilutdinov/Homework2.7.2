import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    boolean hasWord(String word) { //метод проверка наличия передаваемого слова в тексте
        Set<String> set = new HashSet<>(); //создаем коллекцию HashSet
        for (String words : text.split("\\P{IsAlphabetic}+")) { //проходим циклом forEach
            set.add(words); // добавляем слова в коллекцию HashSet
        }
        return set.contains(word);
    }
}