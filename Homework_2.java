/**
*Java1. Homework2
*
*@author Lena
*@version 07.11.2021
*/
class Homework_2 {
    
    public static void main(String[] args){
        System.out.println(methodSum2(2,20));
        System.out.println(methodSum2(20,-9));
        System.out.println(methodSum2(5,10));
        printNumber();
        System.out.println (returnNumber(2));
        System.out.println (returnNumber(-2));
        System.out.println (returnNumber(0));
        replayPhrase("Hello, World", 5);
    }
        static String methodSum2(int a,int b) {
            return(a+b>=10 && a+b<=20? "true" : "false");
        }

        static void printNumber() {
            int n=2;
            
            if (n>= 0) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }
        }
           
        static String returnNumber(int c) {
            return(c>=0? "false" : "true");
        }
        
        static void replayPhrase(String str,int repl) {

            for (int i = 0; i < repl; i++) {
                System.out.println(str);
            }
        }
}


