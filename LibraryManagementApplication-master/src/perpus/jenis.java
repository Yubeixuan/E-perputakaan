/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

/**
 *
 * @author KRISNA
 **/
/* =========================
   ABSTRACT CLASS (PUBLIC)
   ========================= */
public abstract class jenis {

    protected static final int DENDA_PER_HARI = 2000;

    public abstract String getNamaJenis();
    public abstract int maxHariPinjam();

    public int getDendaPerHari() {
        return DENDA_PER_HARI;
    }
}

/* =========================
   IMPLEMENTASI JENIS BUKU
   (TIDAK PUBLIC)
   ========================= */
class Novel extends jenis {

    @Override
    public String getNamaJenis() {
        return "Novel";
    }

    @Override
    public int maxHariPinjam() {
        return 7;
    }
}

class BukuPelajaran extends jenis {

    @Override
    public String getNamaJenis() {
        return "Buku Pelajaran";
    }

    @Override
    public int maxHariPinjam() {
        return 7;
    }
}

class BukuReferensi extends jenis {

    @Override
    public String getNamaJenis() {
        return "Buku Referensi";
    }

    @Override
    public int maxHariPinjam() {
        return 7;
    }
}

class Majalah extends jenis {

    @Override
    public String getNamaJenis() {
        return "Majalah";
    }

    @Override
    public int maxHariPinjam() {
        return 7;
    }
}

class Skripsi extends jenis {

    @Override
    public String getNamaJenis() {
        return "Skripsi / Tesis";
    }

    @Override
    public int maxHariPinjam() {
        return 7;
    }
}

/* =========================
   FACTORY (MASIH 1 FILE)
   ========================= */
class JenisFactory {

    public static jenis getJenis(String pilihan) {
        switch (pilihan) {
            case "Novel":
                return new Novel();
            case "Buku Pelajaran":
                return new BukuPelajaran();
            case "Buku Referensi":
                return new BukuReferensi();
            case "Majalah":
                return new Majalah();
            case "Skripsi / Tesis":
                return new Skripsi();
            default:
                return null;
        }
    }
}
