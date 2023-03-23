package ModelClass;

public class PrismaSegitiga extends VolumeBangunRuang{
    public PrismaSegitiga(int alas, int tinggi_prisma, int tinggi_alas) {
        super(alas, tinggi_prisma, tinggi_alas);
    }
    public int VolumePrisma(){
        int alas_prisma = getAlas();
        int tinggi_alas = getTinggi_alas();
        int tinggi_prisma = getTinggi();
        return (((alas_prisma * tinggi_alas)/2) * tinggi_prisma);
    }
}
