//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //  Setter
        Nasabah nasabah = new Nasabah(
                "12345",
                "1234567890123456",
                "John Doe",
                "081234567890"
        );

        nasabah.setAlamat("Test Jalan");
        nasabah.setPekerjaan("Test Pekerjaan");
        nasabah.setNamaIbuKandung("Test Ibu Kandung");
        nasabah.setPenghasilanRataRataPerbulan(5000000.0);

    //  Getter
        System.out.println("Kode CIF: " + nasabah.getKodeCIF());
        System.out.println("NIK: " + nasabah.getNIK());
        System.out.println("Nama Nasabah: " + nasabah.getNamaNasabah());
        System.out.println("Telp: " + nasabah.getTelp());
        System.out.println("Alamat: " + nasabah.getAlamat());
        System.out.println("Pekerjaan: " + nasabah.getPekerjaan());
        System.out.println("Ibu Kandung: " + nasabah.getNamaIbuKandung());
        System.out.println("Penghasilan Rata-Rata Per-Bulan: Rp." + nasabah.getPenghasilanRataRataPerbulan());
    }
}