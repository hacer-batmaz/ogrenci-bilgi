public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;

    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.bolum = bolum;
    }

    public Ogrenci(Ogrenci ogrenci) {
        this.ad = getAd();
        this.bolum = getBolum();
        this.gano = getGano();
    }

    public Ogrenci(String ad, String bolum, double gano, String bolumKodu, int girisYili) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        this.ogrNo = ogrenciNoOlustur();
    }

    public Ogrenci() {
        ad = null;
        bolum = null;
        girisYili = 0;
        ogrNo = null;
        gano = 0.0;
        bolumKodu = null;
    }

    public double harcHesapla(int dersSayisi) {
        double harc = dersSayisi * 120;

        return harc;
    }

    public double harcHesapla(int dersSayisi,double yil) {
        double harc = dersSayisi * 120 + yil * 320;

        return harc;
    }

    public String ogrenciNoOlustur() {
        String girisSirasi = "001";
        this.ogrNo = this.girisYili + this.bolumKodu + girisSirasi;

        return this.ogrNo;
    }

    public String getAd() {
        return ad;
    }

    public String getBolum() {
        return bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setAd() {
        this.ad = ad;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setGano() {
        this.gano = gano;
    }

    public void ganoKontrol(double gano) {
        if (gano < 0 || gano > 4)
            throw new IllegalArgumentException("Öğrenci ganosu 0 ile 4 arasında olmalıdır.");
    }
}