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
- 이중 for문을 사용하였기에 시간복잡도는 `O(n^2)`이 되겠다.

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

## 메소드를 이용한 구구단

```java
public class Gugudan {
	public static int[] calc(int dan) { //정적 메소드 선언
		int[] result = new int[9];
 		for (int i = 0; i < result.length; i++) {
 			result[i] = dan * (i + 1);
 		}
		return result; //배열 리턴
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			int[] result = calc(i + 2);
			for (int j = 0; j < result.length; j++) {
				System.out.println(result[j]);
			}
			System.out.println("---------");
		}
	}
}
```

## 클래스를 이용한 구구단

- 전에 메소드 calc()를 한 클래스에 생성했는데 이것을 다른 클래스에 두어 `API`처럼 사용할 수 있다.
- 이 때 원래는 `new` 연산자를 이용하여 생성자를 생성해야 하지만, 우리는 `static`이라는 정적 메소드를 선언하였다.
- static에 대해서는 나중에 더 자세히 다룰 예정이지만 지금은 각각의 클래스에 객체를 생성할 필요없이 한번 선언하면 `공유한다`로 이해하면 되겠다.
- 사용법은 메소드 앞에 `클래스명.`만 붙여주면 된다.

```java
public class GugudanMain {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			int[] result = Gugudan.calc(i + 2);
			for (int j = 0; j < result.length; j++) {
				System.out.println(result[j]);
			}
			System.out.println("---------");
		}
	}
}
```
