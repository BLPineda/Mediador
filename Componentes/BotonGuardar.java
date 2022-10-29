/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;
import Mediator.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Lenín
 */
public class BotonGuardar extends JButton implements Component {
    private Mediator mediator;

    public BotonGuardar() {
        super("Save");
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }

    @Override
    public void SetMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
