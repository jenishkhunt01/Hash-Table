package DataStructureWithMosh.HashTable;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "green apple";
        Map<Character , Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()){
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch , count+1);
        }
        for(char ch:str.toCharArray()){
            if(map.get(ch) != 1 ){
                System.out.println(ch);
                break;
            }
        }
    }
}
