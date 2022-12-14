package hometasks;

import java.util.HashMap;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap,учитывая, что один человек может иметь несколько телефонов.

public class zadacha1 {
    public static void main(String[] args) {

        Map<String, String> bookFone = new HashMap<>();    
        bookFone.put("Самута И.Г.", "2-23-23");
        bookFone.put("Звягтин А.А.", "3-23-63");
        bookFone.put("Приввалов Д.Н.", "2-76-53");
        bookFone.put("Смирнов К.А.", "3 -15-78");
        bookFone.put("Фадеев С.С.", "2-23-89, 2-43-53");
        bookFone.put("Горшков П.К.", "2-15-13");
        bookFone.put("Лобанов Г.О.", "3-78-99, 2-29-00");
        System.out.println(bookFone.get("Самута И.Г."));
        System.out.println(bookFone.get("Лобанов Г.О."));

        addBookFone(bookFone, "Козлов А.Д.", "2-02-45");

        System.out.println(bookFone.get("Козлов А.Д."));

        deleteBookFone(bookFone, "Самута И.Г.");

        System.out.println(bookFone);
    }

    // Добавить или изменить или изменить данные
    public static void addBookFone(Map<String, String> dict, String name, String number){
        dict.put(name, number);
    }
    // Удалить данные
    public static void deleteBookFone(Map<String, String> dict, String name){
        dict.remove(name);
    }
}