
package Citas_Medicas;

import java.util.ArrayList;
public class ListaCitas {
      private ArrayList<Cita> listaCitas;

    public ListaCitas() {
        listaCitas = new ArrayList<>();
    }

    public void agregarCita(Cita cita) {
        listaCitas.add(cita);
    }

    public void eliminarCita(String codigoCita) {
        listaCitas.removeIf(cita -> cita.getCodigoCita().equals(codigoCita));
    }

    public ArrayList<Cita> getCitas() {
        return listaCitas;
    }

    public Cita buscarCita(String codigoCita) {
        for (Cita cita : listaCitas) {
            if (cita.getCodigoCita().equals(codigoCita)) {
                return cita;
            }
        }
        return null;
    }
  
}
