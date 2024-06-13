package ldc1.tpprogramacionjpa.logica;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Doctor extends Persona implements Serializable {
    
    @Basic
    private int codigo;
    private String especialidad;
    
    @OneToMany
    private ArrayList<Paciente> pacientes;

    public Doctor() {
    }

    public Doctor(int codigo, String especialidad, ArrayList<Paciente> pacientes, int dni, String nombre) {
        super(dni, nombre);
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.pacientes = pacientes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
}
