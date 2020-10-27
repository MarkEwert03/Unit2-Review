//Mark Ewert
//Oct 20, 2020

class Fibonacci{
    public static void main(String[] args){
        //Variables
        int numSub2 = 0;
        int numSub1 = 1;
        int num = 0;
        int total = 0;
        
        while (num < 4000000){
            num = numSub2 + numSub1;
            if (num%2 == 0) total+=num;
            numSub2 = numSub1;
            numSub1 = num;
        }
        System.out.print("Answer: ");
        System.out.println(total);
    }
}