public class Main {

    public static void main(String[] args){
        int result = 1 + 2;

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        //ternary
        boolean wasCar = isCar ? true : false;


        //excercise
        double myDoubleVariable = 20.00;
        double my2DoubleVariable = 80.00;
        double sumOfDoubles = (myDoubleVariable+my2DoubleVariable)*100;

        double remainderOfDoubles = sumOfDoubles%40.00;

        boolean isRemainder0 = remainderOfDoubles == 0 ? true : false;

        System.out.println(isRemainder0);

        if(!isRemainder0){
            System.out.println("Got some remainder");
        }



    }
}
