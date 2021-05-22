public class Solution {
    public int solution(int[] gift_cards, int[] wants) {
        int len = gift_cards.length;
        int result = 0;

        for (int i = 0; i < len; i++) {
            int gift = gift_cards[i];
            if (gift_cards[i] != wants[i]) {
                for (int j = i + 1; j < len; j++) {
                    if (wants[i] == gift_cards[j]) {
                        int temp = gift_cards[i];
                        gift_cards[i] = gift_cards[j];
                        gift_cards[j] = temp;
                        break;
                    }
                }
                if (gift == gift_cards[i]) {
                    result++;
                }
            }
        }


        return result;
    }
}
