import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        System.out.println("Podaj a: ");
        double a=InputInt();
        System.out.println("Podaj b: ");
        double b=InputInt();
        System.out.println("Podaj c: ");
        double c=InputInt();
        funKw(a,b,c);
        liczby();
        nieujemna();
        System.out.print("Ile liczb chcesz posortowac? ");
        int n = (int)InputInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)InputInt();
        }
        sortowanie(array);
        System.out.println("Posortowane liczby:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
    private static double InputInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double liczba = input.nextInt();
        return liczba;
    }

    public static void funKw(double a, double b, double c){
        if (a!=0){
            double delta = Math.pow(b,2)-(4*a*c);
            double x_1 = ((-b)+Math.sqrt(delta))/2*a;
            double x_2 = ((-b)-Math.sqrt(delta))/2*a;
            System.out.printf("Delta= "+delta+"\nx1= "+x_1+"\nx2= "+x_2+"\n");
        }else {
            System.out.println("To nie jest funkcja kwadratowa\n");
        }
    }
    public static void liczby(){
        for (int i = 20; i >= 0; i--) {
            if (i == 2 || i == 6 || i == 9 || i == 15 || i == 19) {
                continue;
            }
            System.out.print(i + " ");
            }
    }
    public static void nieujemna(){
        while(true){
            double number = InputInt();

            if (number < 0) {
                break;
            }
        }
    }
    public static void sortowanie(int array[]){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int element = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] > element)) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = element;
        }
    }
}
