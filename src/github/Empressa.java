/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gamei
 */
public class Empressa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stock prod[] = new stock[2];
        boolean salir = false;
        while (!salir) {
            
           
            String opc = JOptionPane.showInputDialog("1  : Ingresar Producto"+"\n"
                    + "2  : listar Productos ingresados"+"\n"
                    + "3  : Ingresar venta producto"+"\n"
                    + "4  : Salir"+"\n"
                    + "elija una opcion");
            int opciones = Integer.parseInt(opc);

            switch (opciones) {
                case 1:
                    
                    for (int i = 0; i < prod.length; i++) {
                        if (prod[i] != null) {
                            i++;
                            String producto = JOptionPane.showInputDialog("Ingrese el nombre del producto");
                            String valor = JOptionPane.showInputDialog("Ingrese el valor del producto");
                            prod[i] = new stock(producto, valor);
                            break;
                        }
                        String producto = JOptionPane.showInputDialog("Ingrese el nombre del producto");
                        String valor = JOptionPane.showInputDialog("Ingrese el valor del producto");
                        prod[i] = new stock(producto, valor);
                        i++;
                        break;
                    }
                    break;
                case 2:
                    
                for (int i = 0; i < prod.length; i++) {
                    if(prod[i] != null)
                    JOptionPane.showMessageDialog(null, "nombre: " + prod[i].getNombre() + "\n" + " valor " + prod[i].getValor());
                }
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Aplicativo finalizado");
                    salir = true;
                    break;
            }
        }

    }

}
