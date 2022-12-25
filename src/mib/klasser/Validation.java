/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.klasser;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Grupp4
 */
public class Validation {
    
    /**
     * Denna metod kontrollerar ifall en textruta och lösenordsruta som är tomma.
     * Dvs. om någon utav rutorna är tomma, alltså har en tom sträng i sig, då 
     * kommer metoden att returnera en boolean med värdet true.
     * @param firstFieldToCheck
     * @param secondFieldToCheck
     * @return 
     */
    public static boolean checkEmptyFields(JTextField firstFieldToCheck, JPasswordField secondFieldToCheck) {
        boolean emptyTextField = false;
        
        if((firstFieldToCheck.getText().isEmpty()) || (secondFieldToCheck.getText().isEmpty())) {
            emptyTextField = true;
        }
        return emptyTextField;
    }
    
    /**
     * Metoden kontrollerar det alternativ som är valt i combo lådan.
     * Ifall valet i combo lådan är "Alien" kommer metoden att returnera false,
     * och i annat fall har användaren valt "Agent" och då returnerar denna 
     * metod true.
     * @param cmbBoxToCheck
     * @return 
     */
    public static boolean checkCmbBoxType(JComboBox<String> cmbBoxToCheck) {
        boolean chosenIsAgent = true;
        String chosenType = cmbBoxToCheck.getSelectedItem().toString();
        
        if(chosenType.equals("Alien")) {
            chosenIsAgent = false;
        }
        return chosenIsAgent;
    }
}
