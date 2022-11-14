import java.util.ArrayList;
import java.util.List;

public class StandartNumCard implements CardCheck {
    private List<Integer> cardNumber = new ArrayList<>();
    private static final int cardLen = 15;
    private int sum = 0;
    StandartNumCard(List<Integer> cardNumber) {
       this.cardNumber = cardNumber;
    }
    @Override
    public void check() {
        for (int i = 0; i < cardLen + 1; i++) {
            if (Math.abs(i - cardLen) % 2 != 0) {
                cardNumber.set(i, (cardNumber.get(i) * 2));
                if (cardNumber.get(i)  > 9) {
                    cardNumber.set(i, (cardNumber.get(i)) - 9);
                }
            }
        }
        for(int i = 0; i < cardLen  +1; i++) {
            sum += cardNumber.get(i);
        }
        if (sum % 10 == 0) {
            System.out.println("Validation is OK");
        }
        else {
            System.out.println("Validation failed");
        }
    }
}
