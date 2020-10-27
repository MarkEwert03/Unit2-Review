//Mark Ewert
//Oct 20, 2020

class SumMultiples{
    public static void main(String[] args){
        //Variables
        int total = 0;
        
        for (int i = 0; i < 1000; i++){
            if (i%3 == 0 || i%5 == 0){
                total+=i;
            }
        }
        System.out.print("Answer: ");
        System.out.println(total);
    }
}