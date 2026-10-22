package semester1.practice04;

import java.util.Scanner;

public class practice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //завдання1
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Java - надійна та кросплатформна мова!");
//        }

        //завдання2
//        System.out.print("Введіть рядок тексту: ");
//        String text = scanner.nextLine();
//        System.out.print("Введіть число N (N >= 1): ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Результат:");
//        for (int i = 1; i <= n; i++) {
//            System.out.print("[" + i + "] " + text);
//            if (i < n) {
//                System.out.print(", ");
//            }
//        }

        //завдання3
//        int balance = 0;
//        for (int month = 1; month <= 12; month++) {
//            balance += 500;
//            System.out.println("Місяць " + month + ": " + balance + " грн");
//        }

        //завдання4
//        System.out.print("Введіть поточний курс євро до гривні (наприклад, 44.5): ");
//        double rate = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Таблиця вартості євро в гривнях (Курс: " + rate + ")");
//        double currentUah = 0.0;
//        double step = rate * 10;
//        for (int euro = 10; euro <= 100; euro += 10) {
//            currentUah += step;
//            System.out.println(euro + " євро = " + currentUah + " грн");
//        }

        //завдання5
//        System.out.println("Введіть довжину рамки: ");
//        int width = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < width; i++) {
//            System.out.println("=");
//        }
//        System.out.println();

        //завдання6
//        int count = 10;
//        while(count >= 1){
//            System.out.println(count);
//            count--;
//        }
//        System.out.println("Поїхали! Ракета запущена!");

        //завдання7
//        int sum = 0;
//        System.out.print("Введіть число: ");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        while (number != 0) {
//            sum += number;
//            System.out.print("Введіть наступне число: ");
//            number = scanner.nextInt();
//        }
//        System.out.println("Загальна сума всіх введених чисел: " + sum);

        //завдання8
//        System.out.print("Введіть число M: ");
//        int m = scanner.nextInt();
//        scanner.nextLine();
//        int power = 1;
//        System.out.print("Степені двійки (<= " + m + "): ");
//        while (power <= m) {
//            System.out.print(power + " ");
//            power *= 2;
//        }

        //завдання9
//        System.out.print("Введіть ціле додатне число N : ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        int originalN = n;
//        int digitCount = 0;
//        int digitSum = 0;
//        while (n > 0) {
//            int digit = n % 10;
//            digitSum += digit;
//            digitCount++;
//            n /= 10;
//        }
//        System.out.println("--- Результати для числа " + originalN + " ---");
//        System.out.println("Кількість цифр: " + digitCount);
//        System.out.println("Сума цифр: " + digitSum);

        //завдання10
//        System.out.print("Введіть ціле додатне число: ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        int originalN = n;
//        int reversedNum = 0;
//        while (n > 0) {
//            int digit = n % 10;
//            reversedNum = reversedNum * 10 + digit;
//            n /= 10;
//        }
//        System.out.println("--- Результат ---");
//        System.out.println("Оригінальне число: " + originalN);
//        System.out.println("Число у зворотному порядку: " + reversedNum);

        //завдання11
//        System.out.print("Введіть початкову суму вкладу S (грн): ");
//        double initialSum = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Введіть річну відсоткову ставку P (%): ");
//        double rate = scanner.nextDouble();
//        scanner.nextLine();
//        double currentAmount = initialSum;
//        int years = 0;
//        while (currentAmount < initialSum * 2) {
//            currentAmount += currentAmount * (rate / 100.0);
//            years++;
//        }
//        System.out.println("--- Результат розрахунку ---");
//        System.out.println("Початкова сума: " + initialSum + " грн");
//        System.out.println("Річна ставка: " + rate + "%");
//        System.out.println("Кінцева сума: " + currentAmount + " грн");
//        System.out.println("Кількість років до подвоєння: " + years);

        //завдання12
//        System.out.print("Введіть ціле число N (N > 1): ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        int divisor = 2;
//        while (n % divisor != 0) {
//            divisor++;
//        }
//        System.out.println("Найменший дільник числа " + n + " (окрім 1): " + divisor);

        //завдання13
//        int secretNum = (int) (Math.random() * 100) + 1;
//        int guess = 0;
//        int attempts = 0;
//        System.out.println("=== ГРА: ВГАДАЙ ЧИСЛО ===");
//        while (guess != secretNum) {
//            System.out.print("Введіть вашу здогадку: ");
//            guess = scanner.nextInt();
//            scanner.nextLine();
//            attempts++;
//            if (guess < secretNum) {
//                System.out.println("Більше!");
//            } else if (guess > secretNum) {
//                System.out.println("Менше!");
//            } else {
//                System.out.println("Вітаю! Ви вгадали таємне число!");
//            }
//        }
//        System.out.println("Кількість витрачених спроб: " + attempts);

        //завдання14
//        int choice;
//        do {
//            System.out.println("=== ІГРОВЕ МЕНЮ ===");
//            System.out.println("1. Розпочати нову гру");
//            System.out.println("2. Завантажити збереження");
//            System.out.println("3. Налаштування");
//            System.out.println("0. Вихід");
//            System.out.print("Оберіть пункт меню: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice) {
//                case 1 -> System.out.println("-> Запуск нової гри... Поїхали!");
//                case 2 -> System.out.println("-> Завантаження збереження з хмари...");
//                case 3 -> System.out.println("-> Відкриття панелі налаштувань...");
//                case 0 -> System.out.println("-> Вихід із програми. До побачення!");
//                default -> System.out.println("-> Помилка: Невірний вибір. Спробуйте ще раз (від 0 до 3).");
//            }
//        } while (choice != 0);

        //завдання15
//        int age;
//        do {
//            System.out.print("Введіть ваш вік: ");
//            age = scanner.nextInt();
//            scanner.nextLine();
//            if (age < 1 || age > 120) {
//                System.out.println("Помилка: Вік має бути від 1 до 120 років. Спробуйте ще раз.");
//            }
//        } while (age < 1 || age > 120);
//        System.out.println("Вік підтверджено: " + age);

        //завдання16
//        final int CORRECT_PIN = 1736;
//        int attempts = 3;
//        boolean isSuccess = false;
//        do {
//            System.out.print("Введіть PIN-код (залишилось спроб: " + attempts + "): ");
//            int enteredPin = scanner.nextInt();
//            scanner.nextLine();
//            attempts--;
//            if (enteredPin == CORRECT_PIN) {
//                isSuccess = true;
//                break;
//            } else {
//                if (attempts > 0) {
//                    System.out.println("Невірний PIN! Спробуйте ще раз.");
//                }
//            }
//        } while (attempts > 0 && !isSuccess);
//        if (isSuccess) {
//            System.out.println("Доступ надано");
//        } else {
//            System.out.println("Карту заблоковано!");
//        }

        //завдання17
//        char choice;
//        do {
//            System.out.println("--- Калькулятор ---");
//            System.out.print("Введіть перше число: ");
//            double num1 = scanner.nextDouble();
//            scanner.nextLine();
//            System.out.print("Введіть друге число: ");
//            double num2 = scanner.nextDouble();
//            scanner.nextLine();
//            double result = num1 + num2;
//            System.out.println("Результат: " + num1 + " + " + num2 + " = " + result);
//            System.out.print("Бажаєте продовжити? (y/n): ");
//            choice = scanner.next().toLowerCase().charAt(0);
//        } while (choice == 'y');
//        System.out.println("Програму завершено. До побачення!");

        //завдання18
//        int die1;
//        int die2;
//        int attempts = 0;
//        System.out.println("=== КИДАЄМО КУБИКИ ДО ДУБЛЯ ===");
//        do {
//            attempts++;
//            die1 = (int) (Math.random() * 6) + 1;
//            die2 = (int) (Math.random() * 6) + 1;
//            System.out.println("Кидок " + attempts + ": [" + die1 + "] та [" + die2 + "]");
//        } while (die1 != die2);
//        System.out.println("Успіх! Випав дубль [" + die1 + " і " + die2 + "].");
//        System.out.println("Загальна кількість спроб: " + attempts);

        //завдання19
//        System.out.print("Введіть чисельник: ");
//        double numerator = scanner.nextDouble();
//        scanner.nextLine();
//        double denominator;
//        do {
//            System.out.print("Введіть знаменник (не може бути 0): ");
//            denominator = scanner.nextDouble();
//            if (denominator == 0) {
//                System.out.println("Помилка: Знаменник не може дорівнювати нулю! Спробуйте ще раз.");
//            }
//        } while (denominator == 0);
//        double result = numerator / denominator;
//        System.out.println("--- Результат ---");
//        System.out.println(numerator + " / " + denominator + " = " + result);

        //завдання20
//        int sum = 0;
//        int count = 0;
//        int score;
//        System.out.println("=== КАЛЬКУЛЯТОР СЕРЕДНЬОГО БАЛУ ===");
//        System.out.println("Вводьте бали за тести (від 0 до 100).");
//        System.out.println("Для завершення введення введіть будь-яке від'ємне число");
//        while (true) {
//            do {
//                System.out.print("Введіть бал: ");
//                score = scanner.nextInt();
//                if (score > 100) {
//                    System.out.println("Помилка: Бал не може перевищувати 100! Спробуйте ще раз.");
//                }
//            } while (score > 100);
//            if (score < 0) {
//                break;
//            }
//            sum += score;
//            count++;
//        }
//        System.out.println("--- РЕЗУЛЬТАТИ ---");
//        if (count > 0) {
//            double average = (double) sum / count;
//            System.out.println("Введено тестувань: " + count);
//            System.out.println("Загальна сума балів: " + sum);
//            System.out.println("Середній бал: " + average);
//        } else {
//            System.out.println("Не було введено жодного валідного бала.");
//        }

        //завдання21
//        System.out.print("Введіть число A: ");
//        int a = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Введіть число B (A <= B): ");
//        int b = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Парні числа від " + a + " до " + b + ": ");
//        for (int i = a; i <= b; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();

        //завдання22
//        System.out.print("Введіть ціле число N (0 <= N <= 20): ");
//        int n = scanner.nextInt();
//        long factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//        System.out.println(n + "! = " + factorial);

        //завдання23
//        System.out.println("Число\t|\tКвадрат\t|\tКуб");
//        System.out.println("-------------------------------------");
//        for (int i = 1; i <= 10; i++) {
//            int square = i * i;
//            int cube = i * i * i;
//            System.out.println(i + "\t|\t" + square + "\t|\t" + cube);
//        }

        //завдання24
//        System.out.println("Числа від 1 до 50, які не діляться ні на 3, ні на 5:");
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }
//        System.out.println();

        //завдання25
//        int foundNumber = -1;
//        for (int i = 100; i <= 200; i++) {
//            if (i % 13 == 0 && i % 7 == 0) {
//                foundNumber = i;
//                break;
//            }
//        }
//        System.out.println("Знайдене перше число: " + foundNumber);

        //завдання26
//        System.out.println("=== Латинський алфавіт та їх ASCII-коди ===");
//        for (char c = 'A'; c <= 'Z'; c++) {
//            int asciiCode = c;
//            System.out.println("Літера: " + c + " | ASCII-код: " + asciiCode);
//        }

        //завдання27
//        System.out.print("Введіть кількість елементів N (N >= 1): ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                sum += i;
//            } else {
//                sum -= i;
//            }
//        }
//        System.out.println("Сума перших " + n + " елементів ряду дорівнює: " + sum);

        //завдання28
//        System.out.print("Введіть перший член прогресії (a1): ");
//        double a1 = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Введіть різницю прогресії (d): ");
//        double d = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Введіть кількість членів (n, n >= 1): ");
//        int n = scanner.nextInt();
//        double sum = 0.0;
//        double currentTerm = a1;
//        System.out.print("Перші " + n + " членів прогресії: ");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(currentTerm + " ");
//            sum += currentTerm;
//            currentTerm += d;
//        }
//        System.out.println();
//        System.out.println("Сума перших " + n + " членів прогресії дорівнює: " + sum);

        //завдання29
//        byte b = 125;
//        System.out.println("Початкове значення: " + b);
//        System.out.println("Запуск циклу на 6 ітерацій:\n");
//        for (int i = 1; i <= 6; i++) {
//            b = (byte) (b + 1);
//            System.out.println("Ітерація " + i + ": b = " + b);
//        }

        //завдання30
//        System.out.print("Введіть кількість чисел N (N > 0): ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        if (n <= 0) {
//            System.out.println("Помилка: N має бути більше за 0.");
//            return;
//        }
//        int sum = 0;
//        System.out.println("Введіть " + n + " цілих чисел:");
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Число " + i + ": ");
//            int number = scanner.nextInt();
//            scanner.nextLine();
//            sum += number;
//        }
//        double exactAverage = (double) sum / n;
//        double truncatedAverage = sum / n;
//        System.out.println("--- РЕЗУЛЬТАТИ ПОРІВНЯННЯ ---");
//        System.out.println("Загальна сума (int sum): " + sum);
//        System.out.println("Кількість чисел (N): " + n);
//        System.out.println("З приведенням ((double) sum / n): " + exactAverage);
//        System.out.println("Без приведення (sum / n): " + truncatedAverage);

        //завдання31
//        System.out.print("Введіть рядок (наприклад, 5 символів): ");
//        String text = scanner.nextLine();
//        String encryptedText = "";
//        for (int i = 0; i < text.length(); i++) {
//            char ch = text.charAt(i);
//            char encryptedChar = (char) (ch + 1);
//            encryptedText += encryptedChar;
//        }
//        System.out.println("--- РЕЗУЛЬТАТ ШИФРУВАННЯ ---");
//        System.out.println("Оригінальний рядок: " + text);
//        System.out.println("Зашифрований рядок:  " + encryptedText);

        //завдання32
//        int totalHryvnias = 0;
//        double totalDiscardedCents = 0.0;
//        System.out.println("Введіть 5 цінників (наприклад, 19.99):");
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("Цінник " + i + ": ");
//            double price = scanner.nextDouble();
//            scanner.nextLine();
//            int hryvnias = (int) price;
//            double cents = price - hryvnias;
//            totalHryvnias += hryvnias;
//            totalDiscardedCents += cents;
//        }
//        System.out.println("--- РЕЗУЛЬТАТИ ---");
//        System.out.println("Загальна сума цілих гривень: " + totalHryvnias);
//        System.out.println("Сума відкинутих копійок: " + totalDiscardedCents);

        //завдання33
//        System.out.println("=== ЕМУЛЯЦІЯ СКАЧУВАННЯ ФАЙЛУ (50 МБ) ===");
//        for (int i = 1; i <= 50; i++) {
//            int percent = (int) (((double) i / 50) * 100);
//            System.out.println("Завантажено: " + percent + "%");
//        }
//        System.out.println("Завантаження успішно завершено!");

        //завдання34
//        long bigNumber = 3_000_000_000L;
//        int smallNumber = (int) bigNumber;
//        System.out.println("=== ПРИВЕДЕННЯ LONG ДО INT ===");
//        System.out.println("Оригінальне число (long): " + bigNumber);
//        System.out.println("Результат після приведення (int): " + smallNumber);

        //завдання35
//        System.out.println("=== 1. Проблемний цикл з double ===");
//        for (double d = 0.0; d <= 1.0; d += 0.1) {
//            System.out.println("d = " + d);
//        }
//        System.out.println("=== 2. Правильний цикл з int-лічильником ===");
//        for (int i = 0; i <= 10; i++) {
//            double val = i / 10.0;
//            System.out.println("val = " + val);
//        }

        //завдання36
//        System.out.println("=== ТАБЛИЦЯ МНОЖЕННЯ 10x10 ===");
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                int product = i * j;
//                System.out.print(product + "\t");
//            }
//            System.out.println();
//        }

        //завдання37
//        System.out.print("Введіть висоту рамки H: ");
//        int h = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Введіть ширину рамки W: ");
//        int w = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Результат:");
//        for (int i = 1; i <= h; i++) {
//            for (int j = 1; j <= w; j++) {
//                if (i == 1 || i == h || j == 1 || j == w) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //завдання38
//        System.out.print("Введіть висоту трикутника N: ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Результат:");
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //завдання39
//        System.out.print("Введіть число N (N >= 2): ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Прості числа від 2 до " + n + ": ");
//        for (int i = 2; i <= n; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();

        //завдання40
//        System.out.print("Введіть розмір дошки N: ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Шахова дошка " + n + "x" + n + ":");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((i + j) % 2 == 0) {
//                    System.out.print("# ");
//                } else {
//                    System.out.print("_ ");
//                }
//            }
//            System.out.println();
//        }
        scanner.close();

    }
}
