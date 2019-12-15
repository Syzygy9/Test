public class FirstHalf {

    public String firstHalf(String str) {
       if (str == null) {
         throw new NullPointerException("Argument can't be null");
        }
        return str.substring (0,str.length()/2);
    }

}
