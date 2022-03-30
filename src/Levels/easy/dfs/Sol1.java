package Levels.easy.dfs;

import java.util.ArrayList;
import java.util.List;

// O(v + e) time | O(v) space
public class Sol1 {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            array.add(this.name);
            for (Node child : children) {
                child.depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

    public static void main(String args[]) {
        Node a = new Node("A");
        a.addChild("B");
        a.addChild("C");
        a.addChild("D");

        a.children.get(0).addChild("E");
        a.children.get(0).addChild("F");
        a.children.get(0).children.get(1).addChild("I");
        a.children.get(0).children.get(1).addChild("J");
        a.children.get(2).addChild("G");
        a.children.get(2).addChild("H");
        a.children.get(2).children.get(0).addChild("K");

   /*           A
          B     C      D
      E     F        G    H
          I   J      K*/
        System.out.println(a.depthFirstSearch(new ArrayList<>()));

    }
}
