import java.io.*;
import java.util.*;
import org.junit.*;
  import org.junit.runner.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


public class Solution {
  
    public static void main(String[] args) {
      JUnitCore.main("Solution");
    }

  
  @Test
  public void success() {
    int a[] = {1,9,23,8,0,6,2,4,8,8,34,76,22,1,5,6};
    int b[] ={1,9,23,68,0,6,2,4,88,34,76,22};;
    System.out.println("Original:" + Arrays.toString(a));   
    Solution s = new Solution();
    
    s.quickSort(a,0,a.length-1);
    
    if(Arrays.equals(a,b)) {System.out.println("Success");} else  {System.out.println("Failed");}
    
    
    System.out.println("Final:" + Arrays.toString(a));
  }
  
  
  @Test
  public void successPartition() {
    int a[] = {1,9,23,8,0,6,2,4,8,8,34,76,22,1,5,6};
    int b[] ={1,9,23,8,0,6,2,4,8,8,34,76,22};
    System.out.println("Original:" + Arrays.toString(a));   
    Solution s = new Solution();
    
    //s.quickSort(a,0,a.length-1);
     
    s.partition( a, 0,a.length-1, a.length-1);
    
    if(Arrays.equals(a,b)) {System.out.println("Success");} else  {System.out.println("Failed");}
    
    
    System.out.println("Final partition:" + Arrays.toString(a));
  }
  
  
  void quickSort(int[] a, int lo, int hi){
    
    int p = hi;
    
    if(hi>lo) {
     
      p = this.partition(a,lo, hi, p);
    
      this.quickSort(a, lo, p-1);
      this.quickSort(a, p+1, hi );
    }
    
  }
  
  
  int partition(int[] a, int lo, int hi, int p){
    
   // System.out.println("hi: " + a[hi] + "lo: " +a[lo]);  
    int ind = lo;
    
    if(lo<hi) {
      
      for(int i=lo; i<=hi; i++ ) {
      
        if(a[i]<a[p]) {
          
          if(ind !=i) {
            int c = a[i];

            a[i]= a[ind];
            a[ind]=c;
          }
          
          ++ind;          
        }
        
        
        if(i==p&&ind<p) {
          
          int c = a[p];

            a[p]= a[ind];
            a[ind]=c;
        }
      
      }
    }
    
    //System.out.println("Partition: " + Arrays.toString(a) + "ind: " +ind );  
    return ind;
  }
    
  
  
}
