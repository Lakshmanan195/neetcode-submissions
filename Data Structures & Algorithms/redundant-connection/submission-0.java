class Solution {
    class dsu{
        int[] parent;
        int[] rank;
        dsu(int n){
            parent=new int[n+1];
            for(int i=0;i<=n;i++) parent[i]=i;
            rank=new int[n+1];
        }
        int find(int node){
            if(parent[node]==node) return node;
            parent[node]=find(parent[node]);
            return parent[node];
        }
        void union(int node1,int node2){
            int parent_node1=find(node1);
            int parent_node2=find(node2);
            if(rank[parent_node1]>rank[parent_node2]){
                parent[parent_node2]=parent_node1;
                rank[parent_node1]+=1;
            }
            else{
                parent[parent_node1]=parent_node2;
                rank[parent_node2]+=1;
            }
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        dsu obj=new dsu(1001);
        for(int i=0;i<edges.length;i++){
            int start=edges[i][0];
            int dest=edges[i][1];
            if(obj.find(start)==obj.find(dest)) return new int[]{start,dest};
            obj.union(start,dest);
        }
        return new int[]{};
    }
}
