public class PuzzleProvider {
private int puzzNumber;
    public int [][] puzzleSolution(int puzzNumber){
this.puzzNumber = puzzNumber;
    int [][] solution = new int[0][0];//decaltion of solution array 

    //returns different puzzles 
    if(puzzNumber == 1 ){
        solution = new int[][]{
            {0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0},
            {2, 0, 0, 0, 2},
            {0, 2, 2, 2, 0},
            {0, 0, 0, 0, 0},
        }; 
    }else if(puzzNumber == 2){

    solution = new int [][]{
        {0, 1, 0, 0, 1, 0},
        {0, 1, 0, 0, 1, 0},
        {0, 0, 0, 0, 0, 0}, 
        {2, 0, 0, 0, 0, 2},
        {0, 2, 2, 2, 2, 0}, 
        {0, 0, 0, 0, 0, 0},
        };
    }
    
    return solution; //return 2d array solution 

   
    }

    public int getPuzzNum(){ 
        return this.puzzNumber;//getter to return num key 
    }
}
