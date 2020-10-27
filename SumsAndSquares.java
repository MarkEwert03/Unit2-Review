//Mark Ewert
//Oct 20, 2020

class SumsAndSquares{
    public static void main(String[] args){
        int n = 100;
        int difference = squareOfSums(n) - sumOfSquares(n);
        System.out.print("Answer: ");
        System.out.println(difference);
    }
    
    public static int sumOfSquares(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += (Math.pow(i, 2));
        }
        return sum;
    }
    
    public static int squareOfSums(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
           sum+=i; 
        }
        int squaredSum = (int)Math.pow(sum, 2);
        return squaredSum;
    }
}