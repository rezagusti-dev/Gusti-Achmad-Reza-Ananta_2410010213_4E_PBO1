package sistemmanajemangym;

public class Member {

    // =========================
    // Atribut (Encapsulation)
    // =========================
    private String idMember;
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String nomorHP;
    private String jenisMember;
    private int lamaBulan;

    // =========================
    // Constructor Default
    // =========================
    public Member() {

    }

    // =========================
    // Constructor Berparameter
    // =========================
    public Member(String idMember, String nama, int umur,
                  String jenisKelamin, String nomorHP,
                  String jenisMember, int lamaBulan) {

        this.idMember = idMember;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.nomorHP = nomorHP;
        this.jenisMember = jenisMember;
        this.lamaBulan = lamaBulan;
    }

    // =========================
    // Getter
    // =========================

    public String getIdMember() {
        return idMember;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public String getJenisMember() {
        return jenisMember;
    }

    public int getLamaBulan() {
        return lamaBulan;
    }

    // =========================
    // Setter
    // =========================

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public void setJenisMember(String jenisMember) {
        this.jenisMember = jenisMember;
    }

    public void setLamaBulan(int lamaBulan) {
        this.lamaBulan = lamaBulan;
    }

    // =========================
    // Polymorphism
    // Akan dioverride oleh subclass
    // =========================

    public double hitungBiaya() {
        return 0;
    }

    // =========================
    // Menampilkan Data Member
    // =========================

    public void tampilkanData() {

        System.out.println("-------------------------------------------");
        System.out.println("ID Member      : " + idMember);
        System.out.println("Nama           : " + nama);
        System.out.println("Umur           : " + umur + " Tahun");
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Nomor HP       : " + nomorHP);
        System.out.println("Jenis Member   : " + jenisMember);
        System.out.println("Lama Member    : " + lamaBulan + " Bulan");
        System.out.println("Total Biaya    : Rp " + hitungBiaya());
        System.out.println("-------------------------------------------");
    }

}