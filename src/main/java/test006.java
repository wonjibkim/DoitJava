public class test006 {
    public static void main(String[] args) {

        int dan=2;
        int k=1;

        while(dan<10){
            while(k<10){
                System.out.printf("%d * %d =%d",dan,k,(dan*k));
                k++;
            }
            k=1;
            dan++;
        }



       /* while (dan<=9) {

            while (k<=9)
            {

                System.out.print( dan +" X "+ k +" = " + (dan*k));
                k++;

            }
            k = 1;
            dan++;

        }*/
    }
}

