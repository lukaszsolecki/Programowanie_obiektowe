import java.util.Random;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        lab();
        wyznacz();
        System.out.println("Podaj ilosc wyrazow ciagu: ");
        int n=InputInt();
        ciag(n);
        System.out.println("Podaj ilosc losowanych liczb: ");
        int n2=InputInt();
        los(n2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wyraz: ");
        String s = scanner.nextLine();
        System.out.println("Czy wyraz '" + s + "' jest palindromem? " + palindrom(s));
    }

    private static int InputInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = input.nextInt();
        return liczba;
    }
    private static String InputString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj napis: ");
        String napis = input.nextLine();
        return napis;
    }

    public static void lab() {
        System.out.println("Ile studentow?");
        double n = InputInt();
        int i = 0;
        double s = 0;
        while (i < n) {
            System.out.println("Podaj liczbe punktow " + (i + 1) + " studenta");
            double points = InputInt();
            s += points;
            i++;
        }
        double srednia = s / n;
        System.out.println("Srednia liczba punktow to: " + srednia);
    }

    public static void wyznacz(){
        System.out.println("Wyznacz sume i ilosc liczb o roznych znakach: ");
        int suma_ujemna=0;
        int ilosc_ujemna=0;
        int suma_dodatnia=0;
        int ilosc_dodatnia=0;
        for (int i=0;i<10;i++){
            int liczba = InputInt();
            if (liczba<0){
                ilosc_ujemna+=1;
                suma_ujemna+=liczba;
            }else {
                ilosc_dodatnia+=1;
                suma_dodatnia+=liczba;
            }
        }
        System.out.println("Ilosc liczb ujemnych: "+ ilosc_ujemna+"\nSuma liczb ujemnych: "+ suma_ujemna+"\nIlosc liczb dodatnich: "+ilosc_dodatnia+"\nSuma liczb dodatnich: "+suma_dodatnia);
    }
    public static void ciag(int n){
        int suma=0;
        for (int i=1;i<=n;i++){
            if (i%2==0){
                suma+=i;
            }
        }
        System.out.println("Suma liczb parzystych wynosi: "+suma);
    }
    public static int RandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public static void los(int n2) {
        int random,sum=0;
        for(int i=0;i<n2;i++){
            random = RandomNumber(-10,45);
            System.out.println(+(i+1)+ ". wylosowana liczba to: "+random);
            if(random%2==0){
                sum+=random;
            }
        }
        System.out.println("Suma cyfr parzystych wynosi: "+sum);
    }
    public static boolean palindrom(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

