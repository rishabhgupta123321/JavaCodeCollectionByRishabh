
 // for finding maximum number in between three numbers by usin ternary operator    -

 
 
   class Maxofthreenumbers{
    public static void main(String[] args){     // here this is like nested if/else code.
    int a = 2, b = 3, c = 4,Max;
    Max = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);   
    System.out.println(Max);
    }
}
