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
public class Titulo extends JTextField implements Component{
  private Mediator Mediador;

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        Mediador.markNote();
    }

    @Override
    public String getName() {
        return "Título";
    }

    @Override
    public void SetMediator(Mediator mediator) {
        this.Mediador = mediator;
    }
}
