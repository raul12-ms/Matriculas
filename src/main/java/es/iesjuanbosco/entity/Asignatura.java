package es.iesjuanbosco.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Asignatura {

    // Atributos de instancia
    private int id;
    private String nombre;
    private String descripcion;

    // Constructor
    public Asignatura(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Constructor vacio
    public Asignatura() {

    }

    // Metodos públicos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Asignatura " + id +
                ", nombre = " + nombre + '\'' +
                ", descripcion = " + descripcion + '\'';
    }
}
