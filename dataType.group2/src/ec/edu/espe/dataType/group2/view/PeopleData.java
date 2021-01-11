package ec.edu.espe.dataType.group2.view;

import ec.edu.espe.filemanager.utils.Data;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Group2
 */

public class PeopleData {
    
    public static void main(String[] args) throws InterruptedException {
        
       Scanner sn = new Scanner(System.in);
       boolean exit = false;
       int option;
       
       while(!exit){
           System.out.println("******MENU*******");
           System.out.println("\n1. Save Data");
           System.out.println("2. Find Data");          
           System.out.println("3. Exit");
           
           try{
           
           System.out.print("\nEnter one of the options: ");
           option = sn.nextInt();

           switch(option){
               
               case 1:
                   
                   InformationData object1 = new InformationData();
                   object1.DataOut();                   
                   object1.getName();
                   object1.getAge();
                   object1.getTelephone();
                   object1.getSubject();
                   object1.getAverage();
                   object1.getGender();
                   String dataToSave   =  object1.getName()+","+object1.getAge()+","+object1.getTelephone()+","
                                         +object1.getSubject()+","+object1.getAverage()+","+object1.getGender();
                   System.out.println(" ");
                   Data.save("Group2.csv", dataToSave);
                   System.out.println(" ");                  
                   break;
                   
               case 2:
                   File file = new File("Group2.csv");
                   Scanner keyboard = new Scanner(System.in);
                   System.out.println(" ");
                   System.out.print("\nEnter the word to find in the file: ");
                   String data = keyboard.nextLine();
                   System.out.println("");
                   Data.find(file, data);
                   System.out.println(" ");
                   break;
                   
               case 3:
                   System.out.println("\nThanks!!!");
                   exit=true;
                   System.out.println(" ");
                   break;
                       
               default:
                   System.out.println("\nOnly numbers between  1 - 3");
                   System.out.println(" ");
                   }
            } catch (InputMismatchException e) {
                System.out.println("\nYou must insert a number!!");                   
           } 
       }
    }    
}
