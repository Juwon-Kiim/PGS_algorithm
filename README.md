# PG_algorithm
여기는 프로그래머스 문제!

1. Programmers lv2 방문길이
-정점이 아닌 선분을 체크해야하기 때문에 어려운 문제였다고 생각한다. HashSet을 사용하여 선분을 저장하는데 예를 들어 0,0 에서 0,1로 가는 선분을 저장한다고 하면 set.add("0001")과 set.add("0100")을 통해 밟고간 선분을 저장한다. 여기서 set을 사용하는 이유는 set은 중복이 안되기 때문이다. 그리고 U, D, L, R을 처리할 때 contains 메서드를 사용하여 이미 밟은 선분이면 움직인 길이를 더 추가하지 않도록 해준다.

2. Programmers lv2 주식가격
-이중 for문을 사용하여 입력 배열에서 두개씩 비교하며 가격이 떨어지지 않은 시간을 측정한다. 앞의 주식 가격과 뒤의 주식 가격이 같거나 뒤의 주식 가격이 크면 가격이 떨어지지 않았으므로 시간을 +1 해주고 for문을 계속 돌린다. 앞의 주식 가격보다 뒤의 주식 가격이 작다면 가격이 떨어졌다는 의미이고 1초 후에 가격이 떨어지기 때문에 시간 +1해주고 for문을 탈출한다.

3. Programmers lv2 짝지어제거하기
-stack에 알파벳을 하나씩 넣는다. 이 때 stack 꼭대기에 있는 알파벳이 넣으려 하는 알파벳과 같으면 pop()을 하고 다르다면 push()를 한다. 이렇게 하여 마지막에 stack이 비워져 있다면 1을 그렇지 않으면 0을 반환한다.

4. Programmers lv2 게임맵최단거리
-bfs를 이용한 최단 거리 문제이다. 4방 탐색을 통해 queue에 갈 수 있는 곳의 좌표를 넣으면서 queue에 더이상 값이 없을 때까지 진행한다.
현재 타일에서 다음 타일로 갈 수 있다면 현재까지 더해온 거리에 +1을 한 수를 다음 타일에 넣는다. 이렇게 한다면 다른 길로 빠졌을 때에도 목적지까지의 최단 경로에 영향을 주지 않기 때문이다. 이렇게 하여 만약 도착할 수 있다면 이때까지 더한 수를 return, 도착지가 여전히 1이라면 -1 return하면 된다.

5. Programmers lv2 카펫
-간단한 구현 문제다. 카펫의 중앙과 테두리가 다르게 색칠된 격자의 개수를 기억하고 있고, 이를 통해 전체 카펫의 가로, 세로를 파악하는 문제이다. 중요한 것은 카펫의 가로 길이는 세로 길이와 같거나 세로 길이보다 길다는 것이다. 이를 통해 카펫의 중앙 격자의 가로 세로를 구하기 위해 for문을 돌려서 나누어 떨어지는 수들을 찾고 그 수들로 카펫의 테두리 격자의 개수를 구하는 식을 세우고 그 식이 제공되는 테두리 격자의 개수와 같다면 나오게 되는 두 수가 바로 카펫 중앙의 격자의 가로 세로 길이이다. 이 가로와 세로 길이에 각각 2를 더하면 카펫의 가로, 세로 길이가 된다.

-----------------

알고리즘 스터디가 끝남에 따라 개인 GitHub 저장소에 저장하고 commit 형식은 스터디에서 사용하던 방식으로 진행함
