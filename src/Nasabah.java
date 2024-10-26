public class Nasabah {
    private String kodeCIF;
    private String NIK;
    private String namaNasabah;
    private String telp;
    private String alamat;
    private String namaIbuKandung;
    private String pekerjaan;
    private double penghasilanRataRataPerbulan;

    // Constructor with mandatory fields
    public Nasabah(String kodeCIF, String NIK, String namaNasabah, String telp) {
        if (kodeCIF == null || kodeCIF.length() != 5) {
            throw new IllegalArgumentException("Kode CIF must be exactly 5 characters.");
        }
        if (NIK == null || NIK.length() != 16) {
            throw new IllegalArgumentException("NIK must be exactly 16 characters.");
        }
        if (namaNasabah == null || namaNasabah.isEmpty()) {
            throw new IllegalArgumentException("Nama Nasabah is required.");
        }
        if (telp == null || telp.isEmpty()) {
            throw new IllegalArgumentException("Telp is required.");
        }

        this.kodeCIF = kodeCIF;
        this.NIK = NIK;
        this.namaNasabah = namaNasabah;
        this.telp = telp;
    }

    // Optional fields setters
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNamaIbuKandung(String namaIbuKandung) {
        this.namaIbuKandung = namaIbuKandung;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void setPenghasilanRataRataPerbulan(double penghasilanRataRataPerbulan) {
        this.penghasilanRataRataPerbulan = penghasilanRataRataPerbulan;
    }

    // Getters
    public String getKodeCIF() {
        return kodeCIF;
    }

    public String getNIK() {
        return NIK;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public String getTelp() {
        return telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNamaIbuKandung() {
        return namaIbuKandung;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public double getPenghasilanRataRataPerbulan() {
        return penghasilanRataRataPerbulan;
    }
}
