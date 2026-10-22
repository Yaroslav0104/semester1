package semester1.practice05;

import java.util.Scanner;
import java.util.Arrays;

public class practice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //завдання1
//        int[] numbers = new int[5];
//        System.out.print("Початковий масив: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//        numbers[0] = 10;
//        numbers[2] = 30;
//        numbers[4] = 50;
//        System.out.println("Масив після присвоєння значень: " + Arrays.toString(numbers));

        //завдання2
//        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
//        System.out.println("Загальна кількість днів: " + days.length);
//        System.out.println("Перший день: " + days[0]);
//        System.out.println("Останній день: " + days[days.length - 1]);
//        days[5] = "Вихідний (Сб)";
//        days[6] = "Вихідний (Нд)";
//        System.out.println("Оновлений список днів: " + Arrays.toString(days));

        //завдання3
//        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};
//        System.out.println("Початковий стан масиву цін: " + Arrays.toString(prices));
//        prices[2] = prices[2] * 0.8;
//        System.out.println("Оновлений масив цін (після знижки): " + Arrays.toString(prices));

        //завдання4
//        System.out.print("Введіть розмір масиву N (N > 0): ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        if (n <= 0) {
//            System.out.println("Помилка: N має бути більше за 0.");
//            scanner.close();
//            return;
//        }
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//        System.out.println("Отриманий масив: " + Arrays.toString(arr));

        //завдання5
//        int[] arr = {4, 8, 15, 16, 23, 42};
//        System.out.print("Елементи масиву у зворотному порядку: ");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i]);
//            if (i > 0) {
//                System.out.print(", ");
//            }
//        }

        //завдання6
//        System.out.print("Введіть розмір масиву N (N > 0): ");
//        int n = scanner.nextInt();
//        if (n <= 0) {
//            System.out.println("Помилка: N має бути більше за 0.");
//            scanner.close();
//            return;
//        }
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//        System.out.println("Отриманий масив: " + Arrays.toString(arr));

        //завдання7
//        int[] original = {3, 7, 1, 9, 4};
//        int[] copy = new int[original.length];
//        for (int i = 0; i < original.length; i++) {
//            copy[i] = original[i];
//        }
//        copy[0] = 999;
//        System.out.println("Оригінальний масив (original): " + Arrays.toString(original));
//        System.out.println("Скопійований масив (copy):    " + Arrays.toString(copy));

        //завдання8
//        int[] grades = {95, 84, 70, 99, 65, 88, 92};
//        int sum = 0;
//        for (int i = 0; i < grades.length; i++) {
//            sum += grades[i];
//        }
//        double average = (double) sum / grades.length;
//        System.out.println("Сума: " + sum + ", Середній бал: " + average);

        //завдання9
//        int[] original = {3, 7, 1, 9, 4};
//        int[] copy = new int[original.length];
//        for (int i = 0; i < original.length; i++) {
//            copy[i] = original[i];
//        }
//        copy[0] = 999;
//        System.out.println("Оригінальний масив (original): " + Arrays.toString(original));
//        System.out.println("Скопійований масив (copy):    " + Arrays.toString(copy));

        //завдання10
//        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int zeroCount = 0;
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] > 0) {
//                positiveCount++;
//            } else if (data[i] < 0) {
//                negativeCount++;
//            } else {
//                zeroCount++;
//            }
//        }
//        System.out.println("Масив даних: " + Arrays.toString(data));
//        System.out.println("Кількість додатних елементів (> 0): " + positiveCount);
//        System.out.println("Кількість від'ємних елементів (< 0): " + negativeCount);
//        System.out.println("Кількість нульових значень (== 0): " + zeroCount);

        //завдання11
//        int[] numbers = new int[10];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int) (Math.random() * 100) + 1;
//        }
//        int evenCount = 0;
//        int oddSum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                evenCount++;
//            } else {
//                oddSum += numbers[i];
//            }
//        }
//        System.out.println("=== СТАТИСТИКА МАСИВУ ===");
//        System.out.println("Згенерований масив: " + Arrays.toString(numbers));
//        System.out.println("Кількість парних чисел: " + evenCount);
//        System.out.println("Сума всіх непарних чисел: " + oddSum);

        //завдання12
//        int[] students = {1042, 2031, 3055, 4018, 5099};
//        System.out.print("Введіть номер залікової книжки для пошуку: ");
//        int target = scanner.nextInt();
//        scanner.nextLine();
//        int foundIndex = -1;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] == target) {
//                foundIndex = i;
//                break;
//            }
//        }
//        if (foundIndex != -1) {
//            System.out.println("Студента знайдено! Його позиція (індекс) у масиві: " + foundIndex);
//        } else {
//            System.out.println("Студента з таким номером не знайдено");
//        }

        //завдання13
//        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};
//        System.out.println("Результати кидків кубика: " + Arrays.toString(rolls));
//        System.out.print("Введіть число від 1 до 6 для пошуку: ");
//        int target = scanner.nextInt();
//        scanner.nextLine();
//        int count = 0;
//        for (int i = 0; i < rolls.length; i++) {
//            if (rolls[i] == target) {
//                count++;
//            }
//        }
//        System.out.println("Число " + target + " випало серед результатів " + count + " раз(и).");

        //завдання14
//        int[] salaries = {18000, 25000, 32000, 15000, 41000, 29000};
//        System.out.println("Список зарплат: " + Arrays.toString(salaries));
//        int sum = 0;
//        for (int i = 0; i < salaries.length; i++) {
//            sum += salaries[i];
//        }
//        double averageSalary = (double) sum / salaries.length;
//        System.out.println("Середня зарплата у відділі: " + averageSalary);
//        System.out.print("Зарплати, що перевищують середню: ");
//        boolean found = false;
//        for (int i = 0; i < salaries.length; i++) {
//            if (salaries[i] > averageSalary) {
//                System.out.print(salaries[i] + " ");
//                found = true;
//            }
//        }

        //завдання15
//        double[] prices = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
//        System.out.println("Котирування акцій: " + Arrays.toString(prices));
//        double min = prices[0];
//        double max = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] < min) {
//                min = prices[i];
//            }
//            if (prices[i] > max) {
//                max = prices[i];
//            }
//        }
//        double difference = max - min;
//        System.out.println("Мінімальна ціна: " + min);
//        System.out.println("Максимальна ціна: " + max);
//        System.out.println("Різниця (розмах коливань): " + String.format("%.2f", difference));
//    }

        //завдання16
//        String[] cities = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};
//        for (String city : cities) {
//            System.out.println("Ласкаво просимо до міста " + city + "!");
//        }

        //завдання17
//        double[] salaries = {20000.0, 25000.0, 18000.0, 30000.0};
//        for (int i = 0; i < salaries.length; i++) {
//            salaries[i] *= 1.10;
//        }
//        System.out.println("Оновлені зарплати (після підвищення на 10%): " + Arrays.toString(salaries));

        //завдання18
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        System.out.println("Оригінальний масив: " + Arrays.toString(arr));
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        System.out.println("Перевернутий масив: " + Arrays.toString(arr));

        //завдання19
//        int[] base = {2, 4, 6, 8, 10};
//        int[] squares = new int[base.length];
//        for (int i = 0; i < base.length; i++) {
//            squares[i] = base[i] * base[i];
//        }
//        System.out.println("Базовий масив (base):    " + Arrays.toString(base));
//        System.out.println("Масив квадратів (squares): " + Arrays.toString(squares));

        //завдання20
//        int[] arr = {1, 3, 5, 7, 9};
//        boolean isSorted = true;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                isSorted = false;
//                break;
//            }
//        }
//        System.out.println("Масив: " + Arrays.toString(arr));
//        if (isSorted) {
//            System.out.println("Результат: Масив УПОРЯДКОВАНИЙ за зростанням.");
//        } else {
//            System.out.println("Результат: Масив НЕ УПОРЯДКОВАНИЙ за зростанням.");
//        }

        //завдання21
//        int[] a = {1, 2, 3};
//        int[] b = {4, 5, 6, 7};
//        int[] c = new int[a.length + b.length];
//        for (int i = 0; i < a.length; i++) {
//            c[i] = a[i];
//        }
//        for (int j = 0; j < b.length; j++) {
//            c[a.length + j] = b[j];
//        }
//        System.out.println("Масив a: " + Arrays.toString(a));
//        System.out.println("Масив b: " + Arrays.toString(b));
//        System.out.println("Об'єднаний масив c: " + Arrays.toString(c));

        //завдання22
//        int[] test = {45, 12, 89, 3, 27};
//        System.out.println("Початковий стан масиву: " + Arrays.toString(test));
//        Arrays.sort(test);
//        System.out.println("Масив після сортування: " + Arrays.toString(test));
//        Arrays.fill(test, -1);
//        System.out.println("Фінальний результат (після fill): " + Arrays.toString(test));

        //завдання23
//        int[][] table = {
//                {5, 12, 3},
//                {8,  9, 14},
//                {1, 22,  7}
//        };
//        System.out.println("=== КВАДРАТНА МАТРИЦЯ 3x3 ===");
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[i].length; j++) {
//                System.out.print(table[i][j] + "\t");
//            }

        //завдання24
//        int[][] matrix = {
//                {10, 20, 30, 40},
//                {50, 60, 70, 80}
//        };
//        System.out.println("Кількість рядків матриці: " + matrix.length);
//        System.out.println("Кількість стовпчиків у першому рядку: " + matrix[0].length);
//        int topLeft = matrix[0][0];
//        int topRight = matrix[0][matrix[0].length - 1];
//        int bottomLeft = matrix[matrix.length - 1][0];
//        int bottomRight = matrix[matrix.length - 1][matrix[0].length - 1];
//        System.out.println("--- Значення кутових елементів ---");
//        System.out.println("Лівий верхній:  " + topLeft);
//        System.out.println("Правий верхній: " + topRight);
//        System.out.println("Лівий нижній:   " + bottomLeft);
//        System.out.println("Правий нижній:  " + bottomRight);

        //завдання25
//        int[][] grid = new int[3][4];
//        int counter = 1;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                grid[i][j] = counter;
//                counter++;
//            }
//        }
//        System.out.println("=== ПОСЛІДОВНО ЗАПОВНЕНА СІТКА 3x4 ===");
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                System.out.print(grid[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //завдання26
//        int[][] randomGrid = new int[4][3];
//        for (int i = 0; i < randomGrid.length; i++) {
//            for (int j = 0; j < randomGrid[i].length; j++) {
//                randomGrid[i][j] = (int) (Math.random() * 90) + 10;
//            }
//        }
//        System.out.println("=== 1. Виведення через Arrays.deepToString() ===");
//        System.out.println(Arrays.deepToString(randomGrid));
//        System.out.println();
//        System.out.println("=== 2. Виведення у вигляді таблиці ===");
//        for (int i = 0; i < randomGrid.length; i++) {
//            for (int j = 0; j < randomGrid[i].length; j++) {
//                System.out.print(randomGrid[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //завдання27
//        int[][] randomGrid = new int[4][3];
//        for (int i = 0; i < randomGrid.length; i++) {
//            for (int j = 0; j < randomGrid[i].length; j++) {
//                randomGrid[i][j] = (int) (Math.random() * 90) + 10;
//            }
//        }
//        System.out.println("=== 1. Виведення через Arrays.deepToString() ===");
//        System.out.println(Arrays.deepToString(randomGrid));
//        System.out.println();
//        System.out.println("=== 2. Виведення у вигляді таблиці ===");
//        for (int i = 0; i < randomGrid.length; i++) {
//            for (int j = 0; j < randomGrid[i].length; j++) {
//                System.out.print(randomGrid[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //завдання28
//        int size = 5;
//        int[][] matrix = new int[size][size];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {
//                    matrix[i][j] = 1;
//                } else {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//        System.out.println("=== ОДИНИЧНА КВАДРАТНА МАТРИЦЯ 5x5 ===");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //завдання29
//        int size = 4;
//        int[][] matrix = new int[size][size];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = 1;
//            }
//        }
//        for (int j = 0; j < matrix[1].length; j++) {
//            matrix[1][j] = 0;
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i][2] = 7;
//        }
//        System.out.println("=== МОДИФІКОВАНА МАТРИЦЯ 4x4 ===");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //завдання30
//        int[][] matrix = {
//                {5, 12, 3},
//                {8, 9, 14},
//                {1, 22, 7}
//        };
//        System.out.println("=== МАТРИЦЯ ===");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        int sum = 0;
//        int totalElements = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//                totalElements++;
//            }
//        }
//        double average = (double) sum / totalElements;
//        System.out.println("--- СТАТИСТИКА МАТРИЦІ ---");
//        System.out.println("Загальна сума всіх чисел: " + sum);
//        System.out.println("Загальна кількість елементів (rows * cols): " + totalElements);
//        System.out.println("Середнє арифметичне значення: " + average);

        //завдання31
//        int[][] matrix = {
//                {3, 5, 2, 1},
//                {10, -2, 4, 6},
//                {0, 7, 8, 3}
//        };
//        int[] rowSums = new int[3];
//        for (int i = 0; i < matrix.length; i++) {
//            int rowSum = 0;
//            for (int j = 0; j < matrix[i].length; j++) {
//                rowSum += matrix[i][j];
//            }
//            rowSums[i] = rowSum;
//        }
//        System.out.println("=== СУМИ ЕЛЕМЕНТІВ ПО РЯДКАХ ===");
//        for (int i = 0; i < rowSums.length; i++) {
//            System.out.println("Рядок " + i + ": сума = " + rowSums[i]);
//        }

        //завдання32
//        int[][] matrix = {
//                {4, 1, 8},
//                {2, 9, 3},
//                {7, 5, 6}
//        };
//        System.out.println("=== МАТРИЦЯ 3x3 ===");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("-----------------------------------");
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        int[] colSums = new int[cols];
//        for (int col = 0; col < cols; col++) {
//            int currentColumnSum = 0;
//            for (int row = 0; row < rows; row++) {
//                currentColumnSum += matrix[row][col];
//            }
//            colSums[col] = currentColumnSum;
//        }
//        System.out.print("Суми:\t");
//        for (int col = 0; col < cols; col++) {
//            System.out.print(colSums[col] + "\t");
//        }
//        System.out.println();

        //завдання33
//        int[][] matrix = {
//                {-5,  12, -3,   8},
//                {15,  -2, 45,  -6},
//                { 0,  22, -14, 19}
//        };
//        System.out.println("=== МАТРИЦЯ 3x4 ===");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("-----------------------------------");
//        int max = matrix[0][0];
//        int maxRow = 0;
//        int maxCol = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] > max) {
//                    max = matrix[i][j];
//                    maxRow = i;
//                    maxCol = j;
//                }
//            }
//        }
//        System.out.println("Максимум: " + max + " у комірці [" + maxRow + ", " + maxCol + "]");

        //завдання34
//        int[][] matrix = {
//                {5,  2,  3,  1},
//                {8,  6,  4,  9},
//                {1,  7,  2,  5},
//                {3,  4,  6,  8}
//        };
//        System.out.println("=== КВАДРАТНА МАТРИЦЯ 4x4 ===");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("-----------------------------------");
//        int mainDiagonalSum = 0;
//        int secondaryDiagonalSum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {
//                    mainDiagonalSum += matrix[i][j];
//                }
//                if (i + j == matrix.length - 1) {
//                    secondaryDiagonalSum += matrix[i][j];
//                }
//            }
//        }
//        System.out.println("Сума головної діагоналі: " + mainDiagonalSum);
//        System.out.println("Сума побічної діагоналі: " + secondaryDiagonalSum);
//        if (mainDiagonalSum > secondaryDiagonalSum) {
//            System.out.println("Результат порівняння: Сума головної діагоналі БІЛЬША за суму побічної.");
//        } else if (mainDiagonalSum < secondaryDiagonalSum) {
//            System.out.println("Результат порівняння: Сума побічної діагоналі БІЛЬША за суму головної.");
//        } else {
//            System.out.println("Результат порівняння: Суми обох діагоналей РІВНІ між собою.");
//        }

        //завдання35
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int size = matrix.length;
//        int[][] transposed = new int[size][size];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                transposed[j][i] = matrix[i][j];
//            }
//        }
//        System.out.println("=== ПОЧАТКОВА МАТРИЦЯ ===");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println("=== ТРАНСПОНОВАНА МАТРИЦЯ ===");
//        for (int i = 0; i < transposed.length; i++) {
//            for (int j = 0; j < transposed[i].length; j++) {
//                System.out.print(transposed[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //завдання36
//        int[][] ladder = new int[4][];
//        ladder[0] = new int[1];
//        ladder[1] = new int[2];
//        ladder[2] = new int[3];
//        ladder[3] = new int[4];
//        for (int i = 0; i < ladder.length; i++) {
//            for (int j = 0; j < ladder[i].length; j++) {
//                ladder[i][j] = i;
//            }
//        }
//        System.out.println("=== ЗУБЧАСТИЙ МАСИВ У ФОРМІ СХОДИНОК ===");
//        for (int i = 0; i < ladder.length; i++) {
//            for (int j = 0; j < ladder[i].length; j++) {
//                System.out.print(ladder[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //завдання37
//        String[][] weekSchedule = new String[5][];
//        weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Фізика"};
//        weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
//        weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
//        weekSchedule[3] = new String[]{"Дискретна математика"};
//        weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};
//        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"};
//        System.out.println("=== РОЗКЛАД ЗАНЯТЬ НА ТИЖДЕНЬ ===");
//        System.out.println("-----------------------------------");
//        for (int i = 0; i < weekSchedule.length; i++) {
//            System.out.println(days[i] + " (Кількість пар: " + weekSchedule[i].length + "):");
//            for (int j = 0; j < weekSchedule[i].length; j++) {
//                System.out.println("   " + (j + 1) + ". " + weekSchedule[i][j]);
//            }
//            System.out.println();
//        }

        //завдання38
//        int[][] pascal = new int[5][];
//        for (int i = 0; i < pascal.length; i++) {
//            pascal[i] = new int[i + 1];
//        }
//        for (int i = 0; i < pascal.length; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || j == i) {
//                    pascal[i][j] = 1;
//                } else {
//                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
//                }
//            }
//        }
//        System.out.println("=== ПЕРШІ 5 РЯДКІВ ТРИКУТНИКА ПАСКАЛЯ ===");
//        for (int i = 0; i < pascal.length; i++) {
//            for (int j = 0; j < pascal[i].length; j++) {
//                System.out.print(pascal[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //завдання39
//        int[][][] cube = new int[3][3][3];
//        for (int x = 0; x < cube.length; x++) {
//            for (int y = 0; y < cube[x].length; y++) {
//                for (int z = 0; z < cube[x][y].length; z++) {
//                    cube[x][y][z] = x + y + z;
//                }
//            }
//        }
//        for (int x = 0; x < cube.length; x++) {
//            System.out.println("--- Шар " + x + " ---");
//            for (int y = 0; y < cube[x].length; y++) {
//                for (int z = 0; z < cube[x][y].length; z++) {
//                    System.out.print(cube[x][y][z] + "\t");
//                }
//                System.out.println();
//            }
//        }

        //завдання40
//        double[][][] weather = new double[3][7][2];
//        String[] cities = {"Київ", "Львів", "Одеса"};
//        double[][] baseTemps = {
//                {20.0, 12.0},
//                {18.0, 10.0},
//                {23.0, 15.0}
//        };
//        for (int i = 0; i < weather.length; i++) {
//            for (int j = 0; j < weather[i].length; j++) {
//                weather[i][j][0] = baseTemps[i][0] + (j % 3) - 1;
//                weather[i][j][1] = baseTemps[i][1] + (j % 2) - 0.5;
//            }
//        }
//        System.out.println("=== СЕРЕДНЯ ДЕННА ТЕМПЕРАТУРА ПО МІСТАХ ЗА ТИЖДЕНЬ ===");
//        for (int i = 0; i < weather.length; i++) {
//            double sumDay = 0;
//            for (int j = 0; j < weather[i].length; j++) {
//                sumDay += weather[i][j][0];
//            }
//            double avgDay = sumDay / weather[i].length;
//            System.out.println(cities[i] + ": " + avgDay + " °C");
//        }
//        System.out.println();
//        double minNight = weather[0][0][1];
//        String coldestCity = cities[0];
//        int coldestDay = 1;
//        for (int i = 0; i < weather.length; i++) {
//            for (int j = 0; j < weather[i].length; j++) {
//                double nightTemp = weather[i][j][1];
//                if (nightTemp < minNight) {
//                    minNight = nightTemp;
//                    coldestCity = cities[i];
//                    coldestDay = j + 1;
//                }
//            }
//        }
//        System.out.println("=== НАЙХОЛОДНІША НІЧ ЗА ВЕСЬ ТИЖДЕНЬ ===");
//        System.out.println("Місто: " + coldestCity);
//        System.out.println("День тижня: " + coldestDay);
//        System.out.println("Температура: " + minNight + " °C");
        scanner.close();
    }
}



