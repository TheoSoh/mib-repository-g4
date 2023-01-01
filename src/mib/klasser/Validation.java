/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.klasser;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

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
     * 
     * @param firstFieldToCheck
     * @return 
     */
    public static boolean checkEmptyTxtField(JTextField txtFieldToCheck) {
        boolean emptyTextField = false;
        
        if(txtFieldToCheck.getText().isEmpty()) {
            emptyTextField = true;
        }
        return emptyTextField;
    }
    
    /**
     * Denna metod kontrollerar ifall rutorna som inkommer som parameter 
     * är tomma. 
     * Dvs. om någon utav rutorna är tomma, alltså har en tom sträng i sig, 
     * då kommer metoden att returnera en boolean med värdet true.
     * @param firstFieldToCheck
     * @param secondFieldToCheck
     * @param thirdFieldToCheck
     * @return 
     */
    public static boolean checkEmptyFields(JTextField firstFieldToCheck, JPasswordField secondFieldToCheck, JPasswordField thirdFieldToCheck) {
        boolean emptyTextField = false;
        
        if((firstFieldToCheck.getText().isEmpty()) || (secondFieldToCheck.getText().isEmpty()) || (thirdFieldToCheck.getText().isEmpty())) {
            emptyTextField = true;
        }
        return emptyTextField;
    }
    
    /**
     * 
     * @param firstFieldToCheck
     * @param secondFieldToCheck
     * @param thirdFieldToCheck
     * @param fourthFieldToCheck
     * @param fifthFieldToCheck
     * @param sixthFieldToCheck
     * @return 
     */
    public static boolean checkEmptyFields(JTextField firstFieldToCheck, JTextField secondFieldToCheck, JTextField thirdFieldToCheck, JTextField fourthFieldToCheck, JTextField fifthFieldToCheck) {
        boolean emptyTextField = false;
        
        if((firstFieldToCheck.getText().isEmpty()) || (secondFieldToCheck.getText().isEmpty()) || (thirdFieldToCheck.getText().isEmpty()) || (fourthFieldToCheck.getText().isEmpty()) || (fifthFieldToCheck.getText().isEmpty())) {
            emptyTextField = true;
        }
        return emptyTextField;
    }
    
    /**
     * 
     * @param firstFieldToCheck
     * @param secondFieldToCheck
     * @return 
     */
    public static boolean checkEmptyTxtFields(JTextField firstFieldToCheck,JTextField secondFieldToCheck) {
        boolean emptyTextField = false;
        
        if((firstFieldToCheck.getText().isEmpty()) || (secondFieldToCheck.getText().isEmpty()))  {
            emptyTextField = true;
        }
        return emptyTextField;
    } 
    
    /**
     * 
     * @param firstFieldToCheck
     * @param secondFieldToCheck
     * @param thirdFieldToCheck
     * @return 
     */
    public static boolean checkEmptyTxtFields(JTextField firstFieldToCheck,JTextField secondFieldToCheck,JTextField thirdFieldToCheck) {
        boolean emptyTextField = false;
        
        if((firstFieldToCheck.getText().isEmpty()) || (secondFieldToCheck.getText().isEmpty()) || (thirdFieldToCheck.getText().isEmpty()))  {
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
    
    /**
     * 
     * @param checkThisString
     * @return 
     */
    public static boolean checkIfTxtFieldIsOfInt(JTextField checkThisTxtField) {
        boolean isOfInt = false;
        String checkThisString = checkThisTxtField.getText();
        if(checkThisString.matches("[0-9]+")) {
            isOfInt = true;
        }
        return isOfInt;
    }
    
    /**
     * 
     * @param checkThisString
     * @return 
     */
    public static boolean checkStringSelectedRace(String checkThisString) {
        boolean raceIsWorm = false;
        if(checkThisString.equals("Worm")) {
            raceIsWorm = true;
        }
        return raceIsWorm;
    }
    
    /**
     * 
     * @param addToThisCmb 
     */
    public static void addRaceToCmb(JComboBox<String> addToThisCmb) {
        String firstRace = "Boglodite";
        String secondRace = "Squid";
        String thirdRace = "Worm";
        addToThisCmb.addItem(firstRace);
        addToThisCmb.addItem(secondRace);
        addToThisCmb.addItem(thirdRace);
    }
}
