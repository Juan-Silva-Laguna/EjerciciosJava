package repetitivos;


import java.util.*;
public class ejer4_5 {

    public static void main(String[] args) {
      
       double tot;
        for (int x = 1; x <= 365; x++) {
            tot=Math.pow(3, x);
            System.out.println("el dia "+x+" ahorro "+tot);
        }
        
    }
}