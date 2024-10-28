/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Eddy Perez Macias
 */
public class DC {
private int DCnum;
private int node1;
private int node2;
private double Volts;

public DC(int num, int n1, int n2, double V){
    DCnum = num;
    node1 = n1;
    node2 = n2;
    Volts = V;
}

public String getDComponent(){
    String format = "V"+DCnum +" "+ node1 + " "+ node2 + " " + "DC"+ " "+Volts;
    return format;
}
}
