/*
 * This problem is extesion of a version from hacker rank
 * We define an hourglass in  to be a subset of values with indices falling in
 * this pattern in 's graphical representation:
    a b c
      d
    e f g

 * There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
 * Task: Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 * Extension: Print every hour glass and its max
 */
package justcoding;

/**
 *
 * @author npilusa
 */
import java.util.*;

public class HourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = -50;
        
        //print out arrays for testing
        for(int hGlass = 0; hGlass < 4; hGlass++){
            
            //Get rows of matrix
            boolean skip = false;
            boolean neck;
            int[] sums = new int[4];
            
            for(int row = hGlass; row < hGlass+3; row++){
                int colStart = 0;
                neck = false;
                int index = 0;
                
                //Get columns of matrix
                for(int column = colStart; column < colStart+3; ){
                    if(skip && neck){
                        System.out.print(arr[row][column]+" ");
                        sums[index] += arr[row][column];
                        
                    }else if(!skip){
                        System.out.print(arr[row][column]+" ");
                        sums[index] += arr[row][column];
                    }else{
                        System.out.print("  ");
                    }
                    
                    column++;
                    neck = !neck;
                      
                    //moves to columns for next hour glass
                    if(column != 6 && column == colStart+3){
                        colStart++;
                        column = colStart;
                        System.out.print(" ");//vertical space between glasses
                        neck = false;
                    }
                     //Set the index for storing the sum of an hour glass
                    switch(colStart){
                        case 1:
                            index = 1;
                            break;
                        case 2:
                            index = 2; //to store sum of next glass
                            break;
                        case 3:
                            index = 3; //to store sum of next glass
                            break;
                    }
                    
                   
                }
                System.out.println();//next row for a glass
                skip = !skip;
            }
            
            //Find max sum from current row of hour glasses
            for(int sum: sums){
                if(sum > max){
                    max = sum;
                }
                System.out.print("Max "+sum+"  ");
            }
            System.out.println("\n");// row of hour glasses
        }
        System.out.println("\nThe max is: "+max);
    }
}
