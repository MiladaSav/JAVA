import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        /* //целочисленные данные, популярный int
        byte num = 100; // чейка может хранить 8бит от -128 до 127
        short num1 = 131; // 16бит -32768 до 32767
        int num3 = 141; // 32бит -2147483648 до 214748647
        long num4 = 123; // 64бит
        //вещественный тип данных попул double не требует букву в конце
        float num5 = 1.1f; //32бит 1.2223  6-7 знаков после точки
        double num6 = 1.11; //64бит точность после точки 15 знаков
        //символьный для юникода тоже
        char simv = 'A'; //символьный тип данных из юникода тоже 16бит
        boolean isTrue = false; // 1бит true
         */
        /*int num1 = 3;
        int num2 = 4;
        int num3 = --num2; // дискримент,может и спереди и после стоять, только после перееменной

        int result = num1 % num2; //остаток от деления целое число

        if(num1 > num2) { //Условие && - и, || - или
            System.out.println("Больше");
        } else {
            System.out.println("Меньше");
        }
        System.out.println(num3);*/


        /*char ch,answer = 'B';

        System.out.println("Попробуй отгадать букву");
        System.out.print("Какую букву загадали?");

        ch = (char)System.in.read();

        if (ch == answer){
            System.out.println("Молодец");
        } else if (ch > answer) {
            System.out.println("Перебор");
        } else {
            System.out.println("Недобор");
        }*/

        int month = 5;
        String monthString;
         switch (month) {
            case 1: monthString = "Январь";
                break;
            case 2: monthString = "Февраль";
                break;
            case 3: monthString = "Март";
                break;
            case 4: monthString = "Апрель";
                break;
             default: monthString = "Не понятно";
                break;
         }
         System.out.println(monthString);
    }
}
