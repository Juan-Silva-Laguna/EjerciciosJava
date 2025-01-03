

package evaluacion;
import java.util.*;
public class problema_2 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int num,i,tot;
      
        int numero[] = new int [23];
       numero[0]=0;
       numero[1]=1;
       numero[2]=2;
       numero[3]=3;
       numero[4]=4;
       numero[5]=5;
       numero[6]=6;
       numero[7]=7;
       numero[8]=8;
       numero[9]=9;
       numero[10]=10;
       numero[11]=11;
       numero[12]=12;
       numero[13]=13;
       numero[14]=14;
       numero[15]=15;
       numero[16]=16;
       numero[17]=17;
       numero[18]=18;
       numero[19]=19;
       numero[20]=20;
       numero[21]=21;
       numero[22]=22;
       
       String dni[]= new String [23];
       dni[0]="T";
       dni[1]="R";
       dni[2]="W";
       dni[3]="A";
       dni[4]="G";
       dni[5]="M";
       dni[6]="Y";
       dni[7]="F";
       dni[8]="P";
       dni[9]="D";
       dni[10]="X";
       dni[11]="B";
       dni[12]="N";
       dni[13]="J";
       dni[14]="Z";
       dni[15]="S";
       dni[16]="Q";
       dni[17]="V";
       dni[18]="H";
       dni[19]="L";
       dni[20]="C";
       dni[21]="K";
       dni[22]="E";
       
       System.out.println("Ingrese el DNI : ");
                num = teclado.nextInt();
                
                //tot=Double.valueOf(num/23).intValue();
                tot=num%23;
                for (i = 0; i < 23; i++) {
                    
                    if (tot==numero[i]) {
                        System.out.println("El numero DNI junto con su respectiva letra quedaria asi: "+num+"-"+dni[i]);
                    }
                 }
                
       
        
    }

}