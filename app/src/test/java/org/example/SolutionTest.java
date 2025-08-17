package org.example;
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void positiveTest1() {
    int nums1[] = new int[] {1,3};
    int nums2[] = new int[] {2};
    Solution s = new Solution();
    double delta = 1e-14;
    assertEquals(s.findMedianSortedArrays(nums1,nums2),2.0,delta);
  }

  @Test
  void positiveTest2() {
    int nums1[] = new int[] {1,2};
    int nums2[] = new int[] {3,4};
    Solution s = new Solution();
    double delta = 1e-14;
    assertEquals(s.findMedianSortedArrays(nums1,nums2),2.5,delta);
  }

    @Test
    void positiveTest3() {
        int nums1[] = new int[] {1};
        int nums2[] = new int[] {};
        Solution s = new Solution();
        double delta = 1e-14;
        assertEquals(s.findMedianSortedArrays(nums1,nums2),1.0,delta);    
    }

    @Test
    void positiveTest4() {
        int nums1[] = new int[] {-1000000};
        int nums2[] = new int[] { 1000000};
        Solution s = new Solution();
        double delta = 1e-14;
        assertEquals(s.findMedianSortedArrays(nums1,nums2),0.0,delta);    
    }

    @Test
    void positiveTest5() {
        int nums1[] = new int[] {1,2,3};
        int nums2[] = new int[] {-3,-2,-1};
        Solution s = new Solution();
        double delta = 1e-14;
        assertEquals(s.findMedianSortedArrays(nums1,nums2),0.0,delta);    
    }

    @Test
    void positiveTest6() {
        int nums1[] = new int[] {2,3};
        int nums2[] = new int[] {-3,-2,-1};
        Solution s = new Solution();
        double delta = 1e-14;
        assertEquals(s.findMedianSortedArrays(nums1,nums2),-1,delta);    
    }

    @Test
    void positiveTest7() {
        int nums1[] = new int[] {2,30};
        int nums2[] = new int[] {-3,-2,-1};
        Solution s = new Solution();
        double delta = 1e-14;
        assertEquals(s.findMedianSortedArrays(nums1,nums2),-1,delta);    
    }

    @Test
    void positiveTest8() {
        int nums1[] = new int[] {1,2,3};
        int nums2[] = new int[] {3,4,5};
        Solution s = new Solution();
        double delta = 1e-14;
        assertEquals(s.findMedianSortedArrays(nums1,nums2),3,delta);    
    }
    @Test
    void positiveTest9() {
        int nums1[] = new int[] {1,2,3};
        int nums2[] = new int[] {10,20,30};
        Solution s = new Solution();
        double delta = 1e-14;
        assertEquals(s.findMedianSortedArrays(nums1,nums2),6.5,delta);    
    }
}






