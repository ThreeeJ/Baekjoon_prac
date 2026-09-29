import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int a = 0, b = 0, c = 0;
        
        for (int i=0; i<answers.length; i++) {
            if (people1(i, answers[i])) a++;
            if (people2(i, answers[i])) b++;
            if (people3(i, answers[i])) c++;
        }
        
        int max = Math.max(a, Math.max(b, c));
        
        int count = 0;
        if (a == max) count++;
        if (b == max) count++;
        if (c == max) count++;

        int[] answer = new int[count];
        int index = 0;
        
        if (a == max) answer[index++] = 1;
        if (b == max) answer[index++] = 2;
        if (c == max) answer[index++] = 3;

        return answer;
    }
    
    public boolean people1(int num, int answer) {
        int[] arr1 = {1, 2, 3, 4, 5};
        return arr1[num % arr1.length] == answer;
    }
    
    public boolean people2(int num, int answer) {
        int[] arr2 = {1, 3, 4, 5};
        if (num % 2 == 0) return 2 == answer;
        else return arr2[((num - 1) / 2) % arr2.length] == answer;
    }
    
    public boolean people3(int num, int answer) {
        int[] arr3 = {3, 1, 2, 4, 5};
        return arr3[(num / 2) % arr3.length] == answer;
    }
}