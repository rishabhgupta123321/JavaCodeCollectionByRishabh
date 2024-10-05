                 //  java variables  
                 /* java variables in comments*/



/*
class Lecture_9_Comments{ 
    int a = 2;    // instance variable
    static int b = 4;    // static variable
    public static void main(String[] args){
        int c = 30;  // local variable 
        final int D = 20;    // final variable
        Lecture_9_Comments ref = new Lecture_9_Comments();
        System.out.println(ref.a); 
        System.out.println(b);
        System.out.println(c);
        System.out.print(D);
    }
}

*/




class Lecture_9_Comments{ 
    int a = 2;    // instance variable
    static int b = 4;    // static variable
    public static void main(String[] args){
        int c = 30;  // local variable 
        final int D = 20;    // final variable
        Lecture_9_Comments ref = new Lecture_9_Comments();
        System.out.println(ref.a); 
        System.out.println(Lecture_9_Comments.b);
        System.out.println(c);
        System.out.print(D);
    }
}
