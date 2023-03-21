import jdk.jshell.Snippet;

import java.io.InputStream;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Run();
    }
    public static void Menu(){
        System.out.println("======================");
        System.out.println("=======Kalkulator=======");
        System.out.println("======================");
        System.out.println("\t\t\t1. Suma" +
                "\n\t\t\t2. Różnica" +
                "\n\t\t\t3. Iloczyn" +
                "\n\t\t\t4. Iloraz" +
                "\n\t\t\t5. Potega" +
                "\n\t\t\t6. Pierwiastek" +
                "\n\t\t\t7. Funkcje trygonometryczne(sin,cos,tg,ctg)" +
                "\n\t\t\t8. Wyjscie");
        System.out.println("\t\t\t----------------------------------------");
        System.out.println("\t\t\tWybierz operacje:");

    }

    public static void Run(){
        int wybor;
        while (true){
            Menu();
            wybor=InputInt();
            switch (wybor){
                case 1->metoda1();
                case 2->metoda2();
                case 3->metoda3();
                case 4->metoda4();
                case 5->metoda5();
                case 6->metoda6();
                case 7->metoda7();
                case 8->Close();
                default->Error();
            }
        }
    }
    public static void metoda1(){
        System.out.println("Podaj wartosci x i y aby je dodac: ");
        int x=InputInt();
        int y=InputInt();
        int suma=x+y;
        System.out.println("Suma podanych liczb wynosi: "+suma);
    }
    public static void metoda2(){
        System.out.println("Podaj wartosci x i y aby je odjac: ");
        int x=InputInt();
        int y=InputInt();
        int roznica=x-y;
        System.out.println("Roznica podanych liczb wynosi: "+roznica);
    }
    public static void metoda3(){
        System.out.println("Podaj wartosci x i y aby je pomnozyc: ");
        int x=InputInt();
        int y=InputInt();
        int iloczyn=x*y;
        System.out.println("Iloczyn podanych liczb wynosi: "+iloczyn);
    }
    public static void metoda4(){
        System.out.println("Podaj wartosci x i y aby wykonac dzielenie: ");
        int x=InputInt();
        int y=InputInt();
        int iloraz=x/y;
        System.out.println("Iloraz podanych liczb wynosi: "+iloraz);
    }
    public static void metoda5(){
        System.out.println("Podaj liczbe i potege aby spotegowac: ");
        int x=InputInt();
        int y=InputInt();
        int potega= (int)Math.pow(x,y);
        System.out.println("Potega liczby wynosi: "+potega);
    }
    public static void metoda6(){
        System.out.println("Podaj liczbe aby spierwiastkowac: ");
        int x=InputInt();
        double pierwiastek= Math.sqrt(x);
        System.out.println("Pierwiastek liczby wynosi: "+pierwiastek);
    }
    public static void metoda7(){
        System.out.println("Podaj wartosc kata w radianach: ");
        int tryg=InputInt();
        double sin= Math.sin(tryg);
        double cos= Math.cos(tryg);
        double tg= Math.tan(tryg);
        //double ctg= Math.cot(tryg);
        System.out.println("Sin= "+sin+"\nCos= "+cos+"\nTg= "+tg);
    }
    public static void Error(){
        System.out.println("Bledne dane koniec programu");
        System.exit(0);
    }

    public static int InputInt(){
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }

    public static void Close(){
        System.out.println("\t\t\tCzy na pewno chcesz wyjsc t || T");
        String znak = InputString();
        String st1="t";
        String st2="T";
        if (znak.equals(st1) || znak.equals(st2)) System.exit(0);
    }
    public static String InputString(){
        Scanner input = new Scanner(System.in);
        String znak = input.nextLine();
        return znak;
    }
}