import java.util.Scanner;

public class ChatRoom {

    public static void main(String[] args) {

        String h = "hello";
        String s = "";
        int pass = 0;
        int j = 0;
        Scanner skaner = new Scanner(System.in);
        s = skaner.nextLine();

        for (int i=0; i<s.length(); i++){
            if (j < 5 && pass < 6){
                if(h.charAt(j) == s.charAt(i)){
                    pass++;
                    j++;
                }
            }
        }

        if (pass == 5){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}
