/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modell;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public abstract class Jarmu {
    private boolean beinditva ;
    private boolean uzemanyag ;
    private boolean megerkezett ;
    
    public Jarmu() {
        setBeinditva(false);
        setUzemanyag(true);
        setMegerkezett(false);
    }

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        setBeinditva(beinditva);
        setUzemanyag(uzemanyag);
        setMegerkezett(megerkezett);
    }
    
    public void beiindit(){
        beinditva = true;
    }
    public void leallit(){
        beinditva = false;
    }
    public boolean tankol(){
        if(beinditva == false){
            return true;
        }
        return false;
    }
    public boolean halad(){
        return true;
    }

    public boolean isBeinditva() {
        return beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }

    public void setBeinditva(boolean beinditva) {
        this.beinditva = beinditva;
    }

    public void setUzemanyag(boolean uzemanyag) {
        this.uzemanyag = uzemanyag;
    }

    public void setMegerkezett(boolean megerkezett) {
        this.megerkezett = megerkezett;
    }
    
    
}
