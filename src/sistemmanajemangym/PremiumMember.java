package sistemmanajemangym;

public class PremiumMember extends Member {

    // Harga Premium
    private final double BIAYA_PER_BULAN = 350000;

    // Constructor
    public PremiumMember(String idMember,
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
              "Premium",
              lamaBulan);

    }

    // Override Method
    @Override
    public double hitungBiaya() {

        double total = getLamaBulan() * BIAYA_PER_BULAN;

        // Diskon 10% jika berlangganan minimal 12 bulan
        if (getLamaBulan() >= 12) {

            total = total - (total * 0.10);

        }

        return total;

    }

}