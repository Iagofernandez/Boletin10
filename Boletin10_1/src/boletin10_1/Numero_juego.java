/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
class Numero_juego {
    int numero, intentos, numAcertar, juegoNumero=0;
    public void Juego(){}
    
    public void persona1(){
        int numIntentos;
        int numAcertar1=Integer.parseInt(JOptionPane.showInputDialog(null, "Primera persona\n numero a acertar entre 1 y 50"));
        
        while(numAcertar1<1||numAcertar1<50){
             numAcertar=Integer.parseInt(JOptionPane.showInputDialog(null, "Primera persona\n numero a acertar entre 1 y 50"));
            
        }
        
        numAcertar=numAcertar1;
        numIntentos=Integer.parseInt(JOptionPane.showInputDialog(null, "Primera persona\n cuantos intentos tiene el segundo jugador"));
        intentos=numIntentos;
    }
    public void persona2(){
        int numAcertar2, numIntentos2;
        for(numIntentos2=1;numIntentos2<=intentos;numIntentos2++){
            numAcertar2=Integer.parseInt(JOptionPane.showInputDialog(null, "Segunda persona\n Introduce un número entre 1 y 50"));
            
            while(numAcertar2<1||numAcertar2>50){
            numAcertar2=Integer.parseInt(JOptionPane.showInputDialog(null, "Segunda persona\n Introduce un número entre 1 y 50"));
            }
            if (numAcertar2<numAcertar){
                JOptionPane.showInputDialog(null,"Te has quedado corto, vuelve a intentarlo");
            }
            
            else if(numAcertar>numAcertar){
                JOptionPane.showInputDialog(null, "Te has pasado, vuelve a intentarlo");
            }
            
            else {
                JOptionPane.showInputDialog(null, "Acierto");
                break;
            }
            if(numIntentos2>intentos);
            JOptionPane.showInputDialog(null, "No quedan más intentos");
        }
    }
    public void juegoNumero(){
        while (juegoNumero>=0){
            persona1();
            persona2();
            juegoNumero=JOptionPane.showOptionDialog(null, "Comienzo de partida","juegoNumero",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }
    }
}
