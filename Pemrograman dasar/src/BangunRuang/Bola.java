package BangunRuang;

public class Bola {
    
    static float phi = 3.14f;
    
    static float bolaLuas(float jari) {
        
        float hasil = 4 * phi * jari * jari;
        
        return hasil;
    }
    
    static float bolaVolume(float jari) {
        return (4f/3f) * phi * jari * jari * jari;
    }
}
