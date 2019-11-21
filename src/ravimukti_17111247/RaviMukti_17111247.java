//Jumlah pelanggan diinputkan oleh pengguna / User 
//User Melakukan Input nomor meja, nama_pelanggan, menu makanan yang dipilih, menu minuman 
//yang dipilih dan masing masing jumlahnya sesuai dgn jml pelanggan yang diinputkan sebelumnya. 
//Program menampilkan subtotal dari menu yang dipesan dengan rumus :
//Program menampilkan subtotal dari menu yang dipesan dengan rumus : 
//a. Subtotal_Makan=jml_mkn*hrg_mkn
//b. Subtotal_Minum=jml_mnm*hrg_mnm 
//Program menampilkan pertanyaan, Apakah ada tambahan pesanan?
//Jika ya, user bisa kembali menginputkan pesanan
//Jika tidak maka program akan menghitung total_pembelian dengan rumus : 
//Total_Pembelian =Subtotal_makan+Subtotal_Minum
//Jika Total_Pembelian  lebih dari 150.000 maka pelanggan mendapatkan diskon 15%
//Jika Total_Pembelian lebih dari 300.000 maka diskon 20%
//Total_Bayar adalah (Total_Pembelian – Diskon )+ Pajak
//Pajak= 10% * Total_Pembelian
//Terakhir, Apikasi Menampilkan List Pelanggan berupa nomor_meja, nama_pelanggan, makanan yang 
//dipesan, harga makanan, dan jumlahnya,  minuman yang dipesan, harga minuman, dan jumlahnya
//serta total yang harus dibayar. Dalam Bentuk Tabel 

package ravimukti_17111247;

import java.util.ArrayList;
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
                
        String [][] transaksi = new String[5][8];
        Scanner inputLokasi = new Scanner(System.in);
        Scanner inputTransaksiMenu = new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        Scanner inputMenu = new Scanner(System.in);
        String nama, lokasi, menu, transaksiMenu;
        boolean ulangi = false;
        
        
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
        minuman3.setNamaMenu("Jus Alpukhaat");
        minuman3.setHargaMenu(100000);
        makanan.setNamaMenu("Pecel Lele");
        makanan.setHargaMenu(80000);
        makanan2.setNamaMenu("Rica Rica Ayam");
        makanan2.setHargaMenu(95000);
        makanan3.setNamaMenu("Nasi Goreng");
        makanan3.setHargaMenu(100000);
        System.out.println("-------------------------------");
        System.out.println("         RESTO ABSURD          ");
        System.out.println("-------------------------------");
        System.out.println("Nama Pelanggan : ");
        nama = inputNama.nextLine().toString();
        System.out.println("Nomor Meja : ");
        lokasi = inputLokasi.nextLine().toString();
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
            System.out.println("Silakan Pesan Menu Coy : ");
            menu = inputMenu.nextLine().toString();
            System.out.println("---------------------------------------------------");
            System.out.println("Apakah ada tambahan? ? (Y/N)");
            transaksiMenu = inputTransaksiMenu.next();
            switch(transaksiMenu){
                case "Y":
                    ulangi = true;
                    break;
                case "N":
                    ulangi = false;
                    break;
                default:
                    ulangi = false;
            }
        } while (ulangi == true);
        
}
};

class TransaksiResto {
    private String nomorMeja;
    private String namaPembeli;

    public TransaksiResto(String nomorMeja, String namaPembeli) {
        this.nomorMeja = nomorMeja;
        this.namaPembeli = namaPembeli;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNama(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getNomorMeja() {
        return nomorMeja;
    }

    public void setNomorMeja(String nomorMeja) {
        this.nomorMeja = nomorMeja;
    }
    
    
};
