import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sprawdzic czy jest parzysta: ");
        int p=InputInt();
        System.out.println(Parzystosc(p));

        System.out.println("Sprawdzic czy jest podzielna przez 3 i 5: ");
        int q=InputInt();
        System.out.println(Podzielnosc(q));

        System.out.println("Sprawdzic ile wyniesie liczba podniesiona do 3 potegi: ");
        int pot=InputInt();
        System.out.println(Potega(pot));

        System.out.println("Sprawdzic ile wyniesie pierwiastek z liczby: ");
        int pie=InputInt();
        System.out.println(Pierwiastek(pie));

        System.out.println("Sprawdzic czy mozna stworzyc trojkat prostokatny, podaj przedzial wartosci losowanych odcinkow: ");
        Random rand = new Random();
        int x=InputInt();
        int y=InputInt();
        int a = rand.nextInt(y-x  +1)+x;
        int b = rand.nextInt(y-x  +1)+x;
        int c = rand.nextInt(y-x  +1)+x;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Trojkat(a,b,c));
    }
    private static int InputInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = input.nextInt();
        return liczba;
    }
    public static boolean Parzystosc(int p){
        if (p%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean Podzielnosc(int q){
        if (q%3==0 && q%5==0){
            return true;
        }else{
            return false;
        }
    }
    public static int Potega(int pot){
        return (int) Math.pow(pot,3);

    }public static int Pierwiastek(int pie){
        return (int) Math.sqrt(pie);
    }
    public static boolean Trojkat(int a,int b, int c){
        if (a > 0 && b > 0 && c > 0) {
            if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((b * b) + (c * c)) == (a * a)) {
                return true;
            }
        }
        return false;
    }
}