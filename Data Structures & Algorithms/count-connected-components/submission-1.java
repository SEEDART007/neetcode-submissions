class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        int compo = 0;
        for(int i=0;i<n;i++){
          adjList.add(new ArrayList<>());
        }
        for(int[] edge : edges){
          int u = edge[0];
          int v = edge[1];

          adjList.get(u).add(v);
          adjList.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
          if(!visited[i]){
            dfs(i,visited,adjList);
            compo++;
          }
        }
        return compo;
    }
    public void dfs(int src, boolean[] visited, List<List<Integer>> adj){
      visited[src] = true;

      for(int neigh : adj.get(src)){
        if(!visited[neigh])
        dfs(neigh,visited,adj);
      }
    }
}
