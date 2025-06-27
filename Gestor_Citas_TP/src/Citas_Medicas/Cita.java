
package Citas_Medicas;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Cita {
 private String codigoCita;
    private String dni;
    private String nombre;
    private String telefono;
    private int edad;
    private String sexo;
    private String ciudad;
    private String especialidad;
    private String fecha;
    private String numeroConsultorio;
    private String doctor;
    private boolean atendido;

    // Map de doctores por especialidad
    private static final Map<String, List<String>> DOCTORES_POR_ESPECIALIDAD = new HashMap<>();
    private static final Random RANDOM = new Random();

    static {
        DOCTORES_POR_ESPECIALIDAD.put("Pediatria", List.of("Dr. Smith", "Dr. Johnson", "Dr. Williams", "Dr. Brown", "Dr. Jones"));
        DOCTORES_POR_ESPECIALIDAD.put("Cardiologia", List.of("Dr. Garcia", "Dr. Martinez", "Dr. Rodriguez", "Dr. Hernandez", "Dr. Lopez"));
        DOCTORES_POR_ESPECIALIDAD.put("Dermatologia", List.of("Dr. Gonzalez", "Dr. Wilson", "Dr. Anderson", "Dr. Thomas", "Dr. Taylor"));
        DOCTORES_POR_ESPECIALIDAD.put("Endocrinologia", List.of("Dr. Moore", "Dr. Jackson", "Dr. Martin", "Dr. Lee", "Dr. Perez"));
        // Agregar más doctores si es necesario
    }

    // Constructor
    public Cita(String codigoCita, String dni, String nombre, String telefono, int edad, String sexo,
                String ciudad, String especialidad, String fecha, boolean atendido) {
        this.codigoCita = codigoCita;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.ciudad = ciudad;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.numeroConsultorio = asignarNumeroConsultorio();
        this.doctor = asignarDoctor(especialidad);
        this.atendido = atendido;
    }

    // Asignar un número de consultorio aleatorio del 1 al 20
    private String asignarNumeroConsultorio() {
        return String.valueOf(RANDOM.nextInt(20) + 1);
    }

    // Asignar un doctor aleatorio basado en la especialidad
    private String asignarDoctor(String especialidad) {
        List<String> doctores = DOCTORES_POR_ESPECIALIDAD.get(especialidad);
        if (doctores != null && !doctores.isEmpty()) {
            return doctores.get(RANDOM.nextInt(doctores.size()));
        } else {
            return "N/A";
        }
    }

    // Getters y Setters
    public String getCodigoCita() {
        return codigoCita;
    }

    public void setCodigoCita(String codigoCita) {
        this.codigoCita = codigoCita;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    
}
