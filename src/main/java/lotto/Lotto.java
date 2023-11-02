package lotto;

import java.util.List;


public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("로또 번호는 중복되지 않는 6개 번호 입니다. 프로그렘을 종료합니다.");
        }
    }

    // TODO: 추가 기능 구현
    public boolean lottoContains(int a){
        for (Integer integer : numbers) {
            if (a == integer) return true;
        }
        return false;
    }

    public List<Integer> getNumbers(){
        return numbers;
    }
}
