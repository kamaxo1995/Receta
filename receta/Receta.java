/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta;

/**
 *
 * @author alumnociclo
 */
public class Receta {

private class receta {
    String Nombre;
    String Ingredientes;

        
        public String ArrayList() {
            return "receta{" + "Ingredientes=" + Ingredientes + '}';
        }
    String Preparacion;

        public receta(String Nombre, String Ingredientes, String Preparacion) {
            this.Nombre = Nombre;
            this.Ingredientes = Ingredientes;
            this.Preparacion = Preparacion;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public String getIngredientes() {
            return Ingredientes;
        }

        public void setIngredientes(String Ingredientes) {
            this.Ingredientes = Ingredientes;
        }

        public String getPreparacion() {
            return Preparacion;
        }

        public void setPreparacion(String Preparacion) {
            this.Preparacion = Preparacion;
        }

        public receta(String Nombre) {
            this.Nombre = Nombre;
        }
      public class Ingredientes {
          float cantidad;

        public String getUnidad() {
            return unidad;
        }

        public void setUnidad(String unidad) {
            this.unidad = unidad;
        }
          String unidad;
          String nombre;
      }

    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
