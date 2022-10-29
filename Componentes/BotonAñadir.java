/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;
import Mediator.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Lenín
 */
public class BotonAñadir extends JButton implements Component {
    
    private Mediator mediator;
    
    @Override
    public void SetMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    
     @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
    
}
