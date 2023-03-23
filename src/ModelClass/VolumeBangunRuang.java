package ModelClass;

public class VolumeBangunRuang {
    private int alas;
    private int tinggi;
    private int tinggi_alas;
    private int jari_jari;

    public VolumeBangunRuang(int alas, int tinggi, int tinggi_alas){
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggi_alas = tinggi_alas;
    }

    public VolumeBangunRuang(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public VolumeBangunRuang(int jari_jari){
        this.jari_jari = jari_jari;
    }

    public int getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(int jari_jari) {
        this.jari_jari = jari_jari;
    }

    public int getTinggi_alas() {
        return tinggi_alas;
    }

    public void setTinggi_alas(int tinggi_alas) {
        this.tinggi_alas = tinggi_alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

}
