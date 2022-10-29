/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;
import javax.swing.*;
import Mediator.*;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;
/**
 *
 * @author Lenín
 */
public class Filtro extends JTextField implements Component {

    private Mediator mediador;
    private ListModel Lista_Modelo;

    public Filtro() {}

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        String start = getText();
        searchElements(start);
    }

    public void setList(ListModel listModel) {
        this.Lista_Modelo = listModel;
    }

    private void searchElements(String s) {
        if (Lista_Modelo == null) {
            return;
        }

        if (s.equals("")) {
            mediador.setElementsList(Lista_Modelo);
            return;
        }

        ArrayList<Note> notes = new ArrayList<>();
        for (int i = 0; i < Lista_Modelo.getSize(); i++) {
            notes.add((Note) Lista_Modelo.getElementAt(i));
        }
        DefaultListModel<Note> listModel = new DefaultListModel<>();
        for (Note note : notes) {
            if (note.getName().contains(s)) {
                listModel.addElement(note);
            }
        }
        mediador.setElementsList(listModel);
    }

    @Override
    public String getName() {
        return "Filtro";
    }

    @Override
    public void SetMediator(Mediator mediator) {
        this.mediador = mediator;
    }
    
}
