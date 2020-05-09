public class Main 
{
    public static void main(String args[]) 
    {
        int variable1 = 8;
        int variable2 = 14;
        int variable3 = 7;
        int minor = 0;
        minor = (variable1 < variable2) ? (variable1 < variable3 ? variable1 : variable3) : (variable2 < variable3 ? variable2 : variable3);
        //condition ? (variable : variable)
        System.out.println(minor);
    }
}
