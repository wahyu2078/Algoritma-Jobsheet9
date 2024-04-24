import java.util.Scanner;

public class PakaianMain29 {
    public static void main(String[] args) {
        PakaianStack29 stk = new PakaianStack29(5);
        Scanner sc = new Scanner(System.in);
        char pilih;

        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Max");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    char inputLanjut;
                    do {
                        System.out.print("Jenis: ");
                        String jenis = sc.nextLine();
                        System.out.print("Warna: ");
                        String warna = sc.nextLine();
                        System.out.print("Merk: ");
                        String merk = sc.nextLine();
                        System.out.print("Ukuran: ");
                        String ukuran = sc.nextLine();
                        System.out.print("Harga: ");
                        double harga = sc.nextDouble();
                        sc.nextLine();
                        Pakaian29 p = new Pakaian29(jenis, warna, merk, ukuran, harga);
                        stk.push(p);

                        System.out.print("Tambahkan data lainnya? (y/n): ");
                        inputLanjut = sc.next().charAt(0);
                        sc.nextLine();
                    } while (inputLanjut == 'y' || inputLanjut == 'Y');
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
                    Pakaian29 maxPakaian = stk.getMax();
                    if (maxPakaian != null) {
                        System.out.println("Pakaian dengan harga tertinggi:");
                        System.out.println(maxPakaian.jenis + " " + maxPakaian.warna + " " + maxPakaian.merk + " " + maxPakaian.ukuran + " " + maxPakaian.harga);
                    }
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        } while (pilih == 'y' || pilih == 'Y');

        sc.close();
    }
}
