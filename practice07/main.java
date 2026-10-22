package semester1.practice07;

import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //завдання1
//        class Book {
//            private String title;
//            private String author;
//            private int year;
//            private double price;
//
//            public Book() {
//                this.title = "Невідомо";
//                this.author = "Невідомий";
//                this.year = 2000;
//                this.price = 0.0;
//            }
//
//            public Book(String title, String author, int year, double price) {
//                this.title = title;
//                this.author = author;
//                if (year < 0 || price < 0.0) {
//                    this.year = 2000;
//                    this.price = 0.0;
//                } else {
//                    this.year = year;
//                    this.price = price;
//                }
//            }
//
//            public void printInfo() {
//                System.out.println("Книга: \"" + title + "\" | Автор: " + author + " | Рік: " + year + " | Ціна: " + price + " грн");
//            }
//        }
//        Book book1 = new Book();
//        Book book2 = new Book("Майстер і Маргарита", "Михайло Булгаков", 1967, 350.0);
//        System.out.println("=== Перша книга (дефолтний конструктор) ===");
//        book1.printInfo();
//        System.out.println("\n=== Друга книга (параметризований конструктор) ===");
//        book2.printInfo();

        //завдання2
//        class Student {
//            private String name;
//            private int age;
//            private double gpa;
//
//            public Student(String name, int age, double gpa) {
//                this.name = name;
//
//                if (age < 15 || age > 80) {
//                    this.age = 18;
//                } else {
//                    this.age = age;
//                }
//
//                if (gpa < 0.0 || gpa > 5.0) {
//                    this.gpa = 0.0;
//                } else {
//                    this.gpa = gpa;
//                }
//            }
//
//            public boolean isHonorStudent() {
//                return gpa >= 4.5;
//            }
//
//            public void printStudent() {
//                String status = isHonorStudent() ? "Відмінник" : "Звичайний студент";
//                System.out.println("Ім'я: " + name + " | Вік: " + age + " | Середній бал: " + gpa + " | Статус: " + status);
//            }
//        }
//        Student student1 = new Student("Олег", 20, 4.8);
//        Student student2 = new Student("Анна", 19, 4.0);
//        Student student3 = new Student("Максим", 12, 6.0);
//        System.out.println("=== Студент 1 (валідні дані, відмінник) ===");
//        student1.printStudent();
//        System.out.println("=== Студент 2 (валідні дані, звичайний) ===");
//        student2.printStudent();
//        System.out.println("=== Студент 3 (некоректні дані, спрацює валідація) ===");
//        student3.printStudent();

        //завдання3
//        class BankAccount {
//            private String accountNumber;
//            private String ownerName;
//            private double balance;
//
//            public BankAccount(String accountNumber, String ownerName, double initialBalance) {
//                this.accountNumber = accountNumber;
//                this.ownerName = ownerName;
//                if (initialBalance < 0) {
//                    this.balance = 0.0;
//                } else {
//                    this.balance = initialBalance;
//                }
//            }
//
//            public void deposit(double amount) {
//                if (amount > 0) {
//                    balance += amount;
//                    System.out.println("Успішно поповнено рахунок на " + amount + " грн.");
//                } else {
//                    System.out.println("Помилка: сума поповнення має бути більшою за 0!");
//                }
//            }
//
//            public boolean withdraw(double amount) {
//                if (amount > 0 && amount <= balance) {
//                    balance -= amount;
//                    System.out.println("Успішно знято " + amount + " грн.");
//                    return true;
//                } else {
//                    System.out.println("Помилка: недостатньо коштів на рахунку або невірна сума!");
//                    return false;
//                }
//            }
//
//            public void printAccount() {
//                System.out.println("Номер рахунку: " + accountNumber + " | Власник: " + ownerName + " | Баланс: " + balance + " грн");
//            }
//        }
//        BankAccount account = new BankAccount("UA30322001000002620", "Марина", 3000.0);
//        System.out.println("=== Початковий стан рахунку ===");
//        account.printAccount();
//        System.out.println("--- Поповнення рахунку ---");
//        account.deposit(1500.0);
//        account.printAccount();
//        System.out.println("--- Спроба зняття 6000 грн (понад ліміт) ---");
//        boolean isWithdrawn = account.withdraw(6000.0);
//        System.out.println("Результат транзакції: " + isWithdrawn);
//        System.out.println("=== Фінальний стан рахунку ===");
//        account.printAccount();

        //завдання4
//        class Point2D {
//            private double x;
//            private double y;
//
//            public Point2D() {
//                this.x = 0.0;
//                this.y = 0.0;
//            }
//
//            public Point2D(double x, double y) {
//                this.x = x;
//                this.y = y;
//            }
//
//            public double distanceToOrigin() {
//                return Math.sqrt(x * x + y * y);
//            }
//
//            public double distanceTo(double targetX, double targetY) {
//                return Math.sqrt(Math.pow(targetX - x, 2) + Math.pow(targetY - y, 2));
//            }
//
//            public void printPoint() {
//                System.out.print("Point(" + x + "; " + y + ")");
//            }
//        }
//        Point2D p1 = new Point2D();
//        Point2D p2 = new Point2D(3.0, 4.0);
//        Point2D p3 = new Point2D(1.0, 2.0);
//        System.out.print("Точка 1: ");
//        p1.printPoint();
//        System.out.println();
//        System.out.print("Точка 2: ");
//        p2.printPoint();
//        System.out.println();
//        System.out.print("Точка 3: ");
//        p3.printPoint();
//        System.out.println("\n");
//        System.out.println("=== Розрахунок відстаней ===");
//        System.out.println("Відстань від Точки 2 до початку координат: " + p2.distanceToOrigin());
//        System.out.println("Відстань між Точкою 2 та Точкою 3: " + p2.distanceTo(1.0, 2.0));

        //завдання5
//        class Product {
//            private String name;
//            private double price;
//            private int quantity;
//            private String category;
//
//            public Product(String name, double price, int quantity, String category) {
//                this.name = name;
//                this.price = (price >= 0) ? price : 0.0;
//                this.quantity = (quantity >= 0) ? quantity : 0;
//                this.category = category;
//            }
//
//            public double getTotalValue() {
//                return price * quantity;
//            }
//
//            public void applyDiscount(double percent) {
//                if (percent >= 0 && percent <= 100) {
//                    price -= price * (percent / 100.0);
//                } else {
//                    System.out.println("Помилка: Відсоток знижки має бути в діапазоні від 0 до 100!");
//                }
//            }
//
//            public void printProduct() {
//                System.out.println("Товар: " + name + " | Категорія: " + category + " | Ціна за од.: " + price + " грн | Кількість: " + quantity + " шт. | Загальна вартість партії: " + getTotalValue() + " грн");
//            }
//        }
//        Product product = new Product("Смартфон", 15000.0, 5, "Електроніка");
//        System.out.println("=== Стан товару ДО знижки ===");
//        product.printProduct();
//        System.out.println("--- Застосування знижки 20% ---");
//        product.applyDiscount(20.0);
//        System.out.println("=== Стан товару ПІСЛЯ знижки ===");
//        product.printProduct();

        //завдання6
//        class Time {
//            private int hours;
//            private int minutes;
//            private int seconds;
//
//            public Time(int hours, int minutes, int seconds) {
//                if (hours >= 0 && hours <= 23) {
//                    this.hours = hours;
//                } else {
//                    this.hours = 0;
//                }
//                if (minutes >= 0 && minutes <= 59) {
//                    this.minutes = minutes;
//                } else {
//                    this.minutes = 0;
//                }
//                if (seconds >= 0 && seconds <= 59) {
//                    this.seconds = seconds;
//                } else {
//                    this.seconds = 0;
//                }
//            }
//
//            public void tick() {
//                seconds++;
//                if (seconds > 59) {
//                    seconds = 0;
//                    minutes++;
//                    if (minutes > 59) {
//                        minutes = 0;
//                        hours++;
//                        if (hours > 23) {
//                            hours = 0;
//                        }
//                    }
//                }
//            }
//
//            public String toUniversalString() {
//                String h = (hours < 10 ? "0" : "") + hours;
//                String m = (minutes < 10 ? "0" : "") + minutes;
//                String s = (seconds < 10 ? "0" : "") + seconds;
//                return h + ":" + m + ":" + s;
//            }
//
//            public String toStandardString() {
//                int displayHours = hours % 12;
//                if (displayHours == 0) {
//                    displayHours = 12;
//                }
//                String amPm = (hours < 12) ? "AM" : "PM";
//                String h = (displayHours < 10 ? "0" : "") + displayHours;
//                String m = (minutes < 10 ? "0" : "") + minutes;
//                String s = (seconds < 10 ? "0" : "") + seconds;
//                return h + ":" + m + ":" + s + " " + amPm;
//            }
//        }
//        Time time = new Time(23, 59, 56);
//        System.out.println("=== Демонстрація ходу часу (tick) ===");
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Універсальний: " + time.toUniversalString() + " | Стандартний: " + time.toStandardString());
//            time.tick();
//        }

        //завдання7
//        class Rectangle {
//            private double width;
//            private double height;
//
//            public Rectangle() {
//                this.width = 1.0;
//                this.height = 1.0;
//            }
//
//            public Rectangle(double size) {
//                this.width = (size >= 0) ? size : 0.0;
//                this.height = (size >= 0) ? size : 0.0;
//            }
//
//            public Rectangle(double width, double height) {
//                this.width = (width >= 0) ? width : 0.0;
//                this.height = (height >= 0) ? height : 0.0;
//            }
//
//            public double getArea() {
//                return width * height;
//            }
//
//            public double getPerimeter() {
//                return 2 * (width + height);
//            }
//
//            public boolean isSquare() {
//                return width == height;
//            }
//
//            public void printInfo() {
//                System.out.println("Ширина: " + width + " | Висота: " + height);
//                System.out.println("Площа: " + getArea());
//                System.out.println("Периметр: " + getPerimeter());
//                System.out.println("Чи є квадратом: " + isSquare());
//            }
//        }
//        Rectangle rect = new Rectangle(4.0, 7.0);
//        Rectangle square = new Rectangle(5.0);
//        System.out.println("=== Інформація про прямокутник ===");
//        rect.printInfo();
//        System.out.println("=== Інформація про квадрат ===");
//        square.printInfo();
//        System.out.println("=== Порівняння площ та периметрів ===");
//        if (rect.getArea() > square.getArea()) {
//            System.out.println("Прямокутник має більшу площу (" + rect.getArea() + " проти " + square.getArea() + ")");
//        } else if (rect.getArea() < square.getArea()) {
//            System.out.println("Квадрат має більшу площу (" + square.getArea() + " проти " + rect.getArea() + ")");
//        } else {
//            System.out.println("Площі фігур рівні.");
//        }
//        if (rect.getPerimeter() > square.getPerimeter()) {
//            System.out.println("Прямокутник має більший периметр (" + rect.getPerimeter() + " проти " + square.getPerimeter() + ")");
//        } else if (rect.getPerimeter() < square.getPerimeter()) {
//            System.out.println("Квадрат має більший периметр (" + square.getPerimeter() + " проти " + rect.getPerimeter() + ")");
//        } else {
//            System.out.println("Периметри фігур рівні.");
//        }

        //завдання8
//        class Employee {
//            private int id;
//            private String fullName;
//            private String position;
//            private double monthlySalary;
//
//            public Employee(int id, String fullName, String position, double monthlySalary) {
//                this.id = id;
//                this.fullName = fullName;
//                this.position = position;
//                this.monthlySalary = (monthlySalary >= 0) ? monthlySalary : 0.0;
//            }
//
//            public void raiseSalary(double percent) {
//                if (percent > 0) {
//                    monthlySalary += monthlySalary * (percent / 100.0);
//                }
//            }
//
//            public double getAnnualSalary() {
//                return 12 * monthlySalary;
//            }
//
//            public void printBadge() {
//                System.out.println("=== БЕЙДЖ ПРАЦІВНИКА ===");
//                System.out.println("ID: " + id);
//                System.out.println("ПІБ: " + fullName);
//                System.out.println("Посада: " + position);
//                System.out.println("Місячна зарплата: " + monthlySalary + " грн");
//                System.out.println("Річна зарплата: " + getAnnualSalary() + " грн");
//            }
//        }
//        Employee emp = new Employee(101, "Коваленко Андрій", "Java Developer", 40000.0);
//        System.out.println("--- Інформація ДО підвищення ---");
//        emp.printBadge();
//        emp.raiseSalary(15.0);
//        System.out.println("--- Інформація ПІСЛЯ підвищення ставки на 15% ---");
//        emp.printBadge();
//        System.out.println("Новий річний дохід після перерахунку: " + emp.getAnnualSalary() + " грн");

        //завдання9
//        class User {
//            private String login;
//            private String email;
//            private String role;
//            private boolean isActive;
//
//            public User(String login, String email, String role, boolean isActive) {
//                this.login = login;
//                this.email = email;
//                this.role = role;
//                this.isActive = isActive;
//            }
//
//            public User(String login, String email) {
//                this(login, email, "USER", true);
//            }
//
//            public User(String login) {
//                this(login, login + "@domain.com");
//            }
//
//            public User() {
//                this("guest");
//            }
//
//            public void printProfile() {
//                System.out.println("Логін: " + login + " | Email: " + email + " | Роль: " + role + " | Активний: " + isActive);
//            }
//        }
//        User user1 = new User("admin", "admin@domain.com", "ADMIN", true);
//        User user2 = new User("denis", "denis@gmail.com");
//        User user3 = new User("student123");
//        User user4 = new User();
//        System.out.println("=== Користувач 1 (майстер-конструктор) ===");
//        user1.printProfile();
//        System.out.println("=== Користувач 2 (конструктор з 2 параметрами) ===");
//        user2.printProfile();
//        System.out.println("=== Користувач 3 (конструктор з 1 параметром) ===");
//        user3.printProfile();
//        System.out.println("=== Користувач 4 (конструктор за замовчуванням) ===");
//        user4.printProfile();

        //завдання10
//        class Fraction {
//            private int numerator;
//            private int denominator;
//
//            private int gcd(int a, int b) {
//                a = Math.abs(a);
//                b = Math.abs(b);
//                while (b != 0) {
//                    int temp = b;
//                    b = a % b;
//                    a = temp;
//                }
//                return a == 0 ? 1 : a;
//            }
//
//            public Fraction(int numerator, int denominator) {
//                if (denominator == 0) {
//                    System.out.println("Помилка: Знаменник не може дорівнювати 0! Встановлено 1.");
//                    denominator = 1;
//                }
//                if (denominator < 0) {
//                    numerator = -numerator;
//                    denominator = -denominator;
//                }
//                int commonDivisor = gcd(numerator, denominator);
//                this.numerator = numerator / commonDivisor;
//                this.denominator = denominator / commonDivisor;
//            }
//
//            public Fraction(int wholeNumber) {
//                this(wholeNumber, 1);
//            }
//
//            public Fraction() {
//                this(0, 1);
//            }
//
//            public void print() {
//                if (denominator == 1) {
//                    System.out.println(numerator);
//                } else {
//                    System.out.println(numerator + "/" + denominator);
//                }
//            }
//
//            public double toDouble() {
//                return (double) numerator / denominator;
//            }
//        }
//        Fraction f1 = new Fraction(6, -9);
//        Fraction f2 = new Fraction(5);
//        Fraction f3 = new Fraction();
//        Fraction f4 = new Fraction(8, 0);
//        System.out.println("=== Тестування конструкторів та методів класу Fraction ===");
//        System.out.print("Дріб 1 (6, -9): ");
//        f1.print();
//        System.out.println("Десяткове значення: " + f1.toDouble());
//        System.out.println();
//        System.out.print("Дріб 2 (ціле число 5): ");
//        f2.print();
//        System.out.println("Десяткове значення: " + f2.toDouble());
//        System.out.println();
//        System.out.print("Дріб 3 (за замовчуванням): ");
//        f3.print();
//        System.out.println("Десяткове значення: " + f3.toDouble());
//        System.out.println();
//        System.out.print("Дріб 4 (з нулем у знаменнику): ");
//        f4.print();
//        System.out.println("Десяткове значення: " + f4.toDouble());

        //завдання11
//        class Car {
//            private String brand;
//            private String model;
//            private int year;
//            private double mileage;
//            private boolean engineStarted;
//
//            public Car(String brand, String model, int year, double mileage) {
//                this.brand = brand;
//                this.model = model;
//                this.year = year;
//                this.mileage = (mileage >= 0) ? mileage : 0.0;
//                this.engineStarted = false;
//            }
//
//            public Car(String brand, String model, int year) {
//                this(brand, model, year, 0.0);
//            }
//
//            public Car() {
//                this("Unknown", "Standard", 2024);
//            }
//
//            public void startEngine() {
//                engineStarted = true;
//                System.out.println("Двигун успішно запущено.");
//            }
//
//            public void stopEngine() {
//                engineStarted = false;
//                System.out.println("Двигун зупинено.");
//            }
//
//            public void drive(double distance) {
//                if (engineStarted) {
//                    if (distance > 0) {
//                        mileage += distance;
//                        System.out.println("Успішна поїздка! Пройдено: " + distance + " км.");
//                    }
//                } else {
//                    System.out.println("Спершу заведіть двигун!");
//                }
//            }
//
//            public void printCar() {
//                System.out.println("Авто: " + brand + " " + model + " (" + year + " рік) | Пробіг: " + mileage + " км | Двигун увімкнено: " + engineStarted);
//            }
//        }
//        Car myCar = new Car("Toyota", "Camry", 2023);
//        System.out.println("=== Початковий стан нового авто ===");
//        myCar.printCar();
//        System.out.println("--- Спроба поїздки без заведеного двигуна ---");
//        myCar.drive(150.0);
//        System.out.println("--- Заводимо двигун і їдемо 150 км ---");
//        myCar.startEngine();
//        myCar.drive(150.0);
//        System.out.println("=== Фінальний стан авто після поїздки ===");
//        myCar.printCar();

        //завдання12
//        class SmartBulb {
//            private int brightness;
//            private int colorTemp;
//            private boolean isOn;
//
//            public SmartBulb(int brightness, int colorTemp, boolean isOn) {
//                if (brightness < 0) {
//                    this.brightness = 0;
//                } else if (brightness > 100) {
//                    this.brightness = 100;
//                } else {
//                    this.brightness = brightness;
//                }
//
//                if (colorTemp < 2700) {
//                    this.colorTemp = 2700;
//                } else if (colorTemp > 6500) {
//                    this.colorTemp = 6500;
//                } else {
//                    this.colorTemp = colorTemp;
//                }
//
//                this.isOn = isOn;
//            }
//
//            public SmartBulb(int brightness) {
//                this(brightness, 4000, true);
//            }
//
//            public SmartBulb() {
//                this(50);
//            }
//
//            public void printStatus() {
//                String state = isOn ? "Увімкнено" : "Вимкнено";
//                System.out.println("Стан: " + state + " | Яскравість: " + brightness + "% | Колірна температура: " + colorTemp + " K");
//            }
//        }
//        SmartBulb bulb1 = new SmartBulb(80, 5000, true);
//        SmartBulb bulb2 = new SmartBulb(75);
//        SmartBulb bulb3 = new SmartBulb();
//        SmartBulb bulb4 = new SmartBulb(150, 2000, false);
//        System.out.println("=== Лампочка 1 (майстер-конструктор) ===");
//        bulb1.printStatus();
//        System.out.println("=== Лампочка 2 (скорочений конструктор) ===");
//        bulb2.printStatus();
//        System.out.println("=== Лампочка 3 (дефолтний конструктор) ===");
//        bulb3.printStatus();
//        System.out.println("=== Лампочка 4 (з перевіркою валідації меж) ===");
//        bulb4.printStatus();

        //завдання13
//        class QueryBuilder {
//            private String table;
//            private String fields = "*";
//            private String whereClause = "";
//
//            public QueryBuilder(String table) {
//                this.table = table;
//            }
//
//            public QueryBuilder select(String fields) {
//                this.fields = fields;
//                return this;
//            }
//
//            public QueryBuilder where(String condition) {
//                this.whereClause = condition;
//                return this;
//            }
//
//            public String build() {
//                return "SELECT " + fields + " FROM " + table + (whereClause.isEmpty() ? "" : " WHERE " + whereClause) + ";";
//            }
//        }
//        String sql = new QueryBuilder("users").select("id, name, email").where("age >= 18").build();
//        System.out.println("=== Результат побудови SQL-запиту ===");
//        System.out.println(sql);

        //завдання14
//        class CoffeeOrder {
//            private String type;
//            private String size;
//            private int sugarCount;
//            private boolean withSyrup;
//            private double finalPrice;
//
//            private double calculatePrice() {
//                double basePrice = 0.0;
//                if (type.equals("Еспресо")) {
//                    basePrice = 40.0;
//                } else if (type.equals("Капучино")) {
//                    basePrice = 55.0;
//                } else if (type.equals("Лате")) {
//                    basePrice = 60.0;
//                } else {
//                    basePrice = 40.0;
//                }
//                double sizeCoefficient = 1.0;
//                if (size.equals("Small")) {
//                    sizeCoefficient = 1.0;
//                } else if (size.equals("Medium")) {
//                    sizeCoefficient = 1.3;
//                } else if (size.equals("Large")) {
//                    sizeCoefficient = 1.6;
//                }
//                double price = basePrice * sizeCoefficient;
//                if (withSyrup) {
//                    price += 15.0;
//                }
//                return price;
//            }
//
//            public CoffeeOrder(String type, String size, int sugarCount, boolean withSyrup) {
//                this.type = type;
//                this.size = size;
//                this.sugarCount = sugarCount;
//                this.withSyrup = withSyrup;
//                this.finalPrice = calculatePrice();
//            }
//
//            public CoffeeOrder(String type, String size) {
//                this(type, size, 0, false);
//            }
//
//            public CoffeeOrder(String type) {
//                this(type, "Medium");
//            }
//
//            public void printReceipt() {
//                System.out.println("=== КАВОВЕ ЗАМОВЛЕННЯ ===");
//                System.out.println("Тип кави: " + type);
//                System.out.println("Розмір: " + size);
//                System.out.println("Кількість цукру: " + sugarCount + " лож.");
//                System.out.println("З сиропом: " + (withSyrup ? "Так" : "Ні"));
//                System.out.println("Фінальна ціна: " + finalPrice + " грн");
//            }
//        }
//        CoffeeOrder order1 = new CoffeeOrder("Лате", "Large", 2, true);
//        CoffeeOrder order2 = new CoffeeOrder("Капучино", "Medium");
//        CoffeeOrder order3 = new CoffeeOrder("Еспресо");
//        System.out.println("--- Замовлення 1 (повний конструктор) ---");
//        order1.printReceipt();
//        System.out.println("--- Замовлення 2 (скорочений конструктор) ---");
//        order2.printReceipt();
//        System.out.println("--- Замовлення 3 (базовий конструктор) ---");
//        order3.printReceipt();

        //завдання15
//        class Box {
//            private double width;
//            private double height;
//            private double depth;
//            private String material;
//
//            public Box(double width, double height, double depth, String material) {
//                this.width = (width >= 0) ? width : 0.0;
//                this.height = (height >= 0) ? height : 0.0;
//                this.depth = (depth >= 0) ? depth : 0.0;
//                this.material = material;
//            }
//
//            public Box(double size, String material) {
//                this(size, size, size, material);
//            }
//
//            public Box(Box other) {
//                this(other.width, other.height, other.depth, other.material);
//            }
//
//            public double getVolume() {
//                return width * height * depth;
//            }
//
//            public double getSurfaceArea() {
//                return 2 * (width * height + width * depth + height * depth);
//            }
//
//            public void printBox() {
//                System.out.println("Матеріал: " + material + " | Розміри (ШxВxГ): " + width + " x " + height + " x " + depth);
//                System.out.println("Об'єм: " + getVolume() + " | Площа поверхні: " + getSurfaceArea());
//            }
//        }
//        Box originalBox = new Box(5.0, "Гофрокартон");
//        Box copyBox = new Box(originalBox);
//        System.out.println("=== Оригінальна коробка ===");
//        originalBox.printBox();
//        System.out.println("=== Скопійована коробка ===");
//        copyBox.printBox();
//        System.out.println("=== Порівняння об'ємів ===");
//        System.out.println("Об'єм оригіналу: " + originalBox.getVolume());
//        System.out.println("Об'єм копії: " + copyBox.getVolume());
//        if (originalBox.getVolume() == copyBox.getVolume()) {
//            System.out.println("Результат: Об'єми обох коробок повністю рівні!");
//        } else {
//            System.out.println("Результат: Об'єми відрізняються.");
//        }

        //завдання16
//        class FlightTicket {
//            private String ticketNumber;
//            private String passengerName;
//            private String flightNumber;
//            private String departureCity;
//            private String arrivalCity;
//            private String seatNumber;
//            private boolean hasBaggage;
//
//            public FlightTicket(String ticketNumber, String passengerName, String flightNumber, String departureCity, String arrivalCity, String seatNumber, boolean hasBaggage) {
//                this.ticketNumber = ticketNumber;
//                this.passengerName = passengerName;
//                this.flightNumber = flightNumber;
//                this.departureCity = departureCity;
//                this.arrivalCity = arrivalCity;
//                this.seatNumber = seatNumber;
//                this.hasBaggage = hasBaggage;
//            }
//
//            public FlightTicket(String ticketNumber, String passengerName, String flightNumber, String departureCity, String arrivalCity) {
//                this(ticketNumber, passengerName, flightNumber, departureCity, arrivalCity, "UNASSIGNED", false);
//            }
//
//            public void assignSeat(String seat) {
//                this.seatNumber = seat;
//            }
//
//            public void printBoardingPass() {
//                System.out.println("=== ПОСАДКОВИЙ ТАЛОН (BOARDING PASS) ===");
//                System.out.println("Номер квитка: " + ticketNumber + " | Рейс: " + flightNumber);
//                System.out.println("Пасажир: " + passengerName);
//                System.out.println("Маршрут: " + departureCity + " -> " + arrivalCity);
//                System.out.println("Місце: " + seatNumber);
//                System.out.println("Наявність багажу: " + (hasBaggage ? "Так" : "Ні"));
//            }
//        }
//        FlightTicket ticket = new FlightTicket("TK98765", "Денис Коваленко", "PS-501", "Київ", "Відень");
//        System.out.println("--- Стан квитка до вибору місця ---");
//        ticket.printBoardingPass();
//        ticket.assignSeat("12F");
//        System.out.println("--- Стан квитка після реєстрації та вибору місця ---");
//        ticket.printBoardingPass();

        //завдання17
//        class MathOperations {
//
//            public int add(int a, int b) {
//                return a + b;
//            }
//
//            public double add(double a, double b) {
//                return a + b;
//            }
//
//            public int add(int a, int b, int c) {
//                return a + b + c;
//            }
//
//            public String add(String a, String b) {
//                return a + " " + b;
//            }
//
//            public int multiply(int a, int b) {
//                return a * b;
//            }
//
//            public double multiply(double a, double b) {
//                return a * b;
//            }
//
//            public String multiply(String text, int times) {
//                String result = "";
//                for (int i = 0; i < times; i++) {
//                    result += text;
//                }
//                return result;
//            }
//        }
//        MathOperations math = new MathOperations();
//        System.out.println("=== ТЕСТУВАННЯ МЕТОДУ ADD ===");
//        System.out.println("add(10, 20) [int, int] = " + math.add(10, 20));
//        System.out.println("add(5.5, 4.2) [double, double] = " + math.add(5.5, 4.2));
//        System.out.println("add(3, 7, 10) [int, int, int] = " + math.add(3, 7, 10));
//        System.out.println("add(\"Слава\", \"Україні\") [String, String] = " + math.add("Слава", "Україні"));
//        System.out.println("=== ТЕСТУВАННЯ МЕТОДУ MULTIPLY ===");
//        System.out.println("multiply(6, 7) [int, int] = " + math.multiply(6, 7));
//        System.out.println("multiply(2.5, 4.0) [double, double] = " + math.multiply(2.5, 4.0));
//        System.out.println("multiply(\"Java\", 3) [String, int] = " + math.multiply("Java", 3));

        //завдання18
//        class DocumentPrinter {
//
//            public void print(String message) {
//                System.out.println(message);
//            }
//
//            public void print(int number) {
//                System.out.println("[INT]: " + number);
//            }
//
//            public void print(double number, int decimals) {
//                String pattern = "%." + decimals + "f";
//                String formatted = String.format(pattern, number);
//                System.out.println("[DOUBLE]: " + formatted);
//            }
//
//            public void print(String[] lines) {
//                if (lines != null) {
//                    for (int i = 0; i < lines.length; i++) {
//                        System.out.println((i + 1) + ". " + lines[i]);
//                    }
//                }
//            }
//
//            public void print(String message, boolean uppercase) {
//                if (uppercase) {
//                    System.out.println(message.toUpperCase());
//                } else {
//                    System.out.println(message);
//                }
//            }
//        }
//        DocumentPrinter printer = new DocumentPrinter();
//        System.out.println("=== 1. Друк звичайного рядка ===");
//        printer.print("Вітаємо у системі документообігу!");
//        System.out.println("=== 2. Друк цілого числа ===");
//        printer.print(123);
//        System.out.println("=== 3. Друк дійсного числа (2 знаки після коми) ===");
//        printer.print(45.6789, 2);
//        System.out.println("=== 4. Друк масиву рядків з нумерацією ===");
//        String[] sections = {"Вступ", "Основна частина", "Висновки"};
//        printer.print(sections);
//        System.out.println("=== 5. Друк з параметром uppercase ===");
//        printer.print("увага! важливе повідомлення", true);
//        printer.print("це звичайний текст без змін", false);

        //завдання19
//        class AreaCalculator {
//
//            public double calculateArea(double side) {
//                return side * side;
//            }
//
//            public double calculateArea(double width, double height) {
//                return width * height;
//            }
//
//            public double calculateArea(double radius, boolean isCircle) {
//                if (isCircle) {
//                    return Math.PI * radius * radius;
//                }
//                return 0.0;
//            }
//
//            public double calculateTriangleArea(double a, double b, double c) {
//                if ((a + b > c) && (a + c > b) && (b + c > a)) {
//                    double p = (a + b + c) / 2.0; // півпериметр
//                    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
//                }
//                return 0.0;
//            }
//
//            public double calculateTrapezoidArea(double base1, double base2, double height) {
//                return ((base1 + base2) / 2.0) * height;
//            }
//        }
//        AreaCalculator calc = new AreaCalculator();
//        double squareArea = calc.calculateArea(5.0);
//        double circleArea = calc.calculateArea(4.0, true);
//        double rectangleArea = calc.calculateArea(6.0, 3.0);
//        double triangleArea = calc.calculateTriangleArea(3.0, 4.0, 5.0);
//        double trapezoidArea = calc.calculateTrapezoidArea(4.0, 6.0, 5.0);
//        System.out.println("=== ОБЧИСЛЕННЯ ПЛОЩ ГЕОМЕТРИЧНИХ ФІГУР ===");
//        System.out.println("Площа квадрата: " + squareArea);
//        System.out.println("Площа круга: " + circleArea);
//        System.out.println("Площа прямокутника: " + rectangleArea);
//        System.out.println("Площа трикутника: " + triangleArea);
//        System.out.println("Площа трапеції: " + trapezoidArea);

        //завдання20
//        class Logger {
//
//            public void log(String message) {
//                System.out.println("[INFO] " + message);
//            }
//
//            public void log(String level, String message) {
//                System.out.println("[" + level + "] " + message);
//            }
//
//            public void log(String level, int errorCode, String message) {
//                System.out.println("[" + level + "] (Code: " + errorCode + "): " + message);
//            }
//
//            public void log(String tag, String message, boolean timestamp) {
//                if (timestamp) {
//                    long currentTime = System.currentTimeMillis();
//                    System.out.println("[" + tag + "] " + message + " (Timestamp: " + currentTime + " ms)");
//                } else {
//                    System.out.println("[" + tag + "] " + message);
//                }
//            }
//        }
//        Logger logger = new Logger();
//        System.out.println("=== ДЕМОНСТРАЦІЯ СИСТЕМИ ЛОГУВАННЯ ===");
//        logger.log("Програму успішно запущено.");
//        logger.log("WARNING", "Пам'ять заповнена на 85%.");
//        logger.log("ERROR", 404, "Ресурс не знайдено за вказаною адресою.");
//        logger.log("DATABASE", "З'єднання з сервером встановлено.", true);

        //завдання21
//        class ArraySearcher {
//            public int find(int[] arr, int target) {
//                return find(arr, target, 0);
//            }
//
//            public int find(int[] arr, int target, int startIndex) {
//                if (arr == null || startIndex < 0 || startIndex >= arr.length) {
//                    return -1;
//                }
//                for (int i = startIndex; i < arr.length; i++) {
//                    if (arr[i] == target) {
//                        return i;
//                    }
//                }
//                return -1;
//            }
//
//            public int find(String[] arr, String target) {
//                return find(arr, target, false);
//            }
//
//            public int find(String[] arr, String target, boolean ignoreCase) {
//                if (arr == null) {
//                    return -1;
//                }
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] != null && target != null) {
//                        if (ignoreCase) {
//                            if (arr[i].equalsIgnoreCase(target)) {
//                                return i;
//                            }
//                        } else {
//                            if (arr[i].equals(target)) {
//                                return i;
//                            }
//                        }
//                    } else if (arr[i] == target) {
//                        return i;
//                    }
//                }
//                return -1;
//            }
//        }
//        ArraySearcher searcher = new ArraySearcher();
//        int[] numbers = {10, 20, 30, 20, 40, 50};
//        String[] words = {"Apple", "Banana", "Orange", "banana"};
//        System.out.println("=== ПОШУК У МАСИВІ ЧИСЕЛ ===");
//        System.out.println("Пошук числа 20 (з початку): індекс " + searcher.find(numbers, 20));
//        System.out.println("Пошук числа 20 (починаючи з індексу 2): індекс " + searcher.find(numbers, 20, 2));
//        System.out.println("Пошук відсутнього числа 99: індекс " + searcher.find(numbers, 99));
//        System.out.println("=== ПОШУК У МАСИВІ СЛІВ ===");
//        System.out.println("Точний пошук \"Orange\": індекс " + searcher.find(words, "Orange"));
//        System.out.println("Точний пошук \"banana\" (з урахуванням регістру): індекс " + searcher.find(words, "banana", false));
//        System.out.println("Пошук \"banana\" (з ігноруванням регістру): індекс " + searcher.find(words, "banana", true));

        //завдання22
//        class DateService {
//            private int day;
//            private int month;
//            private int year;
//
//            public DateService(int day, int month, int year) {
//                this.day = day;
//                this.month = month;
//                this.year = year;
//            }
//
//            public void add(int days) {
//                day += days;
//                while (day > 30) {
//                    day -= 30;
//                    month++;
//                    if (month > 12) {
//                        month = 1;
//                        year++;
//                    }
//                }
//            }
//
//            public void add(int days, int months) {
//                add(days); // спершу додаємо дні
//                month += months;
//                while (month > 12) {
//                    month -= 12;
//                    year++;
//                }
//            }
//
//            public void add(int days, int months, int years) {
//                add(days, months); // додаємо дні та місяці
//                year += years;
//            }
//
//            public void printDate() {
//                String d = (day < 10 ? "0" : "") + day;
//                String m = (month < 10 ? "0" : "") + month;
//                System.out.println(d + "." + m + "." + year);
//            }
//        }
//        DateService date = new DateService(15, 3, 2024);
//        System.out.print("Початкова дата: ");
//        date.printDate();
//        System.out.println("--- Додаємо 20 днів ---");
//        date.add(20);
//        System.out.print("Дата після додавання 20 днів: ");
//        date.printDate();
//        System.out.println("--- Додаємо 3 місяці ---");
//        date.add(0, 3);
//        System.out.print("Фінальна дата після додавання 3 місяців: ");
//        date.printDate();

        //завдання23
//        class SalaryCalculator {
//
//            public double calculate(double baseRate) {
//                return (baseRate >= 0) ? baseRate : 0.0;
//            }
//
//            public double calculate(double baseRate, double fixedBonus) {
//                return calculate(baseRate) + ((fixedBonus >= 0) ? fixedBonus : 0.0);
//            }
//
//            public double calculate(double baseRate, double bonusPercent, boolean isTaxDeducted) {
//                double withBonus = baseRate + (baseRate * (bonusPercent / 100.0));
//                if (isTaxDeducted) {
//                    return withBonus * (1.0 - 0.195);
//                }
//                return withBonus;
//            }
//
//            public double calculate(double baseRate, int overtimeHours, double overtimeHourlyRate) {
//                double overtimePay = (overtimeHours > 0 && overtimeHourlyRate > 0) ? (overtimeHours * overtimeHourlyRate) : 0.0;
//                return calculate(baseRate) + overtimePay;
//            }
//        }
//        SalaryCalculator calc = new SalaryCalculator();
//        double baseRate = 30000.0;
//        double salary1 = calc.calculate(baseRate);
//        double salary2 = calc.calculate(baseRate, 5000.0);
//        double salary3 = calc.calculate(baseRate, 15.0, true);
//        double salary4 = calc.calculate(baseRate, 10, 300.0);
//        System.out.println("=== РОЗРАХУНОК ЗАРОБІТНОЇ ПЛАТИ ===");
//        System.out.println("1. Лише базова ставка (" + baseRate + " грн): " + salary1 + " грн");
//        System.out.println("2. Ставка + фіксована премія 5000 грн: " + salary2 + " грн");
//        System.out.println("3. Ставка з бонусом 15% та вирахуванням податку 19.5%: " + salary3 + " грн");
//        System.out.println("4. Ставка + понаднормові (10 год по 300 грн): " + salary4 + " грн");

        //завдання24
//        class ArrayFilter {
//
//            public int[] filter(int[] arr, int threshold) {
//                if (arr == null) {
//                    return new int[0];
//                }
//                int count = 0;
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] > threshold) {
//                        count++;
//                    }
//                }
//                int[] result = new int[count];
//                int index = 0;
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] > threshold) {
//                        result[index++] = arr[i];
//                    }
//                }
//                return result;
//            }
//
//            public int[] filter(int[] arr, int min, int max) {
//                if (arr == null) {
//                    return new int[0];
//                }
//                int count = 0;
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] >= min && arr[i] <= max) {
//                        count++;
//                    }
//                }
//                int[] result = new int[count];
//                int index = 0;
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] >= min && arr[i] <= max) {
//                        result[index++] = arr[i];
//                    }
//                }
//                return result;
//            }
//
//            public int[] filter(int[] arr, boolean keepEvens) {
//                if (arr == null) {
//                    return new int[0];
//                }
//                int count = 0;
//                for (int i = 0; i < arr.length; i++) {
//                    boolean isEven = (arr[i] % 2 == 0);
//                    if (isEven == keepEvens) {
//                        count++;
//                    }
//                }
//                int[] result = new int[count];
//                int index = 0;
//                for (int i = 0; i < arr.length; i++) {
//                    boolean isEven = (arr[i] % 2 == 0);
//                    if (isEven == keepEvens) {
//                        result[index++] = arr[i];
//                    }
//                }
//                return result;
//            }
//
//            public void printArray(int[] arr) {
//                System.out.print("[");
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.print(arr[i]);
//                    if (i < arr.length - 1) {
//                        System.out.print(", ");
//                    }
//                }
//                System.out.println("]");
//            }
//        }
//        ArrayFilter filterObj = new ArrayFilter();
//        int[] original = {12, 5, 8, 19, 24, 3, 16};
//        System.out.println("=== ОРИГІНАЛЬНИЙ МАСИВ ===");
//        filterObj.printArray(original);
//        System.out.println("--- Фільтрація 1: елементи > 10 ---");
//        int[] res1 = filterObj.filter(original, 10);
//        filterObj.printArray(res1);
//        System.out.println("--- Фільтрація 2: елементи в діапазоні [5; 15] ---");
//        int[] res2 = filterObj.filter(original, 5, 15);
//        filterObj.printArray(res2);
//        System.out.println("--- Фільтрація 3: лише парні числа (keepEvens = true) ---");
//        int[] res3 = filterObj.filter(original, true);
//        filterObj.printArray(res3);
//        System.out.println("--- Фільтрація 4: лише непарні числа (keepEvens = false) ---");
//        int[] res4 = filterObj.filter(original, false);
//        filterObj.printArray(res4);

        //завдання25
//        class UserAccount {
//            private int id;
//            private String username;
//            private String email;
//
//            private static int nextId = 1001;
//
//            public UserAccount(String username, String email) {
//                this.id = nextId++;
//                this.username = username;
//                this.email = email;
//            }
//
//            public static int getNextAvailableId() {
//                return nextId;
//            }
//
//            public static void resetIdSequence(int startId) {
//                nextId = startId;
//            }
//
//            public void printUser() {
//                System.out.println("ID: " + id + " | Username: " + username + " | Email: " + email);
//            }
//        }
//        System.out.println("Наступний доступний ID до створення: " + UserAccount.getNextAvailableId());
//        UserAccount user1 = new UserAccount("denis_dev", "denis@gmail.com");
//        UserAccount user2 = new UserAccount("anna_it", "anna@gmail.com");
//        UserAccount user3 = new UserAccount("max_code", "max@gmail.com");
//        System.out.println("=== Список створених користувачів ===");
//        user1.printUser();
//        user2.printUser();
//        user3.printUser();
//        System.out.println("Наступний доступний ID після створення трьох користувачів: " + UserAccount.getNextAvailableId());

        //завдання26
//        class ServerConfig {
//            public static final String SERVER_NAME = "AlphaEnterprise";
//            public static final int MAX_CONNECTIONS = 5;
//
//            private static int activeConnections = 0;
//
//            public static boolean connect() {
//                if (activeConnections < MAX_CONNECTIONS) {
//                    activeConnections++;
//                    return true;
//                }
//                return false;
//            }
//
//            public static void disconnect() {
//                if (activeConnections > 0) {
//                    activeConnections--;
//                }
//            }
//
//            public static void printServerStatus() {
//                int freeSlots = MAX_CONNECTIONS - activeConnections;
//                System.out.println("Сервер: " + SERVER_NAME);
//                System.out.println("Активних підключень: " + activeConnections + " | Вільних слотів: " + freeSlots);
//            }
//        }
//        System.out.println("=== МОДЕЛЮВАННЯ ПІДКЛЮЧЕННЯ 6 КОРИСТУВАЧІВ ===");
//        for (int i = 1; i <= 6; i++) {
//            System.out.println("Спроба підключення Користувача " + i + ":");
//            boolean isConnected = ServerConfig.connect();
//            if (isConnected) {
//                System.out.println("-> Успішно підключено!");
//            } else {
//                System.out.println("-> ВІДМОВА: Ліміт з'єднань вичерпано!");
//            }
//            ServerConfig.printServerStatus();
//            System.out.println("---------------------------------------------");
//        }

        //завдання27
//        class MathUtils {
//
//            private MathUtils() {
//            }
//
//            public static final double PI = 3.1415926535;
//            public static final double E = 2.7182818284;
//
//            public static long factorial(int n) {
//                if (n < 0) {
//                    return 0;
//                }
//                long result = 1;
//                for (int i = 2; i <= n; i++) {
//                    result *= i;
//                }
//                return result;
//            }
//
//            public static double power(double base, int exp) {
//                if (exp == 0) {
//                    return 1.0;
//                }
//                double result = 1.0;
//                int absExp = Math.abs(exp);
//                for (int i = 0; i < absExp; i++) {
//                    result *= base;
//                }
//                return (exp < 0) ? (1.0 / result) : result;
//            }
//
//            public static int gcd(int a, int b) {
//                a = Math.abs(a);
//                b = Math.abs(b);
//                while (b != 0) {
//                    int temp = b;
//                    b = a % b;
//                    a = temp;
//                }
//                return a;
//            }
//
//            public static int clamp(int val, int min, int max) {
//                if (val < min) {
//                    return min;
//                }
//                if (val > max) {
//                    return max;
//                }
//                return val;
//            }
//        }
//        System.out.println("=== ТЕСТУВАННЯ УТИЛІТАРНОГО КЛАСУ MATHUTILS ===");
//        System.out.println("Константа PI: " + MathUtils.PI);
//        System.out.println("Константа E: " + MathUtils.E);
//        System.out.println();
//        long fact = MathUtils.factorial(5);
//        double pow = MathUtils.power(2.0, -3);
//        int commonDivisor = MathUtils.gcd(48, 18);
//        int clampedVal1 = MathUtils.clamp(15, 0, 10);
//        int clampedVal2 = MathUtils.clamp(-5, 0, 10);
//        System.out.println("Факторіал 5 (factorial(5)) = " + fact);
//        System.out.println("2 у степені -3 (power(2.0, -3)) = " + pow);
//        System.out.println("НСД чисел 48 і 18 (gcd(48, 18)) = " + commonDivisor);
//        System.out.println("Clamp (15 у діапазоні [0; 10]) = " + clampedVal1);
//        System.out.println("Clamp (-5 у діапазоні [0; 10]) = " + clampedVal2);

        //завдання28
//        class CurrencyExchange {
//            private static double usdToUahRate = 41.5;
//            private static double eurToUahRate = 45.2;
//
//            public static void updateRates(double newUsd, double newEur) {
//                if (newUsd > 0) {
//                    usdToUahRate = newUsd;
//                }
//                if (newEur > 0) {
//                    eurToUahRate = newEur;
//                }
//            }
//
//            public static double uahToUsd(double uah) {
//                if (usdToUahRate == 0) {
//                    return 0.0;
//                }
//                return uah / usdToUahRate;
//            }
//
//            public static double usdToUah(double usd) {
//                return usd * usdToUahRate;
//            }
//
//            public static double eurToUah(double eur) {
//                return eur * eurToUahRate;
//            }
//        }
//        double uahAmount = 10000.0;
//        double eurAmount = 200.0;
//        System.out.println("=== КОНВЕРТАЦІЯ ЗА ПОЧАТКОВИМИ КУРСАМИ ===");
//        System.out.println(uahAmount + " грн у доларах: " + CurrencyExchange.uahToUsd(uahAmount) + " $");
//        System.out.println(eurAmount + " євро у гривнях: " + CurrencyExchange.eurToUah(eurAmount) + " грн");
//        System.out.println("--- Змінюємо курси валют через updateRates(42.5, 46.0) ---");
//        CurrencyExchange.updateRates(42.5, 46.0);
//        System.out.println("=== КОНВЕРТАЦІЯ ЗА НОВИМИ КУРСАМИ ===");
//        System.out.println(uahAmount + " грн у доларах (новий курс): " + CurrencyExchange.uahToUsd(uahAmount) + " $");
//        System.out.println(eurAmount + " євро у гривнях (новий курс): " + CurrencyExchange.eurToUah(eurAmount) + " грн");

        //завдання29
//        class FleetCar {
//            private String vinCode;
//            private double currentMileage;
//
//            private static int totalCars = 0;
//            private static double totalCompanyMileage = 0.0;
//
//            public FleetCar(String vinCode, double initialMileage) {
//                this.vinCode = vinCode;
//                this.currentMileage = (initialMileage >= 0) ? initialMileage : 0.0;
//                totalCars++;
//                totalCompanyMileage += this.currentMileage;
//            }
//
//            public void addTrip(double km) {
//                if (km > 0) {
//                    currentMileage += km;
//                    totalCompanyMileage += km;
//                }
//            }
//
//            public static void printFleetSummary() {
//                System.out.println("=== СУМАРНА СТАТИСТИКА АВТОПАРКУ ===");
//                System.out.println("Загальна кількість автомобілів: " + totalCars);
//                System.out.println("Сумарний пробіг усього автопарку: " + totalCompanyMileage + " км");
//            }
//
//            public void printCarInfo() {
//                System.out.println("VIN-код: " + vinCode + " | Пробіг авто: " + currentMileage + " км");
//            }
//        }
//        FleetCar car1 = new FleetCar("WVWZZZ3CZ", 12000.0);
//        FleetCar car2 = new FleetCar("VF38ERH00", 5400.0);
//        FleetCar car3 = new FleetCar("JTMBC31V0", 25000.0);
//        System.out.println("=== СТАН АВТОМОБІЛІВ ПІСЛЯ СТВОРЕННЯ ===");
//        car1.printCarInfo();
//        car2.printCarInfo();
//        car3.printCarInfo();
//        car1.addTrip(450.0);
//        car2.addTrip(1200.0);
//        car3.addTrip(300.5);
//        System.out.println("=== ВИКОНАННЯ РЕЙСІВ ===");
//        System.out.println("Авто 1 проїхало 450 км.");
//        System.out.println("Авто 2 проїхало 1200 км.");
//        System.out.println("Авто 3 проїхало 300.5 км.");
//        FleetCar.printFleetSummary();

        //завдання30
//        class StringUtils {
//
//            private StringUtils() {}
//
//            public static boolean isPalindrome(String s) {
//                if (s == null) {
//                    return false;
//                }
//
//                String clean = s.replaceAll("\\s+", "").toLowerCase();
//                int left = 0;
//                int right = clean.length() - 1;
//                while (left < right) {
//                    if (clean.charAt(left) != clean.charAt(right)) {
//                        return false;
//                    }
//                    left++;
//                    right--;
//                }
//                return true;
//            }
//
//            public static String reverse(String s) {
//                if (s == null) {
//                    return null;
//                }
//                StringBuilder sb = new StringBuilder(s);
//                return sb.reverse().toString();
//            }
//
//            public static int countVowels(String s) {
//                if (s == null) {
//                    return 0;
//                }
//                int count = 0;
//                String lower = s.toLowerCase();
//                String vowels = "аоуеиіяюєїaeiou";
//
//                for (int i = 0; i < lower.length(); i++) {
//                    char c = lower.charAt(i);
//                    for (int j = 0; j < vowels.length(); j++) {
//                        if (c == vowels.charAt(j)) {
//                            count++;
//                            break;
//                        }
//                    }
//                }
//                return count;
//            }
//
//            public static String maskCardNumber(String cardNumber) {
//                if (cardNumber == null) {
//                    return null;
//                }
//
//                int totalDigits = 0;
//                for (int i = 0; i < cardNumber.length(); i++) {
//                    if (Character.isDigit(cardNumber.charAt(i))) {
//                        totalDigits++;
//                    }
//                }
//                if (totalDigits <= 4) {
//                    return cardNumber;
//                }
//                int maskedCount = totalDigits - 4;
//                StringBuilder result = new StringBuilder();
//                int currentDigitIndex = 0;
//                for (int i = 0; i < cardNumber.length(); i++) {
//                    char c = cardNumber.charAt(i);
//                    if (Character.isDigit(c)) {
//                        currentDigitIndex++;
//                        if (currentDigitIndex <= maskedCount) {
//                            result.append('*');
//                        } else {
//                            result.append(c);
//                        }
//                    } else {
//                        result.append(c);
//                    }
//                }
//                return result.toString();
//            }
//        }
//        System.out.println("=== ТЕСТУВАННЯ КЛАСУ STRINGUTILS ==-");
//        String pal1 = "А роза упала на лапу Азора";
//        String pal2 = "Програмування";
//        System.out.println("1. Перевірка паліндрома:");
//        System.out.println("\"" + pal1 + "\" -> " + StringUtils.isPalindrome(pal1));
//        System.out.println("\"" + pal2 + "\" -> " + StringUtils.isPalindrome(pal2));
//        String textToReverse = "Java Developer";
//        System.out.println("\n2. Перевертання рядка:");
//        System.out.println("Оригінал: " + textToReverse);
//        System.out.println("Реверс: " + StringUtils.reverse(textToReverse));
//        String wordForVowels = "Університет";
//        System.out.println("\n3. Підрахунок голосних:");
//        System.out.println("Слово: " + wordForVowels);
//        System.out.println("Кількість голосних: " + StringUtils.countVowels(wordForVowels));
//        String cardNumber = "4441 1111 2222 3333";
//        System.out.println("\n4. Маскування номера картки:");
//        System.out.println("Оригінал: " + cardNumber);
//        System.out.println("Маскований: " + StringUtils.maskCardNumber(cardNumber));

        //завдання31
//        System.out.println("=== МОДЕЛЮВАННЯ СТВОРЕННЯ ІГРОВИХ СЕСІЙ (МАКСИМУМ 3) ===");
//        System.out.println("Створюємо сесію 1:");
//        GameSession s1 = GameSession.createSession("Альфа");
//        if (s1 != null) s1.printSessionInfo();
//        System.out.println("Створюємо сесію 2:");
//        GameSession s2 = GameSession.createSession("Браво");
//        if (s2 != null) s2.printSessionInfo();
//        System.out.println("Створюємо сесію 3:");
//        GameSession s3 = GameSession.createSession("Чарлі");
//        if (s3 != null) s3.printSessionInfo();
//        System.out.println("Створюємо сесію 4 (очікуємо перевантаження):");
//        GameSession s4 = GameSession.createSession("Дельта");
//        System.out.println("Результат створення s4: " + s4);
//        System.out.println("--- Завершуємо сесію хоста 'Альфа' ---");
//        if (s1 != null) {
//            s1.terminate();
//        }
//        System.out.println("Створюємо сесію 5 після звільнення слота:");
//        GameSession s5 = GameSession.createSession("Ехо");
//        if (s5 != null) {
//            s5.printSessionInfo();
//        }

        //завдання32
//        System.out.println("=== ФІЗИЧНИЙ ДВИГУН ТА РОЗРАХУНКИ ===");
//        double timeSeconds = 5.0;
//        double fallDistance = PhysicsEngine.freeFallDistance(timeSeconds);
//        System.out.println("Час падіння: " + timeSeconds + " сек");
//        System.out.println("Відстань вільного падіння: " + fallDistance + " м");
//        double massKg = 0.001; // 1 грам у кілограмах
//        double restEnergyValue = PhysicsEngine.restEnergy(massKg);
//        System.out.println("Маса речовини: " + massKg + " кг (1 г)");
//        System.out.println("Енергія спокою (E = m * c^2): " + restEnergyValue + " Дж");

        //завдання33
//        LineSegment segment = new LineSegment(1.0, 2.0, 4.0, 6.0);
//        System.out.println("=== ІНФОРМАЦІЯ ПРО ВІДРІЗОК ===");
//        segment.printSegment();
//        double length = segment.getLength();
//        System.out.println("Довжина відрізка: " + length);
//        Point midPoint = segment.getMidPoint();
//        System.out.println("Координати середини відрізка: (" + midPoint.getX() + "; " + midPoint.getY() + ")");

        //завдання34
//        class ClientAccount {
//            private String iban;
//            private String owner;
//            private double balance;
//
//            public ClientAccount(String iban, String owner, double balance) {
//                this.iban = iban;
//                this.owner = owner;
//                this.balance = (balance >= 0) ? balance : 0.0;
//            }
//
//            public boolean transferTo(ClientAccount recipient, double amount) {
//
//                if (recipient == null || recipient == this) {
//                    System.out.println("Помилка: неможливо здійснити переказ на цей рахунок!");
//                    return false;
//                }
//
//                if (amount > 0 && this.balance >= amount) {
//                    this.balance -= amount;
//                    recipient.balance += amount;
//                    System.out.println("Успішно переведено " + amount + " грн від " + this.owner + " до " + recipient.owner);
//                    return true;
//                } else {
//                    System.out.println("Помилка: недостатньо коштів на рахунку або невірна сума переказу!");
//                    return false;
//                }
//            }
//
//            public void printAccount() {
//                System.out.println("IBAN: " + iban + " | Власник: " + owner + " | Баланс: " + balance + " грн");
//            }
//        }
//        ClientAccount ivan = new ClientAccount("UA111112222233333", "Іван", 10000.0);
//        ClientAccount maria = new ClientAccount("UA999998888877777", "Марія", 2000.0);
//        System.out.println("=== БАЛАНСИ ДО ПЕРЕКАЗУ ===");
//        ivan.printAccount();
//        maria.printAccount();
//        System.out.println("--- Виконуємо переказ 3 500 грн ---");
//        boolean transferResult = ivan.transferTo(maria, 3500.0);
//        System.out.println("Статус транзакції: " + transferResult);
//        System.out.println("=== ФІНАЛЬНІ БАЛАНСИ РАХУНКІВ ===");
//        ivan.printAccount();
//        maria.printAccount();

        //завдання35
//        class Engine {
//            private String serialNumber;
//            private int horsePower;
//            private boolean isRunning;
//
//            public Engine(String serialNumber, int horsePower) {
//                this.serialNumber = serialNumber;
//                this.horsePower = (horsePower > 0) ? horsePower : 0;
//                this.isRunning = false; // за замовчуванням двигун вимкнений
//            }
//
//            public void start() {
//                isRunning = true;
//            }
//
//            public void stop() {
//                isRunning = false;
//            }
//
//            public boolean isRunning() {
//                return isRunning;
//            }
//
//            public int getHorsePower() {
//                return horsePower;
//            }
//
//            public String getSerialNumber() {
//                return serialNumber;
//            }
//        }
//
//        class CarWithEngine {
//            private String brand;
//            private String model;
//            private Engine engine;
//
//            public CarWithEngine(String brand, String model, Engine engine) {
//                this.brand = brand;
//                this.model = model;
//                this.engine = engine;
//            }
//
//            public void startCar() {
//                if (engine != null) {
//                    engine.start();
//                    System.out.println(brand + " готовий до руху!");
//                } else {
//                    System.out.println("Помилка: у автомобіля відсутній двигун!");
//                }
//            }
//
//            public void turnOff() {
//                if (engine != null) {
//                    engine.stop();
//                    System.out.println(brand + " вимкнено.");
//                }
//            }
//
//            public void printSpecs() {
//                System.out.println("Марка та модель: " + brand + " " + model);
//                if (engine != null) {
//                    System.out.println("Двигун (Серійний номер: " + engine.getSerialNumber() +
//                            ", Потужність: " + engine.getHorsePower() + " к.с.)");
//                    System.out.println("Двигун запущено: " + engine.isRunning());
//                } else {
//                    System.out.println("Двигун не встановлено.");
//                }
//            }
//        }
//        Engine engine = new Engine("ENG-987654", 450);
//        CarWithEngine myCar = new CarWithEngine("BMW", "M5 Competition", engine);
//        System.out.println("=== СТАН АВТОМОБІЛЯ ДО ЗАПУСКУ ===");
//        myCar.printSpecs();
//        System.out.println("--- Заводимо автомобіль ---");
//        myCar.startCar();
//        System.out.println("=== СТАН АВТОМОБІЛЯ ПІСЛЯ ЗАПУСКУ ===");
//        myCar.printSpecs();
//        System.out.println("--- Зупиняємо двигун ---");
//        myCar.turnOff();

        //завдання36
//        Processor cpu = new Processor("Intel Core i5-13600K", 3.5, 12500.0);
//        Memory ram16 = new Memory(16, 3200, 2400.0);
//        Computer myPC = new Computer("Alpha Gaming Station", cpu, ram16, 3500.0);
//        System.out.println("=== ПОЧАТКОВІ ХАРАКТЕРИСТИКИ ТА ЦІНА ===");
//        myPC.printSpecs();
//        Memory ram32 = new Memory(32, 3600, 4800.0);
//        System.out.println("--- Виконуємо апгрейд пам'яті до 32GB ---");
//        myPC.upgradeMemory(ram32);
//        System.out.println("=== ХАРАКТЕРИСТИКИ ТА ЦІНА ПІСЛЯ АПГРЕЙДУ ===");
//        myPC.printSpecs();

        //завданн37
//        class Hero {
//            private String name;
//            private int health;
//            private int attackPower;
//            private int defense;
//
//            public Hero(String name, int health, int attackPower, int defense) {
//                this.name = name;
//                this.health = (health >= 0) ? health : 0;
//                this.attackPower = (attackPower >= 0) ? attackPower : 0;
//                this.defense = (defense >= 0) ? defense : 0;
//            }
//
//            public void attack(Hero target) {
//                if (target == null || !target.isAlive() || !this.isAlive()) {
//                    return;
//                }
//
//                int damage = this.attackPower - target.defense;
//
//                if (damage <= 0) {
//                    damage = 1;
//                }
//
//                target.health -= damage;
//                if (target.health < 0) {
//                    target.health = 0;
//                }
//
//                System.out.println(this.name + " атакує " + target.name + " і завдає " + damage + " одиниць шкоди! У " + target.name + " залишилося " + target.health + " HP.");
//            }
//
//            public boolean isAlive() {
//                return this.health > 0;
//            }
//
//            public String getName() {
//                return name;
//            }
//        }
//        Hero knight = new Hero("Лицар", 100, 25, 10);
//        Hero orc = new Hero("Орк", 120, 20, 5);
//        System.out.println("=== ПОЧАТОК ДУЕЛІ МІЖ ГЕРОЯМИ ===");
//        System.out.println("Учасники:");
//        System.out.println("- Лицар (HP: 100, Атака: 25, Захист: 10)");
//        System.out.println("- Орк (HP: 120, Атака: 20, Захист: 5)");
//        int round = 1;
//        while (knight.isAlive() && orc.isAlive()) {
//            System.out.println("--- Раунд " + round + " ---");
//            knight.attack(orc);
//            if (!orc.isAlive()) {
//                break;
//            }
//            orc.attack(knight);
//            System.out.println();
//            round++;
//        }
//        System.out.println("=== ДУЕЛЬ ЗАВЕРШЕНО ===");
//        if (knight.isAlive()) {
//            System.out.println("Переможець: Лицар!");
//        } else if (orc.isAlive()) {
//            System.out.println("Переможець: Орк!");
//        } else {
//            System.out.println("Нічия! Обидва герої загинули в один раунд.");
//        }

        //завдання38
//        class Product {
//            private int id;
//            private String title;
//            private double price;
//
//            public Product(int id, String title, double price) {
//                this.id = id;
//                this.title = title;
//                this.price = (price >= 0) ? price : 0.0;
//            }
//
//            public double getPrice() {
//                return price;
//            }
//
//            public String getTitle() {
//                return title;
//            }
//        }
//
//        class Customer {
//            private String name;
//            private double walletBalance;
//
//            public Customer(String name, double walletBalance) {
//                this.name = name;
//                this.walletBalance = (walletBalance >= 0) ? walletBalance : 0.0;
//            }
//
//            public boolean pay(double amount) {
//                if (amount > 0 && walletBalance >= amount) {
//                    walletBalance -= amount;
//                    return true;
//                }
//                return false;
//            }
//
//            public double getWalletBalance() {
//                return walletBalance;
//            }
//
//            public String getName() {
//                return name;
//            }
//        }
//
//        class Order {
//            private Customer customer;
//            private Product[] items;
//            private int itemCount;
//
//            public Order(Customer customer, int maxItems) {
//                this.customer = customer;
//                this.items = new Product[maxItems];
//                this.itemCount = 0;
//            }
//
//            public void addProduct(Product p) {
//                if (itemCount < items.length && p != null) {
//                    items[itemCount] = p;
//                    itemCount++;
//                } else {
//                    System.out.println("Помилка: кошик заповнений або товар невалідний!");
//                }
//            }
//
//            public double calculateTotal() {
//                double total = 0.0;
//                for (int i = 0; i < itemCount; i++) {
//                    total += items[i].getPrice();
//                }
//                return total;
//            }
//
//            public boolean checkout() {
//                double total = calculateTotal();
//
//                if (customer.pay(total)) {
//                    System.out.println("=== ЧЕК УСПІШНОЇ ПОКУПКИ ===");
//                    System.out.println("Покупець: " + customer.getName());
//                    System.out.println("Товари в замовленні:");
//                    for (int i = 0; i < itemCount; i++) {
//                        System.out.println(" - " + items[i].getTitle() + ": " + items[i].getPrice() + " грн");
//                    }
//                    System.out.println("Загальна сума: " + total + " грн");
//                    System.out.println("Оплата пройшла успішно! Залишок на гаманці: " + customer.getWalletBalance() + " грн");
//                    return true;
//                } else {
//                    System.out.println("Помилка оплати: недостатньо коштів у покупця " + customer.getName() + " для оплати суми " + total + " грн (на балансі: " + customer.getWalletBalance() + " грн)!");
//                    return false;
//                }
//            }
//        }
//        Product p1 = new Product(1, "Бездротова миша", 850.0);
//        Product p2 = new Product(2, "Механічна клавіатура", 2200.0);
//        Product p3 = new Product(3, "Ігровий монітор", 8500.0);
//        System.out.println("=== СЦЕНАРІЙ 1: Покупка з достатнім балансом ===");
//        Customer richCustomer = new Customer("Олександр", 12000.0);
//        Order order1 = new Order(richCustomer, 3);
//        order1.addProduct(p1);
//        order1.addProduct(p2);
//        order1.checkout();
//        System.out.println();
//        System.out.println("=== СЦЕНАРІЙ 2: Покупка з недостатнім балансом ===");
//        Customer poorCustomer = new Customer("Ірина", 3000.0);
//        Order order2 = new Order(poorCustomer, 3);
//        order2.addProduct(p2);
//        order2.addProduct(p3);
//        order2.checkout();

        //завдання39
//        class Vector3D {
//            private double x;
//            private double y;
//            private double z;
//
//            public Vector3D(double x, double y, double z) {
//                this.x = x;
//                this.y = y;
//                this.z = z;
//            }
//
//            public Vector3D() {
//                this(0, 0, 0);
//            }
//
//            public Vector3D add(Vector3D other) {
//                if (other == null) {
//                    return new Vector3D(this.x, this.y, this.z);
//                }
//                return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
//            }
//
//            public double dotProduct(Vector3D other) {
//                if (other == null) {
//                    return 0.0;
//                }
//                return this.x * other.x + this.y * other.y + this.z * other.z;
//            }
//
//            public Vector3D crossProduct(Vector3D other) {
//                if (other == null) {
//                    return new Vector3D();
//                }
//                double cx = this.y * other.z - this.z * other.y;
//                double cy = this.z * other.x - this.x * other.z;
//                double cz = this.x * other.y - this.y * other.x;
//                return new Vector3D(cx, cy, cz);
//            }
//
//            public boolean isOrthogonalTo(Vector3D other) {
//                return Math.abs(this.dotProduct(other)) < 1e-9;
//            }
//
//            public boolean isEqualTo(Vector3D other) {
//                if (other == null) {
//                    return false;
//                }
//                return this.x == other.x && this.y == other.y && this.z == other.z;
//            }
//
//            public void printVector() {
//                System.out.println("(" + x + ", " + y + ", " + z + ")");
//            }
//        }
//        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0);
//        Vector3D v2 = new Vector3D(0.0, 1.0, 0.0);
//        System.out.println("=== ПОЧАТКОВІ ВЕКТОРИ ===");
//        System.out.print("Вектор v1: ");
//        v1.printVector();
//        System.out.print("Вектор v2: ");
//        v2.printVector();
//        System.out.println("=== ТЕСТУВАННЯ ОПЕРАЦІЙ ===");
//        Vector3D sumVector = v1.add(v2);
//        System.out.print("Сума v1 та v2 (v1.add(v2)): ");
//        sumVector.printVector();
//        double dot = v1.dotProduct(v2);
//        System.out.println("Скалярний добуток v1 та v2 (v1.dotProduct(v2)): " + dot);
//        boolean orthogonal = v1.isOrthogonalTo(v2);
//        System.out.println("Чи є v1 та v2 ортогональними (перпендикулярними): " + orthogonal);
//        Vector3D cross = v1.crossProduct(v2);
//        System.out.print("Векторний добуток v1 та v2 (v1.crossProduct(v2)): ");
//        cross.printVector();

        //завдання40
//        class BookItem {
//            private String isbn;
//            private String title;
//            private String author;
//            private boolean isAvailable;
//
//            public BookItem(String isbn, String title, String author) {
//                this.isbn = isbn;
//                this.title = title;
//                this.author = author;
//                this.isAvailable = true;
//            }
//
//            public boolean borrowBook() {
//                if (isAvailable) {
//                    isAvailable = false;
//                    return true;
//                }
//                return false; // якщо вже видана
//            }
//
//            public void returnBook() {
//                isAvailable = true;
//            }
//
//            public String getTitle() {
//                return title;
//            }
//
//            public boolean isAvailable() {
//                return isAvailable;
//            }
//
//            public void printBook() {
//                String status = isAvailable ? "Доступна" : "Видана";
//                System.out.println("\"" + title + "\" — Автор: " + author + " (ISBN: " + isbn + ") | Статус: " + status);
//            }
//        }
//
//        class LibraryCatalog {
//            private BookItem[] books;
//            private int size;
//
//            public LibraryCatalog(int capacity) {
//                this.books = new BookItem[capacity];
//                this.size = 0;
//            }
//
//            public void addBook(BookItem book) {
//                if (size < books.length && book != null) {
//                    books[size] = book;
//                    size++;
//                    System.out.println("Книгу \"" + book.getTitle() + "\" успішно додано до каталогу.");
//                } else {
//                    System.out.println("Помилка: каталог переповнено або книга невалідна!");
//                }
//            }
//
//            public BookItem findBookByTitle(String title) {
//                if (title == null) {
//                    return null;
//                }
//                for (int i = 0; i < size; i++) {
//                    if (books[i].getTitle().equalsIgnoreCase(title)) {
//                        return books[i];
//                    }
//                }
//                return null;
//            }
//
//            public boolean borrowBook(String title) {
//                BookItem book = findBookByTitle(title);
//                if (book != null) {
//                    return book.borrowBook();
//                }
//                System.out.println("Помилка: книгу з назвою \"" + title + "\" не знайдено в каталозі.");
//                return false;
//            }
//
//            public void printCatalog() {
//                System.out.println("=== БІБЛІОТЕЧНИЙ КАТАЛОГ ===");
//                if (size == 0) {
//                    System.out.println("Каталог порожній.");
//                    return;
//                }
//                for (int i = 0; i < size; i++) {
//                    System.out.print((i + 1) + ". ");
//                    books[i].printBook();
//                }
//            }
//        }
//        LibraryCatalog catalog = new LibraryCatalog(5);
//        BookItem b1 = new BookItem("978-5-699", "Кобзар", "Тарас Шевченко");
//        BookItem book1 = new BookItem("978-966-00", "Кобзар", "Тарас Шевченко");
//        BookItem book2 = new BookItem("978-617-12", "Тіні забутих предків", "Михайло Коцюбинський");
//        BookItem book3 = new BookItem("978-617-09", "Тигролови", "Іван Багряний");
//        System.out.println("=== ДОДАВАННЯ КНИГ ДО ФОНДУ ===");
//        catalog.addBook(book1);
//        catalog.addBook(book2);
//        catalog.addBook(book3);
//        System.out.println();
//        catalog.printCatalog();
//        System.out.println("--- Спроба взяти книгу \"Тіні забутих предків\" (1-й раз) ---");
//        boolean success1 = catalog.borrowBook("Тіні забутих предків");
//        System.out.println("Результат видачі: " + (success1 ? "Успішно видано!" : "Не вдалося видати."));
//        System.out.println();
//        catalog.printCatalog();
//        System.out.println("--- Спроба взяти ту саму книгу вдруге ---");
//        boolean success2 = catalog.borrowBook("Тіні забутих предків");
//        System.out.println("Результат повторної видачі: " + (success2 ? "Успішно видано!" : "Помилка: книга вже видана іншому читачу!"));
    }
}
//class TestBookItem {
//
//}









