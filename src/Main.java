import java.util.Scanner;

public class Main {
    public static int joseph(int n, int k){

        if(n == 1) {
            return 0;
        }else {
            return (joseph(n - 1, k) + k) % n;
        }
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("oi");
        int cnt = prompt.nextInt();
        int l[] = new int[cnt];
        for(int i = 0;i <cnt;i++){

            l[i]=(joseph(prompt.nextInt(), prompt.nextInt())+1);
        }
        for(int i = 0;i < cnt;i++){
            System.out.println("Case " + (i+1) + " : "+l[i]);
        }
    }
}
