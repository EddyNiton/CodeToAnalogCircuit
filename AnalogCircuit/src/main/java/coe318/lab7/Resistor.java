/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Eddy Perez Macias
 */
public class Resistor {
    
    
private int ResNum;
private int node1;
private int node2;
private double ohms;

public Resistor(int num, int n1, int n2, double value){
    ResNum = num;
    node1 = n1;
    node2 = n2;
    ohms = value; 
}
public String getResistorComponent(){
    String format = "R"+ResNum+" "+node1+" "+node2+" "+ohms; 
    return format;
}
}
