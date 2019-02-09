package Task01;

public class Controller {
    // Fields
    String strTemplate1 = "Hello";
    String strTemplate2 = "world!";
    String strInput1;
    String strInput2;

    // Methods
    // Start process
    void startController(){
        // create View object
        View view = new View();

        // get a first input
        view.takeFirstInput();
        strInput1 = view.getUserInput();

        // check the first input
        while (!(strInput1.trim().equals(strTemplate1))) {
            view.showAlert();
            strInput1 = view.getUserInput();
        }

        // get a second input
        view.takeSecondInput();
        strInput2 = view.getUserInput();

        // check the second input
        while (!(strInput2.trim().equals(strTemplate2))) {
            view.showAlert();
            strInput2 = view.getUserInput();
        }

        // Create Model object
        Model model = new Model();
        model.setInputs(strInput1, strInput2);

        // Send the final string to View
        view.printOut(model.getOutput());
        view.stopScanner();
    }

}