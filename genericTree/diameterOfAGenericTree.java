package practice.genericTree;

import java.io.*;
import java.util.*;

public class diameterOfAGenericTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static Node construct(int[] arr) {
        Node root = null;

        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }


    static int dia = 0;

    static int diameter(Node node){
        int dch = -1;
        int sdch = -1;

        for(Node child : node.children){
            int ch = diameter(child);

            if(ch>dch){
                sdch = dch;
                dch = ch;
            } else if(ch > sdch){
                sdch = ch;
            }
        }

        if(sdch + dch + 2 > dia){
            dia = sdch + dch + 2;
        }

        dch +=1;
        return dch;
    }



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Node root = construct(arr);
        diameter(root);
        System.out.println(dia);
        // write your code here
    }

}
