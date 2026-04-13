/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Tsheg
 */
public class login {
  public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         
        //Registration
        
        System.out.println("=== Register === ");
        
        System.out.println("Enter first name: ");
        String firstName = input.nextLine();
        
        System.out.println("Enter last name: ");
        String lastName = input.nextLine();
        
        System.out.println("create username: ");
        String storedUsername = input.nextLine();
        
        System.out.println("Create password: ");
        String storedPassword = input.nextLine();
        
        System.out.println("/nRegistration successful!/n");
        
        
        //login
        System.out.println("=== Login ===");
        
        System.out.println("Enter username: ");
        String username = input.nextLine();
        
        System.out.println("Enter password:");
        String password = input.nextLine();
        
        //login conditions 
        if(username.equals( storedUsername) && password.equals(storedPassword)){
            
            //True message 
            System.out.println("Welcome" + firstName + " " + lastName +", it is great to see you again .");
        }else{
            //False message
            System.out.println("Username or Password incorrect,please try again.");
        }
        
        
    }
    
}
