package com.generation.clase2102.models;

//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------
public class SmartTV {

    public String marca;
    public String modelo;
    public Double tamanio;
    public String resolucion;
    public String tipoDePantalla;

//-------------------------------------------CONSTRUCTOR---------------------------------------------

public SmartTV() {
}
public SmartTV(String marca, String modelo, Double tamanio, String resolucion, String tipoDePantalla) {
    this.marca = marca;
    this.modelo = modelo;
    this.tamanio = tamanio;
    this.resolucion = resolucion;
    this.tipoDePantalla = tipoDePantalla;
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
public Double getTamanio() {
    return tamanio;
}
public void setTamanio(Double tamanio) {
    this.tamanio = tamanio;
}
public String getResolucion() {
    return resolucion;
}
public void setResolucion(String resolucion) {
    this.resolucion = resolucion;
}
public String getTipoDePantalla() {
    return tipoDePantalla;
}
public void setTipoDePantalla(String tipoDePantalla) {
    this.tipoDePantalla = tipoDePantalla;
}



//-------------------------------------------FUNCIONALIDADES-----------------------------------------

public String reproducirContenido(){
    return "Pongale play pariente";
}

public String navegarPorInternet(){
    return "Googlealo";
}

public String senalAbierta(){
    return "Ingresa tu canal favorito";
}

public String streaming(){
    return "Netflix o Youtube";
}


}
