package com.generation.clase2102.models;
//----------------------------------OBJETO CON ATRIBUTOS------------------------------------------

public class Smartphone {
    public String marca;
	public String modelo;
	public String color;
	public Integer capacidad;
	public String sistemaOperativo;


//-------------------------------------------CONSTRUCTOR--------------------------------------------
public Smartphone() {
    }

public Smartphone(String marca, String modelo, String color, Integer capacidad, String sistemaOperativo){
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.capacidad = capacidad;
    this.sistemaOperativo = sistemaOperativo;
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

//-------------------------------------------FUNCIONALIDADES------------------------------------------

public void llamar(){
    System.out.println("Marca el numero al que quieres llamar");
}

public String escribir(){
   return "Mensaje Enviado";
}

public String grabar(){
    return "Grabando";
}

public String navegarInternet(){
    return "Abrir el Navegador";
}

public String interactuarApp(){
    return "Abrir app";
}

}
