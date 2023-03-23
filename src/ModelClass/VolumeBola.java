package ModelClass;

public class VolumeBola extends VolumeBangunRuang{
    public VolumeBola(int jari_jari) {
        super(jari_jari);
    }
    private double phi;

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double VolumeBolaFull(){
        setPhi(3.14);
        double resultPhi = getPhi();
        int jari_jari_bola = getJari_jari();
        return ((1.33333333) * resultPhi * (jari_jari_bola^3));
    }
    public double VolumeBolaSebagian(){
        setPhi(3.14);
        double resultPhi = getPhi();
        int jari_jari_bola = getJari_jari();
        return ((1.33333333) * resultPhi * (jari_jari_bola^3));
    }
}
