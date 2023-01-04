/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib.klasser;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * Denna metod är start-metoden, vilket gör att våra java-klasser får en databas-uppkoppling samt att LoginPage startar.
 * @author Grupp4
 */
public class Start {
    
    private static InfDB idb;
    
    public static void main(String[] args) throws InfException 
    {
        try 
        {
            idb = new InfDB("mibdb","3306", "mibdba", "mibkey");
        }
        catch (InfException ex)
        {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        new LoginPage(idb).setVisible(true);
    }
}
