//public class MaxDijkstra {
//	public static int V = 9;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
//            {4, 0, 8, 0, 0, 0, 0, 11, 0},
//            {0, 8, 0, 7, 0, 4, 0, 0, 2},
//            {0, 0, 7, 0, 9, 14, 0, 0, 0},
//            {0, 0, 0, 9, 0, 10, 0, 0, 0},
//            {0, 0, 4, 14, 10, 0, 2, 0, 0},
//            {0, 0, 0, 0, 0, 2, 0, 1, 6},
//            {8, 11, 0, 0, 0, 0, 1, 0, 7},
//            {0, 0, 2, 0, 0, 0, 6, 7, 0}
//           };
//           MaxDijkstra t = new MaxDijkstra ();
//           t.dijkstra(graph, 0);
//	}
//
//	public static void dijkstra(int[][] graph, int s){
//		int[] distance = new int[V];
//		boolean[] visited = new boolean[V];
//		for(int i = 0; i < V; i++){
//			distance[i] = 10000;
//			visited[i] = false;
//		}
//		distance[s] = 0;
//		for(int i = 0; i < V-1; i++){
//			int u = minDistance(distance, visited);
//			visited[u] = true;
//			for(int v = 0; v < V; v++){
//				if(graph[u][v] != 0 && !visited[v] && distance[u]!=10000 && distance[v] > distance[u] + graph[u][v]){
//					distance[v] = distance[u] + graph[u][v];
//				}
//			}
//		}
//
//		printSolution(distance, V);
//	}
//
//	public static int minDistance(int[] distance, boolean[] visited){
//		int minimum = 10000;
//		int minIndex = -1;
//		for(int i = 0; i < V; i++){
//			if(!visited[i] && distance[i] < minimum){
//				minimum = distance[i];
//				minIndex = i;
//			}
//		}
//		return minIndex;
//	}
//
//	public static void printSolution(int dist[], int n)
//    {
//        System.out.println("Vertex   Distance from Source");
//        for (int i = 0; i < V; i++)
//            System.out.println(i+"               "+dist[i]);
//    }
//
//}
