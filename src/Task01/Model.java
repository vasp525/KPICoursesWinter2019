package Task01;

/* Class Model takes 2 strings
* from Controller, then creates a new string from 2 string above.
* Then return the new string via getter.
*/

public class Model {
    // Fields
    private String s1;
    private String s2;


    // Methods
    // Set two strings
    public void setInputs(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    // Get the final string
    public String getOutput (){
        return s1 + ", " + s2;
    }
}