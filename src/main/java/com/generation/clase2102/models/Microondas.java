package com.generation.clase2102.models;

//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------
public class Microondas {
    public String marca;
	public String modelo;
	public Double potencia;
	public Double capacidad;
	public Double consumo;
    
//-------------------------------------------CONSTRUCTOR---------------------------------------------
    public Microondas() {
    }

    public Microondas(String marca, String modelo, Double potencia, Double capacidad, Double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.capacidad = capacidad;
        this.consumo = consumo;
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

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }
    
//-------------------------------------------FUNCIONALIDADES-----------------------------------------
    
public String calentar(){
    return "Su comida esta caliente";
}

public String descongelar(){
    return "Su comida esta Descongelada";
}

public String cocinar(){
    return "Su comida se esta cocinando";
}

public String cronometro(){
    return "Iniciar Cronometro";
}

    
}




