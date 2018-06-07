/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopledb;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.*;

/**
 *
 * @author phildor
 */
public class PeopleGUI extends JFrame {
    private boolean motherValidated = false, fatherValidated = false;
    private final int NR_PERS_JTF = 12;
    private JTextField[] personTextFields = new JTextField[NR_PERS_JTF];
    private JLabel[] personLabels = new JLabel[NR_PERS_JTF];
    private String[] labelDefaultText = new String[]{"Last name", "First name","Nickname", "Gender", "Date of Birth", "Date of Death", "Father", "Mother", "Telephone nr", "Entry date", "Place met", "Comment"};
    //not implemented
    private String[] textFieldDefaultText = new String[]{"", ""};
    
    
    public PeopleGUI(){
        
        buildGUI();
    }
    
    public void buildGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(0,1));
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new GridBagLayout());
        for(int i = 0; i<personTextFields.length;i++){
            GridBagConstraints c = new GridBagConstraints();
            personLabels[i] = new JLabel(labelDefaultText[i]);
            personTextFields[i] = new JTextField("");
            textFieldPanel.add(personLabels[i], c);
            textFieldPanel.add(personTextFields[i], c);
        }
        textFieldPanel.add(new JButton("test"),new GridBagConstraints(3,6,3,12,0,0,GridBagConstraints.CENTER,0,new Insets(0, 0, 0, 0),0,0));
        add(textFieldPanel);

        
        
        pack();
    }
}
