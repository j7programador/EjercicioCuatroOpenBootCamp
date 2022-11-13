package com.clases;

public class SmartPhone extends SmartDevice {

    String numero;

    public SmartPhone(String nombre, double memoria, double tamanio, double precio, String numero) {
        super(nombre, memoria, tamanio, precio);
        this.numero = numero;
        imprimirPhone();
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numero='" + numero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", memoria=" + memoria +
                ", tamanio=" + tamanio +
                ", precio=" + precio +
                '}';
    }
    public void imprimirPhone() {
        System.out.println(toString());
    }
}
