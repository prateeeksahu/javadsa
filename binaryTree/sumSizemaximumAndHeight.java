package practice.binaryTree;

import java.io.*;
import java.util.*;

public class sumSizemaximumAndHeight {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static int size(Node node) {
       if(node == null){return 0;}

       int rsize = size(node.right);
       int lsize = size(node.left);

       return rsize+lsize+1;

    }

    public static int sum(Node node) {
        if(node == null){return 0;}

        int rsum = sum(node.right);
        int lsum = sum(node.left);

        return rsum+lsum+node.data;
    }

    public static int max(Node node) {
        if(node == null){return Integer.MIN_VALUE;}

        int rmax = max(node.right);
        int lmax = max(node.left);


        return Math.max(Math.max(rmax, lmax),node.data);
    }

    public static int height(Node node) {
        if(node == null){return -1;}

        int rht = height(node.right);
        int lht = height(node.left);


        return Math.max(rht, lht) +1;
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            Integer[] arr = new Integer[n];
            String[] values = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                if (values[i].equals("n") == false) {
                    arr[i] = Integer.parseInt(values[i]);
                } else {
                    arr[i] = null;
                }
            }

            Node root = construct(arr);

            int size = size(root);
            int sum = sum(root);
            int max = max(root);
            int ht = height(root);
            System.out.println(size);
            System.out.println(sum);
            System.out.println(max);
            System.out.println(ht);
        }

    }