public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        //menambahkan vertex
        graph.addVertex('A'); // 0 start for dfs
        graph.addVertex('B'); // 1
        graph.addVertex('C'); // 2
        graph.addVertex('D'); // 3
        //menambahkan edge
        graph.addEdge(1,0); //BA
        graph.addEdge(1, 3); //BD
        graph.addEdge(0, 3); //AD
        graph.addEdge(0, 2); //AC
        graph.adjacencyMatrix();
        System.out.println();
    }
}
