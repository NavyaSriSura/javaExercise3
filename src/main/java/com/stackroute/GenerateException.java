package com.stackroute;

public class GenerateException
{

        public static void main(String[] args) {
            //NegativeArraySizeException
            try {
                throw new NegativeArraySizeException();
            } catch (NegativeArraySizeException e1) {
                System.out.println(e1.toString());
            }
            //IndexOutOfBoundsException
            try {
                throw new IndexOutOfBoundsException();
            } catch (IndexOutOfBoundsException e2) {
                System.out.println(e2.toString());
            }
            //NullPointerException
            try {
                throw new NullPointerException();
            } catch (NullPointerException e3) {
                System.out.println(e3.toString());
            }
        }

    }
