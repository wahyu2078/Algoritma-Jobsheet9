
import java.util.Scanner;

public class StrukMain29 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Struk29 stk = new Struk29(20);
        StrukMain29 main = new StrukMain29();

        int pil;
        while (true) {
            System.err.println("=========================");
            System.err.println("Pilihan");
            System.err.println();
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Kupon");
            System.out.println("6. Keluar");
            System.out.print("Pilih opreasi: ");
            pil = sc.nextInt();
            switch (pil) {
                case 1:
                    main.pushPakaian(stk);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    main.kupon(stk);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia. ");
                    break;
            }
        }
    }

    public void pushPakaian(Struk29 stk) {
        char pilih;
        do {
            System.out.print("No Belanja: ");
            int noTra = sc.nextInt();
            System.out.print("Tanggal (dd/mm/yyyy) : ");
            String tanggal = sc.next();
            System.out.print("Jumlah: ");
            int jumlah = sc.nextInt();
            System.out.print("Total Bayar: ");
            int total = sc.nextInt();

            Struk29 d = new Struk29(noTra, tanggal, jumlah, total);

            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n) ? ");
            pilih = sc.next().charAt(0);
            stk.push(d);
        } while (pilih == 'y');
    }

    public void kupon(Struk29 stk) {
        System.out.println("Data yang diambil");
        int i = 0;
        while (i < 5) {
            stk.pop();
            i++;
        }

        System.out.println();
        System.out.println("Data yang tersisa");
        stk.print();
    }
}