package passcry;
import crypto.Crypto;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Passcry {
    
    public static void main(String[] args) {
        
        Crypto crypto=new Crypto();
        interfaz gui=new interfaz();
        gui.setVisible(true);
        
        //CLOSE
        gui.btnCLOSE.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
                System.exit(0); 
                gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);
                System.out.println("Click CLOSE");
            }
        });
        //ENCRIPT
        gui.btnEn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
               char[] pass=gui.labelPass.getPassword();
               String password="";
               for(char x : pass){
                   password+=x;
               }
               gui.textRes.setText(crypto.Set_MD5(gui.TextReq.getText(),password));
            }  
        });
        //DECRIPT
        gui.btnDes.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){   
               char[] pass=gui.labelPass.getPassword();
               String password="";
               for(char x : pass){
                   password+=x;
               }
               gui.textRes.setText(crypto.Get_MD5(gui.TextReq.getText(),password));
            }  
        }); 
        
    }
    
}
