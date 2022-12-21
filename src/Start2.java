import java.io.IOException;
import java.util.Scanner;

public class Start2 {

    public static void main(String[] arg) throws IOException {
        /* Сканер
    }
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);

     */
    /*
        for (int i = 0; i< 5; i++) {
        System.out.println("Итерация " + i);
    }
    */
        /*
        for (int i = 0; 'S' != (char) System.in.read(); i++){
            System.out.println("Итерация " + i);

        }

         */
/*        сначала сравнивает, потом прибавляет. Когда не знаем кол-во итераций
int count = 0;
while (count < 10){
    System.out.println(count);
    count++;
}
*/
        int count = 10;
        do {
            System.out.println(count);
            count++;
        }while (count < 10);


    }

}
