package practice.linkedList;

import java.io.*;
import java.util.*;

public class linkedListToQueue {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LLToQueueAdapter qu = new LLToQueueAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }

    public static class LLToQueueAdapter {
        LinkedList<Integer> list;

        public LLToQueueAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void add(int val) {
            list.addLast(val);
        }

        int remove() {
            if(list.size() ==0){
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return list.removeFirst();
            }
        }

        int peek() {
            if(list.size() ==0){
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return list.getFirst();
            }
        }
    }
}
