import javax.swing.*;
import java.awt.*;


public class PuzzPanel {

    private Driver driver; //Main class
    private PuzzleProvider solutionProvider; //ref puzzle class 

    public PuzzPanel(Driver driver,PuzzleProvider solutionProvider){
        this.driver = driver; 
        this.solutionProvider = solutionProvider; 

    }


    public void showPuzzlePanel(int puzzleNum){//method to display puzzle panel 

        int [][] solution = solutionProvider.puzzleSolution(puzzleNum); //get puzzle solution 
        NonUi nonUi = new NonUi(solution, driver); //create UI interface
        
     

        JPanel contentPanels = driver.getContentPanels();  //get main panel 

        contentPanels.add(nonUi, "Puzzle Screen" + puzzleNum);//add NonUi to main  panel 

        CardLayout layout = driver.getCardLayout(); // get card layout

        layout.show(contentPanels,"Puzzle Screen" + puzzleNum ); // shhow panel 
        

        }

    }   
