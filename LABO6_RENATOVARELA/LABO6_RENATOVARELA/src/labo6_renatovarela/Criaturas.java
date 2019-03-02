/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6_renatovarela;

import java.util.ArrayList;

/**
 *
 * @author Asus Pc
 */
public class Criaturas {
    String nombre;
    int cantidad_vital;
    int maximo_anos;
    String nombre_region;
    int cantidad_vida;
    ArrayList<String> magicos = new ArrayList();

    public Criaturas() {
    }

    public Criaturas(String nombre, int cantidad_vital, int maximo_anos, String nombre_region, int cantidad_vida) {
        this.nombre = nombre;
        this.cantidad_vital = cantidad_vital;
        this.maximo_anos = maximo_anos;
        this.nombre_region = nombre_region;
        this.cantidad_vida = cantidad_vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_vital() {
        return cantidad_vital;
    }

    public void setCantidad_vital(int cantidad_vital) {
        this.cantidad_vital = cantidad_vital;
    }

    public int getMaximo_anos() {
        return maximo_anos;
    }

    public void setMaximo_anos(int maximo_anos) {
        this.maximo_anos = maximo_anos;
    }

    public String getNombre_region() {
        return nombre_region;
    }

    public void setNombre_region(String nombre_region) {
        this.nombre_region = nombre_region;
    }

    public int getCantidad_vida() {
        return cantidad_vida;
    }

    public void setCantidad_vida(int cantidad_vida) {
        this.cantidad_vida = cantidad_vida;
    }

    public ArrayList<String> getMagicos() {
        return magicos;
    }

    public void setMagicos(ArrayList<String> magicos) {
        this.magicos = magicos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", cantidad_vital=" + cantidad_vital + ", maximo_anos=" + maximo_anos + ", nombre_region=" + nombre_region + ", cantidad_vida=" + cantidad_vida + ", magicos=" + magicos + '}';
    }
    
    
    
    
    
}
