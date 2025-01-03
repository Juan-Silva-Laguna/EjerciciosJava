package repetitivos;


import java.util.*;
public class ejer4_3 {

    public static void main(String[] args) {
       int ig=0,mas=0,men=0,can,num;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos numeros son?");
        can=teclado.nextInt();
        
        for (int x = 1; x < can+1; x++) {
            System.out.println("ingrese valor de numero: "+x);
            num=teclado.nextInt();
            if(num==0){
                ig=ig+1;
            }
            else if (num>0) {
                mas=mas+1;
            }
            else{
                men=men+1;
            }
        }
        System.out.println("los iguales a cero son: "+ig);
        System.out.println("los mayores a cero son: "+mas);
        System.out.println("los menores a cero son: "+men);
    }
    
}
