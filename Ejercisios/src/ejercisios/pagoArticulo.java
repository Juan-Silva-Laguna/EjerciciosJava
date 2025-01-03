package ejercisios;

import java.util.*;
import java.math.*;
public class pagoArticulo {
    public static void main(String[] args) {
        double pago, precio, precioDesc, iva, total;
         Scanner teclado=new Scanner(System.in);
        System.out.println("Precio del producto");
        precio=teclado.nextDouble();
        precioDesc=(precio*20)/100;
        precioDesc=precio-precioDesc;
        iva=(precio*15)/100;
        total=(precioDesc+iva);
        System.out.println("el precio con el descuento aplicado es de: "+precioDesc);
        System.out.println("el precio con el descuento e iva aplicado es de: "+total);
    }
}
