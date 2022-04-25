package DataStructureWithMosh.HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        Map<Integer , Character> map = new HashMap<>();
        int index=1;
        for(char ch:str.toCharArray()){
            map.put(index++, ch);
        }
//        System.out.println(map);

        index=1;
        for(char ch:str.toCharArray()){
            var val = map.remove(index);
            if(!map.containsValue(ch)){
                System.out.println(ch);
                break;
            }
            map.put(index++,val);
        }

    }
}
