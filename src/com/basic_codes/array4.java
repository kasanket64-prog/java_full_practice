
package com.basic_codes;

public class array4 {
    public static void main(String[] args) {

        int[] number = {10, 20, 30};
          try {
              System.out.println(number[5]);
          }
          catch (ArrayIndexOutOfBoundsException e) {
              System.out.println(e.getMessage());
          }

        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
        for(int j = 0; j == number[2]; j++){
            System.out.println(number[j]);
        }


        number = new int[]{10, 20, 30};
                int sum = 0;

                try {
                    // Sum of array elements
                    for (int i = 0; i < number.length; i++) {
                        sum += number[i];
                    }

                    System.out.println("Sum = " + sum);

                    // Exception
                    System.out.println(number[5]);

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception caught: Array index is out of bounds.");
                    System.out.println(e);
                }

                System.out.println("Program continues...");
            }

}