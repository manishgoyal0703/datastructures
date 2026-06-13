package com.datastructures.datastructures.neetcode.arrays_hashing;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EncodeDecode {



    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str: strs) {
            encodedString.append(str.length()+ "#" + str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int j =0;
        int len = str.length();
        while(j<len){
            StringBuilder sb = new StringBuilder();

            String lenString = "";
            while(str.charAt(j)!='#'){
                lenString += str.charAt(j);
                j++;
            }
            int tempLen = Integer.valueOf(lenString);
            j+=1;
            for (int i = j; i < j + tempLen; i++) {
                sb.append(str.charAt(i));
            }
            result.add(sb.toString());
            j+=tempLen;

        }
        return result;
    }

    public static void main(String[] args) {
        EncodeDecode encodeDecode = new EncodeDecode();
        List<String> dummy_input = List.of("we","say",":","yes","!@#$%^&*()");
        String encode = encodeDecode.encode(dummy_input);
        System.out.println(encode);
        List<String> decode = encodeDecode.decode(encode);
        decode.stream().forEach(s->System.out.print(s + " "));
    }
}
