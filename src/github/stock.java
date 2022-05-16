/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package github;

import javax.swing.JOptionPane;

/**
 *
 * @author gamei
 */
public class stock {
    public String nombre, valor, disponible;
    public stock(){
        
    }
    public stock(String nombre, String valor){
        this.nombre = nombre;
        this.valor = valor;
        //this.disponible = disponible;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

   
    
}
