
package test;

import modell.Auto;

public class JarmuvekTest {
    public static void main(String[] args) {
        new JarmuvekTest();
    }
    
       public JarmuvekTest(){
           //mintaTest();
           haladTest();
           defektTest();
           beertTest();
           uzemanyagTest();
       }

    private void mintaTest() {
        int kapott = 7;
        int vart = 3;
        
        assert kapott == vart : "nem egyeznek";
    }

    private void haladTest() {
           Auto auto = new Auto();
           boolean kapott = auto.halad();
           boolean vart = true;
           assert kapott == vart : "nem halad";
    }
    
    private void defektTest() {
           Auto auto = new Auto();
           auto.halad();
           boolean kapott = auto.isDefekt();
           boolean vart = false;
           assert kapott == vart : "Defektes";
    }
    private void beertTest() {
           Auto auto = new Auto();
           auto.halad();
           boolean kapott = auto.isMegerkezett();
           boolean vart = true;
           assert kapott == vart : "Nem érkezett meg";
    }
    private void uzemanyagTest() {
           Auto auto = new Auto();
           auto.halad();
           boolean kapott = auto.isUzemanyag();
           boolean vart = true;
           assert kapott == vart : "Nincs benne uzem anyag";
    }
}
