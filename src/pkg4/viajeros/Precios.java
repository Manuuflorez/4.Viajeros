package pkg4.viajeros;

/*Leer la cantidad de personas que viajan, el valor por persona que viajan a 
Cartagena y luego imprimir:
Valor bruto del viaje
Valor del IVA (19%), preguntar si tiene o no IVA
Descuento: el descuento es del 10% sobre el valor bruto, preguntar si tiene o 
no descuento
Valor neto del viaje
Nota: utilizar para cada uno un método
 */
public class Precios {

    int CantPersonas;
    int ValorViaje;

    public Precios(int CantPersonas, int ValorViaje) {
        this.CantPersonas = CantPersonas;
        this.ValorViaje = ValorViaje;
    }

    public int ValorBruto() {
        int valorBruto = CantPersonas * ValorViaje;
        return valorBruto;
    }

    public int IVA(int OpcionIva) {
        int Iva = 0;
        if (OpcionIva == 1) {
            Iva = (ValorBruto() * 19) / 100;
        } else if (OpcionIva == 2) {
            Iva = 0;
        }
        return Iva;
    }

    public int Descuento(int OpcionDescuento) {
        int descuento = 0;
        if (OpcionDescuento == 1) {
            descuento = (ValorBruto() * 10) / 100;
        } else if (OpcionDescuento == 2) {
            descuento = 0;
        }
        return descuento;
    }

    public int ValorNeto(int OpcionIva, int OpcionDescuento) {
        int valorNeto = ValorBruto() + IVA(OpcionIva) - Descuento(OpcionDescuento);
        return valorNeto;
    }
}
