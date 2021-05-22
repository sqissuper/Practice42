package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * ClassName:TextDemo4
 * Package:test
 * Description:
 *
 * @Author:HP
 * @date:2021/5/22 14:31
 */
public class TextDemo4 {
    //二进制求和
//    public String addBinary(String a, String b) {
//        if(a == null || a.length() == 0) return b;
//        if(b == null || b.length() == 0) return a;
//        int i = a.length() - 1;
//        int j = b.length() - 1;
//        int c = 0;
//        StringBuilder sb = new StringBuilder();
//        while(i >= 0 || j >= 0) {
//            if (i >= 0) c += a.charAt(i--) - '0';
//            if (j >= 0) c += b.charAt(j--) - '0';
//
//            sb.append(c % 2);
//            c /= 2;
//        }
//        String res = sb.reverse().toString();
//        return c == 1 ? c + res : res;
//    }

        //分糖果
//    public static int[] distributeCandies(int candies, int num_people) {
//        int[] arr = new int[num_people];
//        int i = 0;
//        while(candies > 0) {
//            if(i + 1 < candies) {
//                arr[i % num_people] += i + 1;
//            } else {
//                arr[i % num_people] += candies;
//            }
//            candies -= i + 1;
//            i++;
//        }
//        return arr;
//    }

    //235. 二叉搜索树的最近公共祖先
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(p == root || q == root) return root;
//        TreeNode cur = root;
//        while(true) {
//            if(p.val > cur.val && q.val > cur.val) {
//                cur = cur.right;
//            } else if(p.val < cur.val && q.val < cur.val) {
//                cur = cur.left;
//            } else {
//                break;
//            }
//        }
//        root = cur;
//        return root;
//    }

    //剑指 Offer 57. 和为s的两个数字
//    public static int[] twoSum(int[] nums, int target) {
//        int[] ret = new int[2];
//        int i = 0,j = nums.length - 1;
//        while(i <= j) {
//            if(nums[i] + nums[j] > target) {
//                j--;
//            } else if(nums[i] + nums[j] < target) {
//                i++;
//            }else {
//                ret[0] = nums[i];
//                ret[1] = nums[j];
//                break;
//            }
//        }
//        return ret;
//    }

    //面试题 01.02. 判定是否互为字符重排
//    public boolean CheckPermutation(String s1, String s2) {
//        if(s1 == s2) return false;
//        if(s1.length() != s2.length()) return false;
//        char[] c1 = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        for(int i  =0; i < c1.length; i++) {
//            if(c1[i] != c2[i]) return false;
//        }
//        return true;
//
//    }

    //面试题 17.04. 消失的数字
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] != i) return i;
//        }
//        return nums[nums.length - 1] + 1;
//    }
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        twoSum(nums,target);
//        int candies = 20, num_people = 3;
//        int[] ret = distributeCandies(candies,num_people);
//        System.out.println(Arrays.toString(ret));

    }
}
