package Security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Encrypter {
    public static String convertirSHA256(String password){
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

        byte[] hash = md.digest(password.getBytes());
        StringBuffer sb = new StringBuffer();

        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }

    public static void Encryp(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dato a encriptar:  ");
        password= sc.nextLine();
        String PassFinal= convertirSHA256(password);
        System.out.println("Contraseña cifrada --> "+ PassFinal);
    }

}