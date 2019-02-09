package Task02;

public class Controller {

    void beginTheGame () {
        int min = 0;
        int max = 100;
        int inputNum;
        int qty = 0;
        Model model = new Model();
        View view = new View();
        int key = model.rand(min, max);

        while (true) {

            qty++;
            view.requestUserInput(min, max);

            while (!checkInputFormat(view.getUserInput(), min, max)) {
                view.incorrectFormatMsg(min, max);
                view.requestUserInput(min, max);
            }

            inputNum = Integer.parseInt(view.getUserInput());

            if (model.checkResult(inputNum, key)) {
                view.winMsg(qty);
                view.stopScanner();
                break;
            } else {
                view.wrongResultMsg(inputNum);
                if (key > inputNum) {
                    min = inputNum;
                } else {
                    max = inputNum;
                }
            }

        }

    }


    boolean checkInputFormat(String str, int min, int max) {
        String s = str.trim();
        if (s.matches("\\d+")) {
            int a = Integer.parseInt(s);
            if ((a >= min)&&(a <= max)) {
                return true;
            }
        }
        return false;
    }


}