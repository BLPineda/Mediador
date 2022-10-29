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
public class CajaDeTexto extends JTextArea implements Component {
 private Mediator mediator;

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }   

    @Override
    public void SetMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
