
import javax.swing.*; //package for GUI 
import java.awt.*;    //facilitates layout managment 


public class Driver{ 
    private JFrame mainFrame; // window frame
    private JPanel contentPanels; //panel that holds other panels 
    private CardLayout cardLayout; //layout to swap between panel in container 
    private BorderLayout borderLayout;// layout for window 
    private PuzzleProvider solutionProvider; 
    private PuzzPanel puzzPanel;

    public Driver(){ 
        
        mainFrame = new JFrame("Nonogram");// creating window 
        mainFrame.setSize(800,800); //set size frame
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // defines close fuctionality 
        borderLayout = new BorderLayout(); //layout for window 
        mainFrame.setLayout(borderLayout);  // sets layout for window

        contentPanels = new JPanel(); //create panel that holds others 
        cardLayout = new CardLayout();// create layout to swap between panels 
        contentPanels.setLayout(cardLayout); // allows swapping between panels
        mainFrame.add(contentPanels, BorderLayout.CENTER);// adding main panel to frame 

        solutionProvider = new PuzzleProvider();// creates solution provider 
        puzzPanel = new PuzzPanel(this, solutionProvider);// creates puzzels panel with solution to puzzles 


        WelcomeS welcomeScreen = new WelcomeS(this);//Create welcome screen
        contentPanels.add(welcomeScreen.getPanel(), "WelcomeScreen");// add welcome screen to main panel

        mainFrame.setVisible(true); // makes frame visible
    
    }

    
    public void showWelcomeS(){
        cardLayout.previous(contentPanels);// method to show Welcome screen 
    }

    public void showPuzzPanel(int puzzleNum){
        puzzPanel.showPuzzlePanel(puzzleNum);//method to all creation of puzzpanel 
    }

    public JPanel getContentPanels(){// Getter 
        return contentPanels;
    }

    public CardLayout getCardLayout(){ // Getter
        return cardLayout;
    }


    public static void main(String[] args){

        
        new Driver();//creates Nonograme
    }

}




