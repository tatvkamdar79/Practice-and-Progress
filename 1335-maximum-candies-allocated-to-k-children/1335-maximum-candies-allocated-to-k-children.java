// class Solution {
//   public int maximumCandies(int[] nums, long k) {
//     if(nums.length == 1) {
//       if(nums[0] < k) return 0;
//       return (int)((long)nums[0] / k);
//     }
//     int max = Integer.MIN_VALUE;
//     int min = 0;
//     for(int i : nums) {
//       max = Math.max(max, i);
//       // min = Math.min(min, i);
//     }
//     int ans = Integer.MIN_VALUE;
//     while(min <= max) {
//       int mid = min + ((max-min)/2);
//       if(mid == 0) break;
//       // System.out.println(mid);
//       long kids = k;
//       boolean found = false;
//       for(int i = 0; i < nums.length; i++) {
//         if(nums[i] < mid) continue;
//         int canGive = nums[i] / mid;
//         if(kids - canGive <= 0) {
//           found = true;
//           ans = Math.max(ans, mid);
//           break;
//         } else {
//           kids -= canGive;
//         }
//       }
//       if(found) {
//         min = mid + 1;
//       } else {
//         max = mid - 1;
//       }
//     }
//     return ans == Integer.MIN_VALUE ? 0 : ans;
//   }
// }
class Solution {
  public int maximumCandies(int[] nums, long k) {
    int max = 0;
    for (int num : nums) {
      max = Math.max(max, num);
    }

    int low = 1, high = max;
    int ans = 0;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      long totalKids = 0;
      for (int num : nums) {
        totalKids += num / mid;
      }

      if (totalKids >= k) {
        ans = mid;        // This mid is valid, try to find a bigger one
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return ans;
  }
}
