import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 Random random = new Random();
        int arr [] = new int[9];
        System.out.print(" Правильный  порядок: " );
        for (int i = 0;  i < 9; i++) {
            System.out.print( i + " ");
        }
        System.out.print( ";");
        System.out.print( " Обратный порядок: " + " " );
        for (int i =arr.length-1 ; i>=0 ; i--) {

            System.out.print( i+ " " );
        }
        System.out.println(".");
    }
}