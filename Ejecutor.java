/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import Mediator.*;
import Componentes.*;
import javax.swing.*;
/**
 *
 * @author Lenín
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Titulo());
        mediator.registerComponent(new CajaDeTexto());
        mediator.registerComponent(new BotonAñadir());
        mediator.registerComponent(new BotonEliminar());
        mediator.registerComponent(new BotonGuardar());
        mediator.registerComponent(new Lista(new DefaultListModel()));
        mediator.registerComponent(new Filtro());

        mediator.createGUI();
    }
}
