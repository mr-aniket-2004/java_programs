import java.io.*;

public class Slip18B {
    public static void main(String arg[]) throws Exception
    {
        FileWriter w = new FileWriter("Slip18B.txt");
        FileReader r = new FileReader(arg[0]);
        int data =0;
        char ch;
        while (data!=-1) {
            data = r.read();
            if (data ==-1) {
                break;
            }
            else
            {
                ch = (char)data;
                if (ch>='A'&& ch<='Z') {
                    data = data +32;
                    w.write(""+(char)data);
                }  
                else if (ch>='a'&& ch<='z') {
                    data = data -32;
                    w.write(""+(char)data);
                }    
                else if (ch>='0'&& ch<='9') {
                    ch ='*';
                    w.write(""+ch);
                }  
                else 
                    w.write(""+(char)data);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
            }
        }
        w.flush();
        w.close();
        r.close();
        

    }
}
