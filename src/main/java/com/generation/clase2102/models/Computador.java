package com.generation.clase2102.models;

/* 
//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------


public class Computador {
    public String marca;
	public String modelo;
	public String color;
	public Integer capacidad;
	public String sistemaOperativo;
    public Integer tamanio;
    public String procesador;

//-------------------------------------------CONSTRUCTOR---------------------------------------------

    public Computador() {
    }

    public Computador(String marca, String modelo, String color, Integer capacidad, String sistemaOperativo,
            Integer tamanio, String procesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.capacidad = capacidad;
        this.sistemaOperativo = sistemaOperativo;
        this.tamanio = tamanio;
        this.procesador = procesador;
    }

//-------------------------------------------GETTER AND SETTER---------------------------------------


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public Integer getCapacidad() {
        return capacidad;
    }


    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }


    public String getSistemaOperativo() {
        return sistemaOperativo;
    }


    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }


    public Integer getTamanio() {
        return tamanio;
    }


    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }


    public String getProcesador() {
        return procesador;
    }


    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }


//-------------------------------------------FUNCIONALIDADES-----------------------------------------


public String navegarInternet(){
    return "Abrir el Navegador";
}

public String interactuarApp(){
    return "Abrir app";
}

public String reproducirContenido(){
    return "Pongale play pariente";
}

}

*/

public class Computador extends ArticuloElectronico{
    public Integer capacidad;
    public String procesador;

    public Computador() {
        super();
    }
    public Computador(String marca, String modelo, String color, String sistemaOperativo, Integer tamanio,
            Boolean bluetooth, Integer capacidad, String procesador) {
        super(marca, modelo, color, sistemaOperativo, tamanio, bluetooth);
        this.capacidad = capacidad;
        this.procesador = procesador;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void jugar(){
        System.out.println("Abrir Warzone");
    }

    @Override
    public String toString() {
        return super.toString()+ "{capacidad=" + capacidad + ", procesador=" + procesador + "}";
    }

    
}