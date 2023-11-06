package BangunRuang;

public class Tabung {
    
    static float phi = 3.14f;

    static float tabungLuas(float jari, float tinggi) {
        
        float hasil = 2 * phi * jari + ( jari + tinggi);
        
        return hasil;
    }
    
    static float tabungVolume(float jari, float tinggi) {
        return phi * jari * jari * tinggi;
    }
    
}
