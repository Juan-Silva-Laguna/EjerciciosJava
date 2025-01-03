package repetitivos;


import java.util.*;
public class ejer4_10 {

    public static void main(String[] args) {
       int cant,y,edad;
       double tot=0,sal,acum=0;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos salones tiene la escuela");
        cant=teclado.nextInt();
        
        for (int x = 1; x <= cant; x++) {
            System.out.println("ingrese cantidad de estudiantes de el salon "+x);
            y=teclado.nextInt();
            for (int i = 1; i <= y; i++) {
                System.out.println("ingrese edad de aprendiz "+i+" de el salon "+x);
                edad=teclado.nextInt();
                tot=edad/y;
                
            }
            System.out.println("edad promedio de salon "+x+" es "+tot);
            
            sal=tot/cant;
            acum=acum+sal;
        }
        System.out.println("la edad promedio de toda la escuela es de "+acum);
    }
}