package HomeWork3;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String str = "Я помню чудное мгновенье:\n" +
                "Передо мной явилась ты,\n" +
                "Как мимолетное виденье,\n" +
                "Как гений чистой красоты.\n" +
                "В томленьях грусти безнадежной,\n" +
                "В тревогах шумной суеты,\n" +
                "Звучал мне долго голос нежный\n" +
                "И снились милые черты.\n" +
                "Шли годы. Бурь порыв мятежный\n" +
                "Рассеял прежние мечты,\n" +
                "И я забыл твой голос нежный,\n" +
                "Твои небесные черты.\n" +
                "В глуши, во мраке заточенья\n" +
                "Тянулись тихо дни мои\n" +
                "Без божества, без вдохновенья,\n" +
                "Без слез, без жизни, без любви.\n" +
                "Душе настало пробужденье:\n" +
                "И вот опять явилась ты,\n" +
                "Как мимолетное виденье,\n" +
                "Как гений чистой красоты.\n" +
                "И сердце бьется в упоенье,\n" +
                "И для него воскресли вновь\n" +
                "И божество, и вдохновенье,\n" +
                "И жизнь, и слезы, и любовь.";
        str = str.replace(".","");
        str = str.replace(",","");
        str = str.replace(":","");
        str = str.toUpperCase();
        String[] arr = str.split("[ \n]");
        HashMap<String,Integer> dict = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (dict.containsKey(arr[i])) {
                dict.put(arr[i],dict.get(arr[i]) + 1);
            } else {
                dict.put(arr[i],1);
            }
        }

        dict.forEach((key, value) -> System.out.printf("Слово: %s  Количество: %d \n", key, value));
    }
}
