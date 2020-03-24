package HomeWork3;

public class Person {
    String surname;
    String email;
    String phone;

    Person(String surname, String email, String phone){
        this.surname=surname;
        this.email=email;
        this.phone=phone;
    }
    String getSurname(){return surname;}
    String getEmail(){return email;}
    String getPhone(){return phone;}
}
