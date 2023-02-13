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

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
    }
    
    public void beiindit(){
    
    }
    public void leallit(){
    
    }
    public boolean tankol(){
        return true;
    }
    public boolean halad(){
        return true;
    }
}
