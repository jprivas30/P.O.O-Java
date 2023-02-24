package com.generation.clase2102.models;

/* 

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

*/

//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------

public class SmartTV extends ArticuloElectronico{
    public String resolucion;
    public String tipoDePantalla;
    public Boolean controlVoz;

//-------------------------------------------CONSTRUCTOR---------------------------------------------

public SmartTV() {
    super();
}
public SmartTV(String marca, String modelo, String color, String sistemaOperativo, Integer tamanio,
        Boolean bluetooth, String resolucion, String tipoDePantalla, Boolean controlVoz) {
    super(marca, modelo, color, sistemaOperativo, tamanio, bluetooth);
    this.resolucion = resolucion;
    this.tipoDePantalla = tipoDePantalla;
    this.controlVoz = controlVoz;
}


//-------------------------------------------GETTER AND SETTER---------------------------------------

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
public Boolean getControlVoz() {
    return controlVoz;
}
public void setControlVoz(Boolean controlVoz) {
    this.controlVoz = controlVoz;
}

//-------------------------------------------FUNCIONALIDADES-----------------------------------------

public void reproducir(){
    System.out.println("Reproducir Youtube y Netflix :p");
}


@Override
public String toString() {
    return "SmartTV \n" + super.toString() + " {resolucion=" + resolucion + ", tipoDePantalla=" + tipoDePantalla + ", controlVoz=" + controlVoz
            + "}";
}
}