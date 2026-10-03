import java.util.Scanner;

public class TigaLoop {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Batas deret (n) : ");
        int n1 = scanner.nextInt();
        System.out.println();
        printTigaLoop(n1);
        
        System.out.println();
        System.out.println();
        
        System.out.print("Batas deret (n) : ");
        int n2 = scanner.nextInt();
        System.out.println();
        printTigaLoop(n2);
        
        scanner.close();
    }
    
    private static void printTigaLoop(int n) {
        System.out.println("===== SATU DERET, TIGA LOOP =====");
        
        System.out.print("for      :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        
        System.out.print("while    :");
        int j = 1;
        while (j <= n) {
            System.out.print(" " + j);
            j++;
        }
        System.out.println();
        
        System.out.print("do-while :");
        int k = 1;
        do {
            System.out.print(" " + k);
            k++;
        } while (k <= n);
        System.out.println();
        
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");
        
        System.out.print("Disaring :");
        int countPrintln = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i > 7) {
                break;
            }
            System.out.print(" " + i);
            countPrintln++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + countPrintln + " kali");
    }
}
