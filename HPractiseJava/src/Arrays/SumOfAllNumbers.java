package Arrays;

public class SumOfAllNumbers {
public static void main(String[]args)
{
int[]secondSet=new int[5];
secondSet[0]=21;
secondSet[1]=33;
secondSet[2]=64;
secondSet[3]=45;
secondSet[4]=91;
int sum=0;    //initially define value of sum//
for(int i=0;i<secondSet.length;i++)
{
   sum=sum+secondSet[i];
     System.out.println(sum);
}

}
}
