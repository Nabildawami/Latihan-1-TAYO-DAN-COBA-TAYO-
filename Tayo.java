package TugasNabil;

public class Tayo {
    void a(String mobilType){
        System.out.println("TYPE MOBIL    \t     : "+mobilType);
    }
    void a(String warna,int jumlahroda, String noplat){
        System.out.println("Warna Mobil   \t     : "+warna);
        System.out.println("Jumlah Roda   \t     : "+jumlahroda + " Buah ");
        System.out.println("Nomor Polisi  \t     : " +noplat);
    }

    void a (int kecepatan,int waktu){
        System.out.println("Kecepatan Mobil      : " + kecepatan + " km/jam ");
        System.out.println("Waktu Tempuh Mobil   : " + waktu + " jam ");
        System.out.println("Jarak Tempuh Mobil   : " + (kecepatan*waktu) + " km ");

    }
}
