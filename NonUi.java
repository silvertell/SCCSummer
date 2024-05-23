import javax.swing.*;// import for GUI 
import java.awt.*;//layout manager
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NonUi extends JPanel implements ActionListener {

    private int[][] solution; // decalre array for puzzle solution
    private int[][] colorState; // store color state of buttons
    private GridButton[][] buttons;// store frid buttons
    private Driver driver;
    private int rows;
    private int cols;

    public NonUi(int[][] solution, Driver driver) {// constructor UI containg 2d array of buttons in a grid layout
        this.driver = driver;
        this.solution = solution; // assign puzzle solution
        this.rows = solution.length; // get number of rows
        this.cols = solution[0].length;// get number of colums
        this.colorState = new int[rows][cols]; // initilize colour state
        this.buttons = new GridButton[rows][cols];
        colourSetter();
        setLayout(new GridLayout(rows, cols));// set the layout to grid to the same size as the puzzle
        createGrid();// call button creation method

    }

    public void colourSetter() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                colorState[i][j] = -1;
            }
        }
    }

    private void createGrid() { // creates buttons to by looping through each cell in puzzle array
        for (int i = 0; i < rows; i++) { // iterates over the rows
            for (int j = 0; j < cols; j++) { // over columns
                GridButton button = new GridButton();
                button.addActionListener(this); // add action listenteneer
                buttons[i][j] = button; // store grid button in array
                add(button);// add the button panel

            }
        }
    }

    public void actionPerformed(ActionEvent e) { // handles button clicks
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (e.getSource() == buttons[i][j]) { // check if current button in grid matches clicked button
                    buttons[i][j].nextColor();
                    colorState[i][j] = buttons[i][j].getColorState(); // this sets coloursate of button clicked to
                    checkSolution(); // sets clicked column current
                    return;
                }
            }

        }
    }

    public void checkSolution() {// checks if Color state matches puzzle solution
        boolean isCorrect = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (colorState[i][j] != solution[i][j]) {// check if colour state of serached button matches equiv from puzzle 
                    isCorrect = false; // if one cell doesnt match then not solved
                    break;

                }

            }
        }
        if (isCorrect) {
            solutionAchieved();// call solved method
        }     
       
    }

    public void solutionAchieved() {// solved method retursn to welome screen and prints solved
        System.out.println("You solved the puzzle!");
        driver.showWelcomeS();

    }
}
