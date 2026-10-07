import java.util.*;

class Solution {
    public int solution(String dirs) {
        Map<String, Set<Character>> map = new HashMap<>();
        
        int x = 0, y = 0, preX, preY;
        char move, oppositeMove = ' ';
        for (int i=0; i<dirs.length(); i++) {
            preX = x; preY = y;
            move = dirs.charAt(i);
            switch (move) {
                case 'U':
                    if (y < 5) {
                        y++; oppositeMove = 'D';
                    }
                    break;
                case 'D':
                    if (y > -5) {
                        y--; oppositeMove = 'U';
                    }
                    break;
                case 'R':
                    if (x < 5) {
                        x++; oppositeMove = 'L';
                    }
                    break;
                case 'L':
                    if (x > -5) {
                        x--; oppositeMove = 'R';
                    }
                    break;
            }

            if (x == preX && y == preY) {
                continue;
            }

            String key = x + "," + y;
            String oppositeKey = preX + "," + preY;
            map.computeIfAbsent(key, k -> new HashSet<>()).add(move);
            map.computeIfAbsent(oppositeKey, k -> new HashSet<>()).add(oppositeMove);
        }

        int answer = 0;
        for (Set<Character> set : map.values()) {
            answer += set.size();
        }

        return answer / 2;
    }
}