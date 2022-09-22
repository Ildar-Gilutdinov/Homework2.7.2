import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String text;
    protected Set<String> set;

    public WordsChecker(String text) {
        this.text = text;
        set = new HashSet<>(); //создаем коллекцию HashSet
        for (String words : text.split("\\P{IsAlphabetic}+")) { //проходим циклом forEach
            set.add(words); // добавляем слова в коллекцию HashSet
        }
    }

    public boolean hasWord(String word) { //метод проверка наличия передаваемого слова в тексте
        return set.contains(word);
    }
}