package com.generation.clase2102.models;

public class Audifonos {
//----------------------------------OBJETO CON ATRIBUTOS---------------------------------------------

public String marca;
public Double tamanio;
public String tipoDeConexion;
public Boolean cancelacionDeRuido;
public String color;

//-------------------------------------------CONSTRUCTOR---------------------------------------------
public Audifonos() {
}

public Audifonos(String marca, Double tamanio, String tipoDeConexion, Boolean cancelacionDeRuido, String color) {
    this.marca = marca;
    this.tamanio = tamanio;
    this.tipoDeConexion = tipoDeConexion;
    this.cancelacionDeRuido = cancelacionDeRuido;
    this.color = color;
}

//-------------------------------------------GETTER AND SETTER---------------------------------------

public void escuchar(){
    System.out.println("Inserte su rolita favorita");
}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public Double getTamanio() {
    return tamanio;
}

public void setTamanio(Double tamanio) {
    this.tamanio = tamanio;
}

public String getTipoDeConexion() {
    return tipoDeConexion;
}

public void setTipoDeConexion(String tipoDeConexion) {
    this.tipoDeConexion = tipoDeConexion;
}

public Boolean getCancelacionDeRuido() {
    return cancelacionDeRuido;
}

public void setCancelacionDeRuido(Boolean cancelacionDeRuido) {
    this.cancelacionDeRuido = cancelacionDeRuido;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

//-------------------------------------------FUNCIONALIDADES-----------------------------------------

public String manosLibres(boolean contestar){
    if(contestar == true){
        return "Alooooo";
    }else{
        return "Deje su mensaje en el buzon de voz";
    }
}
public String ecualizador(boolean encendido){
    if(encendido == true){
        return "Selecciones la configuracion deseada";
    }else{
        return "activa el ecualizador para una mejor experiencia";
    }
}
public String sonido3D(boolean activado){
    if( activado == true){
        return "Vive una experiencia unica";
    }else{
        return "activa el sonido 3d para una mejor experiencia";
    }
}

}
