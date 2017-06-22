//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//Given two integers x and y, calculate the Hamming distance.



public class Solution {
    public int hammingDistance(int x, int y) {
    int dist = 0;
    int val = x ^ y;

    while (val != 0){
         
        dist++;
        val &= val - 1;
    }
    
    return dist;
    }
}