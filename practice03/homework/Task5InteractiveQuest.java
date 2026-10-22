package semester1.practice03.homework;

import java.util.Scanner;

public class Task5InteractiveQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("/************************************************************\\");
        System.out.println("|               ПРИГОДА: ВТЕЧА З ТЕМНИЦІ ЧАКЛУНА             |");
        System.out.println("\\************************************************************/");
        System.out.print("Введіть ім'я вашого героя: ");
        String heroName = scanner.nextLine();
        System.out.println();
        System.out.println("Оберіть клас героя:");
        System.out.println("1 — Воїн (HP: 120, Сила: 15, Мана: 10, Спритність: 8)");
        System.out.println("2 — Маг (HP: 75, Сила: 6, Мана: 50, Спритність: 10)");
        System.out.println("3 — Розбійник (HP: 90, Сила: 10, Мана: 15, Спритність: 18)");
        System.out.println("default — Волоцюга (HP: 60, Сила: 8, Мана: 5, Спритність: 8)");
        System.out.print("Ваш вибір (ведіть число 1-3): ");
        int classChoice = scanner.nextInt();
        scanner.nextLine();
        int playerHp = switch (classChoice) {
            case 1 -> 120;
            case 2 -> 75;
            case 3 -> 90;
            default -> 60;
        };
        int strength = switch (classChoice) {
            case 1 -> 15;
            case 2 -> 6;
            case 3 -> 10;
            default -> 8;
        };
        int mana = switch (classChoice) {
            case 1 -> 10;
            case 2 -> 50;
            case 3 -> 15;
            default -> 5;
        };
        int agility = switch (classChoice) {
            case 1 -> 8;
            case 2 -> 10;
            case 3 -> 18;
            default -> 8;
        };
        String className = switch (classChoice) {
            case 1 -> "Воїн";
            case 2 -> "Маг";
            case 3 -> "Розбійник";
            default -> "Волоцюга";
        };
        boolean hasSpellBook = (classChoice == 2);
        System.out.println();
        System.out.println("[Створено персонажа]: " + className + " " + heroName + " (HP: " + playerHp + ", Сила: " + strength + ", MP: " + mana + ", AGI: " + agility + ")");
        System.out.println("/************************************************************\\");
        System.out.println("|               ЕТАП 1: РОЗДОРІЖЖЯ 3 ДВЕРЕЙ                   |");
        System.out.println("\\************************************************************/");
        System.out.println("Ви прокидаєтеся в сирій камері. Перед вами 3 проходи.");
        System.out.print("Куди ви прямуєте? (північ / схід / захід): ");
        String direction = scanner.nextLine();
        boolean roomPassed = false;
        System.out.println("/************************************************************\\");
        System.out.println("|               ЕТАП 2: ВИПРОБУВАННЯ КІМНАТИ                  |");
        System.out.println("\\************************************************************/");
        if (direction.equalsIgnoreCase("північ")) {
            System.out.println();
            System.out.println("--- КІМНАТА СТАРОДАВНЬОЇ ЗАГАДКИ ---");
            System.out.println("Магічний кристал світиться синім і запитує: «Скільки буде 67 + 69 * 2?»");
            System.out.print("Ваша відповідь (число): ");
            int answer = scanner.nextInt();
            scanner.nextLine();
            boolean isCorrect = (answer == 205);
            playerHp = isCorrect ? (playerHp + 20) : (playerHp - 30);
            if (isCorrect) {
                System.out.println("Кристал спалахнув яскравим світлом! Відповідь вірна. Отримано бонус: +20 HP.");
            } else {
                System.out.println("Помилка! Кристал вдарив вас темною енергією. Втрачено 30 HP.");
            }
            roomPassed = true;
        } else if (direction.equalsIgnoreCase("схід")) {
            System.out.println();
            System.out.println("--- АРСЕНАЛ ВАРТОВОГО ---");
            System.out.println("Ви зайшли до арсеналу вартового. Тут стоїть кована скриня зі складним замком!");
            System.out.println("Спроба відкрити скриню...");
            boolean canOpen = (agility >= 16 || (mana >= 25 && hasSpellBook));
            if (canOpen) {
                System.out.println("Успіх! Скриня відчинилася без ключа завдяки вашій навичці!");
                strength += 5;
                playerHp += 15;
                System.out.println("Знайдено Амулет Світла та меч! Сила збільшена на 5, HP +15.");
            } else {
                System.out.println("Невдача! Спрацювала прихована пастка зі стрілами!");
                playerHp -= 25;
                System.out.println("Ви поранені. Втрачено 25 HP.");
            }
            roomPassed = true;
        } else if (direction.equalsIgnoreCase("захід")) {
            System.out.println();
            System.out.println("--- ПЕЧЕРА КАМ'ЯНОГО ГОЛЕМА ---");
            System.out.println("Шлях перегородив охоронець — величезний голем!");
            System.out.println("Оберіть тактику бою:");
            System.out.println("1 — Лобова атака (потребує Силу >= 12)");
            System.out.println("2 — Магічний бар'єр (потребує Ману >= 20)");
            System.out.println("3 — Спроба прослизнути повз (потребує Спритність >= 14)");
            System.out.print("Ваш вибір (1-3): ");
            int tactic = scanner.nextInt();
            scanner.nextLine();
            switch (tactic) {
                case 1 -> {
                    if (strength >= 12) {
                        System.out.println("Ви потужним ударом розтрощили захист голема!");
                        roomPassed = true;
                    } else {
                        System.out.println("Вашої сили замало! Голем відкинув вас. -35 HP.");
                        playerHp -= 35;
                    }
                }
                case 2 -> {
                    if (mana >= 20) {
                        System.out.println("Магічний бар'єр захистив вас, і ви оминули охоронця!");
                        roomPassed = true;
                    } else {
                        System.out.println("У вас недостатньо мани! Голем завдав удару. -30 HP.");
                        playerHp -= 30;
                    }
                }
                case 3 -> {
                    if (agility >= 14) {
                        System.out.println("Завдяки високій спритності ви граційно прослизнули повз варту!");
                        roomPassed = true;
                    } else {
                        System.out.println("Ви занадто повільні! Голем зловив вас. -30 HP.");
                        playerHp -= 30;
                    }
                }
                default -> {
                    System.out.println("Розгубившись, ви отримали прямий удар від голема! -40 HP.");
                    playerHp -= 40;
                }
            }
        } else {
            System.out.println("Ви обрали неіснуючий напрямок, заблукали у темних коридорах і виснажилися. -20 HP.");
            playerHp -= 20;
        }
        System.out.println("==============================================================");
        System.out.println("                       ФІНАЛ ГРИ                              ");
        System.out.println("==============================================================");
        if (playerHp <= 0) {
            System.out.println("Кінцівка: ПОРАЗКА");
            System.out.println("Герой загинув у темряві підземелля... Зло перемогло");
        } else if (roomPassed) {
            System.out.println("Кінцівка: ТРІУМФАЛЬНА ПЕРЕМОГА!");
            System.out.println("Ворота розчиняються, і герой виходить на світло сонця");
        } else {
            System.out.println("Кінцівка: ВИЖИВАННЯ БЕЗ ВИХОДУ");
            System.out.println("Ви вистояли, але не змогли відкрити головний вихід із темниці");
        }
        String rank;
        if (playerHp > 100) {
            rank = "Потужний герой (S)";
        } else if (playerHp > 60) {
            rank = "Норм чєлік (A)";
        } else if (playerHp > 0) {
            rank = "Нішевий попуск (B)";
        } else {
            rank = "НН (здох) (F)";
        }
        System.out.println();
        System.out.println("--- ФІНАЛЬНА СТАТИСТИКА ПЕРСОНАЖА ---");
        System.out.println("Ім'я та клас: " + heroName + " (" + className + ")");
        System.out.println("Залишок здоров'я (HP): " + Math.max(0, playerHp));
        System.out.println("Характеристики: Сила: " + strength + ", Мана: " + mana + ", Спритність: " + agility);
        System.out.println("Фінальний ранг проходження: " + rank);
        System.out.println("\\************************************************************/");
        scanner.close();
    }
}




