public class Variable {
    public static void main(String[] args) {
        int a = 3; // int用来表示一个整数，取值范围在 -2^31~2^31-1
        int b = 5;
        int c = 7;

        int x = 9; // 3，5，7，9 为字面值，a,b,c,x,y为变量

        int  y = a*x + b*x*x + c*x*x*x;
        /**
         * 关键字：public,class,static,void, int
         * 类名要和文件名保持一致
         */

        System.out.println(y);
    }
}
