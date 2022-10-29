/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;
import Mediator.*;
import Mediator.Mediator;
import javax.swing.*;
import java.awt.event.ActionEvent;
/**
 *
 * @author Lenín
 */
public class BotonEliminar extends JButton  implements Component {
    private Mediator mediador;

    public BotonEliminar() {
        super("Eliminar");
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediador.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }

    @Override
    public void SetMediator(Mediator mediator) {
        this.mediador = mediator;
    }
    
}
