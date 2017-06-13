/*
 * Given an array of integers, find the k'th largest element eg. 3rd largest number in array, 4th largest, etc
 * Example Output:
 * > k_largest( [ 5, 3, 4, 2, 1] , 2 )  //2 is k so looking for 2nd largest in array
 * 4
 */

package justcoding;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author npilusa
 */
public class KLargest {
    
    public int k_largest(int[] arr, int k){
      ArrayList<Integer> n = new ArrayList();
      
      for (int num: arr){
          n.add(num);
      }
      
      Collections.sort(n);

      return n.get(n.size() - k -2);
        
    }
}
