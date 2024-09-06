class Arithmetic{
    public static void main(String args[]){
        int a = 7;
        int b = 2;

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        // int num=10;
        // System.out.println("Before = "+num);
        // num++;
        // System.out.println("After = "+num);


        int num=10;
        
        System.out.println("Before = "+num);
        ++num;
        System.out.println("After = "+num);


        int z=20;
        int y=20;
        int result = ++z;
        int result1 = y++;
        System.out.println(result);
        System.out.println(result1);
    }
}