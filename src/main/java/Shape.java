/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthewortega
 */
public class Shape {
    int brdrWidth; 
    String brdrColor;
    
    public Shape(){
        brdrWidth=10;
        brdrColor="BLUE";
    }
    public Shape(int b, String c){
        brdrWidth=b;
        brdrColor=c;
    }
    public void setBrdrWidth(int b){
        brdrWidth=b;
    }
    public int getbrdrWidth(){
        return brdrWidth;
    }
}
