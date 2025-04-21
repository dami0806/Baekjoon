/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = &apos;b&apos;;
// String var = &quot;ABCDEFG&quot;;
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Main
{
    static int N;
    static int[] arr;
    static int answer1;
    static int answer2;
     static int answer3;
     static int answer4;
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         N = Integer.parseInt(br.readLine()); // 5
         arr= new int[N];
         answer1 =0;
         answer2 =0;
         answer3 =0;
         answer4 =0;
        
        for(int i = 0; i<N; i++){
             arr[i] = Integer.parseInt(br.readLine()); 
        }
        
        Arrays.sort(arr); // -2,1,2,3,8,
        check();
        
        
        
	}
    static void check(){
      if(N==1) {
        	System.out.println(arr[0]); // 산술평균
    		System.out.println(arr[0]); // 중앙값
    		System.out.println(arr[0]); // 최빈값
   			 System.out.println(0);   // 범위
            return;
        } else{
        
          // 1. 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
		for(int i =0; i<N; i++) {
        	answer1+=arr[i];
        }
        answer1 = (int)Math.round((double)answer1/N);

        // 2.중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        answer2 = arr[(int)N/2];
        
        // 최빈값 : N개의 수들 중 가장 많이 나타나는 값
        HashMap<Integer, Integer> map = new HashMap<>();
       	for(int i =0; i<N; i++) {
        	map.put(arr[i],map.getOrDefault(arr[i],0)+1); // 작은수 부터 저장했음.
        }
          
          int maxCount = 0;
          int min =0;
          ArrayList<Integer> minSec= new ArrayList<>();
         // 가장 많이 나타나는값
          for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
             int val = entry.getKey();
             int cnt = entry.getValue();

             //  여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다. 가장 작은거에서 2번째
              if (cnt > maxCount) {
              		maxCount = cnt;
                  minSec.clear(); 
                  	minSec.add(val);
              } else if (cnt == maxCount) {
                  minSec.add(val);
              }
          }
        Collections.sort(minSec);
           answer3 = (minSec.size() == 1) ? minSec.get(0) : minSec.get(1);
          
        
          
        //4.범위 : N개의 수들 중 최댓값과 최솟값의 차이
        answer4 = arr[N-1]-arr[0];
          System.out.println(answer1);
          System.out.println(answer2);
          System.out.println(answer3);
          System.out.println(answer4);
        }
    }
}