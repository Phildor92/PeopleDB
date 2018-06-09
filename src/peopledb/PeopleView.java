/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopledb;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author phildor
 */
public class PeopleView extends JFrame implements ActionListener {
    JList listOfPeople;
    JButton btnSelect;
    ArrayList<Person> plist = new ArrayList<>();
    
    public PeopleView(ArrayList<Person> personList, PeopleGUI pg){
        plist = personList;
        buildGUI(personList, pg);
    }

    private void buildGUI(ArrayList<Person> personList, PeopleGUI pg) {
        
        String[] names = new String[personList.size()];
        for(int i = 0; i<personList.size();i++){
            names[i] = personList.get(i).getPersonID() + " - " + personList.get(i).getFirstName() + " " + personList.get(i).getLastName();
        }
        setLayout(new GridLayout(0,1));
        listOfPeople = new JList(names);
        add(listOfPeople);
                
        btnSelect = new JButton("Select");
        btnSelect.addActionListener(pg);
        add(btnSelect);
        plist = personList;
        pack();       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Select")){
            
        }
    }

    public String getSelectedIndexOfList() {
        System.out.println(listOfPeople.getSelectedIndex());
        return plist.get(listOfPeople.getSelectedIndex()).getPersonID() + "";
    }
}
