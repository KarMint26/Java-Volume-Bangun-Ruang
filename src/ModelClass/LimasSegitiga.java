package ModelClass;

public class LimasSegitiga extends VolumeBangunRuang{
    public LimasSegitiga(int alas, int tinggi) {
        super(alas, tinggi);
    }
    public int VolumeLimas(){
        int alas_limas = getAlas();
        int tinggi_limas = getTinggi();
        return ((alas_limas * tinggi_limas) / 3);
    }
}
