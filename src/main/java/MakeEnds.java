public class MakeEnds {

    public int[] makeEnds(int[] nums) {

        if (nums == null) {
            throw new IllegalArgumentException ("The argument can't be null");
        }

        int[] new1 = {nums[0], nums[nums.length-1]};
        return new1;

    }

}
