package Escalonador;

import Beans.Dado;
import Beans.Transacao;

/**
 *
 * @author kds
 */
public class Escalonador {

    public void lockShared(Dado d, Transacao T){
        if(d.getStatus() == 'U'){
            
        }
    }
    
    public void lockExclusive(Dado d, Transacao T){
        
    }
    
    public void unlock(Dado d, Transacao T){
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
