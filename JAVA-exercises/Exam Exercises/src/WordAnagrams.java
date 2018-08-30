import java.util.Arrays;
        import java.util.Scanner;

public class WordAnagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String w = in.nextLine();
        int n = in.nextInt();
        in.nextLine();
        Character[] output = new Character[w.length()];

        for (int i = 0; i < n; i++) {
            String word = in.nextLine();

            for (int j = 0; j < w.length(); j++) {
                for (int k = 0; k < word.length(); k++) {
                    if(w.charAt(j) == word.charAt(k)){
                        output[j] = w.charAt(k);
                    }
                }
            }
        }



        /*
        char arr01[] = w.toCharArray();
        Arrays.sort(arr01);

        System.out.println();
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n + 1; i++) {
            String words = in.nextLine();
            char arr[] = words.toCharArray();
            Arrays.sort(arr);

            if(Arrays.equals(arr01, arr)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
        */
    }
}
