package passcry;
import crypto.Crypto;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Passcry {
    
    public static void main(String[] args) {
        
        Crypto crypto=new Crypto();
        interfaz gui=new interfaz();
        gui.setVisible(true);
        
        gui.btnEn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
               
                gui.textRes.setText(crypto.Set_MD5(gui.TextReq.getText(),gui.labelPass.toString()));
            }  
        });
         
        gui.btnDes.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                gui.textRes.setText(crypto.Get_MD5(gui.TextReq.getText(),gui.labelPass.toString()));
            }  
        }); 
        
    }
    
}
