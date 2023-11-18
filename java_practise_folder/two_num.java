import java.util.HashMap;
public class two_num
{
    public static int[] two_ways(int[] nums,int target)
    {
        int output[]={};
       HashMap<Integer,Integer> poli_nums=new HashMap<>();
       int support=0;
       for(int i=0;i<nums.length;i++)
       {
           support=target-nums[i];
          
           if(poli_nums.containsKey(support))
           {
        
               return new int[]{poli_nums.get(support),i};
           }
          
           poli_nums.put(nums[i],i);
           }
       return output;
    }
    public static void main(String[] args)
    {
        int[] nums={2,15,7,11};
        int target=9;
        int[] result=two_ways(nums,target);
        for(int x:result)
        {
           System.out.print(x+" ");
        }
        System.out.println("");
        
    }
}
