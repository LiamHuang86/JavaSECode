package com.forloop;

/**
 * ClassName: ForTest
 * Package: com.loop
 * Description:  循環結構之一 : for循環
 *
 * 1. Java中規範了3種循環結構: for、while、do-while
 * 2. 凡是循環結構，就一定會有四個要素
 *   a) 初始化
 *   b) 條件檢查  ----> 條件一定是boolean類型的變量或表達式
 *   c) 循環主體
 *   d) 更新(迭代)
 *
 * 3. for循環的格式
 *
 * for(a;b;d){
 *     c
 * }
 *
 * 執行過程: a - b - c - d - b - c - d - b - ... - b(最終循環條件不滿足，則結束此結構。)
 *
 * @Author 黃弘熙
 * @Create 2023/8/3 上午 04:35
 * @Version 1.0
 */

public class ForTest {
    public static void main(String[] args) {

        //需求1: 輸出5行HelloWorld
        /*方法1--
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        */

        //方法2--
        for(int i = 1;i <= 5;i++){
            System.out.println("HelloWorld");
        }
        //需求2: 測試實際運行順序
        int num = 1;
        for(System.out.println("a");num < 3; System.out.println("c"),num++){
            System.out.println("b");
        }
        //輸出結果: abcbc

        //需求3: 遍歷1-100之間的偶數，並獲取偶數的個數，獲取所有偶數的和
        int count = 0; //紀錄偶數的個數
        int sum = 0; //紀錄所有偶數的和
        for(int i  = 1;i <= 100;i++){
            if(i % 2 == 0){
                System.out.println(i);
                count++;
                sum += i;
            }


        }
        System.out.println("偶數個數為: " + count); //寫在循環外
        System.out.println("所有偶數的和為: " + sum);
    }
}
