/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testessimpls;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author User
 */
public class Teste extends JLabel implements ListCellRenderer<Aluno> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Aluno> jlist, Aluno e, int i, boolean bln, boolean bln1) {
        
        this.setText(e.getNome()+" - "+e.getIdade());
        
        return this;
    }

   
}
