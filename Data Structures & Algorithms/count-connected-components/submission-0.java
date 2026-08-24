class Solution {
    public int countComponents(int n, int[][] edges) {
      int ans = 0;
      boolean[] visited = new boolean[n];
      List<List<Integer>> graph = new ArrayList<>();
      for(int i=0;i<n;i++){
        graph.add(new ArrayList<>());
      }
      for(int[] edge : edges){
        int u = edge[0];
        int v = edge[1];

        graph.get(u).add(v);
        graph.get(v).add(u);
      }
      for(int i=0;i<n;i++){
        if(!visited[i]){
         dfs(i,visited,graph);
         ans++;
        }
      }
      return ans;
    }
    public void dfs(int src , boolean[] visited, List<List<Integer>> graph ){
        visited[src] = true;

        for(int neigh : graph.get(src)){
            if(!visited[neigh]){
                dfs(neigh,visited,graph);
            }
        }
    }
}
