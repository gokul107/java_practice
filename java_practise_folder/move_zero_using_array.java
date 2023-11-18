import java.util.ArrayList;
public class move_zero_using_array
{
    public static ArrayList<Integer> move_zero(int[] nums)
    {
        int counter=0;
        ArrayList<Integer> out=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                out.add(nums[i]);
            }
            else{
                    counter++;
            }
        }
        for(int j=0;j<counter;j++)
        {
            out.add(0);
        }

        return out;
       
    }
      public static void main(String[] args)
    {
        int[] nums={0,1,0,3,15};
        ArrayList<Integer> output=move_zero(nums);
        System.out.println(output);
        
    }
}
