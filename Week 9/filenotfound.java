import java.io;
public class filenotfound {
    public static void main(String[] args){
        try {
            BufferReader br=new BufferReader(new FilerReader("\"C:\\Users\\CSE-Lab1\\Desktop\\sam.txt\""));
            String line;
        while((line=br.readLine())!=null){
            System.out.println();
        }
        br.close();
    }
        catch(FileNotFoundException e){
            System.err.println("File not found"+e.getMessage());
        }
}
}