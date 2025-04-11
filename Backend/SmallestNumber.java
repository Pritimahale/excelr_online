   class SmallestNumber {
    public static void main(String[]args) {
     int a=2;
     int b=9;
     int c=19;

int smallest=(a>b)? ((b>c)?c:b): ((a>c)?c:a) ;

System.out.println("the smallest number is "+ smallest);



}
}