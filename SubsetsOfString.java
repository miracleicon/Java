public class SubsetsOfString {
    public static void main(String[] args) {
        String input = "MAYANK"; 
        generateSubsets(input, "", 0);
    }
    static void generateSubsets(String str, String currentSubset, int index) {
        if (index == str.length()) {
            System.out.println(currentSubset);
            return;
        }
        generateSubsets(str, currentSubset + str.charAt(index), index + 1);
        generateSubsets(str, currentSubset, index + 1);
    }
}