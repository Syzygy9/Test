public class MakeOutWord {

    public String makeOutWord(String out, String word) {

        if (out == null || word == null) {
            throw new IllegalArgumentException("The Argument can't be null");
        }
        return (out.substring(0, 2) + word + out.substring(2, 4));
    }

}
