package com.stackroute;

public class MyFirstException
{

        MyFirstException(String msg) {
            msg = "this is bound to execute";
            System.out.println(msg);
        }

        public static void main(String[] args) throws Exception {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace(); //e refers to Exception Object
            } finally {
                System.out.println("This is finally block");
            }

        }


}
