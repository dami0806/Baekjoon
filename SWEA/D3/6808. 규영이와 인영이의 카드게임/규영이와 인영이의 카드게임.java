
import java.util.*;
import java.io.*;

class Solution{
    static ArrayList<Integer> list;
    static ArrayList<Integer> list2;
    static int output[];
    static boolean[] visited;
    static int winner;
    static int loser;

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim()); // 4

        for (int test_case = 1; test_case <= T; test_case++) {
            // 규영 카트
            winner = 0;
            loser = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            list = new ArrayList<>();
            list2 = new ArrayList<>();

            visited = new boolean[9];
            output = new int[9];
            for (int i = 0; i < 9; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            for (int i = 1; i <= 18; i++) {
                if (!(list.contains(i))) {
                    list2.add(i);
                }
            }

            dfs(0);
            System.out.println("#" + test_case + " " +winner + " "+ loser);
        }
    }

    static void dfs(int depth) {
        if (depth == 9) {
            // 이때의 output을가지고 list와 비교
             int gScore = 0;
            int iScore = 0;
            for (int i = 0; i < 9; i++) {
               int g = list.get(i);
               int n = output[i];
                
                if(g> n) gScore+= g+n;
                else iScore+=g+n;
            }
                if(gScore>iScore) winner++;
                else loser++;
                return;
            }
            for (int i = 0; i < 9; i++) {
                if (visited[i] == false) {
                    visited[i] = true;
                    output[depth] = list2.get(i);
                    dfs(depth + 1);
                    visited[i] = false;
                }
            }
        }
}