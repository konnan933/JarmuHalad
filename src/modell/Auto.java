
package modell;


public class Auto extends Jarmu{
    private boolean defekt;

    public Auto () {
        super();
        this.defekt = false;
    }
    
    public Auto(boolean defekt) {
        this.defekt = defekt;
    }
    
    public void kereketCsere(){
        defekt = false;
    }
    
    @Override
    public boolean halad(){
        if(Math.random() < 0.25){
            defekt = true;
        }else{
            setMegerkezett(true);
        }
        return true;
    }
}
