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
public class Archivo {
    
    
    ArrayList<MundoDisco> m = new ArrayList();
    private File archivo = null;

    public Archivo() {
    }
    
    

    public Archivo(String path) {
        archivo = new File(path);
    }

    public ArrayList<MundoDisco> getM() {
        return m;
    }

    public void setM(ArrayList<MundoDisco> m) {
        this.m = m;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    public void setMundos(MundoDisco p){
        m.add(p);
        
    }
    
    
    
    
    
    
      public void escribirarchivo() throws IOException{
          System.out.println("-******************");
          
          for (int i = 0; i < m.size(); i++) {
              for (int j = 0; j < m.get(i).getCriaturas().size(); j++) {
                  System.out.println(m.get(i).getCriaturas().get(i));
              }
              
          }
          
          
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
        fw = new FileWriter(archivo,false);
        bw = new BufferedWriter(fw);
            for (MundoDisco t : m) {
                bw.write(t.getNombre()+";");
                for (int i = 0; i < t.getCriaturas().size(); i++) {
                    bw.write(t.getCriaturas().get(i).getNombre() + ",");
                    bw.write(t.getCriaturas().get(i).getCantidad_vida()+",");
                    bw.write(t.getCriaturas().get(i).getCantidad_vital()+",");
                    bw.write(t.getCriaturas().get(i).getNombre_region()+",");
                    bw.write(t.getCriaturas().get(i).getMaximo_anos()+",");
                    
                }
                bw.write(";");

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
        m = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    m.add(new MundoDisco(sc.next()));
                    
                    ArrayList<Criaturas> temp = m.get(m.size() - 1).getCriaturas();
                    Scanner sc2 = new Scanner(sc.next());
                    sc2.useDelimiter(",");
                    
                    while (sc2.hasNext()) {                        
                        temp.add(new Criaturas(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt()));
                    }
                    
                    m.get(m.size() - 1).setCriaturas(temp);
                    
                }
            }
        catch(Exception e){
            
        }
        sc.close();
        }
        
    }
    
    
}
