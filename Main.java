public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler = {
                new Ogrenci(null,null,0.0,"104",1973),
                new Ogrenci("Gökhan","Bilgisayar Müh",7.0,"104",1985),
                new Ogrenci("Ayşe","Makine Müh",0.0,"104",1985),
                new Ogrenci("Elif","Elektrik-Elektronik Müh",1.98,"104",2020)
        };

       for (int i = 0; i < ogrenciler.length; i++) {
           try {
                ogrenciler[i].ganoKontrol(ogrenciler[i].getGano());
           }
           catch (Exception e) {
               //System.out.println("HATA " + (i + 1) + ". " + e.getMessage());
               throw new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır.");
           }
       }

        System.out.println("Öğrenci Bilgileri");
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println("OGR-" + (i + 1) + " " + ogrenciler[i].getAd() + " " + ogrenciler[i].getBolum() +
                    " " + ogrenciler[i].ogrenciNoOlustur() + " " + ogrenciler[i].getGano());
        }

        System.out.println("3. öğrencinin ödemesi gereken harç: " + ogrenciler[2].harcHesapla(4));
        System.out.println("4. öğrencinin ödemesi gereken harç: " + ogrenciler[3].harcHesapla(4,1.5));
    }
}