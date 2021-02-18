/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author nicolas
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int day=16, month=5, year=2000;
       String stDat=Cumple(day,month,year);
        System.out.println("mi cumple " + stDat);
       
    }

    private static String Cumple(int day, int month, int year) {
       String[] ArrayWeek = {"Sunday", "Monday","Tuesday","Wensday","Thursday","Friday","Sturday"};
       int a,y,m,d;
       a =(14 - month) / 12;
       y= year - a;
       m = month + 12 * a - 2;
       d = (day + y + y / 4 -y /100 + y /400 + (31 * m) /12) %7;
       return ArrayWeek[d];
    }
    
}
