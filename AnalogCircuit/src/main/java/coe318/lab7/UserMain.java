/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Eddy Perez Macias
 */
public class UserMain {
private ArrayList<Resistor> resistors;
private ArrayList<DC> dcs; 
    

 public UserMain(){
resistors = new ArrayList<Resistor>(); 
dcs = new ArrayList<DC>(); 
}
 
public void addRes(Resistor res){
    resistors.add(res);
}

public void addDC(DC d){
    dcs.add(d);
}
    public static void main(String[] args) {
        UserMain userMain = new UserMain();
        Scanner scanner = new Scanner(System.in);
        
        
        String end = " ";
        int ResNum = 1;
        int DCNum = 2;
        
        while(end != "end"){
        System.out.println(" Enter an Electrical Compnent:  ");
        String input = scanner.nextLine();
        
        // Split the input string using whitespace as the delimiter.
        String[] component = input.split("\\s+");

        // Now 'values' is an array containing individual components.
        // You can access them by index.

        // Assuming the input format is fixed with four values: "r 0 2 2.0"
        if (component.length == 4) {
            String letter = component[0];
            int node1 = Integer.parseInt(component[1]);
            int node2 = Integer.parseInt(component[2]);
            double Value = Double.parseDouble(component[3]);
            
            if (letter.equals("r")) {
                    Resistor resistor = new Resistor(ResNum, node1, node2, Value);
                    userMain.addRes(resistor);
                    ResNum++;
                }
            
            if (letter.equals("v")) {
                    DC dc = new DC(DCNum, node1, node2, Value);
                    userMain.addDC(dc);
                    DCNum++;
                }
                     
        }else if("spice".equals(component[0])) {
         
         for (Resistor res : userMain.resistors) {
                    System.out.println(res.getResistorComponent());
            
         }
         for (DC dc : userMain.dcs){
             System.out.println(dc.getDComponent());
         }
         
        }else if("end".equals(component[0])){
         System.out.println("THE END");
         break;
            
            
        }else{
         System.out.println("Input format is not as expected.");    
        }
       
    }
    }
}
