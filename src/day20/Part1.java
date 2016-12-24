package day20;

/**
 * Created by Sneeuwpopsneeuw on 09-Dec-16.
 */
public class Part1 {   // TODO
    public static void main(String[] args) {
        long value = 0;
        int i = 1;   // 27_720

//        while (value < 33_100_000) {
//            value = 0;
//
//            for (int j=1; j <= i; j++) {
//                if (i % j == 0)
//                    value += (j * 10);
//            }
//            System.out.println(i + " : " + value);
//
//            i++;
//        }

        while (value < 33_100_000) {
            value += (i*10);
            i++;
        }

        int[] dividors = new int[i+1];
        for (int n=0; n < i+1; n++) { dividors[n] = n +1; }

        for (int j=1; j < i+1; j++) {  // TODO: DIT WEKRT NOG NIET ECHT LEKKER
            for (int k=1; k < i+1; k++) {
                if (dividors[k] % j == 0)
                    dividors[k] /= j;
            }
        }


        System.out.println("");
        System.out.println("Ans = " + i);    // 11!       2574 ???
    }
}



/*          27_720

2
3
2
5

7
2
3

11


 */