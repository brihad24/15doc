import java.util.*;

public class AliceBob {
    public static void main(String[] args){
        int  Alice[] = new int[3];
        int  Bob[] = new int[3];
        int marks[] = {0,0};
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++){
            Alice[i] = sc.nextInt();
        }

        for (int i=0; i<3; i++){
            Bob[i] = sc.nextInt();
        }

        for (int i=0; i<3; i++)
        {
            if(Alice[i]>Bob[i])
            {
                marks[0] = marks[0]+1;
            }
            
            if(Alice[i]<Bob[i])
            {
                marks[1] = marks[1]+1;
            }
        }
        for(int i=0;i<2;i++){
        System.out.println(marks[i]+" ");
        }
    }    
}
