import java.util.ArrayList;
import java.util.List;

public class Graph {

    public static void main(String[] args){
        int e = 5;  // Number of edges
        int v = 10; // Number of vertices
        int[][] matrix = new int[v+1][v+1]; // Initialize adjacency matrix
        createGraphUsingMatrix(matrix, e); // Create the graph with 5 edges
        printGraph(matrix); // Print the adjacency matrix
        createGraphUsingList(v); // Create the graph using adjacency list
    }

    // Method to create the graph by adding edges in matrix
    private static void createGraphUsingMatrix(int[][] matrix, int e){
        // Example edges (source, destination) to add
        addEdge(matrix, 1, 2);
        addEdge(matrix, 1, 3);
        addEdge(matrix, 2, 4);
        addEdge(matrix, 5, 6);
        addEdge(matrix, 7, 8);
    }

    // Method to add an edge to the graph using the matrix
    private static void addEdge(int[][] matrix, int source, int dest){
        matrix[source][dest] = 1;  // Set the source-destination edge
        matrix[dest][source] = 1;  // Set the destination-source edge (for undirected graph)
    }

    // Method to print the adjacency matrix
    private static void printGraph(int[][] matrix){
        for (int i = 1; i < matrix.length; i++) {  // Start from 1 to skip index 0 (if not needed)
            for (int j = 1; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");  // Print matrix element
            }
            System.out.println();  // Newline after each row
        }
    }

    // Method to create the graph using adjacency list
    private static void createGraphUsingList(int v){
        List<List<Integer>> list = new ArrayList<>();

        // Initialize list of size v+1 (1-based indexing)
        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        // Example edges (source, destination) to add
        addEdge(list, 1, 2);
        addEdge(list, 1, 3);
        addEdge(list, 2, 4);
        addEdge(list, 5, 6);
        addEdge(list, 7, 8);

        printGraphList(list);  // Print the adjacency list
    }

    // Method to add an edge to the graph using the list
    private static void addEdge(List<List<Integer>> list, int source, int destination){
        list.get(source).add(destination);  // Add destination to the source's adjacency list
        list.get(destination).add(source);  // Add source to the destination's adjacency list
    }

    // Method to print the adjacency list
    private static void printGraphList(List<List<Integer>> list){
        for (int i = 1; i < list.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer neighbor : list.get(i)) {
                System.out.print(neighbor + " ");  // Print neighbors of the vertex
            }
            System.out.println();  // Newline after each vertex's neighbors
        }
    }
}
