                                                /*Exception Propagation*/




// class ExceptionPropagation
// {    
//     public static void main(String[] args){        // so in this caller happen , so here with the help of caller , so here method calls to other methods without throws
//         try{
//             m1();
//         }
//         catch(Exception e){
//             System.out.println("this is the exception coming : "+e);
//         }
//     }


//         public static void m1(){
//             m2();
//         }
//         public static void m2(){
//             m3();
//         }
//         public static void m3(){
//             System.out.println(10/0);
//         }
//     }










class ExceptionPropagation
{    
    public static void main(String[] args){        // so in this caller happen , so here with the help of caller , 
                                                //so here method calls to other methods without throws
        try{
            m1();
        }
        catch(Exception e){
            System.out.println("this is the exception coming : "+e.getMessage());
        }
    }

    
        public static void m1(){
            m2();
        }
        public static void m2(){
            m3();
        }
        public static void m3(){
            System.out.println(10/0);
        }
    }
