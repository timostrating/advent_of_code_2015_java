package day10;

/**
 * Created by Sneeuwpopsneeuw on 08-Dec-16.
 */
public class part1 {

    public static void main(String[] args) { new part1().start("1113122113", 40); }
    public void start(String str, int length) {
        for (int i=1; i <= length; i++) {
            str = run(str);
            System.out.println( str.length() );  // 360154
        }
    }

    public String run(String str) {
        StringBuilder output = new StringBuilder("");
        StringBuilder buffer = new StringBuilder("");
        char curChar = ' ';

        for (int j=0; j < str.length(); j++) {
            if (curChar == str.charAt(j)) {
                buffer.append( str.charAt(j) );
            } else {
                curChar = str.charAt(j);
                output.append( exrun(buffer) );
                buffer = new StringBuilder( ""+str.charAt(j) );
            }
        }

        output.append( exrun(buffer) );
        return output.toString();
    }

    public String exrun(StringBuilder str) {
        return (str.length() == 0)? "" : (str.length() + "" + str.charAt(0));
    }


//    public String run(String str) {
//        String output = "";
//        char curChar = ' ';
//        int i=0;
//
//        while (str.length() > 1) {
//            if (curChar == str.charAt(0)) {
//                i++;
//            } else {
//                curChar = str.charAt(0);
//                output += (i+1) + str.charAt(0);
//                i = 0;
//            }
//            str = str.substring(1, str.length());
//        }
//        return output;
//    }

//    public String run(String str) {
//        String output = "";
//        char curChar = ' ';
//        int i=0;
//
//        for (int j=0; j < str.length(); j++) {
//            if (curChar == str.charAt(j)) {
//                i++;
//            } else {
//                curChar = str.charAt(j);
//                output += (i) + str.charAt(j-1);
//                i = 0;
//            }
//        }
//        return output;
//    }


}