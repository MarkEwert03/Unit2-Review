//Mark Ewert
//Oct 20, 2020

class Pythagoras{
    public static void main(String[] args){
        //Variables
        double a = 1;
        double b = 1;
        double c = 1;
        int product = 0;

        while (product == 0){
            for (b = 1; b < 1000; b++){
                c = Math.sqrt(a*a + b*b);
                if (a+b+c==1000){
                    product = (int)(a*b*c);
                    System.out.println(a + " " + b + " " + c);
                }

            }
            a++;
        }
        System.out.print("Answer: ");
        System.out.println(product);
    }
}