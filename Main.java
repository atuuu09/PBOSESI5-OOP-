import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening dari berbagai jenis
        Rekening rekening1 = new Tabungan("Atuuu", "12345", 1000000, 5.0);
        Rekening rekening2 = new Giro("Icaaa", "67890", 2000000, 500000);
        Rekening rekening3 = new Deposito("Raraa", "11223", 1500000, 6, 7.0);

        // Menyimpan objek rekening dalam ArrayList
        ArrayList<Rekening> rekeningList = new ArrayList<>();
        rekeningList.add(rekening1);
        rekeningList.add(rekening2);
        rekeningList.add(rekening3);

        // Menampilkan semua rekening dengan saldo
        System.out.println("Daftar Semua Rekening: ");
        for (Rekening r : rekeningList) {
            r.tampilkanInfo();
            System.out.println(); // Menambahkan baris kosong setelah setiap informasi rekening
        }

        // Mencari rekening dengan saldo tertinggi dan terendah
        double maxSaldo = Double.MIN_VALUE;
        double minSaldo = Double.MAX_VALUE;
        Rekening maxRekening = null, minRekening = null;

        for (Rekening r : rekeningList) {
            if (r.saldo > maxSaldo) {
                maxSaldo = r.saldo;
                maxRekening = r;
            }
            if (r.saldo < minSaldo) {
                minSaldo = r.saldo;
                minRekening = r;
            }
        }

        // Menampilkan rekening dengan saldo tertinggi
        System.out.println("Rekening dengan saldo tertinggi: ");
        maxRekening.tampilkanInfo();

        // Menampilkan rekening dengan saldo terendah
        System.out.println("Rekening dengan saldo terendah: ");
        minRekening.tampilkanInfo();
    }
}

