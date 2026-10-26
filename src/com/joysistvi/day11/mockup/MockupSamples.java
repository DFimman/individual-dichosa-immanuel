package com.joysistvi.day11.mockup;

public class MockupSamples {

    public static void main(String[] args) {

        int price = 1000;
        int qty = 2;
        String grade = "2";
        double discount = 0.0;
        switch(grade) {
            case "1":
                discount = price * 0.1;
                break;
            case "2":
                discount = price * 0.5;
                //continue; // Line 16 commented out to fix compilation error
            default:
                System.out.println("Thank you!");
        }
        System.out.println(discount);
        /* String[] strs = {"A", "B"};
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" and " + idx);
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }*/

        /* sample 5
        float var1 = (12_345.01 <= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.println(var2);

         */

        /* sample 4
        int x = 10;
        int y = 3;
        System.out.println(x / y);
         */

       /* sample 3
        float fit = 100.00F;
        System.out.println(fit);
        */
    }


    /* Number 2 sample
    public static void main(String[] args) {
       int x = 100;
       int a = x++;
       int b = ++x;
       int c = x++;
       int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;
        System.out.println(d);
    } */

    /* Number 1 sample
    private char var;

    public static void main(String[] args) {
        char var1 ='a';
        char var2 = var1;
        var2 = 'e';

        MockupSamples obj1 = new MockupSamples();
        MockupSamples obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';

        System.out.println(var1 + "," + var2);
        System.out.print(obj1.var + "," + obj2.var);
    }
     */
}
