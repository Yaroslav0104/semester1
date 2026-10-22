package semester1.practice01;

public class Practice40 {
    public static void main(String[] args) {
        System.out.println("+------------------------------------+");
        System.out.println("|             IT-STORE ЧЕК           |");
        System.out.println("+------------------------------------+");
        System.out.println("|Товар\t\t\tКількість\tЦіна     |");
        System.out.println("|Флешка 64GB\t2\t\t\t150   грн|");
        System.out.println("|Мишка USB\t\t1\t\t\t400   грн|");
        System.out.println("|Планшет Apple\t1\t\t\t21999 грн|");
        System.out.println("|Навушники JBL\t1\t\t\t1600  грн|");
        System.out.println("|Телевізор LG\t1\t\t\t10500 грн|");
        System.out.println("+------------------------------------+");
        System.out.println("|         Разом до сплати(грн):      |");
        System.out.print("|                ");
        System.out.print(2*150+400+21999+1600+10500);
        System.out.println("               |");
        System.out.println("+------------------------------------+");
        System.out.println("|         Дякуємо за покупку!        |");
        System.out.println("+------------------------------------+");
    }
}
