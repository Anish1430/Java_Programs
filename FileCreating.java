import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileCreating {
    public static void main(String[] args) throws Exception {
        //Yes bus file ka Location btayega Java mai......
//        File file=new File("FileAnish\\xyz.txt");
//         if(file.canRead()) {
//             System.out.println("This file is Presented in My system");
//             System.out.println(file.getAbsoluteFile());
//         }else {
//             System.out.println("This file is Not Presented in My system");
//         }


        //Kisi v file ke Ander hmko dekhna hai kya likha hai to hm aise dekhengai......
        File file=new File("FileAnish\\xyz.txt");
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String str;
        while((str=br.readLine())!=null) {
            System.out.println(str);
        }
    }
}
