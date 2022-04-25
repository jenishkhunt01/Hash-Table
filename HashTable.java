package DataStructureWithMosh.HashTable;

import java.util.LinkedList;

public class HashTable {

    private class Entry{
        private int key;
        private int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key , int value){
        int index = hash(key);
        if(entries[index] == null)
            entries[index] = new LinkedList<>();

        var bucket = entries[index];
        for(var entry :bucket) {
            if (entry.key == key){
                entry.value = value;
                return;
            }
        }
        var entry = new Entry(key , value);
        entries[index].addLast(entry);

    }

    public int get(int key){
        int index = hash(key);
        var bucket = entries[index];
        for(var entry:bucket){
            if(entry.key == key)
                return entry.value ;
        }
        return 0;
    }

    public void remove(int key){
        int index = hash(key);
        var bucket = entries[index];
        for(var entry:bucket) {
            if (entry.key == key){
                bucket.remove();
                return;
           }
        }
    }

    private int hash(int key){
        return key%entries.length;
    }
}

class Main{
    public static void main(String[] args) {
        HashTable table = new HashTable();
//        table.put(2 , "ashu");
//        table.put(2 , "sid");
//        table.put(7 , "jenish");
        System.out.println(table.get(7));
        table.remove(2);
    }
}
