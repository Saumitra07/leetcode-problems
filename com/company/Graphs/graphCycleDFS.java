package com.company.Graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class graphCycleDFS {
    public static void main(String[] args) {
      //  int[][] adj=new int[][]{{1}, {0, 2}, {1}, {}} ;
      int[][] adj=new int[][]{{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}};
        int V=5;
        boolean[] visited=new boolean[V];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<V;i++)
        {
           if(!visited[i])
            // if(check(-1,i,adj,visited))
            // {
            //     System.out.print("cycle detected");
            // }
            if(bfs(i,adj,visited,map))
            System.out.print("cycle detected");
              
        }
        
     //   System.out.print("No cycle detected");
    
    }

    public static boolean check(int parent,int source,int[][] adj,boolean[] visited)
    {
        visited[source]=true;
       
            for(int i:adj[source])
            {
                if(!visited[i])
                {

                       if(check(source,i,adj,visited))
                        {
                          return true;
                        }
                }
                else if(i!=parent)
                    return true;
            }
        
        return false;
    
    }

        
    public static boolean bfs(int source,int[][] adj,boolean[] visited, HashMap<Integer,Integer> map)
    {
        Queue<int[]> q=new LinkedList<>();
        
        q.add(new int[]{source,-1});
        visited[source]=true;
        
        while(!q.isEmpty())
        {
            int[] pair=q.poll();
            int node=pair[0];
            int parent=pair[1];
            visited[node]=true;
            
                for(int i:adj[node])
                {
                    if(!visited[i])
                    {
                        q.add(new int[]{i,node});
                        // map.put(i, n);
                    }
                      
                    else if(i!=parent)
                        return true;
                }
            

             
        }
        return false;
    }
}
