package Leetcode_Java_Problems.src;

public class MinDaysBouqets {

  public static void main(String[] args){
    int[] bloomDay = {1, 10, 3, 10, 2};
    int m = 3;
    int k = 2;
    MinDaysBouqets obj = new MinDaysBouqets();
    int result = obj.minDays(bloomDay, m, k);
    System.out.println("Mininum number of days: " + result);
  }
  
  public int minDays(int[] bloomDay, int m, int k) {
    if ((long) m * k > bloomDay.length){
      return -1;
    }  
    
    int low = 1;
    int high = (int) 1e9;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (canMakeBouqets(bloomDay, m, k, mid)) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }
  
  public static boolean canMakeBouqets(int[] bloomDay, int m, int k, int day){
    int total = 0, count = 0;
    for (int bloom : bloomDay){
      if (bloom <= day){
        count++;
        if (count == k){
          total++;
          count = 0;
        } 
      } else{
        count = 0;
      }
    }
    return total >= m;
  }
    
}
