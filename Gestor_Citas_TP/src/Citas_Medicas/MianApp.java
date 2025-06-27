
package Citas_Medicas;


public class MianApp {
    
     public static void main(String[] args) {
        // Crear la instancia compartida de ListaCitas
        ListaCitas listaCitas = new ListaCitas();

        // Configurar y mostrar la ventana principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal(listaCitas).setVisible(true);
            }
        });
    }
    
}
