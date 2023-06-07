import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        // Створення об'єкту HashMap для зберігання прізвищ та номерів телефонів
        Map<String, String> phoneBook = new HashMap<>();

        // Додавання елементів до книги
        phoneBook.put("Назаренко", "0642512397");
        phoneBook.put("Іванов", "09563652841");
        phoneBook.put("Сидоров", "05006253620");
        phoneBook.put("Ковальчук", "0502362456");
        phoneBook.put("Семенов", "0692356852");
        phoneBook.put("Мельник", "0651236589");
        phoneBook.put("Коваленко", "06532655987");
        phoneBook.put("Бондаренко", "0502315784");
        phoneBook.put("Шевченко", "0686986520");
        phoneBook.put("Богданов", "0695252130");

        // Отримання розміру книги
        int size = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + size);

        // Виведення всіх записів з книги
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String lastName = entry.getKey();
            String phoneNumber = entry.getValue();
            System.out.println(lastName + ": " + phoneNumber);
        }

        // Пошук номера телефону за прізвищем
        String searchLastName = "Іванов";
        if (phoneBook.containsKey(searchLastName)) {
            String phoneNumber = phoneBook.get(searchLastName);
            System.out.println("Номер телефону для прізвища " + searchLastName + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Видалення довільного запису з книги
        String removeLastName = "Назаренко";
        phoneBook.remove(removeLastName);
        System.out.println("Запис для прізвища " + removeLastName + " був видалений");

        // Перевірка наявності значення в книзі
        String searchPhoneNumber = "09563652841";
        boolean containsValue = phoneBook.containsValue(searchPhoneNumber);
        System.out.println("Чи є в книзі номер телефону " + searchPhoneNumber + ": " + containsValue);
    }
}
