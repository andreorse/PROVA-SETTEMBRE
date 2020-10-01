/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica;

import java.util.Scanner;

/**
 *
 * @author orsenigo_andrea
 */
public class Verifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        System.out.println("DI QUALE CLASSE SI VUOLE VISUALIZZARE L'ORARIO?");
        String classe = input.nextLine();
        DatiCondivisi dc = new DatiCondivisi(classe);
        ThreadCerca tc = new ThreadCerca(dc);
        tc.start();
        tc.join();
        System.out.println(dc.getRis());
    }
    
}
