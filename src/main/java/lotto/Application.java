package lotto;

import java.util.ArrayList;
import java.util.List;

import lotto.Lotto;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    // 랜덤 번호 6개 뽑기
    public static List<Integer> setRandomNumbers(){
        List<Integer> box = new ArrayList<>();
        while(box.size() != 6) {
            int rd = Randoms.pickNumberInRange(1, 45);
            if(box.contains(rd)) continue;
            box.add(rd);
        }
        return box;
    }
    
    private static List<Integer> getUserNumbers(){
        List<Integer> box = new ArrayList<>();
        for (String s : Console.readLine().split(",")) {
            box.add(Integer.parseInt(s));
        }
        return box;
    }

    private static int getUserBonus(Lotto userNumbers){
        int bonus = Integer.parseInt(Console.readLine());
        if (userNumbers.lottoContains(bonus)) throw new IllegalArgumentException();
        return bonus;
    }

    private void judge(Lotto winNum, Lotto user, int bonus){
        int ct = winNum.countMatch(user.getNumbers());
        if(ct < 3) return;
        if(ct < 4);
        if(ct < 5);
        if(ct < 6);
        winNum.lottoContains(bonus);
    }

    public static void main(String[] args) {
        Lotto winNumber = new Lotto(setRandomNumbers());
        Lotto user = new Lotto(getUserNumbers());
        int bonus = getUserBonus(user);
    }
}
