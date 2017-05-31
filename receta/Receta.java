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

    protected Object addingrediente() throws CloneNotSupportedException {
        return addingrediente(); //To change body of generated methods, choose Tools | Templates.
    }
    

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    protected Object addpreparacion() throws CloneNotSupportedException {
        return addpreparacion(); //To change body of generated methods, choose Tools | Templates.  
    }
     String cantidad;

class receta {

        public int getPersonas() {
            return personas;
        }

        public void setPersonas(int personas) {
            this.personas = personas;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

    int personas = 4;
    String autor;
       
    String Nombre;
    String Ingredientes;
    String Preparacion;

        @Override
        public String toString() {
            return "receta{" + "Nombre=" + Nombre + ", Ingredientes=" + Ingredientes + ", Preparacion=" + Preparacion + '}';
        }


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

            @Override
            public String toString() {
                char tomate = 0;
                String kg = null;
                return "Ingredientes{" + "cantidad=" + 3 + ", unidad=" + kg + ", nombre=" + tomate + '}';
            }
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
