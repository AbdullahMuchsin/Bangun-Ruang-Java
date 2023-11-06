package BangunRuang;

public class Kerucut {
    
    static float phi = 3.14f;
    
    static float kerucutLuas(float jari, float panjangGaris) {
                
        float hasil = phi * jari * ( jari + panjangGaris );
        
        return hasil;
    }
    
    static float kerucutVolume(float jari, float tinggi) {
        return (1f/3f) * phi * jari * jari * tinggi;
    }
    
    
}
