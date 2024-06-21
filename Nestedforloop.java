/* Nested forloop example - */





//Basic syntax-
/*
class Nestedforloop{
    public static void main(String[] rags){
        int i,j;
        for(; ;)  // rows
        {
            for(; ;)      // columns
            {
               
            }
        }
    }
}
*/ 






/* 
class Nestedforloop{
    public static void main(String[] rags){
        int i,j;
        for(i=1;i<=5;i++)  // rows
        {
            for(j=1;j<=5;j++)      // columns
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
*/






class Nestedforloop{
    public static void main(String[] rags){
        int i,j;
        for(i=1;i<=5;i++)  // rows
        {
            for(j=1;j<=5;j++) // columns
            {
                System.out.print("*" +" ");
            }
            System.out.print("\n");
        }
    }
} 
  



/* //In this we can also print squares of stars in which like above we have rows and columns.

In this we are able to create the star patterns.

Here i is in outer for loop and j is in inner for loop , 
outer for loop give us output in rows and inner for loop give us output in columns and 
when according to above when outer loop will execute one time 
then inner loop will execute 5 times like this and that’s why in outer loop
 after inner loop we have used a new line statement for taking new row otherwise again and again
 it will  print in same row but column will increase


*/