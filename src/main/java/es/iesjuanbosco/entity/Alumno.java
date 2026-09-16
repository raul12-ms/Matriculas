package es.iesjuanbosco.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Alumno {

    // Atributos de instancia
    private int id;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private List<Asignatura> asignaturas;

    // Constructor
    public Alumno(int id, String nombre, String apellidos, LocalDate fechaNacimiento, List<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.asignaturas = asignaturas;
    }

    // Constructor vacio
    public Alumno() {
    }

    // Métodos públicos
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    // Metodo aparte
    public void addAsignatura(Asignatura asignatura) {
        this.asignaturas.add(asignatura);   // añadir asignatura a la lista de asignaturas
    }

    public void removeAsignatura(Asignatura asignatura) {
        this.asignaturas.remove(asignatura);   // borrar asignatura a la lista de asignaturas
    }


    @Override
    public String toString() {
        return  " - Nombre = " + nombre + '\'' +
                ", apellidos = " + apellidos + '\'' +
                ", fechaNacimiento = " + fechaNacimiento +
                ", asignaturas = " + asignaturas + '\n';
    }
}
