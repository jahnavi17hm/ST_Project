package org.example;
import java.util.*;
public class Dfs
{
    static class Graph {
        private final Map<Integer, List<Integer>> adjacencyList;
        public Graph() {
            this.adjacencyList = new HashMap<>();
        }
        public void addEdge(int source, int destination) {
            adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
            adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
        }
        public void removeEdge(int source, int destination) {
            adjacencyList.get(source).remove(Integer.valueOf(destination));
            adjacencyList.get(destination).remove(Integer.valueOf(source));
        }

        public int numberOfComponents() {
            Set<Integer> visited = new HashSet<>();
            int components = 0;

            for (int node : adjacencyList.keySet()) {
                if (!visited.contains(node)) {
                    dfsTraversal(node, visited);
                    components++;
                }
            }
            return components;
        }
        private void dfsTraversal(int startNode, Set<Integer> visited) {
            Stack<Integer> stack = new Stack<>();
            stack.push(startNode);
            visited.add(startNode);

            while (!stack.isEmpty()) {
                int current = stack.pop();
                for (int neighbor : adjacencyList.getOrDefault(current, Collections.emptyList())) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }
        public boolean isBipartite() {
            Set<Integer> visited = new HashSet<>();
            Map<Integer, Integer> color = new HashMap<>();

            for (int node : adjacencyList.keySet()) {
                if (!visited.contains(node)) {
                    if (!bipartiteDfs(node, visited, color)) {
                        return false;
                    }
                }
            }
            return true;
        }
        private boolean bipartiteDfs(int startNode, Set<Integer> visited, Map<Integer, Integer> color) {
            Stack<Integer> stack = new Stack<>();
            stack.push(startNode);
            visited.add(startNode);
            color.put(startNode, 0);

            while (!stack.isEmpty()) {
                int current = stack.pop();

                for (int neighbor : adjacencyList.getOrDefault(current, Collections.emptyList())) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                        visited.add(neighbor);
                        color.put(neighbor, 1 - color.get(current));
                    } else if (color.get(neighbor).equals(color.get(current))) {
                        return false; // Graph is not bipartite
                    }
                }
            }
            return true;
        }
        public boolean hasCycle() {
            Set<Integer> visited = new HashSet<>();

            for (int node : adjacencyList.keySet()) {
                if (!visited.contains(node)) {
                    if (hasCycleDfs(node, visited, -1)) {
                        return true;
                    }
                }
            }
            return false;
        }
        private boolean hasCycleDfs(int current, Set<Integer> visited, int parent) {
            visited.add(current);

            for (int neighbor : adjacencyList.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    if (hasCycleDfs(neighbor, visited, current)) {
                        return true;
                    }
                } else if (neighbor != parent) {
                    return true; // Cycle detected
                }
            }
            return false;
        }
    }
}
