package Algo_D0406;

import java.util.Set;
import java.util.HashSet;

class Solution {
    // 상하좌우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    
    public int solution(String dirs) {
        int answer = 0;
        int curX = 0, curY = 0;
        int nextX = 0, nextY = 0;
        
        Set<String> set = new HashSet<String>();
        
        for(int i=0;i<dirs.length();i++){
            switch(dirs.charAt(i)){
                case 'U':
                    nextX = curX + dx[0];
                    nextY = curY + dy[0];
                    if(nextY>5) continue;
                    if(!set.contains(curX+""+curY+""+nextX+""+nextY) && !set.contains(nextX+""+nextY+""+curX+""+curY)){
                        set.add(curX+""+curY+""+nextX+""+nextY);
                        set.add(nextX+""+nextY+""+curX+""+curY);
                        
                        answer++;
                    }
                    curX = nextX;
                        curY = nextY;
                    break;
                case 'D':
                    nextX = curX + dx[1];
                    nextY = curY + dy[1];
                    if(nextY<-5) continue;
                    if(!set.contains(curX+""+curY+""+nextX+""+nextY) && !set.contains(nextX+""+nextY+""+curX+""+curY)){
                        set.add(curX+""+curY+""+nextX+""+nextY);
                        set.add(nextX+""+nextY+""+curX+""+curY);
                        
                        answer++;
                    }
                    curX = nextX;
                        curY = nextY;
                    break;
                case 'L':
                    nextX = curX + dx[2];
                    nextY = curY + dy[2];
                    if(nextX<-5) continue;
                    if(!set.contains(curX+""+curY+""+nextX+""+nextY) && !set.contains(nextX+""+nextY+""+curX+""+curY)){
                        set.add(curX+""+curY+""+nextX+""+nextY);
                        set.add(nextX+""+nextY+""+curX+""+curY);
                       
                        answer++;
                    }
                     curX = nextX;
                        curY = nextY;
                    break;
                case 'R':
                    nextX = curX + dx[3];
                    nextY = curY + dy[3];
                    if(nextX>5) continue;
                    if(!set.contains(curX+""+curY+""+nextX+""+nextY) && !set.contains(nextX+""+nextY+""+curX+""+curY)){
                        set.add(curX+""+curY+""+nextX+""+nextY);
                        set.add(nextX+""+nextY+""+curX+""+curY);
                      
                        answer++;
                    }
                      curX = nextX;
                        curY = nextY;
                    break;
            }
        }
        System.out.println(set.toString());
        return answer;
    }
}