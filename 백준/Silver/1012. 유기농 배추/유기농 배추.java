import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] visited;
    static int [][]map;
    static int[] dx = {0,1,0,-1};
    static int[] dy= {1,0,-1,0};
    static int w;
    static int h;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
         w=0; //가로길이 10
         h=0; // 8
        int location=0;
        int warm =0;

        for(int test_case = 1; test_case<=T; test_case++) {
            StringTokenizer st =new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken()); // 가로먼저나왔다.
            h= Integer.parseInt(st.nextToken());
            location= Integer.parseInt(st.nextToken());
            warm =0;

            map = new int[h][w];
            visited = new boolean[h][w];

            for(int i = 0 ; i<location; i++){
                st =new StringTokenizer(br.readLine());// 1 1
                int x = Integer.parseInt(st.nextToken());
                int y= Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            for(int i = 0 ; i<h; i++){
                for(int j = 0 ; j<w; j++){
                    if(map[i][j]==1){
                        dfs(i,j);
                        warm++;
                    }
                }
            }
            System.out.println(warm);
        }
    }

    static public void dfs(int i,int j) {
        // 처음 들어온 map visited = true;
        map[i][j]=0;
        for(int k =0; k<4; k++) {
            int ny = i + dy[k];
            int nx = j + dx[k];
            if (ny >= 0 && ny < h && nx >= 0 && nx < w) {
                if(map[ny][nx]==1) {

                    dfs(ny,nx);
                }
            }
        }
    }
}