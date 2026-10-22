package semester1.practice03;

import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //завдання1
//        System.out.println("Ім'я: ");
//        String name = scanner.nextLine();
//        System.out.println("Прізвище: ");
//        String surname = scanner.nextLine();
//        System.out.println("Вік: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Місто проживання: ");
//        String sity = scanner.nextLine();
//        System.out.println("----Інформаційна картка----");
//        System.out.println("Ім'я: " + name);
//        System.out.println("Прізвище: " + surname);
//        System.out.println("Вік: " + age);
//        System.out.println("Місто проживання: " + sity);
//        System.out.println("---------------------------");
//        System.out.println("Привіт " + name + " " + surname +" з міста проживання " + sity + ", твій вік " + age);

        //завдання2
//        System.out.println("Введіть перше число: ");
//        int a = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Введіть друге число: ");
//        int b = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Сума: " + (a + b));
//        System.out.println("Різниця: " + (a - b));
//        System.out.println("Добуток: " + (a * b));
//        System.out.println("Остача від ділення: " + (a % b));

        //завдання3
//        System.out.println("Введіть суму в гривнях: ");
//        double amountUAH = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Введіть курс USD: ");
//        double courseUSD = scanner.nextDouble();
//        scanner.nextLine();
//        double amountUSD = Math.round((amountUAH / courseUSD) * 100)/100.0;
//        System.out.println("Сума до видачі: " + amountUSD);

        //завдання4
//        System.out.println("Введіть номер квитка: ");
//        int ticketNumb = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Введіть повне ім'я студента: ");
//        String fullName = scanner.nextLine();
//        System.out.println("Введіть спеціальність: ");
//        String specialty = scanner.nextLine();
//        System.out.println("Студент: " + fullName + ", квиток №" + ticketNumb + ", спеціальність: " + specialty);

        //завдання5
//        System.out.println("Введіть зріст у метрах: ");
//        double height = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Введіть вагу у кілограмах: ");
//        double weight = scanner.nextDouble();
//        scanner.nextLine();
//        double indexBodyWeight = Math.round((weight/Math.pow(height, 2))*100)/100.0;
//        System.out.println("Ваш зріст (м): " + height);
//        System.out.println("Ваша вага (кг): " + weight);
//        System.out.println("Розрахований ВМІ: " + indexBodyWeight);

        //завдання6
//        System.out.println("Введіть ваш улюблений символ: ");
//        char symbol = scanner.next().charAt(0);
//        int code = (int) symbol;
//        System.out.println("Символ: " + symbol + " | Код символу: " + code );

        //завдання7
//        System.out.println("Введіть довжину катету а: ");
//        double a = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Введіть довжину катету b: ");
//        double b = scanner.nextDouble();
//        scanner.nextLine();
//        double c = Math.round (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) * 100)/100.0;
//        double p = Math.round((a + b)*100)/100.0;
//        double s = Math.round((a * b)*100)/100.0;
//        System.out.println("Катет а: " + a + " Катет b: " + b);
//        System.out.println("Гіпотенуза: " + c);
//        System.out.println("Периметр: " + p);
//        System.out.println("Площа: " + s);

        //завдання8
//        System.out.println("Введіть назву товару: ");
//        String name = scanner.nextLine();
//        System.out.println("Введіть ціну товару: ");
//        double price = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Введіть кількість товару: ");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        double amount = Math.round((price * number) * 100)/100.0;
//        double pdv = Math.round((amount * 0.2) * 100)/100.0;
//        System.out.println("Товар: " + name);
//        System.out.println("Ціна: " + price);
//        System.out.println("Кількість: " + number);
//        System.out.println("Загальна сума: " + amount + " грн (з них ПДВ 20%: " + pdv + " грн)");

        //завдання9
//        System.out.println("Введіть число: ");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        if (number > 0) {
//            System.out.println("Число додатнє.");
//        } else if (number == 0){
//            System.out.println("Це нуль");
//        }else{
//            System.out.println("Число від'ємне");
//        }

        //завдання10
//        System.out.println("Введіть число: ");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        if (number == 0) {
//            System.out.println("Число є нулем.");
//        } else if (number % 2 == 0) {
//            System.out.println("Число парне");
//        } else {
//            System.out.println("Число непарне");
//        }

        //завдання11
//        System.out.println("Введіть ваш вік: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        if (age < 0 || age > 120) {
//            System.out.println("Некоректний вік");
//        } else if (age > 0 && age <= 12) {
//            System.out.println("Дитина");
//        } else if (age >= 13 && age <= 17) {
//            System.out.println("Підліток");
//        } else if (age >= 18 && age <= 64) {
//            System.out.println("Дорослий");
//        } else if (age >= 65) {
//            System.out.println("Пенсіонер");
//        }

        //завдання12
//        System.out.println("Введіть оцінку: ");
//        int grade = scanner.nextInt();
//        if (grade < 0 || grade > 100) {
//            System.out.println("\"Помилка: некоректний бал!\"");
//            scanner.nextLine();
//        } else if (grade >= 0 && grade <= 59){
//            System.out.println("Незадовільно (F)");
//        } else if (grade >= 60 && grade <= 63){
//            System.out.println("Достатньо (Е)");
//        } else if (grade >= 64 && grade <= 73){
//            System.out.println("Задовільно (D)");
//        } else if (grade >= 74 && grade <= 81){
//            System.out.println("Добре (C)");
//        } else if (grade >= 82 && grade <= 89){
//            System.out.println("Дуже добре (B)");
//        } else if (grade >= 90 && grade <= 100){
//            System.out.println("Відмінно (А)");
//        }

        //завдання13
//        System.out.println("Введіть 3 числа: ");
//        int a = scanner.nextInt();
//        scanner.nextLine();
//        int b = scanner.nextInt();
//        scanner.nextLine();
//        int c = scanner.nextInt();
//        scanner.nextLine();
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        int min = a;
//        if (b < min) {
//            min = b;
//        }
//        if (c < min) {
//            min = c;
//        }
//        System.out.println("Максимум: " + max);
//        System.out.println("Мінімум: " + min);

        //завдання14
//        System.out.println("Введіть Х: ");
//        double x = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Введіть Y: ");
//        double y = scanner.nextDouble();
//        scanner.nextLine();
//        if (x > 0 && y > 0){
//            System.out.println("Точка (" + x + "; " + y + ") знаходиться у I четверті");
//        } else if (x < 0 && y > 0){
//            System.out.println("Точка (" + x + "; " + y + ") знаходиться у II четверті");
//        } else if (x < 0 && y < 0){
//            System.out.println("Точка (" + x + "; " + y + ") знаходиться у III четверті");
//        } else if (x > 0 && y < 0){
//            System.out.println("Точка (" + x + "; " + y + ") знаходиться у IV четверті");
//        }

        //завдання15
//        int x = 5;
//        int y = 20;
//        if (x > 10) {
//            if (y > 15) {
//                System.out.println("y більше 15");
//            }
//        } else {
//            System.out.println("x не перевищує 10 (зовнішній else)");
//        }

        //завдання16
//        System.out.println("Введіть обсяг спожитої електроенергії (в кВт·год): ");
//        double energy = scanner.nextDouble();
//        scanner.nextLine();
//        double totalSum = 0;
//        if (energy < 0){
//            System.out.println("Помилка! Обсяг спожитої електроенергії не може бути від'ємним!");
//        } else if (energy <= 100){
//            totalSum = energy * 2.64;
//        } else {
//            totalSum = (100 * 2.64) + ((energy - 100) * 4.32);
//        }
//        System.out.println("Спожито: " + energy);
//        System.out.println("Сума до сплати: " + totalSum + " грн");

        //завдання17
//        System.out.println("Введіть число х: ");
//        int x = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Введіть число у: ");
//        int y = scanner.nextInt();
//        scanner.nextLine();
//        int max = (x > y) ? x : y;
//        System.out.println("Найбільше число: " + max);

        //завдання18
//        System.out.println("Введіть число n: ");
//        int n = scanner.nextInt();
//        int abs = (n < 0) ? -n : n;
//        System.out.println("Модуль n: " + abs);

        //завдання19
//        System.out.println("Введіть число: ");
//        int a = scanner.nextInt();
//        String result = (a % 2 == 0) ? "Парне" : "Непарне";
//        System.out.println(result);

        //завдання20
//        System.out.println("Введіть бал: ");
//        int grade = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Результат: " + ((grade >= 60)? "Зараховано" : "Незараховано" ));

        //завдання21
//        System.out.println("Введіть число: ");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        String status = (number > 0) ? "Додатне" : (number < 0) ? "Від'ємне" : "Нуль";
//        System.out.println("Число: " + status);

        //завдання22
//        System.out.println("Введіть суму: ");
//        double amount = scanner.nextDouble();
//        scanner.nextLine();
//        double sum = (amount > 1000)? (amount - (amount * 0.10)) : (amount - (amount * 0.02));
//        System.out.println("До сплати зі знижкою: " + sum + " грн");

        //завдання23
//        System.out.println("Введіть а: ");
//        int a = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Введіть b: ");
//        int b = scanner.nextInt();
//        scanner.nextLine();
//        String res = (b != 0) ? "" + (a / b) : "Помилка ділення на 0 неможливе";
//        System.out.println("Результат: " + res);

        //завдання24
//        System.out.println("Введіть кількість помилок: ");
//        int mistake = scanner.nextInt();
//        scanner.nextLine();
//        String res = (mistake == 1)? "Знайдено 1 помилку" : "Знайдено " + mistake + " помилок";
//        System.out.println(res);

        //завдання25
//        int x = 10;
//        int divisor = 0;
//        if (divisor != 0 && (x / divisor > 1)) {
//            System.out.println("Успішне ділення");
//        } else {
//            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
//        }
// програма не падає з ArithmeticException через && якому для перевірки достатньо однієї умови, тому ділення такого не відбувається і програма переходить до блоку else

        //завдання26
//        int counter1 = 0;
//        int counter2 = 0;
//        boolean b1 = false && (++counter1 > 0);
//        boolean b2 = false & (++counter2 > 0);
//        System.out.println("Лічильник1: " + counter1);
//        System.out.println("Лічильник2: " + counter2);
// counter1 залишився 0 через &&, який бачить false зліва і пропускає праву частину, а counter2 став 1 через &, який обов’язково перевіряє обидві умови

        //завдання27
//        int number = 5;
//        if (number > 0 || (10 / 0 == 0)) {
//                System.out.println("Умова виконана, аварійне ділення не викликалося!");
//        }
// вираз не виконується, бо використовується || який бачить з лівої сторони true і виконує дію

        //завдання28
//        int counterA = 0;
//        int counterB = 0;
//        boolean test1 = true || (++counterA > 0);
//        boolean test2 = true | (++counterB > 0);
//        System.out.println("Лічильник1: " + counterA);
//        System.out.println("Лічильник2: " + counterB);
// оператор | перевіряє, окрім першої умови виконує щей другу і тому лічильник2 зміниться на 1

        //завдання29
//        System.out.println("Введіть години (від 0 до 23): ");
//        int hours = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Введіть хвилини (від 0 до 59): ");
//        int minutes = scanner.nextInt();
//        scanner.nextLine();
//        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
//        if (isValidTime == true){
//            System.out.println("Зараз: " + hours + ":" + minutes);
//        } else {
//            System.out.println("Помилка!");
//        }

        //завдання30
//        System.out.println("Введіть сторону а: ");
//        int a = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Введіть сторону b: ");
//        int b = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Введіть сторону c: ");
//        int c = scanner.nextInt();
//        scanner.nextLine();
//        if ((a + b > c) && (a + c > b) && (b + c > a)) {
//            System.out.println("Трикутник існує: true");
//        } else {
//            System.out.println("Трикутник існує: false");
//        }

        //завдання31
//        System.out.println("Введіть число n: ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        boolean isEvenBitwise = (n & 1) == 0;
//        boolean isEvenStandard = (n % 2) == 0;
//        System.out.println("Побітова перевірка (n & 1 == 0): " + isEvenBitwise);
//        System.out.println("Звичайна перевірка (n % 2 == 0): " + isEvenStandard);
//        System.out.println("Пояснення: оскільки число 1 складається з нулів і однієї одиниці в кінці, операція & 1 стирає всі інші біти числа, залишаючи для перевірки лише останній");

        //завдання32
//        boolean isPinCorrect = true;
//        boolean isCardActive = true;
//        boolean hasSufficientBalance = true;
//        boolean isDailyLimitExceeded = false;
//        boolean isTransactionAllowed = isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded;
//        if (isTransactionAllowed) {
//            System.out.println("Транзакція дозволена!");
//        } else {
//            System.out.println("Транзакція відхилена.");
//        }

        //завдання33
//        System.out.println("Введіть день (від 1 до 7): ");
//        int day = scanner.nextInt();
//        scanner.nextLine();
//        switch (day) {
//            case 1:
//                System.out.println("Понеділок");
//                break;
//            case 2:
//                System.out.println("Вівторок");
//                break;
//            case 3:
//                System.out.println("Середа");
//                break;
//            case 4:
//                System.out.println("Четвер");
//                break;
//            case 5:
//                System.out.println("П'ятниця");
//                break;
//            case 6:
//                System.out.println("Субота");
//                break;
//            case 7:
//                System.out.println("Неділя");
//                break;
//            default:
//                System.out.println("Некоректний номер дня");
//                break;
//        }

        //завдання34
//        System.out.println("Введіть день (від 1 до 7): ");
//        int day = scanner.nextInt();
//        scanner.nextLine();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Будній день");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Вихідний день");
//                break;
//            default:
//                System.out.println("Некоректний номер дня");
//                break;
//        }

        //завдання35
//        System.out.println("Введіть номер місяця (1–12): ");
//        int month = scanner.nextInt();
//        scanner.nextLine();
//        int days = switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> 31;
//            case 4, 6, 9, 11           -> 30;
//            case 2                     -> 28;
//            default                    -> 0;
//        };
//        if (days > 0) {
//            System.out.println("Кількість днів у місяці: " + days);
//        } else {
//            System.out.println("Неіснуючий місяць");
//        }

        //завдання36
//        System.out.print("Введіть місяць: ");
//        String month = scanner.nextLine();
//        String season = switch (month) {
//            case "грудень", "січень", "лютий"       -> "Зима";
//            case "березень", "квітень", "травень"   -> "Весна";
//            case "червень", "липень", "серпень"     -> "Літо";
//            case "вересень", "жовтень", "листопад"  -> "Осінь";
//            default                                 -> "Невідомий місяць";
//        };
//        if (!season.equals("Невідомий місяць")) {
//            System.out.println("Пора року: " + season);
//        } else {
//            System.out.println("Введено некоректну назву місяця.");
//        }

        //завдання37
//        System.out.println("Оберіть спосіб доставки (1 — Самовивіз, 2 — Кур'єр, 3 — Поштомат): ");
//        int deliveryMethod = scanner.nextInt();
//        scanner.nextLine();
//        int cost = switch (deliveryMethod) {
//            case 1 -> 0;
//            case 2 -> {
//                System.out.print("Введіть вагу товару (кг): ");
//                double weight = scanner.nextDouble();
//                if (weight > 5) {
//                    yield 150;
//                } else {
//                    yield 90;
//                }
//            }
//            case 3 -> 60;
//            default -> -1;
//        };
//        if (cost == -1) {
//            System.out.println("Некоректний вибір способу доставки");
//        } else {
//            System.out.println("Вартість доставки: " + cost + " грн.");
//        }

        //завдання38
//        System.out.print("Число 1: ");
//        double a = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Оберіть операцію (+, -, *, /): ");
//        char op = scanner.next().charAt(0);
//        System.out.print("Число 2: ");
//        double b = scanner.nextDouble();
//        scanner.nextLine();
//        Double result = switch (op) {
//            case '+' -> a + b;
//            case '-' -> a - b;
//            case '*' -> a * b;
//            case '/' -> {
//                if (b == 0) {
//                    System.out.println("Помилка: ділення на нуль!");
//                    yield null;
//                }
//                yield a / b;
//            }
//            default -> {
//                System.out.println("Помилка: невідома операція!");
//                yield null;
//            }
//        };
//        if (result == null) {
//            System.out.println("Помилка: ділення на нуль або невідома операція!");
//        } else {
//            System.out.println("Результат: " + result);
//        }

        //завдання39
//        System.out.print("Введіть команду (start,pause,stop,exit): ");
//        String command = scanner.nextLine();
//        if (command == "start") {
//            System.out.println("Цей рядок ніколи не виконається через оператор ==, тому що він порівнює посилання двох об'єктів, а вони різні");
//        }
//        if ("start".equalsIgnoreCase(command)) {
//            System.out.println("Система успішно запущена");
//        }
//        switch (command.toLowerCase()) {
//            case "pause" -> System.out.println("Процес тимчасово зупинено");
//            case "stop" -> System.out.println("Процес повністю зупинено");
//            case "exit" -> System.out.println("Вихід із програми");
//            default -> System.out.println("Помилка! Невідома команда");
//        }

        //завдання40
//        double balance = 5000.0;
//        final int CORRECT_PIN = 1004;
//        System.out.println("================ БАНКОМАТ ================");
//        System.out.print("Введіть PIN: ");
//        int pin = scanner.nextInt();
//        scanner.nextLine();
//        if (pin == CORRECT_PIN) {
//            System.out.println("Авторизація успішна!");
//            System.out.println("Оберіть дію (1 - Баланс, 2 - Поповнення, 3 - Зняття, 4 - Вихід): ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 1 -> System.out.println("Ваш поточний баланс: " + balance + " грн.");
//                case 2 -> {
//                    System.out.println("Введіть суму поповнення: ");
//                    double addition = scanner.nextDouble();
//                    scanner.nextLine();
//                    if (addition > 0) {
//                        System.out.println("Рахунок поповнено на " + addition + "грн. Новий баланс: " + (addition + balance) + "грн");
//                    } else {
//                        System.out.println("Сума поповнення має бути більшою за 0");
//                    }
//                }
//                case 3 -> {
//                    System.out.print("Введіть суму зняття: ");
//                    double removal = scanner.nextDouble();
//                    scanner.nextLine();
//                    if (removal > 0 && removal <= balance) {
//                        double commission = (removal > 1000) ? removal * 0.01 : 0.0;
//                        if (removal + commission <= balance) {
//                            balance -= (removal + commission);
//                            System.out.println("Комісія операції: " + commission + "грн");
//                            System.out.println("Видано: " + removal + "грн. Залишок на рахунку: " + balance + "грн.");
//                        } else {
//                            System.out.println("Помилка! Недостатньо коштів на рахунку з урахуванням комісії банкомату");
//                        }
//                    } else {
//                        System.out.println("Помилка! Некоректна сума або недостатньо коштів на рахунку");
//                    }
//                }
//                case 4 -> System.out.println("Дякуємо, що скористалися нашим банкоматом! До побачення.");
//                default -> System.out.println("Помилка! Обрано невідому дію");
//            }
//        } else {
//            System.out.println("Невірний PIN-код! Доступ заблоковано.");
//        }
//        System.out.println("==========================================");
        scanner.close();
    }
}
