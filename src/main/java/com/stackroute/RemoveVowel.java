package com.stackroute;

public class RemoveVowel
{
    public String[] checkVowel(String s[]) {
        for (int i = 0; i < s.length; i++)
            s[i] = s[i].replaceAll("[aeiouAEIOU]", "");
        return s;
    }
}
