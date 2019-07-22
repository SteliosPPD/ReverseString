package exercise5pdfw2d3reversestring;

public class Exercise5pdfW2D3ReverseString {

    public static void main(String[] args) {

        ReverseStr();

    }

    public static void ReverseStr() {

        StringBuilder str = new StringBuilder("abcdfghcba");
        //StringBuilder str1 = str.reverse();
        str.toString();
        str.reverse().toString();
        System.out.println(str + "\n" + str.reverse());
        for (int x = 0; x < str.length(); x++) {
            for (int y = 0; y < str.length(); y++) {
                System.out.println(str.substring(x, y));
                System.out.println(str.reverse().substring(x, y));
                }
                
            }
        }
    
}
