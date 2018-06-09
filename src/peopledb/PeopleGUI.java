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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author phildor
 */
public class PeopleGUI extends JFrame implements ActionListener {
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
        GridBagConstraints c = new GridBagConstraints();
        for(int i = 0; i<personTextFields.length;i++){
            
            personLabels[i] = new JLabel(labelDefaultText[i]);
            personTextFields[i] = new JTextField("");
            personTextFields[i].setColumns(20);
            c.gridx = 0;
            c.gridy = i;
            textFieldPanel.add(personLabels[i], c);
            c.gridx = 1;
            textFieldPanel.add(personTextFields[i], c);
        }
        c.gridx = 2;
        c.gridy = 6;
        JButton btnGetFatherID = new JButton("Get ID");
        btnGetFatherID.setActionCommand("GetFatherID");
        btnGetFatherID.addActionListener(this);
        textFieldPanel.add(btnGetFatherID,c);
        
        c.gridy = 7;
        JButton btnGetMotherID = new JButton("Get ID");
        btnGetMotherID.setActionCommand("GetMotherID");
        btnGetMotherID.addActionListener(this);
        textFieldPanel.add(btnGetMotherID,c);
        add(textFieldPanel);

        
        
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PeopleView pv = new PeopleView(new ArrayList(), this);
        switch(e.getActionCommand()){          
            case "GetFatherID": 
                if(!personTextFields[6].getText().equals("")){
                    ArrayList<Person> peopleFound = PeopleDB.findPerson(personTextFields[6].getText());
                    pv = new PeopleView(peopleFound, this);
                    pv.setVisible(true);
                }
                break;
            case "GetMotherID":
                if(!personTextFields[6].getText().equals("")){
                    ArrayList<Person> peopleFound = PeopleDB.findPerson(personTextFields[7].getText());
                    pv = new PeopleView(peopleFound, this);
                    pv.setVisible(true);
                }
                break;
            case "Select":
                
                personTextFields[6].setText(pv.getSelectedIndexOfList());
                
        }
    }
}
