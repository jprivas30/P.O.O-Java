package com.generation.clase2102.models;

/* 
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

*/

//----------------------------------OBJETO CON ATRIBUTOS------------------------------------------

public class Smartphone extends ArticuloElectronico{
    public Integer capacidad;
    public String procesador;
    public Boolean camara;

//-------------------------------------------CONSTRUCTOR--------------------------------------------
    public Smartphone() {
        super();
    }
    public Smartphone(String marca, String modelo, String color, String sistemaOperativo, Integer tamanio,
            Boolean bluetooth, Integer capacidad, String procesador, Boolean camara) {
                super(marca, modelo, color, sistemaOperativo, tamanio, bluetooth);
                this.capacidad = capacidad;
                this.procesador = procesador;
        this.camara = camara;
    }

//-----------------------------------------GETTER AND SETTER------------------------------------------

    
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
    public Boolean getCamara() {
        return camara;
    }
    public void setCamara(Boolean camara) {
        this.camara = camara;
    }


//-------------------------------------------FUNCIONALIDADES------------------------------------------

    public void grabar(){
        System.out.println("Grabó su TikTok");
    }

    
    @Override
    public String toString() {
        return super.toString() + " {capacidad=" + capacidad + ", procesador=" + procesador + ", camara=" + camara + "}";
    }
    }