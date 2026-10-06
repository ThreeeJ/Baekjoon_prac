import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] failRate = new double[N];
        int people = stages.length;

        Integer[] answer = new Integer[N];
        for (int i = 0; i < N; i++) {
            answer[i] = i + 1;
        }
        
        for (int i=1; i<=N; i++) {
            if (people == 0) {
                failRate[i-1] = 0;
                continue;
            }

            int count = 0;
            for (int j=0; j<stages.length; j++) {
                if (stages[j] == i) {
                    count++;
                }
            }

            failRate[i-1] = (double) count/ people;
            people -= count;
        }

        Arrays.sort(answer, (a, b) -> Double.compare(failRate[b-1], failRate[a-1]));

        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
    }
}