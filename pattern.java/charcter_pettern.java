public class charcter_pettern {
    public static void main(String[] args) {
        int num=4;
        char ch ='a';
        for(int line = 1;line<=num;line++){
            for(char chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
