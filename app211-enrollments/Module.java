
/**
 * The class Module displays the modules taken at BNU,
 * that are part of a course, including information
 * regarding the module code and title.
 *
 * @author Mercy Sholola
 * @version 23/10/21 1.0
 */
public class Module
{
 // Variables
 private String code;
 private String title;
 private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        credit = 15;
        this.code = code;
        this.title = title;
    }

    public String getCode()
    {
        return code;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    

     /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        System.out.println(" Module Code: " + code + ": " 
                        + title + " Credit " + credit);
        System.out.println();
    }
    

}
