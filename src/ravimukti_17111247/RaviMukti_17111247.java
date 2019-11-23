package ravimukti_17111247;

import java.util.Scanner;

/**
 *
 * @author ravimukti
 */
public class RaviMukti_17111247 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;
        int pilihan;
        int jumlahPesanan;
        double total = 0;
        double diskon = 0;
        double grandTotal = 0;
        String ulangi, nama, meja;
        String[] menu = new String[100];
        double[] harga = new double[100];
        double[] subtotal = new double[100];
        int[] jmlPesan = new int[100];
        Scanner inputMeja = new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        Scanner inputMenu = new Scanner(System.in);
        Scanner inputHarga = new Scanner(System.in);
        Scanner inputJumlahPesanan = new Scanner(System.in);
        Scanner inputUlangi = new Scanner(System.in);

        Minuman minuman = new Minuman();
        Minuman minuman2 = new Minuman();
        Minuman minuman3 = new Minuman();
        Makanan makanan = new Makanan();
        Makanan makanan2 = new Makanan();
        Makanan makanan3 = new Makanan();
        minuman.setNamaMenu("Hayang Thai Tea");
        minuman.setHargaMenu(30000);
        minuman2.setNamaMenu("Kopi Ti Kebon");
        minuman2.setHargaMenu(75000);
        minuman3.setNamaMenu("Jus Alpukhat");
        minuman3.setHargaMenu(100000);
        makanan.setNamaMenu("Pecel Lele");
        makanan.setHargaMenu(80000);
        makanan2.setNamaMenu("Rica Rica Ayam");
        makanan2.setHargaMenu(95000);
        makanan3.setNamaMenu("Nasi Goreng");
        makanan3.setHargaMenu(100000);
        System.out.println("---------------------------------------------------");
        System.out.println("                 RESTO ABSURD BEUT                 ");
        System.out.println("---------------------------------------------------");
        System.out.println("Masukin nomer mejanya disini : ");
        meja = inputMeja.nextLine();
        System.out.println("Nah nama kamu juga ya disini : ");
        nama = inputNama.nextLine();
        System.out.println("\n");
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("              Menu Resto Absurd Beut               ");
            System.out.println("---------------------------------------------------");
            System.out.println("1. " + makanan.getNamaMenu() + "\t\tHarga : " + makanan.getHargaMenu());
            System.out.println("2. " + makanan2.getNamaMenu() + "\tHarga : " + makanan2.getHargaMenu());
            System.out.println("3. " + makanan3.getNamaMenu() + "\t\tHarga : " + makanan3.getHargaMenu());
            System.out.println("---------------------------------------------------");
            System.out.println("4. " + minuman.getNamaMenu() + "\tHarga : " + minuman.getHargaMenu());
            System.out.println("5. " + minuman2.getNamaMenu() + "\tHarga : " + minuman2.getHargaMenu());
            System.out.println("6. " + minuman3.getNamaMenu() + "\tHarga : " + minuman3.getHargaMenu());
            System.out.println("---------------------------------------------------");
            System.out.println("Coba masukin makanan yang mau kamu pesen : ");
            pilihan = inputMenu.nextInt();
            switch (pilihan) {
                case 1:
                    menu[i] = makanan.getNamaMenu();
                    harga[i] = makanan.getHargaMenu();
                    break;
                case 2:
                    menu[i] = makanan2.getNamaMenu();
                    harga[i] = makanan2.getHargaMenu();
                    break;
                case 3:
                    menu[i] = makanan3.getNamaMenu();
                    harga[i] = makanan3.getHargaMenu();
                    break;
                case 4:
                    menu[i] = minuman.getNamaMenu();
                    harga[i] = minuman.getHargaMenu();
                    break;
                case 5:
                    menu[i] = minuman2.getNamaMenu();
                    harga[i] = minuman2.getHargaMenu();
                    break;
                case 6:
                    menu[i] = minuman3.getNamaMenu();
                    harga[i] = minuman3.getHargaMenu();
                    break;
                default:
                    menu[i] = "Kamu milih apa sih? Ini gak ada di menu";
                    harga[i] = 0;
                    break;
            }
            System.out.println("Kamu mau pesennya berapa banyak? ");
            jumlahPesanan = inputJumlahPesanan.nextInt();
            jmlPesan[i] = jumlahPesanan;
            subtotal[i] = harga[i]*jmlPesan[i];
            System.out.println("Menu yang kamu pesan nih : " + menu[i]);
            System.out.println("Harga per menu segini ya : " + harga[i]);
            System.out.println("Kamu pesannya sebanyak ini nih : " + jmlPesan[i]);
            System.out.println("Hmm kamu mau pesen lagi gak ? (Y/N)");
            ulangi = inputUlangi.next();
            i++;
        } while (ulangi.equals("Y") || ulangi.equals("y"));
        System.out.println("Hai " + nama + ", meja kamu di " + meja);
        System.out.println("nih menu yang kamu pesan " + i + ", detailnya ini ya..");
        System.out.println("---------------------------------------------------");
        for (int j = 0; j < i; j++) {
                System.out.println(menu[j] + " x " + jmlPesan[j] + "\t = " + subtotal[j]);
                total += subtotal[j];
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Subtotal\t: " + total);
        if (total >= 150000 &&  total < 300000) {
            diskon = total*0.15;
            System.out.println("Diskon\t\t: " + diskon);
        } else if (total >= 300000){
            diskon = total*0.3;
            System.out.println("Diskon\t\t: " + diskon);
        }
        grandTotal = total - diskon;
        System.out.println("GrandTotal\t: " + grandTotal);
        System.out.println("\n\n\n");
        System.out.println("---------------------------------------------------");
        System.out.println("           TRANSAKSI RESTO ABSURD BEUT             ");
        System.out.println("---------------------------------------------------");
        System.out.println("Meja\t\t|Nama\t\t|Makanan\t|Subtotal\t|Diskon\t\t|Total");
        for (int m = 0; m < i; m++) {
            System.out.print(meja+"\t\t"+nama+"\t\t"+menu[m]+"\t\t"+total+"\t\t"+diskon+"\t\t"+grandTotal);
        }
    }   
};
