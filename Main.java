package konstruktuor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Username : ");
        String usr = input.nextLine();
        System.out.print("Masukkan Password : ");
        String pass = input.nextLine();
        
        User sosok = new User();
        
        sosok.setId(usr, pass);
        
        System.out.println("Username : " + sosok.getUsername());
        System.out.println("Password : " + sosok.getPassword());
    }
}
