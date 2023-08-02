package com.forloop;

/**
 * ClassName: ForTest3
 * Package: com.loop
 * Description: 輸入兩個正整數m、n，求其"最大公因數"與"最小公倍數"。
 *
 * 說明:
 * 1.我們可以在循環結構中使用break。一旦執行break就跳出(或結束)當前循環結構。
 * 2.如何結束一個循環結構?
 *      Ans1--循環條件不滿足。 (即循環條件執行完為false)
 *      Ans2--在循環主體中執行了break。
 *
 * @Author 黃弘熙
 * @Create 2023/8/3 上午 05:42
 * @Version 1.0
 */
public class ForTest3 {
    public static void main(String[] args) {

        int m = 12;
        int n = 20;

        //獲取m,n中的較小值
        int min = (m < n)? m : n;

        //最大公因數
        //方式1:
        int result = 1;
        for(int i = 1;i <= min;i++) {
            if (m % i == 0 && n % i == 0) {
                //System.out.println(i);
                result = i;
            }
        }
        System.out.println(result);

        //方式2:  推薦
        for(int i = min;i > 0;i--){
            if(m % i == 0 && n % i == 0) {
                System.out.println(i);
                break; //一旦執行就跳出當前循環結構
            }
        }

        //最小公倍數
        //方法1:
        int max = (m < n)? n : m;
        for(int i = max;i <= n * m;i++){
            if(i % m == 0 && i % n == 0){
                System.out.println("最小公倍數為: "+ i);
                break;
            }
        }
        //方法2: 已知最大公因數的情況下，可以使用歐幾里得算法(m * n / i)

        System.out.println("最小公倍數為: " + m * n / result);
    }
}
