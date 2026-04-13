package com.mycompany.main;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;
/**
 *
 * @author Tshegofatso Bogale 
 */
public class Main {

    public static void main(String[] args) {
              Scanner scanner =new Scanner(System.in);
       
        //declaration
        String username = null;
        String password = null;
        String cellPhoneNumber;
        String firstName;
        String lastName;
        String inputusername;
        String inputpassword;
        
       boolean isValid =false;
       //first and Last name 
        System.out.println("Enter firstname:");
        firstName =scanner.nextLine();
        
        System.out.println("Enter lastname:");
        lastName = scanner.nextLine();
    
        while(!isValid){
        System.out.println("Enter username: ");
        System.out.println("Username must contain an underscore and is no more than five characters long .");
        username=scanner.nextLine();
        
        //username conditions 
       
       if(username.contains("_")& username.length() <=5){
           isValid=true;
           System.out.println("Username successfully captured");
        
    }else{
           System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length");
        
       }
        }
       isValid=false;
       
       
      while(!isValid){
        System.out.println("Enter password ");
        System.out.println("The password must be:At least eight charecters long ;Contain a capital letter ;Contain a number ;Contain a special charecter .");
        password =scanner.nextLine();
        
        //password conditions 
       if(password.length()>= 8 &&
          password.matches(".*[0-9].*") &&
          password.matches(".*[A-Z].*") &&
          password.matches(".*[!@#$^&*()].*")){
           System.out.println("Password succesfully captured");
          isValid = true;
           
       }else{
           System.out.println("Password is not correctly formatted;please ensure that the that password contains at least eight characters ,a capital letter,a number,and a special charecter.");
       }
      }
       isValid =false;
       String regex ="\\+27\\d{9}";
        
        while(!isValid){
        System.out.println("Enter cellphone number ");
        System.out.println("Should contain international code +27");
        cellPhoneNumber =scanner.nextLine();
        
        //cell phone number conditions 
        
        if (cellPhoneNumber.matches(regex) && cellPhoneNumber.contains("+27")&&cellPhoneNumber.substring(3).length() <=10){
           System.out.println("cell phone number successfully added ");
           isValid =true;
            
        }else{
            System.out.println("cell phone number incorrectly formatted or does not contain international code");
            System.out.println("Registration successful!/n ");
        }
       }
        isValid = false;
        
        
       //login
       while(!isValid){
        System.out.println("===Login===");
        
        System.out.println("Enter username:");
        inputusername =scanner.nextLine();
        
        System.out.println("Enter password");
        inputpassword =scanner.nextLine();
        
        //check login
        
        if(inputusername.matches(username) && inputpassword.equals(password)){
            System.out.println("Welcome" + " " + firstName + " " + lastName +",it is great to see you again.");
            isValid =true;
            
        }else{
            System.out.println("Username or password incorrect,please try again.");
            
           
        }
       }
       
        
        
        
    }
}

      

