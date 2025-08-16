import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("Feliz ano novo!");
    }
}
