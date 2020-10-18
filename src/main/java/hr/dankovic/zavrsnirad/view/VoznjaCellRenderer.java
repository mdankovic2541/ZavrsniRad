/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.view;

import hr.dankovic.zavrsnirad.model.Vozac;
import hr.dankovic.zavrsnirad.model.Voznja;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Marko
 */
public class VoznjaCellRenderer extends JLabel implements ListCellRenderer<Voznja>{

 
    @Override
    public Component getListCellRendererComponent(JList<? extends Voznja> list, Voznja value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getPolaziste()+ " " + value.getOdrediste());
        if(isSelected){
            setBackground(Color.BLUE);
            setForeground(Color.BLUE);
        }else{
            setBackground(Color.BLUE);
            setForeground(Color.BLACK);
        }
        return this;    }
    
}
