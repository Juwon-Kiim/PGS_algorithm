package Algo_D0509;

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static boolean[][] visited;
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        
        bfs(0, 0, maps);
        
        return maps[maps.length-1][maps[0].length-1]==1?-1:maps[maps.length-1][maps[0].length-1];
    }
    public void bfs(int r, int c, int[][] maps){
        Queue<int[]> queue = new LinkedList<>();
        
        visited[r][c] = true;
        queue.offer(new int[] {r, c});
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int cr = cur[0];
            int cc = cur[1];
            for(int d=0;d<4;d++){
                int nr = cr+dr[d];
                int nc = cc+dc[d];
                
                if(nr>=0 && nr<maps.length && nc>=0 && nc<maps[0].length && !visited[nr][nc] && maps[nr][nc]!=0){
                    queue.offer(new int[] {nr, nc});
                    visited[nr][nc]=true;
                    maps[nr][nc]=maps[cr][cc]+1;
                }
            }
        }
    }
}