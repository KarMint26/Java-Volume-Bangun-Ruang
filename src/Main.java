import ModelClass.LimasSegitiga;
import ModelClass.PrismaSegitiga;
import ModelClass.VolumeBola;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String output_scan(String index){
        System.out.print(index + " : ");
        return scanner.nextLine();
    }
    public static void viewApp(){
        label:
        while(true){
            System.out.println("\n   PROGRAM MENGHITUNG VOLUME BANGUN RUANG");
            System.out.println("==============================================");
            System.out.println("1. Volume Limas Segitiga");
            System.out.println("2. Volume Bola");
            System.out.println("3. Volume Prisma Segitiga");
            System.out.println("x. Exit Aplikasi");
            String choose = output_scan("\nMasukkan Pilihan Anda");
            switch (choose){
                case "1" -> {
                    limas_segitiga();
                }
                case "2" -> {
                    bola();
                }
                case "3" -> {
                    prisma_segitiga();
                }
                case "x" -> {
                    break label;
                }
                default -> {
                    System.out.println("Pilihan Anda Tidak Valid.......");
                }
            }
        }
    }

    public static void limas_segitiga(){
        System.out.println("\n  PROGRAM MENGHITUNG VOLUME LIMAS SEGITIGA");
        System.out.println("==============================================");
        int luas_alas = Integer.parseInt(output_scan("Masukkan Luas Alas"));
        int tinggi_limas = Integer.parseInt(output_scan("Masukkan Tinggi"));
        LimasSegitiga limasSegitiga = new LimasSegitiga(luas_alas, tinggi_limas);
        System.out.println("\nHasil Dari Volume Limas Segitiga Adalah : " + limasSegitiga.VolumeLimas());
        System.out.println(" ");
    }
    public static void SetengahBola(){
        int jari_jari = Integer.parseInt(output_scan("\nMasukkan Jari-Jari Bola"));
        VolumeBola volumeBola = new VolumeBola(jari_jari);
        System.out.println("\nHasil Dari Volume Setengah Bola Adalah : " + volumeBola.VolumeBolaSebagian());
    }
    public static void VolumeBolaFull(){
        int jari_jari = Integer.parseInt(output_scan("Masukkan Jari-Jari Bola"));
        VolumeBola volumeBola = new VolumeBola(jari_jari);
        System.out.println("\nHasil Dari Volume Bola Adalah : " + volumeBola.VolumeBolaFull());
    }
    public static void bola(){
        System.out.println("\n  PROGRAM MENGHITUNG VOLUME BOLA");
        System.out.println("====================================");
        System.out.println("1. Volume Setengah Bola");
        System.out.println("2. Volume Bola");
        String chose = output_scan("\nPilih bola untuk dihitung");
        switch (chose) {
            case "1" -> {
                SetengahBola();
            }
            case "2" -> {
                VolumeBolaFull();
            }
            default -> {
                System.out.println("Inputan anda tidak valid.....");
            }
        }
    }
    public static void prisma_segitiga(){
        System.out.println("\n  PROGRAM MENGHITUNG VOLUME PRISMA SEGITIGA");
        System.out.println("===============================================");
        int alas_prisma = Integer.parseInt(output_scan("Masukkan Alas Prisma"));
        int tinggi_alas = Integer.parseInt(output_scan("Masukkan Tinggi Alas"));
        int tinggi_prisma = Integer.parseInt(output_scan("Masukkan Tinggi Prisma"));
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(alas_prisma, tinggi_prisma, tinggi_alas);
        System.out.println("\nHasil Dari Volume Prisma Segitiga Adalah : " + prismaSegitiga.VolumePrisma());
        System.out.println(" ");
    }
    public static void main(String[] args) {
        viewApp();
    }
}