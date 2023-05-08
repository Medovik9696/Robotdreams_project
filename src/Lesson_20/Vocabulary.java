package Lesson_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Vocabulary {
    public static void main(String[] args) {
        Map<String, WordsTranslate> wordsTranslateMap = new HashMap<>();
        wordsTranslateMap.put("Паляниця", new WordsTranslate("Loaf","パン","Laib"));
        wordsTranslateMap.put("Полуниця", new WordsTranslate("Strawberry","いちご","Erdbeere"));
        wordsTranslateMap.put("Всесвіт", new WordsTranslate("Universe","宇宙","Universum"));
        wordsTranslateMap.put("Світ", new WordsTranslate("World","世界","Welt"));
        wordsTranslateMap.put("Мир", new WordsTranslate("Peace","平和","Frieden"));
        wordsTranslateMap.put("Людина", new WordsTranslate("Man","男","Mann"));
        wordsTranslateMap.put("Тварина", new WordsTranslate("Animal","動物","Tier"));
        wordsTranslateMap.put("Автомобіль", new WordsTranslate("Car","車","Auto"));
        wordsTranslateMap.put("Чай", new WordsTranslate("Tee","お茶","Tee"));
        wordsTranslateMap.put("Кава", new WordsTranslate("Coffee","コーヒー","Kaffee"));

        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Input a word: ");
            String key = in.nextLine();
            if(wordsTranslateMap.containsKey(key)) {System.out.println(getWordAndTranslations(key,wordsTranslateMap));
            }
            else System.out.println("Спробуйте інше слово");}
        }
    static public String getWordAndTranslations(String mapsKey, Map ourMap){
        String result = mapsKey + ": " + ourMap.get(mapsKey).toString();
        return result;
    };
}

class WordsTranslate{
    String english;
    String japanese;
    String german;

    public WordsTranslate() {
    }

    public WordsTranslate(String english, String japanese, String german) {
        this.english = english;
        this.japanese = japanese;
        this.german = german;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordsTranslate that = (WordsTranslate) o;
        return Objects.equals(english, that.english) && Objects.equals(japanese, that.japanese) && Objects.equals(german, that.german);
    }

    @Override
    public int hashCode() {
        return Objects.hash(english, japanese, german);
    }

    @Override
    public String toString() {
        return
                "English='" + english + '\'' +
                ", Japanese='" + japanese + '\'' +
                ", German='" + german + '\'' +
                ';';
    }
}
