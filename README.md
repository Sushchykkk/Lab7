# Lab7
лабораторна робота №7
Виконав ``Сущик Олександр`` групи ``ТР-23``

Посилання на мій GitHub: ``https://github.com/Sushchykkk``
## Опис до класу Car
Клас `Car` представляє автомобіль і має наступні властивості:

- `brand` (String): марка автомобіля.
- `enginePower` (double): потужність двигуна автомобіля.
- `driver` (Driver): об'єкт, який представляє водія автомобіля. (Потрібно мати окремий клас `Driver` для цього.)
- `price` (double): вартість автомобіля.
- `year` (int): рік випуску автомобіля.

Клас `Car` має конструктор, який приймає значення для всіх властивостей автомобіля і встановлює їх значення.

Також в класі `Car` є методи доступу (гетери і сетери) для кожної властивості, які дозволяють отримувати значення властивостей і встановлювати нові значення.

Метод `toString` перевизначений для представлення об'єкта `Car` у вигляді рядка, який містить значення всіх його властивостей.

Цей клас дозволяє створювати об'єкти автомобілів, встановлювати та отримувати їх властивості та представляти їх у зручному для виведення вигляді.
___
## Опис до класу Driver

Клас `Driver` представляє водія і має наступні властивості:

- `name` (String): ім'я водія.
- `age` (int): вік водія.
- `experience` (int): стаж водія.

Клас `Driver` має конструктор, який приймає значення для всіх властивостей водія і встановлює їх значення.

Також в класі `Driver` є методи доступу (гетери і сетери) для кожної властивості, які дозволяють отримувати значення властивостей і встановлювати нові значення.

Метод `toString` перевизначений для представлення об'єкта `Driver` у вигляді рядка, який містить значення всіх його властивостей.

Цей клас дозволяє створювати об'єкти водіїв, встановлювати та отримувати їх властивості та представляти їх у зручному для виведення вигляді.
___
## Опис до класу Main
Цей код демонструє використання класу `HashMap` для створення телефонної книги. Основні кроки в програмі такі:

1. Створення об'єкту `HashMap` зі зберіганням прізвищ та номерів телефонів.
2. Додавання елементів до книги за допомогою методу `put(key, value)` об'єкту `HashMap`.
3. Виведення всіх записів з книги за допомогою ітерації через `entrySet()` об'єкту `HashMap`.
4. Введення прізвища для пошуку номеру телефону.
5. Пошук номера телефону за прізвищем за допомогою методу `containsKey(key)` та `get(key)` об'єкту `HashMap`.
6. Видалення довільного запису з книги за допомогою методу `remove(key)` об'єкту `HashMap`.
7. Виведення кількості записів у книзі за допомогою методу `size()` об'єкту `HashMap`.

Цей код демонструє роботу зі збереженням та отриманням даних у вигляді пари ключ-значення за допомогою `HashMap`.
___
## Опис до класу PhoneBook
Цей код демонструє використання класу `HashMap` для реалізації телефонної книги. Основні кроки в програмі такі:

1. Створення об'єкту `HashMap` для зберігання прізвищ та номерів телефонів.
2. Додавання елементів до книги за допомогою методу `put(key, value)` об'єкту `HashMap`.
3. Отримання розміру книги за допомогою методу `size()` об'єкту `HashMap`.
4. Виведення всіх записів з книги за допомогою ітерації через `entrySet()` об'єкту `HashMap`.
5. Пошук номера телефону за прізвищем за допомогою методу `containsKey(key)` та `get(key)` об'єкту `HashMap`.
6. Видалення довільного запису з книги за допомогою методу `remove(key)` об'єкту `HashMap`.
7. Перевірка наявності значення в книзі за допомогою методу `containsValue(value)` об'єкту `HashMap`.

Цей код демонструє роботу зі збереженням та отриманням даних у вигляді пари ключ-значення за допомогою `HashMap` і використання різних методів цього класу для роботи з даними.
___

