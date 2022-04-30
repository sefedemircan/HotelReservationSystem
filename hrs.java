package javaapplication14;

import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;


public class JavaApplication14 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---HOTEL RESERVATİON SYSTEM---");
        
        String checkin;
        String checkout;
        String room;
        int adult;
        int children;
        long price = 0;
        long result2 = 0;
        
       
        System.out.println("Check in: ");
        checkin = scan.next();
        
       
        System.out.println("Check out: ");
        checkout = scan.next();
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
 
         
 try {
     Date date1 = myFormat.parse(checkin);
     Date date2 = myFormat.parse(checkout);
     
     long result = date2.getTime() - date1.getTime();
     result2 = result/(24*60*60*1000);
     
      
 } catch (ParseException e) {
     e.printStackTrace();
 }
        
        System.out.println("---GUEST---");
        System.out.println("Adult: ");
        adult=scan.nextInt();
        
        
        if(adult==0){
            System.out.println("Please enter a valid number!");
            System.exit(0);
        }
        else{
            price = (adult)*1000*(result2);
        }
        System.out.println("Children: ");
        children=scan.nextInt();
        
        
        if(children==0){
            price = (adult)*1000*(result2);
        }
        else{
            price = ((children) * 500)+((adult)*1000);
        }
           
        
        System.out.println("Choose room");
        System.out.println("Standart, Junior, Senior");
        room = scan.next();
        
        
        if(room.equals("Junior")){
            price=(price)*2;
        }
        else if(room.equals("Senior")){
            price = (price)*4;
        }
        else{
            price = (price)*1;
        }
        
        
        System.out.println("Check in:"+checkin);
        System.out.println("Check out:"+checkout);
        
        
        System.out.println("Adult:"+adult);
        System.out.println("Children:"+children);
        
        
        System.out.println("Day:"+result2);
        
        System.out.println("Room:"+room);
        
        System.out.println("Price:"+price);
        
            
    }
    
        
}
