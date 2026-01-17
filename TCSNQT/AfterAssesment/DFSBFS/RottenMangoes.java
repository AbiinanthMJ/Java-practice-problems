package TCSNQT.AfterAssesment.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

class node{
    int row;
    int col;
    int tm;
    node (int _row , int _col , int _tm){
        this.col=_col;
        this.row=_row;
        this.tm= _tm;
    }
}
public class RottenMangoes {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}
        };
        int n = grid.length;
        int m = grid[0].length;
        int [][] visited = new int[n][m];
        Queue<node> q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
              if(grid[i][j]==2){
                  visited[i][j]=1;
                  q.add(new node(i,j,0));
              }
              else{
                  visited[i][j]=0;
              }
              if(grid[i][j]==1)fresh++;
            }
        }
        int tm = 0;
        int [] drow = {-1,0,1,0};
        int [] dcol = {1,0,-1,0};
        int cnt = 0;
        while(!q.isEmpty()){
            node  _n = q.peek();
            int r = _n.row;
            int c = _n.col;
            int t = _n.tm;
            tm = Math.max(tm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow = r+drow[i];
                int ncol = c+dcol[i];
                if(nrow>=0&& nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && visited[nrow][ncol]==0){
                    q.add(new node(nrow, ncol , t+1));
                    visited[nrow][ncol]=2;
                    cnt++;
                }
            }
            if(cnt!=fresh){
                System.out.println("-1");
            }
            System.out.println(tm);
        }
    }
}
