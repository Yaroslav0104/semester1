package semester1.practice06;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        //завдання1
//        Student s1 = new Student();
//        s1.name = "Денис";
//        s1.age = 19;
//        s1.gpa = 4.75;
//        System.out.println(s1.name + ", " + s1.age + ", " + s1.gpa);

        //завдання2
//        Car car1 = new Car();
//        Car car2 = new Car();
//        car1.brand = "Toyota";
//        car1.model = "Camry";
//        car1.year = 2021;
//        car1.speed = 180;
//        car2.brand = "BMW";
//        car2.model = "M5";
//        car2.year = 2023;
//        car2.speed = 250;
//        System.out.println("Авто 1: " + car1.brand + " " + car1.model + ", Рік: " + car1.year + ", Швидкість: " + car1.speed);
//        System.out.println("Авто 2: " + car2.brand + " " + car2.model + ", Рік: " + car2.year + ", Швидкість: " + car2.speed);
//        System.out.println();
//        if (car1.year > car2.year) {
//            System.out.println("Новіший автомобіль: " + car1.brand + " " + car1.model + " (" + car1.year + " рік)");
//        } else if (car2.year > car1.year) {
//            System.out.println("Новіший автомобіль: " + car2.brand + " " + car2.model + " (" + car2.year + " рік)");
//        } else {
//            System.out.println("Обидва автомобілі випущені в один і той самий рік (" + car1.year + ")");
//        }

        //завдання3
//        Book emptyBook = new Book();
//        System.out.println("Назва: " + emptyBook.title);
//        System.out.println("Автор: " + emptyBook.author);
//        System.out.println("Сторінок: " + emptyBook.pages);
//        System.out.println("Прочитано: " + emptyBook.isRead);

        //завдання4
//        Rectangle rect = new Rectangle();
//        rect.width = 7.5;
//        rect.height = 4.0;
//        double area = rect.width * rect.height;
//        double perimeter = 2 * (rect.width + rect.height);
//        System.out.println("Ширина: " + rect.width);
//        System.out.println("Висота: " + rect.height);
//        System.out.println("Площа прямокутника: " + area);
//        System.out.println("Периметр прямокутника: " + perimeter);

        //завдання5
//        Product product = new Product();
//        product.name = "Монітор";
//        product.price = 6500.0;
//        product.quantity = 8;
//        double totalValue = product.price * product.quantity;
//        System.out.println("Товар: " + product.name);
//        System.out.println("Ціна за одиницю: " + product.price + " грн");
//        System.out.println("Кількість: " + product.quantity + " шт.");
//        System.out.println("Загальна вартість партії: " + totalValue + " грн");

        //завдання6
//        Smartphone phone = new Smartphone();
//        phone.model = "Samsung Galaxy S23";
//        phone.batteryLevel = 100;
//        phone.isTurnedOn = true;
//        phone.batteryLevel -= 35;
//        if (phone.batteryLevel <= 0) {
//            phone.batteryLevel = 0;
//            phone.isTurnedOn = false;
//        }
//        System.out.println("=== ФІНАЛЬНИЙ СТАН ТЕЛЕФОНУ ===");
//        System.out.println("Модель: " + phone.model);
//        System.out.println("Заряд батареї: " + phone.batteryLevel + "%");
//        System.out.println("Увімкнено: " + phone.isTurnedOn);

        //завдання7
//        Point2D a = new Point2D();
//        a.x = 0.0;
//        a.y = 0.0;
//        Point2D b = new Point2D();
//        b.x = 3.0;
//        b.y = 4.0;
//        double distance = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
//        System.out.println("Точка A: (" + a.x + ", " + a.y + ")");
//        System.out.println("Точка B: (" + b.x + ", " + b.y + ")");
//        System.out.println("Відстань між точками: " + distance);

        //завдання8
//        Student first = new Student();
//        first.name = "Іван";
//        Student second = first;
//        second.name = "Петро";
//        System.out.println(first.name);
        //у пам'яті існує тільки один студент. first і second - це просто два ярлики, які ведуть до цього самого студента, тому один заміняється на інший

        //завдання9
//        Greeter greeter = new Greeter();
//        greeter.sayHello();
//        greeter.sayHelloTo("Денис");

        //завдання10
        //щоб не було забагато лишніх класів окремо, я буду створювати класи тут, щоб було зручніше
//        class Animal {
//            public String species;
//            public String name;
//
//            public void makeSound() {
//                System.out.println(name + " видає звук!");
//            }
//
//            public void printInfo() {
//                System.out.println("Вид: " + species + " | Кличка: " + name);
//            }
//        }
//        Animal cat = new Animal();
//        cat.species = "Кіт";
//        cat.name = "Барсик";
//        Animal dog = new Animal();
//        dog.species = "Собака";
//        dog.name = "Рекс";
//        cat.printInfo();
//        cat.makeSound();
//        System.out.println();
//        dog.printInfo();
//        dog.makeSound();

        //завдання11
//        class Counter {
//            public int count;
//
//            public void increment() {
//                count++;
//            }
//
//            public void decrement() {
//                count--;
//            }
//
//            public void reset() {
//                count = 0;
//            }
//
//            public void printCount() {
//                System.out.println("Поточне значення лічильника: " + count);
//            }
//        }
//        Counter counter = new Counter();
//        counter.increment();
//        counter.increment();
//        counter.increment();
//        counter.decrement();
//        counter.printCount();

        //завдання12
//        class TrafficLight {
//            public String currentColor;
//
//            public void changeColor(String newColor) {
//                currentColor = newColor;
//            }
//
//            public void showSignal() {
//                if (currentColor.equals("Червоний")) {
//                    System.out.println("Стій!");
//                } else if (currentColor.equals("Жовтий")) {
//                    System.out.println("Увага!");
//                } else if (currentColor.equals("Зелений")) {
//                    System.out.println("Їдь!");
//                } else {
//                    System.out.println("Невідомий колір світлофора");
//                }
//            }
//        }
//        TrafficLight light = new TrafficLight();
//        light.changeColor("Червоний");
//        System.out.print("Світлофор: " + light.currentColor + " — ");
//        light.showSignal();
//        light.changeColor("Жовтий");
//        System.out.print("Світлофор: " + light.currentColor + " — ");
//        light.showSignal();
//        light.changeColor("Зелений");
//        System.out.print("Світлофор: " + light.currentColor + " — ");
//        light.showSignal();

        //завдання13
//        class Player {
//            public String nickname;
//            public int health = 100;
//
//            public void takeDamage(int damage) {
//                health -= damage;
//                if (health <= 0) {
//                    health = 0;
//                    System.out.println(nickname + " загинув!");
//                }
//            }
//
//            public void heal(int amount) {
//                health += amount;
//                if (health > 100) {
//                    health = 100;
//                }
//            }
//        }
//        Player player = new Player();
//        player.nickname = "ShadowHunter";
//
//        System.out.println("Гравець " + player.nickname + " увійшов у гру. Здоров'я: " + player.health);
//
//        System.out.println("--- Отримання шкоди (40) ---");
//        player.takeDamage(40);
//        System.out.println("Поточне здоров'я: " + player.health);
//
//        System.out.println("--- Лікування (+30) ---");
//        player.heal(30);
//        System.out.println("Поточне здоров'я: " + player.health);
//
//        System.out.println("--- Отримання смертельної шкоди (150) ---");
//        player.takeDamage(150);
//        System.out.println("Фінальне здоров'я: " + player.health);

        //завдання14
//        class Lamp {
//            public boolean isOn;
//
//            public void turnOn() {
//                isOn = true;
//            }
//
//            public void turnOff() {
//                isOn = false;
//            }
//
//            public void toggle() {
//                isOn = !isOn;
//            }
//
//            public void status() {
//                if (isOn) {
//                    System.out.println("Лампа світить");
//                } else {
//                    System.out.println("Лампа вимкнена");
//                }
//            }
//        }
//        Lamp lamp = new Lamp();
//
//        System.out.print("Початковий стан: ");
//        lamp.status();
//        lamp.turnOn();
//        System.out.print("Після turnOn(): ");
//        lamp.status();
//        System.out.println("--- Перший виклик toggle() ---");
//        lamp.toggle();
//        lamp.status();
//        System.out.println("--- Другий виклик toggle() ---");
//        lamp.toggle();
//        lamp.status();

        //завдання15
//        class Stopwatch {
//            public int seconds;
//
//            public void tick() {
//                seconds++;
//            }
//
//            public void addSeconds(int s) {
//                seconds += s;
//            }
//
//            public void displayTime() {
//                int minutes = seconds / 60;
//                int secs = seconds % 60;
//                String minStr = (minutes < 10 ? "0" : "") + minutes;
//                String secStr = (secs < 10 ? "0" : "") + secs;
//                System.out.println(minStr + ":" + secStr);
//            }
//        }
//        Stopwatch watch = new Stopwatch();
//        watch.tick();
//        watch.tick();
//        watch.tick();
//        System.out.print("Після трьох тіків (3 сек): ");
//        watch.displayTime();
//        watch.addSeconds(122);
//        System.out.print("Після додавання ще 122 секунд (всього 125 сек): ");
//        watch.displayTime();

        //завдання16
//        class Printer {
//            public String model;
//            public int paperCount;
//
//            public void printDocument(String title, int pages) {
//                if (paperCount >= pages) {
//
//                    paperCount -= pages;
//                    System.out.println("Успішно роздруковано документ \"" + title + "\" (" + pages + " стор.). У лотку залишилося: " + paperCount + " арк.");
//                } else {
//                    System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
//                }
//            }
//        }
//        Printer printer = new Printer();
//        printer.model = "HP LaserJet";
//        printer.paperCount = 50;
//        System.out.println("Модель принтера: " + printer.model);
//        System.out.println("Початкова кількість паперу: " + printer.paperCount + " арк.");
//        System.out.println("--- Спроба №1 (друк звіту на 20 сторінок) ---");
//        printer.printDocument("Фінансовий звіт", 20);
//        System.out.println();
//        System.out.println("--- Спроба №2 (друк курсової на 40 сторінок) ---");
//        printer.printDocument("Курсова робота", 40);
//        System.out.println("Кількість паперу після всіх спроб: " + printer.paperCount + " арк.");

        //завдання17
//        class SimpleCalculator {
//
//            public int add(int a, int b) {
//                return a + b;
//            }
//
//            public int subtract(int a, int b) {
//                return a - b;
//            }
//
//            public int multiply(int a, int b) {
//                return a * b;
//            }
//
//            public double divide(int a, int b) {
//                if (b == 0) {
//                    System.out.println("Помилка: Ділення на нуль!");
//                    return 0.0;
//                }
//                return (double) a / b;
//            }
//        }
//        SimpleCalculator calc = new SimpleCalculator();
//        int sumResult = calc.add(20, 5);
//        int subtractResult = calc.subtract(20, 5);
//        int multiplyResult = calc.multiply(20, 5);
//        double divideResult = calc.divide(20, 5);
//        System.out.println("Сума (20 + 5) = " + sumResult);
//        System.out.println("Різниця (20 - 5) = " + subtractResult);
//        System.out.println("Добуток (20 * 5) = " + multiplyResult);
//        System.out.println("Частка (20 / 5) = " + divideResult);
//        System.out.println();
//        System.out.println("--- Перевірка ділення на нуль ---");
//        double zeroDivideResult = calc.divide(15, 0);
//        System.out.println("Результат ділення на нуль: " + zeroDivideResult);

        //завдання18
//        class Circle {
//            public double radius;
//
//            public double getArea() {
//                return Math.PI * radius * radius;
//            }
//
//            public double getCircumference() {
//                return 2 * Math.PI * radius;
//            }
//        }
//        Circle circle = new Circle();
//        circle.radius = 5.0;
//        double area = circle.getArea();
//        double circumference = circle.getCircumference();
//        System.out.println("Радіус кола: " + circle.radius);
//        System.out.println("Площа круга: " + area);
//        System.out.println("Довжина кола: " + circumference);

        //завдання19
//        class TemperatureConverter {
//            public double celsiusToFahrenheit(double c) {
//                return c * 1.8 + 32;
//            }
//
//            public double fahrenheitToCelsius(double f) {
//                return (f - 32) / 1.8;
//            }
//        }
//        TemperatureConverter converter = new TemperatureConverter();
//        double celsiusOriginal = 25.0;
//        double fahrenheit = converter.celsiusToFahrenheit(celsiusOriginal);
//        double celsiusBack = converter.fahrenheitToCelsius(fahrenheit);
//        System.out.println("Початкова температура: " + celsiusOriginal + " °C");
//        System.out.println("У Фаренгейтах: " + fahrenheit + " °F");
//        System.out.println("Назад у Цельсіях: " + celsiusBack + " °C");

        //завдання20
//        class NumberChecker {
//
//            public boolean isEven(int n) {
//                return n % 2 == 0;
//            }
//
//            public boolean isPositive(int n) {
//                return n > 0;
//            }
//
//            public boolean isPrime(int n) {
//                if (n <= 1) {
//                    return false;
//                }
//                for (int i = 2; i <= Math.sqrt(n); i++) {
//                    if (n % i == 0) {
//                        return false;
//                    }
//                }
//                return true;
//            }
//        }
//        NumberChecker checker = new NumberChecker();
//        int[] numbers = {7, 12, -5};
//        for (int i = 0; i < numbers.length; i++) {
//            int num = numbers[i];
//            System.out.println("=== Аналіз числа: " + num + " ===");
//            System.out.println("Парне (isEven): " + checker.isEven(num));
//            System.out.println("Додатне (isPositive): " + checker.isPositive(num));
//            System.out.println("Просте (isPrime): " + checker.isPrime(num));
//            System.out.println();
//        }

        //завдання21
//        class CurrencyExchange {
//            public double usdRate;
//
//            public double toUSD(double uah) {
//                return uah / usdRate;
//            }
//
//            public double toUAH(double usd) {
//                return usd * usdRate;
//            }
//        }
//        CurrencyExchange exchange = new CurrencyExchange();
//        exchange.usdRate = 41.5;
//        double uahAmount = 10000.0;
//        double usdAmount = exchange.toUSD(uahAmount);
//        double roundedUSD = Math.round(usdAmount * 100.0) / 100.0;
//        System.out.println("Сума в гривнях: " + uahAmount + " грн");
//        System.out.println("Поточний курс USD: " + exchange.usdRate + " грн");
//        System.out.println("Результат у доларах: " + roundedUSD + " $");

        //завдання22
//        class Employee {
//            public String name;
//            public double baseSalary;
//            public double bonusPercentage;
//
//            public double calculateTotalSalary() {
//                return baseSalary * (1 + bonusPercentage / 100.0);
//            }
//
//            public double calculateTax() {
//                return calculateTotalSalary() * 0.195;
//            }
//        }
//        Employee emp = new Employee();
//        emp.name = "Андрій";
//        emp.baseSalary = 30000.0;
//        emp.bonusPercentage = 15.0;
//        double totalSalary = emp.calculateTotalSalary();
//        double tax = emp.calculateTax();
//        double roundedTotal = Math.round(totalSalary * 100.0) / 100.0;
//        double roundedTax = Math.round(tax * 100.0) / 100.0;
//        System.out.println("Співробітник: " + emp.name);
//        System.out.println("Базова ставка: " + emp.baseSalary + " грн");
//        System.out.println("Бонус: " + emp.bonusPercentage + "%");
//        System.out.println("Загальна зарплата: " + roundedTotal + " грн");
//        System.out.println("Податок (19.5%): " + roundedTax + " грн");

        //завдання23
//        class TextFormatter {
//            public String formatTitle(String text) {
//                return "*** " + text.toUpperCase() + " ***";
//            }
//
//            public int countVowels(String text) {
//                if (text == null) {
//                    return 0;
//                }
//                int count = 0;
//                String lowerText = text.toLowerCase();
//                String vowels = "аоуеиіяюєїaeiou";
//
//                for (int i = 0; i < lowerText.length(); i++) {
//                    char c = lowerText.charAt(i);
//                    for (int j = 0; j < vowels.length(); j++) {
//                        if (c == vowels.charAt(j)) {
//                            count++;
//                            break;
//                        }
//                    }
//                }
//                return count;
//            }
//        }
//        TextFormatter formatter = new TextFormatter();
//        String word = "Програмування";
//        String formatted = formatter.formatTitle(word);
//        System.out.println("Оригінальне слово: " + word);
//        System.out.println("Форматований заголовок: " + formatted);
//        int vowelsCount = formatter.countVowels(word);
//        System.out.println("Кількість голосних у слові: " + vowelsCount);

        //завдання24
//        class Triangle {
//            public double a;
//            public double b;
//            public double c;
//
//            public boolean isValid() {
//                return (a + b > c) && (a + c > b) && (b + c > a);
//            }
//
//            public double getPerimeter() {
//                return a + b + c;
//            }
//
//            public double getArea() {
//                if (!isValid()) {
//                    return 0.0;
//                }
//                double p = getPerimeter() / 2.0; // півпериметр
//                return Math.sqrt(p * (p - a) * (p - b) * (p - c));
//            }
//        }
//        Triangle triangle = new Triangle();
//        triangle.a = 3.0;
//        triangle.b = 4.0;
//        triangle.c = 5.0;
//        System.out.println("Сторони трикутника: " + triangle.a + ", " + triangle.b + ", " + triangle.c);
//        System.out.println("Чи існує такий трикутник (isValid): " + triangle.isValid());
//        System.out.println("Периметр трикутника: " + triangle.getPerimeter());
//        System.out.println("Площа трикутника: " + triangle.getArea());

        //завдання25
//        class SecretVault {
//            private String secretCode = "Pass123";
//
//            public boolean verifyCode(String attempt) {
//                return secretCode.equals(attempt);
//            }
//        }
//        SecretVault vault = new SecretVault();
//        // vault.secretCode = "hacked"; //private-поле закрите, значить напряму змінити не можна
//        System.out.println("Перевірка коду: " + vault.verifyCode("Pass123"));

        //завдання26
//        class UserAccount {
//            private String username;
//            private String password;
//            public void setCredentials(String u, String p) {
//                username = u;
//                password = p;
//            }
//
//            public boolean login(String enteredUser, String enteredPass) {
//                return username.equals(enteredUser) && password.equals(enteredPass);
//            }
//
//            public void changePassword(String oldPass, String newPass) {
//                if (password.equals(oldPass)) {
//                    password = newPass;
//                    System.out.println("Пароль успішно змінено!");
//                } else {
//                    System.out.println("Помилка: Невірний старий пароль!");
//                }
//            }
//        }
//        UserAccount account = new UserAccount();
//        account.setCredentials("student_denis", "secret123");
//        System.out.println("Спроба входу з невірним паролем: " + account.login("student_denis", "wrongpass"));
//        System.out.println("Спроба входу з вірними даними: " + account.login("student_denis", "secret123"));
//        System.out.println();
//        System.out.println("--- Зміна пароля (невдала) ---");
//        account.changePassword("badpass", "newpass999");
//        System.out.println("--- Зміна пароля (успішна) ---");
//        account.changePassword("secret123", "newpass999");
//        System.out.println("Вхід зі старим паролем: " + account.login("student_denis", "secret123"));
//        System.out.println("Вхід з новим паролем: " + account.login("student_denis", "newpass999"));

        //завдання27
//        class BankAccount {
//            private String accountNumber;
//            private double balance;
//
//            public void setAccountData(String accNum, double initialBalance) {
//                accountNumber = accNum;
//                if (initialBalance >= 0) {
//                    balance = initialBalance;
//                }
//            }
//
//            public void deposit(double amount) {
//                if (amount > 0) {
//                    balance += amount;
//                    System.out.println("Успішно поповнено на: " + amount + " грн");
//                } else {
//                    System.out.println("Помилка: Сума поповнення має бути більшою за 0!");
//                }
//            }
//
//            public boolean withdraw(double amount) {
//                if (amount > 0 && amount <= balance) {
//                    balance -= amount;
//                    System.out.println("Успішно знято: " + amount + " грн");
//                    return true;
//                } else {
//                    System.out.println("Помилка: Недостатньо коштів на рахунку або невірна сума!");
//                    return false;
//                }
//            }
//
//            public double getBalance() {
//                return balance;
//            }
//        }
//        BankAccount account = new BankAccount();
//        account.setAccountData("UA123456789", 1000.0);
//        System.out.println("Початковий баланс: " + account.getBalance() + " грн");
//        System.out.println("--- Спроба зняти 400 грн ---");
//        boolean success1 = account.withdraw(400.0);
//        System.out.println("Результат транзакції: " + success1);
//        System.out.println("Поточний баланс: " + account.getBalance() + " грн");
//        System.out.println("--- Спроба зняти 1500 грн (овердрафт) ---");
//        boolean success2 = account.withdraw(1500.0);
//        System.out.println("Результат транзакції: " + success2);
//        System.out.println("Фінальний баланс: " + account.getBalance() + " грн");

        //завдання28
//        class Thermometer {
//            private double temperature;
//
//            public void setTemperature(double t) {
//                if (t < -273.15) {
//                    System.out.println("Помилка: Температура не може бути нижчою за абсолютний нуль (-273.15 °C)!");
//                } else {
//                    temperature = t;
//                    System.out.println("Температуру успішно оновлено: " + temperature + " °C");
//                }
//            }
//
//            public double getTemperature() {
//                return temperature;
//            }
//        }
//        Thermometer thermometer = new Thermometer();
//        System.out.println("--- Спроба встановити 25.0 °C ---");
//        thermometer.setTemperature(25.0);
//        System.out.println("Поточна температура: " + thermometer.getTemperature() + " °C");
//        System.out.println("--- Спроба встановити -300.0 °C ---");
//        thermometer.setTemperature(-300.0);
//        System.out.println("Поточна температура після помилки: " + thermometer.getTemperature() + " °C");

        //завдання29
//        class CarSpeedometer {
//            private int speed = 0;
//
//            public void accelerate(int delta) {
//                speed += delta;
//                if (speed > 240) {
//                    speed = 240;
//                }
//            }
//
//            public void brake(int delta) {
//                speed -= delta;
//                if (speed < 0) {
//                    speed = 0;
//                }
//            }
//
//            public int getSpeed() {
//                return speed;
//            }
//        }
//        CarSpeedometer car = new CarSpeedometer();
//        System.out.println("Початкова швидкість: " + car.getSpeed() + " км/год");
//        System.out.println("--- Розгін на +270 км/год ---");
//        car.accelerate(270);
//        System.out.println("Поточна швидкість: " + car.getSpeed() + " км/год (спрацювало обмеження до 240)");
//        System.out.println("--- Гальмування на -100 км/год ---");
//        car.brake(100);
//        System.out.println("Поточна швидкість: " + car.getSpeed() + " км/год");
//        System.out.println("--- Екстрене гальмування на -200 км/год ---");
//        car.brake(200);
//        System.out.println("Фінальна швидкість: " + car.getSpeed() + " км/год (спрацювало обмеження до 0)");

        //завдання30
//        class Person {
//            private String name;
//            private int age;
//
//            public void setName(String name) {
//                this.name = name;
//            }
//
//            public void setAge(int age) {
//                if (age >= 0 && age <= 120) {
//                    this.age = age;
//                } else {
//                    System.out.println("Помилка: Вік має бути в діапазоні від 0 до 120 років!");
//                }
//            }
//
//            public void printSummary() {
//                System.out.println("Ім'я: " + name + " | Вік: " + age + " років");
//            }
//        }
//        Person person1 = new Person();
//        person1.setName("Олександр");
//        person1.setAge(20);
//        Person person2 = new Person();
//        person2.setName("Софія");
//        person2.setAge(22);
//        System.out.println("--- Перша особа ---");
//        person1.printSummary();
//        System.out.println("--- Друга особа ---");
//        person2.printSummary();
//        System.out.println("\n--- Перевірка некоректного віку ---");
//        Person person3 = new Person();
//        person3.setName("Незнайомка");
//        person3.setAge(135);

        //завдання31
//        class DiscountCard {
//            private String ownerName;
//            private double totalSpent;
//            private int discountPercent = 1;
//
//            public void setOwnerName(String ownerName) {
//                this.ownerName = ownerName;
//            }
//
//            public void addPurchase(double cost) {
//                if (cost > 0) {
//                    totalSpent += cost;
//
//                    if (totalSpent >= 10000) {
//                        discountPercent = 10;
//                    } else if (totalSpent >= 5000) {
//                        discountPercent = 5;
//                    } else {
//                        discountPercent = 1;
//                    }
//                }
//            }
//
//            public void printCardInfo() {
//                System.out.println("Власник картки: " + ownerName);
//                System.out.println("Загальна сума покупок: " + totalSpent + " грн");
//                System.out.println("Поточна знижка: " + discountPercent + "%");
//            }
//        }
//        DiscountCard card = new DiscountCard();
//        card.setOwnerName("Марія");
//        System.out.println("=== Початковий стан картки ===");
//        card.printCardInfo();
//        System.out.println("--- Покупка №1 на 3 000 грн ---");
//        card.addPurchase(3000.0);
//        card.printCardInfo();
//        System.out.println("--- Покупка №2 на 4 000 грн ---");
//        card.addPurchase(4000.0);
//        card.printCardInfo();

        //завдання32
//        class SmartDoorLock {
//            private int pinCode = 1234;
//            private boolean isLocked = true;
//            private int failedAttempts = 0;
//
//            public void enterPin(int enteredPin) {
//
//                if (failedAttempts >= 3) {
//                    System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
//                    return;
//                }
//
//                if (enteredPin == pinCode) {
//                    isLocked = false;
//                    failedAttempts = 0;
//                    System.out.println("Пін-код вірний! Замок відчинено.");
//                } else {
//                    failedAttempts++;
//                    System.out.println("Невірний пін-код!");
//
//                    if (failedAttempts >= 3) {
//                        System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
//                    } else {
//                        System.out.println("Залишилося спроб: " + (3 - failedAttempts));
//                    }
//                }
//            }
//
//            public boolean isLocked() {
//                return isLocked;
//            }
//        }
//        SmartDoorLock doorLock = new SmartDoorLock();
//        System.out.println("--- Спроба №1 (невірний пін 1111) ---");
//        doorLock.enterPin(1111);
//        System.out.println("--- Спроба №2 (невірний пін 2222) ---");
//        doorLock.enterPin(2222);
//        System.out.println("--- Спроба №3 (невірний пін 3333) ---");
//        doorLock.enterPin(3333);
//        System.out.println("--- Спроба №4 (вводимо правильний пін 1234, але замок вже заблокований) ---");
//        doorLock.enterPin(1234);

        //завдання33
//        class GradeBook {
//            private String studentName;
//            private int[] grades;
//
//            public void setData(String name, int[] g) {
//                studentName = name;
//                grades = g;
//            }
//
//            public double getAverage() {
//                if (grades == null || grades.length == 0) {
//                    return 0.0;
//                }
//                int sum = 0;
//                for (int i = 0; i < grades.length; i++) {
//                    sum += grades[i];
//                }
//                return (double) sum / grades.length;
//            }
//
//            public int getHighestGrade() {
//                if (grades == null || grades.length == 0) {
//                    return 0;
//                }
//                int max = grades[0];
//                for (int i = 1; i < grades.length; i++) {
//                    if (grades[i] > max) {
//                        max = grades[i];
//                    }
//                }
//                return max;
//            }
//
//            public int getLowestGrade() {
//                if (grades == null || grades.length == 0) {
//                    return 0;
//                }
//                int min = grades[0];
//                for (int i = 1; i < grades.length; i++) {
//                    if (grades[i] < min) {
//                        min = grades[i];
//                    }
//                }
//                return min;
//            }
//        }
//        GradeBook gradeBook = new GradeBook();
//        int[] inputGrades = {85, 92, 78, 96, 65};
//        gradeBook.setData("Максим", inputGrades);
//        System.out.println("=== ЖУРНАЛ ОЦІНОК СТУДЕНТА ===");
//        System.out.println("Середній бал: " + gradeBook.getAverage());
//        System.out.println("Найвища оцінка: " + gradeBook.getHighestGrade());
//        System.out.println("Найнижча оцінка: " + gradeBook.getLowestGrade());

        //завдання34
//        class ArrayStats {
//            private int[] numbers;
//
//            public void setNumbers(int[] nums) {
//                numbers = nums;
//            }
//
//            public int countEvens() {
//                if (numbers == null) {
//                    return 0;
//                }
//                int count = 0;
//                for (int i = 0; i < numbers.length; i++) {
//                    if (numbers[i] % 2 == 0) {
//                        count++;
//                    }
//                }
//                return count;
//            }
//
//            public int countOdds() {
//                if (numbers == null) {
//                    return 0;
//                }
//                int count = 0;
//                for (int i = 0; i < numbers.length; i++) {
//                    if (numbers[i] % 2 != 0) {
//                        count++;
//                    }
//                }
//                return count;
//            }
//
//            public int calculateSum() {
//                if (numbers == null) {
//                    return 0;
//                }
//                int sum = 0;
//                for (int i = 0; i < numbers.length; i++) {
//                    sum += numbers[i];
//                }
//                return sum;
//            }
//        }
//        ArrayStats stats = new ArrayStats();
//        int[] arr = {4, 11, 8, 15, 2, 7, 20, 13, 6, 9};
//        stats.setNumbers(arr);
//        System.out.println("=== СТАТИСТИЧНИЙ АНАЛІЗ МАСИВУ ===");
//        System.out.println("Кількість парних чисел: " + stats.countEvens());
//        System.out.println("Кількість непарних чисел: " + stats.countOdds());
//        System.out.println("Сума всіх елементів: " + stats.calculateSum());

        //завдання35
//        class ShoppingCart {
//            private double[] itemPrices = new double[10];
//            private int count = 0;
//
//            public void addItem(double price) {
//                if (count < itemPrices.length && price > 0) {
//                    itemPrices[count] = price;
//                    count++;
//                    System.out.println("Товар вартістю " + price + " грн додано до кошика.");
//                } else {
//                    System.out.println("Помилка: Кошик заповнено або невірна ціна!");
//                }
//            }
//
//            public double calculateTotal() {
//                double total = 0;
//                for (int i = 0; i < count; i++) {
//                    total += itemPrices[i];
//                }
//                return total;
//            }
//        }
//        ShoppingCart cart = new ShoppingCart();
//        System.out.println("=== ДОДАВАННЯ ТОВАРІВ ДО КОШИКА ===");
//        cart.addItem(150.5);
//        cart.addItem(45.0);
//        cart.addItem(1200.0);
//        System.out.println("\nЗагальна вартість покупок у кошику: " + cart.calculateTotal() + " грн");

        //завдання36
//        class TemperatureTracker {
//            private double[] dailyTemps;
//
//            public void setTemps(double[] temps) {
//                if (temps != null && temps.length == 7) {
//                    dailyTemps = temps;
//                } else {
//                    System.out.println("Помилка: Масив повинен містити рівно 7 днів!");
//                }
//            }
//
//            public int countDaysAbove(double threshold) {
//                if (dailyTemps == null) {
//                    return 0;
//                }
//                int count = 0;
//                for (int i = 0; i < dailyTemps.length; i++) {
//                    if (dailyTemps[i] > threshold) {
//                        count++;
//                    }
//                }
//                return count;
//            }
//
//            public void printWeeklyReport() {
//                if (dailyTemps == null) {
//                    System.out.println("Дані про температури відсутні.");
//                    return;
//                }
//
//                System.out.println("--- ЩОДЕННИК ТЕМПЕРАТУР ЗА ТИЖДЕНЬ ---");
//                double maxTemp = dailyTemps[0];
//                int warmestDay = 1;
//
//                for (int i = 0; i < dailyTemps.length; i++) {
//                    System.out.println("День " + (i + 1) + ": " + dailyTemps[i] + " °C");
//                    if (dailyTemps[i] > maxTemp) {
//                        maxTemp = dailyTemps[i];
//                        warmestDay = i + 1;
//                    }
//                }
//
//                System.out.println("Найтепліший день тижня: День " + warmestDay + " (" + maxTemp + " °C)");
//            }
//        }
//        TemperatureTracker tracker = new TemperatureTracker();
//        double[] weekTemps = {18.5, 21.0, 19.5, 24.0, 22.5, 17.0, 20.0};
//        tracker.setTemps(weekTemps);
//        tracker.printWeeklyReport();
//        double threshold = 20.0;
//        int daysAbove = tracker.countDaysAbove(threshold);
//        System.out.println("Кількість днів із температурою вище " + threshold + " °C: " + daysAbove);

        //завдання37
//        class ArraySearcher {
//            private int[] data;
//
//            public void setData(int[] data) {
//                this.data = data;
//            }
//
//            public boolean contains(int target) {
//                return findIndex(target) != -1;
//            }
//
//            public int findIndex(int target) {
//                if (data == null) {
//                    return -1;
//                }
//                for (int i = 0; i < data.length; i++) {
//                    if (data[i] == target) {
//                        return i;
//                    }
//                }
//                return -1;
//            }
//        }
//        ArraySearcher searcher = new ArraySearcher();
//        int[] numbers = {12, 45, 7, 23, 45, 89, 3};
//        searcher.setData(numbers);
//        int existingTarget = 45;
//        int missingTarget = 100;
//        System.out.println("=== Пошук існуючого числа (" + existingTarget + ") ===");
//        System.out.println("Чи міститься в масиві (contains): " + searcher.contains(existingTarget));
//        System.out.println("Перший індекс числа (findIndex): " + searcher.findIndex(existingTarget));
//        System.out.println();
//        System.out.println("=== Пошук відсутнього числа (" + missingTarget + ") ===");
//        System.out.println("Чи міститься в масиві (contains): " + searcher.contains(missingTarget));
//        System.out.println("Перший індекс числа (findIndex): " + searcher.findIndex(missingTarget));

        //завдання38
//        class Vector3D {
//            private double[] coords = new double[3];
//
//            public void setCoords(double x, double y, double z) {
//                coords[0] = x;
//                coords[1] = y;
//                coords[2] = z;
//            }
//
//            public double getMagnitude() {
//                return Math.sqrt(coords[0] * coords[0] + coords[1] * coords[1] + coords[2] * coords[2]);
//            }
//
//            public void multiplyByScalar(double scalar) {
//                for (int i = 0; i < coords.length; i++) {
//                    coords[i] *= scalar;
//                }
//            }
//
//            public void printVector() {
//                System.out.println("(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
//            }
//        }
//        Vector3D vector = new Vector3D();
//        vector.setCoords(2.0, 3.0, 6.0);
//        System.out.print("Початковий вектор: ");
//        vector.printVector();
//        double magnitude = vector.getMagnitude();
//        System.out.println("Довжина вектора: " + magnitude);
//        vector.multiplyByScalar(2.0);
//        System.out.print("Вектор після множення на 2: ");
//        vector.printVector();

        //завдання39
//        class Matrix2D {
//            private int[][] grid;
//
//            public void setGrid(int[][] grid) {
//                this.grid = grid;
//            }
//
//            public void printMatrix() {
//                if (grid == null) {
//                    System.out.println("Матриця порожня.");
//                    return;
//                }
//                for (int i = 0; i < grid.length; i++) {
//                    for (int j = 0; j < grid[i].length; j++) {
//                        System.out.print(grid[i][j] + "\t");
//                    }
//                    System.out.println();
//                }
//            }
//
//            public int getTotalSum() {
//                if (grid == null) {
//                    return 0;
//                }
//                int totalSum = 0;
//                for (int i = 0; i < grid.length; i++) {
//                    for (int j = 0; j < grid[i].length; j++) {
//                        totalSum += grid[i][j];
//                    }
//                }
//                return totalSum;
//            }
//
//            public int getRowSum(int rowIndex) {
//                if (grid == null || rowIndex < 0 || rowIndex >= grid.length) {
//                    return 0;
//                }
//                int rowSum = 0;
//                for (int j = 0; j < grid[rowIndex].length; j++) {
//                    rowSum += grid[rowIndex][j];
//                }
//                return rowSum;
//            }
//        }
//        Matrix2D matrix = new Matrix2D();
//        int[][] inputGrid = {
//                {3, 8, 1},
//                {4, 2, 7},
//                {9, 5, 6}
//        };
//        matrix.setGrid(inputGrid);
//        System.out.println("=== ТАБЛИЦЯ МАТРИЦІ 3x3 ===");
//        matrix.printMatrix();
//        System.out.println();
//        System.out.println("Загальна сума всіх чисел: " + matrix.getTotalSum());
//        System.out.println("Сума елементів 0-го рядка: " + matrix.getRowSum(0));
//        System.out.println("Сума елементів 1-го рядка: " + matrix.getRowSum(1));
//        System.out.println("Сума елементів 2-го рядка: " + matrix.getRowSum(2));

        //завдання40
//        class MatrixDiagonals {
//            private int[][] matrix;
//
//            public void setMatrix(int[][] matrix) {
//                this.matrix = matrix;
//            }
//
//            public int getMainDiagonalSum() {
//                if (matrix == null) {
//                    return 0;
//                }
//                int sum = 0;
//                for (int i = 0; i < matrix.length; i++) {
//                    sum += matrix[i][i];
//                }
//                return sum;
//            }
//
//            public int getAntiDiagonalSum() {
//                if (matrix == null) {
//                    return 0;
//                }
//                int sum = 0;
//                for (int i = 0; i < matrix.length; i++) {
//                    sum += matrix[i][matrix.length - 1 - i];
//                }
//                return sum;
//            }
//
//            public boolean isDiagonalSymmetric() {
//                return getMainDiagonalSum() == getAntiDiagonalSum();
//            }
//        }
//        MatrixDiagonals matrixDiagonals = new MatrixDiagonals();
//        int[][] inputMatrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        matrixDiagonals.setMatrix(inputMatrix);
//        System.out.println("=== АНАЛІЗ ДІАГОНАЛЕЙ МАТРИЦІ ===");
//        System.out.println("Сума головної діагоналі: " + matrixDiagonals.getMainDiagonalSum());
//        System.out.println("Сума побічної діагоналі: " + matrixDiagonals.getAntiDiagonalSum());
//        System.out.println("Чи симетричні діагоналі (isDiagonalSymmetric): " + matrixDiagonals.isDiagonalSymmetric());
    }
}
