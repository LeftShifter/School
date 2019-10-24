package pac;

public class Hh {
    public static void main(String[] args) {
    	System.out.println(Hh.pow("jo", 1));
    }
    public static double pow(double digit, double value) {
    	return Math.pow(digit, value);
    }
    public static String pow(String string, int value) {
    	String result=string;
    	if (value==0) {
    		return "1";
    	}
    	for(;value>0;value--) {
    		result+=result;
    	}
    	return result;
    }
}
