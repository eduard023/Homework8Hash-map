import java.util.HashMap;
import java.util.Map;

public class Main {
    //Task1.1
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone("Иван Иванов","8991187561");
        phoneBook.addPhone("Алексей Иванов","89915541612");
        phoneBook.addPhone("Сергей Иванов","89911878555");
        phoneBook.addPhone("Иван Смирнов","89711805614");
        phoneBook.addPhone("Иван Алексеев","89611575112");
        phoneBook.addPhone("Иван Петвров","88911895616");
        phoneBook.addPhone("Эдуард Иванов","89911875611");
        phoneBook.addPhone("Иван Соловьев","89911871452");
        phoneBook.addPhone("Иван Псов","89789875613");
        phoneBook.addPhone("Павел Иванов","89911874564");
        phoneBook.addPhone("Иван Котов","89911812315");
        phoneBook.addPhone("Станислав Королев","89918475616");
        phoneBook.addPhone("Иван Змеев","88011875617");
        phoneBook.addPhone("Салафат Иванов","+79911275618");
        phoneBook.addPhone("Салат Сенов","89918975619");
        phoneBook.addPhone("Альберт Лапин","89911875610");
        phoneBook.addPhone("Завен Лопухов","+798811875610");
        phoneBook.addPhone("Никита Жорин","89978945610");
        phoneBook.addPhone("Саша Лапин","89911259610");
        phoneBook.addPhone("Альберт Корогоз","+789911875753");


        for (Map.Entry<String, String> entry: phoneBook.getEntries()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            
        }
        //Task 1.3
        Task3 map = new Task3();
        map.addToMap("str1", 2);
        map.addToMap("str2", 1);
        System.out.println(map);
        map.addToMap("str1", 5);
        System.out.println(map);
    }

}