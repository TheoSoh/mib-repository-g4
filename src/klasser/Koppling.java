package klasser;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp4
 */
public class Koppling 
{
    private static InfDB idb;
    
    public static void main(String[] args) throws InfException 
    {
        try 
        {
            idb = new InfDB("mibdb","3306", "mibdba", "mibkey");
        }
        catch (InfException ex)
        {
            Logger.getLogger(Koppling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
