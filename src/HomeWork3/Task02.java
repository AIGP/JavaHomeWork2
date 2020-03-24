package HomeWork3;

import java.util.ArrayList;

public class Task02 {
    public static void main(String[] args) {
        /* Task 02 */
        System.out.println("Task 02");
        PhoneBook phoneBook = new PhoneBook();
        ArrayList<String> arr;
        phoneBook.addPerson("Иванов","ivanov@mail.com","+7987654321");
        phoneBook.addPerson("Иванов","ivanovIvanIvan@mail.com","+7987000321");
        phoneBook.addPerson("Иванов","ivan@mail.com","+7987650000");
        phoneBook.addPerson("Петров","petrov@mail.com","+7496654321");
        phoneBook.addPerson("Петров","petrovPetr@mail.com","+74966001233");
        arr=phoneBook.getEmails("Петров");
        System.out.println(arr);
        arr=phoneBook.getPhones("Иванов");
        System.out.println(arr);
        arr=phoneBook.getPhones("Гумилев");
        System.out.println(arr);
    }
}
