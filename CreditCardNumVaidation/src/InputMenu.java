import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputMenu {
    private List<Integer> cardNumber = new ArrayList<>();

    public void Input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number of your card: ");
        for (int i = 0; i < 16; i++) {
           cardNumber.add(i, in.nextInt());
        }
        in.close();
        StandartNumCard snc = new StandartNumCard(cardNumber);
        snc.check();
    }
}
