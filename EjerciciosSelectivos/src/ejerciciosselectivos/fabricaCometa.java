package ejerciciosselectivos;
import java.util.*;
import java.math.*;
import java.io.*;
public class fabricaCometa {
    public static void main(String[] args) {
        int c;
        double mp,mo,gf,cp,pv;
        
         Scanner teclado=new Scanner(System.in);
        
        try
        {
            
            
            System.out.println("clave del articulo");
            c=teclado.nextInt();
            System.out.println("costo materia prima");
            mp=teclado.nextDouble();
            
            if(c==3||c==4)
                {
                    mo=mp*0.75;
                }
            else if(c==1||c==5)
                {
                    mo=mp*0.80;
                }
            else
                {
                    mo=mp*0.85;
                }
            
            System.out.println("la mano de obra es de: "+mo);
            
            if(c==2||c==5)
                {
                    gf=mp*0.30;
                }
            else if(c==3||c==6)
                {
                    gf=mp*0.35;
                }
            else
                {
                    gf=mp*0.28;
                }
            cp=mp+mo+gf;
            pv=cp+(cp*0.045);
           
            System.out.println("costo de produccion "+cp);
            System.out.println("precio de venta "+pv);
            
        }catch (Exception e)
            {
                System.out.println("error de datos de entrada "+e);
            }
    }
}