package BangunRuang;

public class Balok {
    
    static float balokLuas(float p, float l, float t) {
        
        float hasil = 2 * ( (p*l) + ( (p*t) + (l*t)));
        
        return hasil;
    }
    
    static float balokVolume(float p, float l, float t) {
        return p * l * t;
    }
    
}
