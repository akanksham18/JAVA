class Typecast{
    public static void main(String a[]){
        byte b=127;
        int ac=256;
       
       b=(byte)ac;
        System.out.println(b);

        float f = 4.6f;
        int x = (int)f;
        System.out.println(x);

        byte j=20;
        byte d=10;
        int result=j*d;
        System.out.println(result);
    }
}