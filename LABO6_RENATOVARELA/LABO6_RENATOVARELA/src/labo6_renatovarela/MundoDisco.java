/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6_renatovarela;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus Pc
 */
public class MundoDisco {
    String nombre;
    ArrayList<Criaturas> criaturas = new ArrayList();
      private File archivo = null;

    public MundoDisco() {
    }

    public MundoDisco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Criaturas> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criaturas> criaturas) {
        this.criaturas = criaturas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void escribirarchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
        fw = new FileWriter(archivo,false);
        bw = new BufferedWriter(fw);
         bw.write(nombre+";");
            for (Criaturas t : criaturas) {
               
                
                for (int i = 0; i < criaturas.size(); i++) {
                    bw.write(nombre+";");
                    bw.write(nombre+";");
                    bw.write(nombre+";");
                    bw.write(nombre+";");
                    bw.write(nombre+";");
                    bw.write(nombre+";");
                }
                

            }
        bw.flush();
        }
        catch(Exception e){
            
        }
        bw.close();
        fw.close();
    }
    
    
    
    public void cargararchivo(){
        
        Scanner sc = null;
        criaturas=new ArrayList();
        if(archivo.exists()){
        try{
            sc=new Scanner(archivo);
            sc.useDelimiter(";");
            
            
            while(sc.hasNext()){
                /*
                ArrayList<Criaturas> tem =
                criaturas.add(new Criaturas(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt()));*/
            }
        }
        catch(Exception e){
            
        }
        sc.close();
        }
        
    }
    
    
       
    
}
