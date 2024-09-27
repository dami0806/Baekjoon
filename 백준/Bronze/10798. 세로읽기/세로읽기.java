import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] arr = new String[5];
        String s = "";

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
              if(i < arr[j].length()){
                  sb.append(arr[j].charAt(i));
              }
            }
        }
        // 결과 출력
        System.out.println(sb.toString());
    }
}
