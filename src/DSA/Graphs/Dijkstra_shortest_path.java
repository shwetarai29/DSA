package DSA.Graphs;

import java.util.*;

public class Dijkstra_shortest_path {

    public static class Node {

        private String name;
        private List<Node> shortestPath = new LinkedList<>();
        private Integer distance = Integer.MAX_VALUE;
        Map<Node, Integer> adjacentNodes = new HashMap<>();


        @Override
        public String toString() {
            return "Node{" +
                    "name='" + name + '\'' +
                    ", shortestPath=" + shortestPath +
                    ", distance=" + distance +
                    ", adjacentNodes=" + adjacentNodes +
                    '}';
        }

        public void addDestination(Node destination, int distance) {
            adjacentNodes.put(destination, distance);
        }

        public Node(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Node> getShortestPath() {
            return shortestPath;
        }

        public void setShortestPath(List<Node> shortestPath) {
            this.shortestPath = shortestPath;
        }

        public Integer getDistance() {
            return distance;
        }

        public void setDistance(Integer distance) {
            this.distance = distance;
        }

        public Map<Node, Integer> getAdjacentNodes() {
            return adjacentNodes;
        }

        public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
            this.adjacentNodes = adjacentNodes;
        }
    }

    public static class Graph {

        private Set<Node> nodes = new HashSet<>();

        public void addNode(Node nodeA) {
            nodes.add(nodeA);
        }

        public Set<Node> getNodes() {
            return nodes;
        }

        public void setNodes(Set<Node> nodes) {
            this.nodes = nodes;
        }

        @Override
        public String toString() {
            return "Graph{" +
                    "nodes=" + nodes +
                    '}';
        }

        public static Graph calculateShortestPathFromSource(Graph graph, Node source) {

            source.setDistance(0);

            Set<Node> settledNodes = new HashSet<>();
            Set<Node> unsettledNodes = new HashSet<>();
            unsettledNodes.add(source);

            while (unsettledNodes.size() != 0) {
                Node currentNode = getLowestDistanceNode(unsettledNodes);
                unsettledNodes.remove(currentNode);
                for (Map.Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                    Node adjacentNode = adjacencyPair.getKey();
                    Integer edgeWeigh = adjacencyPair.getValue();

                    if (!settledNodes.contains(adjacentNode)) {
                        CalculateMinimumDistance(adjacentNode, edgeWeigh, currentNode);
                        unsettledNodes.add(adjacentNode);
                    }
                }
                settledNodes.add(currentNode);
            }
            return graph;
        }

        private static void CalculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode) {
            Integer sourceDistance = sourceNode.getDistance();
            if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
                evaluationNode.setDistance(sourceDistance + edgeWeigh);
                LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
                shortestPath.add(sourceNode);
                evaluationNode.setShortestPath(shortestPath);
            }
        }

        private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
            Node lowestDistanceNode = null;
            int lowestDistance = Integer.MAX_VALUE;
            for (Node node : unsettledNodes) {
                int nodeDistance = node.getDistance();
                if (nodeDistance < lowestDistance) {
                    lowestDistance = nodeDistance;
                    lowestDistanceNode = node;
                }
            }
            return lowestDistanceNode;
        }
    }

    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph = graph.calculateShortestPathFromSource(graph, nodeA);
        // System.out.println(graph);
    }
}
