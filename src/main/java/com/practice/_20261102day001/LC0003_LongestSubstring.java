package com.practice._20261102day001;

import java.util.Arrays;

/**
 * LC0003 无重复字符的最长子串（Longest Substring Without Repeating Characters）。
 * 思路：滑动窗口，last[c] 记录字符 c 最近一次出现的下标；
 * 当窗口左界 left 落在重复字符上时，直接把左界跳到重复位置 + 1。
 */
class LC0003_LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int left=0;
        int l = s.length();
        char [] everChar=new char[l];
        if(l==1){
            return 1;
        }
        for(int i =0;i<l;i++){
            // 我的想法是遍历字符串的每一个字符放到数组中，
             everChar[i]=s.charAt(i);
            //  遍历i之前的每一个字符
            //但是left限制了没有重复字符的左边界,只能在左边界的范围内寻找
            for(int j=i-1;j>=left;j--){
                // 查看前面的字符有没有重复的
                // 如果有重复的
                if(everChar[j]==everChar[i]){
                    
                    // 比较是不是最长的字符串
                    // 如果是
                    if(maxLen<i-j){
                        //更新最大长度 
                        maxLen=i-j;
                    }
                    //更新没有重复字符的左边界
                    left=i;

                    break;
                }
                if(j==0&&i==l-1&&maxLen==0){
                    maxLen=l;
                }
                
            }
        }
        return maxLen;

    }
}


