package repetitivos;


import java.util.*;
public class ejre4_22 {

    public static void main(String[] args) {
        int cli;
        double salac,pagmin,pagnin,multa,inte,intemas=0,salant,comp,depo;
    
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos clientes son?");
        cli=teclado.nextInt();
        for (int x = 1; x <= cli; x++) {
            System.out.println("monto de las compras que realizo:");
        comp=teclado.nextDouble();
        System.out.println("saldo anterior:");
        salant=teclado.nextDouble();
        System.out.println("cuanto deposito en el corte anterior:");
        depo=teclado.nextDouble();
        if (depo*0.15>comp) {
            inte=salant*0.12;
            multa=200;
        }
        else{
            inte=0;
            multa=0;
        }
        intemas=intemas+inte;
        salac=salant+comp-depo+inte+multa;
        pagmin=salac*0.15;
        pagnin=salac*0.85;
        System.out.println("pago minimo para el cliente "+x+" es de $"+pagmin);
        System.out.println("pago para no generar intereses con el cliente "+x+" es de  $"+pagnin);
        System.out.println("saldo actual de el cliente "+x+" es de "+salac); 
        }
        System.out.println("ganancia por clientes moros es de $"+intemas);
    }
}