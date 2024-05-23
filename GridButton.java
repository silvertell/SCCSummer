import javax.swing.*; 
import java.awt.*;


public class GridButton extends JButton {//class Def
    private Color actualColor; // holds current colour of button
    private int colorState;//keep track of colour 

    public GridButton(){//constructor 

        this.colorState = -1;//init
        this.actualColor = Color.YELLOW;//set initail colour as yellow for unkown 
        this.setBackground(actualColor);
    }

            public void nextColor(){//method to change button state/color 
                //checks colour and changes it when clicked and holds state to allow comparisoon to puzzle 
                if (actualColor.equals(Color.YELLOW)){
                    actualColor = Color.BLACK; 
                    colorState = 1;
                }else if(actualColor.equals(Color.BLACK)){
                    actualColor = Color.RED; 
                    colorState = 2;
                }else if(actualColor.equals(Color.RED)){
                    actualColor = Color.WHITE;
                    colorState = 0; 
                }
                else if(actualColor.equals(Color.WHITE)){
                    actualColor = Color.YELLOW;
                    colorState = -1; 
                }
                this.setBackground(actualColor);//set button colour 
            }


        

    
    public int getColorState(){
        return this.colorState;
    }

    
}


