package com.forloop;

/**
 * ClassName: ForTest2
 * Package: com.loop
 * Description: 计笲衡(1计ㄤ计ミよ㎝)ㄒ" 153 = 1*1*1 + 3*3*3 + 5*5*5"
 *
 * @Author 独グ撼
 * @Create 2023/8/3 と 05:22
 * @Version 1.0
 */
public class ForTest2 {
    public static void main(String[] args) {

        for(int i = 100;i < 1000;i++){

            //˙艼: 
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;
            //˙艼: 耞挡篶计琌骸ì计砏玥
            if(i == a*a*a + b*b*b + c*c*c){
                System.out.println(i);
            }
        }
    }
}
