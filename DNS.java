import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNS{
  public static void main(String args[]){
    if(args.length != 1)
    {
       System.err.println("Error : Enter thr URL or Internet Address ");
       System.exit(-1);
    }
    try{
        InetAddress ia;
        if(Character.isDigit(args[0].charAt(0)))
        {
           byte[] b = new byte[4];
           String[] bytes = args[0].split("[.]");

           for(int i=0;i<bytes.length;i++)
                    b[i] = new Integer(bytes[i]).byteValue();

           ia = InetAddress.getByAddress(b);
        }
        else
        {
           ia = InetAddress.getByName(args[0]);  
        }
        System.out.println(ia.getHostName() + " / " + ia.getHostAddress());
    }catch(UnknownHostException exception)
    { 
      System.err.println("Error : No Internet addresse for " + args[0]);
    }  
  }
}       
