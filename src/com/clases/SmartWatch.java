package com.clases;

public class SmartWatch extends SmartDevice {

    public SmartWatch(String nombre, double memoria, double tamanio, double precio) {
        super(nombre, memoria, tamanio, precio);
        imprimirWatch();

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "nombre='" + nombre + '\'' +
                ", memoria=" + memoria +
                ", tamanio=" + tamanio +
                ", precio=" + precio +
                '}';
    }
    public void imprimirWatch() {
        System.out.println(toString());
    }
}
