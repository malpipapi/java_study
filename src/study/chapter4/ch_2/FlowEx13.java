package study.chapter4.ch_2;

public class FlowEx13 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i < 10; i++) {
            sum+=i; //sum= sum+i
            System.out.printf("1부터 %2까지의 합: %2d%n",i,sum);
        }
    }
}