package es.iesjuanbosco;

import es.iesjuanbosco.entity.Alumno;
import es.iesjuanbosco.entity.Asignatura;

import java.time.LocalDate;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Alumno alumno = new Alumno(1, "Pepe", "Caro Roja", LocalDate.of(2000, 5, 12), new ArrayList<>());
        Asignatura asignaturaPAUF = new Asignatura(01, "PAUF", "Programación de Aplicaciones Utilizando Frameworks");
        Asignatura asignaturaAD = new Asignatura(02, "AD", "Acceso a Datos");
        Asignatura asignaturaPMDM = Asignatura.builder()
                .nombre("PMDM")
                .descripcion("Programación Multimedia y Dispositivos Móviles")
                .build();

        alumno.addAsignatura(asignaturaPAUF);
        alumno.addAsignatura(asignaturaAD);
        alumno.addAsignatura(asignaturaPMDM);

        IO.println(alumno);
        IO.println(alumno.getId() + ". " + alumno.getNombre() + "" + alumno.getApellidos() + " (" + alumno.getFechaNacimiento() + ")");
        alumno.getAsignaturas().forEach(asignatura -> {
            IO.println((" - " + asignatura.getNombre() + " " + asignatura.getDescripcion()));
        });


    }
}
