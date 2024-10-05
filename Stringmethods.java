                                  /*Strings Methods*/
 

      /* toUpperCase() ,  toLowerCase(),  concat(), length(), trim(), isEmpty(), charAt(), indexOf(), equals(), replace()  */






class Stringmethods{
    public static void main(String []args){
        String a = "hello";
        String b = "ANKIT";    // because here both string object also different so in this string immutable concept also not applicable
        System.out.println(a);
        System.out.println(b);

        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());

// in this we can concat without assigning again object because objects are different 
        System.out.println(a.concat(b));
        System.out.println(a.length());
        String c = "     lsadojia    ";
        String d = " ";
        String e = "";
        System.out.println(c.trim());
        System.out.println(c);
        System.out.println(d.isEmpty());
        System.out.println(e.isEmpty());
        System.out.println(a.charAt(2));


        System.out.println(a.indexOf('e'));
        System.out.println(a.equals(b));

        System.out.println(a.replace('e','o'));


        System.out.println(a.replace("ello","oooo"));
        System.out.println(a.replace("hello","Ankit"));

// in this of replaceable value if we want that we will use then we have to assign in another variable 
// because replacing the value and then again the value will be same like before after that when we call like below


        System.out.println(a);




    }
}