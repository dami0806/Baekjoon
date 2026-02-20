import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        // classic → [(0,500), (2,150), (3,800)]
        
        // 1. 장르별 총 재생 수 계산
         // classic → 500 + 150 + 800 = 1450
         // pop     → 600 + 2500      = 3100
        HashMap<String,Integer>totalMap = new HashMap();
        HashMap<String,ArrayList<int[]>>map = new HashMap();
        for(int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            totalMap.put(genre,totalMap.getOrDefault(genre,0) +play);
            // classic → 1450
            // pop → 3100
            map.putIfAbsent(genre,new ArrayList<>());
            map.get(genre).add(new int[]{i,plays[i]});
        }
        
        
        // 2. 장르 내에서 노래 정렬 map
         // classic → [(0,500), (2,150), (3,800)]
         // pop     → [(1,600), (4,2500)]
        //HashMap<String,ArrayList<int[]>>map = new HashMap();
         // for(int i = 0; i < genres.length; i++) {
         //    map.putIfAbsent(genre,new ArrayList<>());
         //    map.get(genre).add(new int[]{i,plays[i]});
         // }
        
        // 3. 장르를 총 재생 수 기준으로 정렬 후, 각 장르에서 최대 2개 선택
        //["pop", "classic"]
        ArrayList<String> genreList = new ArrayList<>(totalMap.keySet());
        genreList.sort((a,b)-> totalMap.get(b)-totalMap.get(a));
        
        ArrayList<Integer>result = new ArrayList<>();
        
         // 1순위: 재생 수 내림차순
         // 2순위: index 오름차순
        for(String genre : genreList) {
            ArrayList<int[]>songList = map.get(genre);
             //[(0,500), (2,150), (3,800)]
            Collections.sort(songList, (a, b) -> {
                if(b[1] == a[1])
                     return a[0]-b[0];
                return b[1] - a[1];
            });
            result.add(songList.get(0)[0]);
                
                if(songList.size()>1){
                    result.add(songList.get(1)[0]);
                }
        }
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);}
             return answer;
        
    }
}