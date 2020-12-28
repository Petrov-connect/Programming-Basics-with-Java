import java.util.Scanner;
// created by J.M.
public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int group = Integer.parseInt(scan.nextLine());
        double musala=0.0;double monblan=0.0;double kaliman=0.0; double k2=0.0; double everest=0.0;
        for (int i=1;i<=group;i++){
            int num = Integer.parseInt(scan.nextLine());
            if (num<6){
                musala+=num;
            }else if (num<13){
                monblan+=num;
            }else if (num<26){
                kaliman+=num;
            }else if(num<41){
                k2+=num;
            }else {
                everest += num;
            }
        }
        double sum=musala+monblan+kaliman+k2+everest;
        System.out.printf("%.2f%%%n",musala/sum*100);
        System.out.printf("%.2f%%%n",monblan/sum*100);
        System.out.printf("%.2f%%%n",kaliman/sum*100);
        System.out.printf("%.2f%%%n",k2/sum*100);
        System.out.printf("%.2f%%",everest/sum*100);
    }
}
