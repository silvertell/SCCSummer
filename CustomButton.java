import javax.swing.*;

public class CustomButton{

    private JButton button; 

    public  CustomButton(String text, int x, int y, int width, int height){
    button = new JButton(text); 
    button.setBounds(x, y, width, height);
    }

    public JButton getButton(){
    return button;
    }

}
