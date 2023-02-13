
package modell;


public class Auto {
    private boolean defekt;

    public Auto() {
        this.defekt = false;
    }
    
    public Auto(boolean defekt) {
        this.defekt = defekt;
    }
    
    public void kereketCsere(){
        defekt = true;
    }
    public boolean halad(){
        return true;
    }
}
