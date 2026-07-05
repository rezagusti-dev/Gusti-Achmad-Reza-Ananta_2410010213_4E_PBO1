package sistemmanajemangym;

public class RegularMember extends Member {

    // Harga member reguler per bulan
    private final double BIAYA_PER_BULAN = 200000;

    // Constructor
    public RegularMember(String idMember,
                         String nama,
                         int umur,
                         String jenisKelamin,
                         String nomorHP,
                         int lamaBulan) {

        super(idMember,
              nama,
              umur,
              jenisKelamin,
              nomorHP,
              "Regular",
              lamaBulan);

    }

    // Override Method (Polymorphism)
    @Override
    public double hitungBiaya() {

        return getLamaBulan() * BIAYA_PER_BULAN;

    }

}
