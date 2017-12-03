/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaaereo;

/**
 *
 * @author adrian
 */
public class Piloto extends PersonalDeCabina{
    
    private int horas_de_vuelo;

    public Piloto(String rut, String nombre, String apellido, String nacionalidad, int edad) {
        super(rut, nombre, apellido, nacionalidad, edad);
    }

    public Piloto() {
    }

    public Piloto(String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
    }

    public int getHoras_de_vuelo() {
        return horas_de_vuelo;
    }

    public void setHoras_de_vuelo(int horas_de_vuelo) {
        this.horas_de_vuelo = horas_de_vuelo;
    }

    @Override
    public String toString() {
        return "Piloto{" + "horas_de_vuelo=" + horas_de_vuelo + '}';
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Piloto other = (Piloto) obj;
        if (this.horas_de_vuelo != other.horas_de_vuelo) {
            return false;
        }
        return true;
    }
    
    
}
