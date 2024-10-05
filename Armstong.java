              /* Armstrong number find program */    
// Requirements - input - 153 ,  By doing (((1)^3)+((5)^3)+((3)^3)) = 153    output - 153 
// if input == output then number will be armstrong .
// ((1)^3) == 1*1*1 







import java.util.Scanner; 
class Armstrong{
    public static void main(String []rags){
    int n,s=0,a,c,r;
    Scanner ref = new Scanner(System.in);
    System.out.print("Enter any number: ");
    n = ref.nextInt();
    c = n;
    while(n>0){
        r = n%10;
        a = (r*(r*r));
        s = s+(a);
        n = n/10;
    }
    if(c==s){
        System.out.print("Armstrong number");
    }
    else{
        System.out.print("Not Armstrong number");
    }
    ref.close();
}
}