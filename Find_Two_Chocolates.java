import java.util.Arrays;
public class find_two_chocolates 
{
    public static int findChocolates(int[] prices,int money)
    {
       Arrays.sort(prices);
       for(int i=0;i<prices.length;)
        {
        if(prices[i]+prices[i+1]>money)
        {
            return money;
        }
        else{
           return money-(prices[i]+prices[i+1]);
        }
    }
      return 0;
    }
    public static void main(String[] args)
    {
        int[] prices={2,5,3,1,4,1,3};
        int money=5;
        int output=findChocolates(prices,money);
        System.out.println(output+" ");
    }   
}
