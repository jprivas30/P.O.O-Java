package com.generation.clase2102.models;

public class Perro {

//-----------------------ATRIBUTOS--------------------------------------------
//datos privados o publicos depende de la sensibilidad
    public String raza;
    public String color;
    public Double tamanio;
    public String pelaje;
    public char sexo;
    private Integer chip;


//-----------------------CONSTRUCTORES-----------------------------------------
    //constructor por defecto
    //todas las clases deben tener este tipo de constructor 
    public Perro() {
    }

    //constructor de objeto completo
    //todas las clases deben tener este tipo de constructor 
    public Perro(String raza, String color, Double tamanio, String pelaje, char sexo, Integer chip) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.pelaje = pelaje;
        this.sexo = sexo;
        this.chip = chip;
    }

//-----------------------GETTER AND SETTER-------------------------------------


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getChip() {
        return chip;
    }

    public void setChip(Integer chip) {
        this.chip = chip;
    }

    //-----------------------FUNCIONALIDADES-----------------------------------------
    public void ladrar(){
        System.out.println("Guau!!");
    }

    public String romperCosas(boolean meRetaron){
        if(meRetaron == true){
            return "Destrozo";
        }else{
            return "No destrozo";
        }
    }

    public String cavar(){
        return "El perro cavo un hoyo en el patio";
    }

    @Override
    public String toString() {
        return "Perro {raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + " cm"+ ", pelaje=" + pelaje + ", sexo="
                + sexo + ", chip=" + chip + "}";
    }

    
}
