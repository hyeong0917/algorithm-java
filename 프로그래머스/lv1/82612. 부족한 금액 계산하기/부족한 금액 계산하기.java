class Solution {
    public long solution(int price, int money, int count) {
        long x = new Long(count * (count + 1) / 2);
        long new_price = new Long(price);
        long new_money = new Long(money);
        long answer = new Long(x * price - money);
        if(answer <= 0) return 0;
        return answer;
    }
}