import java.util.*;

public class AliceBob {
    public static void main(String[] args){
        int m1 = 0;
        int m2 = 0;
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++)
        {   
            int a = sc.nextInt();
            int b = sc.nextInt();


            if(a>b)
            {
                m1 = m1+1;
            }
            
            if(a<b)
            {
                m2 = m2+1;
            }

            if(a == b)
            {
                m1 = m1;
                m2 = m2;
            }
        }
        System.out.println(m1);
        System.out.println(m2);
    }    
}
