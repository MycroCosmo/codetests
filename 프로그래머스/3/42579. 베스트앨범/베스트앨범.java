import java.util.*;

class Solution {
     public int[] solution(String[] genres, int[] plays) {
        // 장르별 총 재생 횟수를 저장할 HashMap
        HashMap<String, Integer> genrePlayCount = new HashMap<>();
        // 장르별 노래 리스트를 저장할 HashMap
        HashMap<String, ArrayList<int[]>> genreSongs = new HashMap<>();

        // 데이터 초기화
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            // 장르별 총 재생 횟수 업데이트
            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + play);

            // 장르별 노래 리스트에 추가
            if (!genreSongs.containsKey(genre)) {
                genreSongs.put(genre, new ArrayList<>());
            }
            genreSongs.get(genre).add(new int[]{i, play});
        }

        // 장르를 재생 횟수 기준으로 정렬
        List<String> genreOrder = new ArrayList<>(genrePlayCount.keySet());
        Collections.sort(genreOrder, new Comparator<String>() {
            @Override
            public int compare(String g1, String g2) {
                return genrePlayCount.get(g2) - genrePlayCount.get(g1);
            }
        });

        // 결과를 저장할 리스트
        ArrayList<Integer> bestAlbum = new ArrayList<>();

        // 각 장르별로 최대 두 곡을 선택
        for (String genre : genreOrder) {
            List<int[]> songs = genreSongs.get(genre);

            // 노래를 재생 횟수 및 고유 번호 기준으로 정렬
            Collections.sort(songs, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    if (b[1] == a[1]) {
                        return a[0] - b[0];  // 재생 횟수가 같으면 고유 번호 기준으로 정렬
                    } else {
                        return b[1] - a[1];  // 재생 횟수 기준으로 내림차순 정렬
                    }
                }
            });

            // 최대 두 곡 선택
            for (int i = 0; i < Math.min(songs.size(), 2); i++) {
                bestAlbum.add(songs.get(i)[0]);
            }
        }

        // 결과를 배열로 변환하여 반환
        int[] result = new int[bestAlbum.size()];
        for (int i = 0; i < bestAlbum.size(); i++) {
            result[i] = bestAlbum.get(i);
        }
        return result;
    }
}