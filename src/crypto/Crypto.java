/**
 * @author codeBAou
 * Liberia con metodos de encriptacion y manejo de claves
 * 
 */
package crypto;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64; //Descargar Libreria commons-codec-1.14-bin.zip

public class Crypto {
    
    private String secretKey;
    private String base64EncryptedString;
    
    /**
    *Encriptacion MD5 
    *@param texto 
    *@param secret
    */
    public String Set_MD5(String texto,String secret){  
        
        if(secret!=""||secret!=null){
            secretKey=secret;
        }
        
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            base64EncryptedString = new String(base64Bytes);
           
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("set_MD5:"+base64EncryptedString);
        return base64EncryptedString;
    }
    /**
    * Desencriptacion MD5
    * @param textoEncriptado
    * @param secret
    */
    public String Get_MD5(String textoEncriptado,String secret){
        
        this.secretKey=secret;
        
        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");

            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);

            byte[] plainText = decipher.doFinal(message);

            base64EncryptedString = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("get_MD5:"+base64EncryptedString);
        return base64EncryptedString;
    }
    
    public Crypto(){
      String secretKey = "qualityinfosolutions"; //llave para encriptar datos
      String base64EncryptedString = "";
    }
    
}
