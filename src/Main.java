public class Main {
    public static void main(String[] args) {
        System.out.println(nextpurcolinenumber(139));
    }
    static int nextpurcolinenumber(int number){
        boolean Isporcupin=false;
        int nextporcupin=0;
        int maxvalue=Integer.MAX_VALUE;
        number++;
        while(number<=maxvalue){
            if (Isporcupin){
                if (isPrime(number)==1){
                    if (number%10==9){
                        break;

                    }
                    else {
                        Isporcupin=false;
                    }
                }
            }
            else {
                if (isPrime(number)==1){
                    if (number%10==9){
                        Isporcupin=true;
                        nextporcupin=number;
                    }
                }
            }
            number++;
        }

return nextporcupin;
}
static int isPrime(int number){
        int prime=0;
        if (number>0){
            for (int i=2;2*i<=number;i++){
                prime=1;
                if (number%i==0){
                    prime=0;
                    break;
                }
            }
        }
     return prime;
}
}