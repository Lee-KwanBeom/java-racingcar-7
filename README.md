# java-racingcar-precourse

## 과제 진행 요구 사항
* [] 미션을 저장소에 포크하고 클론
* [] 기능 구현전 README.md에 구현할 기능 목록을 정리
* [] 기능 목록 단위 커밋

<hr/>

## 기능 요구 사항
* [] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* [] 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* [] 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* [] 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* [] 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
* [] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
* [] 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
* [] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.
* [] 샘플내용

<hr/>

## 프로그래밍 요구 사항
* [] JDK 21 버전에서 실행 가능
* [] 샘플내용
* [] 샘플내용

<hr/>

## 라이브러리
* [] camp.nextstep.edu.missionutils에서 제공하는 Randoms 및 Console API를 사용
* [] Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용
* [] 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용
