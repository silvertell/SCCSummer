import javax.swing.*;

import java.awt.event.*;







public class WelcomeS implements ActionListener{

    private JPanel welcomePanel; //panel for welcome screen
    private Driver driver; //  refernce to driver 
    private JButton puzzleButton1; //button for each of the puzzles 
    private JButton puzzleButton2; 



    //constructor 
    public WelcomeS(Driver driver ){
        this.driver = driver; //store reference to driver class
        
        welcomePanel = new JPanel();// create a welcome panel 
        welcomePanel.setLayout(null);// disable layout managment 


        JLabel welcomeLabel = new JLabel("Welcome to Nonogram the Puzzle Game"); //create label 
        welcomeLabel.setBounds(200, 50, 400,30);// locaton of label 
        welcomePanel.add(welcomeLabel); // add label to Welcome screeen 

        CustomButton customButton1 = new CustomButton("puzzle 1", 350, 100, 100,30);
        puzzleButton1 = customButton1.getButton();//get custom button and assigns 
        puzzleButton1.addActionListener(this); // as this this class to deal with event


        CustomButton customButton2 = new CustomButton("puzzle 2", 350, 150, 100,30);
        puzzleButton2 = customButton2.getButton();
        puzzleButton2.addActionListener(this);
    

        welcomePanel.add(puzzleButton1);//adds puzzle buttons to welcome screen
        welcomePanel.add(puzzleButton2);
     
 
    }

//method  which handles events triggered by action listener 
public void actionPerformed(ActionEvent e) {
    if (e.getSource()== puzzleButton1){
        driver.showPuzzPanel(1);
    }
    if (e.getSource()== puzzleButton2){
        driver.showPuzzPanel(2);
    }
    
}



public JPanel getPanel(){
    return welcomePanel; 
    }

}
