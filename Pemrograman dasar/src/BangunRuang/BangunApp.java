package BangunRuang;

import java.util.Scanner;

public class BangunApp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        boolean status = true;
        
        while (status) {
            int nomor1, nomor2;
            
            System.out.println("========== APLIKASI MENGHITUNG BANGUN RUANG ==========");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Bola");
            System.out.println("4. Tabung");
            System.out.println("5. Kerucut");
            System.out.print("Silahkan pilih dari nomor [1-5] : ");
            nomor1 = input.nextInt();
            
            switch (nomor1) {
                case 1: 
                    System.out.println("1. Hitung luas permukaan");
                    System.out.println("2. Hitung volume");
                    System.out.print("Silahkan pilih dari nomor [1-2] : ");
                    nomor2 = input.nextInt();
                    
                    System.out.print("Masukan panjang sisi : ");
                    float sisi = input.nextFloat();
                    
                    if(nomor2 == 1) {
                        System.out.printf("Luas Permukaan Ruang Kubus   : %.0f\n", Kubus.kubusLuas(sisi));
                    } else {
                        System.out.printf("Volume Ruang Kubus   : %.0f\n", Kubus.kubusVloume(sisi));
                    }
                break;
                case 2 :
                    System.out.println("1. Hitung luas permukaan");
                    System.out.println("2. Hitung volume");
                    System.out.print("Silahkan pilih dari nomor [1-2] : ");
                    nomor2 = input.nextInt();
                    
                    System.out.print("Masukan panjang : ");
                    float p = input.nextFloat();
                    
                    System.out.print("Masukan lebar : ");
                    float l = input.nextFloat();
                    
                    System.out.print("Masukan tinggi : ");
                    float t = input.nextFloat();
                    
                    if(nomor2 == 1) {
                        System.out.printf("Luas Permukaan Ruang Balok   : %.0f\n", Balok.balokLuas(p, l, t));  
                    } else {
                        System.out.printf("Volume Bangun Ruang Balok   : %.0f\n", Balok.balokLuas(p, l, t));  
                    }
                break;
                case 3 :
                    System.out.println("1. Hitung luas permukaan");
                    System.out.println("2. Hitung volume");
                    System.out.print("Silahkan pilih dari nomor [1-2] : ");
                    nomor2 = input.nextInt();
                    
                    System.out.print("Masukan panjang jari-jari : ");
                    float jari = input.nextFloat();
                    
                    if(nomor2 == 1) {
                        System.out.printf("Luas Permukaan Ruang Bola    : %.0f\n", Bola.bolaLuas(jari));
                    } else {
                        System.out.printf("Volume Bangun Ruang Bola    : %.0f\n", Bola.bolaVolume(jari)); 
                    }
                break;
                case 4 :
                    System.out.println("1. Hitung luas permukaan");
                    System.out.println("2. Hitung volume");
                    System.out.print("Silahkan pilih dari nomor [1-2] : ");
                    nomor2 = input.nextInt();
                    
                    System.out.print("Masukan panjang jari-jari : ");
                    jari = input.nextFloat();
                    
                    System.out.print("Masukan tinggi : ");
                    float tinggi = input.nextFloat();
                    if(nomor2 == 1) {
                        System.out.printf("Luas Permukaan Ruang Tabung  : %.0f\n", Tabung.tabungLuas(jari, tinggi));
                    } else {
                        System.out.printf("Volume Bangun Ruang Tabung  : %.0f\n", Tabung.tabungVolume(jari, tinggi));
                    }
                break;
                case 5 :
                    System.out.println("1. Hitung luas permukaan");
                    System.out.println("2. Hitung volume");
                    System.out.print("Silahkan pilih dari nomor [1-2] : ");
                    nomor2 = input.nextInt();
                    
                    System.out.print("Masukan panjang jari-jari : ");
                    jari = input.nextFloat();
                                        
                    if(nomor2 == 1) {
                        System.out.print("Masukan panjang garis : ");
                        float pGaris = input.nextFloat();
                        System.out.printf("Luas Permukaan Ruang Kerucut : %.0f\n",Kerucut.kerucutLuas(jari, pGaris));
                    } else {
                        System.out.print("Masukan tinggi : ");
                        tinggi = input.nextFloat();
                        System.out.printf("Volume Ruang Kerucut : %.0f\n",Kerucut.kerucutVolume(jari, tinggi));
                    }
                break;
                default : 
                    System.out.println("Maaf input yang anda masukan salah");
            }
            
            System.out.print("Apakah lagi [y/n] ? ");
            char cek = input.next().charAt(0);

            if (cek == 'y' || cek == 'Y') {
                status = false;
            }
        }                                 
        
    }
}
