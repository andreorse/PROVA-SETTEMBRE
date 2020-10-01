/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica;

/**
 *
 * @author orsenigo_andrea
 */
public class ThreadCerca extends Thread{
    private DatiCondivisi dc;
    //private int n;
    
    public ThreadCerca(DatiCondivisi dc){
        this.dc = dc;
        //this.n = n;
    }
    
    @Override
    public void run(){
        String classe = dc.getClasse();
        String ris = "";
        String orario[] = dc.getVect();
        String ore[];
        for(int j=1; j<35; j++){
            ris+=" - ";
            for(int i=0; i<orario.length; i++){
                ore = orario[i].split(",");
                if(ore[j].equals("classe"))
                    ris+=" "+ore[0]+" ";
            }   
        }
        dc.setRis(ris);
    }
}
