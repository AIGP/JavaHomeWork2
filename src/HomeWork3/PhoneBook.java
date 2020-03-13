package HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    HashMap<String, ArrayList<Person>> phoneBook;
    PhoneBook(){
        phoneBook=new HashMap<>();
    }
    void addPerson(String surname, String email, String phone){
        if(phoneBook.get(surname) == null){
            ArrayList<Person> arr = new ArrayList<>();
            arr.add(new Person(surname, email, phone));
            phoneBook.put(surname, arr);
        }
        else{
            phoneBook.get(surname).add(new Person(surname, email, phone));
        }
    }

    ArrayList<String> getPhones(String surname){
        ArrayList<String> arr = new ArrayList<>();
        if (phoneBook.get(surname) != null) {
            for(int i=0; i<phoneBook.get(surname).size();i++){
                arr.add(phoneBook.get(surname).get(i).getPhone());
            }
        }
        return arr;
    }
    ArrayList<String> getEmails(String surname){
        ArrayList<String> arr = new ArrayList<>();
        if (phoneBook.get(surname) != null) {
            for(int i=0; i<phoneBook.get(surname).size();i++){
                arr.add(phoneBook.get(surname).get(i).getEmail());
            }
        }
        return arr;
    }
}
