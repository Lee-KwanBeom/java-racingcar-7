package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        //자동차 이름들 입력 받기
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = Console.readLine();
        String[] carNameArray = carNames.split(",");

        //시도할 횟수 입력 받기
        System.out.println("시도할 횟수는 몇 회인가요?");
        String stringCount = Console.readLine();
        int count = Integer.parseInt(stringCount);

        //자동차 이름들 LinkedHashMap에 담기
        Map<String, Integer> carMap = new LinkedHashMap<>();
        for (String s : carNameArray) { //자동차 담긴 배열의 길이만큼 돌려서 맵에 넣기
            if (s.length() < 6){
                carMap.put(s, 0);
            }else {
                throw new IllegalArgumentException("자동차 이름은 5글자 이하로 입력해주세요!");
            }
        }
        //자동차 Map 엔트리 선언
        Set<Map.Entry<String, Integer>> carEntry = carMap.entrySet();

        //출력 바 설정
        String bar = "-";

        //자동차 Map 엔트리셋하면서 랜덤 함수값 대입후 출력
        System.out.println("\n실행 결과");
        for (int i = 0; i < count; i++) {
            for (Map.Entry<String, Integer> entry : carEntry) {

                //오류 확인 부탁 드립니다
                int randomNumber = Randoms.pickNumberInRange(0, 9);
                if (randomNumber >= 4){
                    carMap.put(entry.getKey(), entry.getValue());
                }else {
                    carMap.put(entry.getKey(), entry.getValue() + 1);
                }
                System.out.println(entry.getKey() + " : " + bar.repeat(entry.getValue()));

            }
            System.out.println();
        }

        //Map의 값들중 최대값 구하기
        int maxNumber = 0;
        for (Map.Entry<String, Integer> entry : carMap.entrySet()) {
            if (entry.getValue() > maxNumber) {
                maxNumber = entry.getValue();
            }
        }

        //최대값 ArrayList에 담기
        List<String> finalWinners = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : carMap.entrySet()) {
            if (entry.getValue() == maxNumber) {
                finalWinners.add(entry.getKey());
            }
        }

        //최종 우승자 출력
        System.out.println("최종 우승자 : " + String.join(", ", finalWinners));

    }
}
