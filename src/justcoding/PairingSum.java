/**
* Given an unsorted array of integers, find a pair with given sum in that array
* Example Output:
* > pairing_sum( [ 5, 6 , 7 , 2 , 3 ] ) // 5 and 2 make 7 and 7 is in the array ( 2 and 3 also right as they make 5)
* [ 5 , 2 ]
*
*/
package justcoding;

/**
 *
 * @author npilusa
 */
public class PairingSum {

    public String pairingSum(int[] arr) {
        int first;
        int second;
        int sum;
        String pairs = "";
        
        //Pick element at aposition
        for (int pos = 0; pos < arr.length; pos++) {
            first = arr[pos];
            
            /*Inner loop picks the second element of the pair*/
            for (int s = pos + 1; s < arr.length; s++){
                second = arr[s];
                sum = second+ first;

                /*Check if the sum of the elements exists in the array*/
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == sum) {
                        pairs += "[" + first + ", " + second + "]  ";
                    }
                }
            }

        }
        return pairs;
    }
}
