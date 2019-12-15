public class MakeAbba {

    public String makeAbba(String a, String b) {

        if (a == null & b == null) {
            throw new IllegalArgumentException ("The arguments can't be null");
        }
        return a + b + b + a;
    }

}
