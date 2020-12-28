import java.util.Scanner;
// created by J.M.
public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        StringBuilder newWord= new StringBuilder(); int n =0; int c =0; int o=0;
        while(!(word.equals("End"))){
            char num = word.charAt(0);
            if(((int) num >64&& (int) num <91)||((int) num >96&& (int) num <123)){
                switch(num) {
                    case 'n':
                        if (n == 0) { n += 1;
                        } else { newWord.append(num);
                        }
                        break;
                    case 'c':
                        if (c == 0) { c += 1;
                        } else { newWord.append(num);
                        }
                        break;
                    case 'o':
                        if (o == 0) { o += 1;
                        } else { newWord.append(num);
                        }
                        break;
                        default:  newWord.append(num);
                    }
                    if(n==1&&c==1&&o==1){
                        System.out.printf("%s ", newWord.toString());
                        n=0;c=0;o=0; newWord = new StringBuilder();
                    }
            }
            word = scan.nextLine();
        }
    }
}
