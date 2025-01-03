
import java.util.*;
import java.math.*;
public class ejer4_11 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double ka=70,kb=160,dis;
        dis=kb-ka;
        while(dis>0){
            ka=ka+1;
            kb=kb-1;
            dis=kb-ka;
        }
        if (dis==0) {
            ka=kb;
        }
        else{
            ka=ka-0.5;
        }
        System.out.println("punto de encuentro es igual a "+ka);
                
    }
}

