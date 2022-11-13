package com.clases;

public abstract class SmartDevice {

    String nombre;
    double memoria;
    double tamanio;

    double precio;
    public SmartDevice() {

    }
    public SmartDevice(String nombre, double memoria, double tamanio, double precio) {

        this.nombre = nombre;
        this.memoria = memoria;
        this.tamanio = tamanio;
        this.precio = precio;
    }
}
