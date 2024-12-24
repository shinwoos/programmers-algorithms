# 배열 뒤집기

---

### 문제 설명 <br>
정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

---

### 입출력 예 설명 <br>

입출력 예 #1<br>
num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.<br>

입출력 예 #2<br>
num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.<br>

입출력 예 #3<br>
num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.
<br>

---

### 솔루션 <br>

실제 문제에서 인자의 값이 동적 배열로 들어옴. <br>
반환타입 int[]를 ArrayList<>로 변경. <br>
for loop를 통해 numList[] 배열 인덱스 값을 ArrayList.add() method로 삽입 및 반환.


- stream, collection을 사용해서 해결도 가능하다.
- 값을 받을 배열의 선언 시 numList[].length로 초기화가 가능하다.
