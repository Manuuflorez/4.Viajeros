/*Leer la cantidad de personas que viajan, el valor por persona que viajan a 
Cartagena y luego imprimir:
Valor bruto del viaje
Valor del IVA (19%), preguntar si tiene o no IVA
Descuento: el descuento es del 10% sobre el valor bruto, preguntar si tiene o 
no descuento
Valor neto del viaje
Nota: utilizar para cada uno un método
 */
package pkg4.viajeros;

import java.util.Scanner;

public class Viajeros {

    public static void main(String[] args) {
        System.out.println("Cuantas personas van a viajar?");
        int CantPersonas = new Scanner(System.in).nextInt();
        System.out.println("Cual es el valor del viaje por persona?");
        int ValorViaje = new Scanner(System.in).nextInt();
        Precios objPrecios = new Precios(CantPersonas, ValorViaje);
        objPrecios.ValorBruto();
        System.out.println("Este viaje tiene IVA?");
        System.out.println("1.Si");
        System.out.println("2.No");
        int OpcionIva = new Scanner(System.in).nextInt();
        objPrecios.IVA(OpcionIva);
        System.out.println("Este viaje tiene descuento?");
        System.out.println("1.Si");
        System.out.println("2.No");
        int OpcionDescuento = new Scanner(System.in).nextInt();
        objPrecios.Descuento(OpcionDescuento);
        System.out.println("El valor total del viaje es: " + objPrecios.ValorNeto(OpcionIva, OpcionDescuento));
    }

}
