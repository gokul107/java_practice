public class find_last_substring
{
    public static int findSubString(String s)
    {
        int output=0;
        String new_s=s.trim();
        char[] chararray=new_s.toCharArray();
        for(int i=chararray.length-1;i>=0;i--)
        {
            if(chararray[i]== ' ')
            {
                break;
            }
            output++;
        }
        return output;


    }
    public static void main(String[] args)
    {
        String s=" hello world ";
        int len=findSubString(s);
        System.out.println(len);
    }
}
