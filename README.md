# 구구단 프로젝트 리팩토링 gugudan-java

## 2, 3단 계산 및 출력

- System.out.println(2 * 1)으로 무식하게 2, 3단을 출력

## 4, 5단 값 입력 및 변수

- 4단: 변수 `result`에 값을 담고 `println`으로 출력
- 5단: `Scanner`를 이용해 값 입력을 받고 그 결과값 출력

## 6, 7단 반복문

- 위의 5단까지는 매줄마다 출력문을 작성해야 한다는 노가다의 길이 있었지만 반복문을 사용하면 이를 해결한다.
- 6단: `while문`을 이용해 6단 출력
- 7단: `for문`을 이용해 7단 출력

## 8, 9단 조건문

- 사용자의 입력값을 받고 8, 9단을 출력하되 조건을 단다.
- 조건은 입력한 값이 `2`보다 작거나 `10`보다 큰 경우, 처리를 해준다. (처리는 알아서 할 것)

## 배열과 이중 for문

- 배열에는 구구단의 단을 넣어주고, 이중 for문을 이용하여 구구단을 구현

```java
public class Gugudan {
	public static void main(String[] args) {
		int[] result = new int[8];
		for (int i = 0; i < result.length; i++) {
			result[i] = i + 2;
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 1; j <= result.length + 1; j++) {
				int gugu = result[i] * j;
				System.out.println(gugu);
			}
			System.out.println("--------");
		}
	}
}

```
