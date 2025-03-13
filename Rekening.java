// Import library yang dibutuhkan
import java.util.ArrayList;

// Kelas utama Rekening
class Rekening {
    protected String namaPemilik;
    protected String nomorRekening;
    protected double saldo;

    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void setor(double jumlah, boolean transfer) {
        saldo += jumlah;
        if (transfer) {
            saldo -= 2500; // Biaya administrasi transfer
        }
    }

    public void tarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: Rp " + saldo);
    }
}

