public class SeeColor {
    public String seeColor(String str) {

        if (str == null) {
            throw new IllegalArgumentException ("String can't be null");
        }
        if (str.length()>=4) {
            if (str.substring (0,4).equals ("blue"))
                return "blue";
            else if (str.substring (0,3).equals ("red"))
                return "red";
            else
                return "";
        }
        else if (str.length() ==3) {
            if (str.substring(0,3).equals ("red"))
                return "red";
            else
                return "";
        }
        else
            return "";

    }


}
