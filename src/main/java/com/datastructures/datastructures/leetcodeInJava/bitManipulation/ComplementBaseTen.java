package com.datastructures.datastructures.leetcodeInJava.bitManipulation;

public class ComplementBaseTen {


    //TC: O(log n), SC: O(1)
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int temp = n;
        int numOfBits = 0;

        //calculate number of bits
        while(temp>0){
            numOfBits++;
            temp >>= 1;
        }

        //calculate bitmask for number of bits
        int bitmask = (1 << numOfBits) -1;

        //calculate complement using xor gate
        return n ^ bitmask;
    }

    public static void main(String[] args) {
        ComplementBaseTen baseTen = new ComplementBaseTen();
        System.out.println(baseTen.bitwiseComplement(5));
    }
}
