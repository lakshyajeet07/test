
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naman
 */
public class Progress implements Runnable{
    
    JProgressBar jpb ;
    
    public Progress (JProgressBar jpb)
    {
        this.jpb=jpb;
        Thread obj = new Thread (this);
        obj.start();
        
        
        
    }
    public void run()
    {
        for (int i=0 ; i<=100 ;i++)
        {
            jpb.setValue(i);
            try
            {
                Thread.sleep(20);
            }
            catch(InterruptedException a){}
        }
        HomePage hp = new HomePage();
        hp.setVisible(true);
    }
    
    
    
}
