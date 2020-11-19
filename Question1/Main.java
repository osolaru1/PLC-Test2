import java.io.*;
import java.util.*;
import java.util.regex.*;

//PLS READ THIS IS REALLY IMPORTANT
//Unfortunately after working this portion on test 2 for question 1, This java file cannot run well and is full of errors
//So instead I elected to rather explain what would have happen in my TEST 2 doc Paper
public class Main {

    public static void main(String[] args) throws IOException {
        //HERE for reference
        /*final Character PerlIdentifier []={'$','@','%'};
        final Character LPAREN = '(';
        final Character RPAREN = ')';
        final Character ADD_OP = '+';
        final Character SUB_OP = '-';
        final String MULT_OP[] = {"*", "/", "//", "%"};
        final Character ASSIGN[] = {':', '='};
        final Character IDENTIFIERS[] ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'j', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        final int NUMBERS[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};*/

        final Character ADD_OP = '+';
        final Character SUB_OP = '-';
        final Character MULT_OP = '*';
        //final String INC = ".++. *";
        //Pattern pattern = Pattern.compile(INC);
        final String DEC_OP = "--";
        final Character CLOSE_OP = '{';
        final Character OPfunct_OP = '(';
        final Character CLfunt_OP = ')';
        final String ASSIGN_OP[] = {"=", "+=", "-=", "/=","%=","&=","^=","|=","<<=",">>=",">>>="};
        File file =new File("C:\\Users\\lolas\\IdeaProjects\\PLS-Test2\\src\\ReadMePls.txt");
       Scanner scan= new Scanner(file);

        //char ss = scan.next().toCharArray()[0];

        //Perl style identifiers token $''@''%'
        if(scan.hasNext("$") && scan.hasNext("@") && scan.hasNext("#")){
            System.out.println("p <SPACE>");
        }
        //Java-Style string literals token
        else if(scan.hasNext("")){
            System.out.println("JavaS <SPACE>");
        }
        //C-Style integer literals token
        else if(scan.hasNext("U")|| scan.hasNext("L")){
            System.out.println("CInt <SPACE>");
        }
        //C-Style character literals token ''
        else if(scan.hasNext("''")){
            System.out.println("CChar <SPACE>");

        }//C-Style floating-point literals token
        else if(scan.hasNext("L")){
            System.out.println("CFloat <SPACE>");
        }
        //Addition token
        else if(scan.hasNext(String.valueOf(ADD_OP))){
            System.out.println("Add <SPACE>");
        }
        //Subtraction token
        else if(scan.hasNext(String.valueOf(SUB_OP))){
            System.out.println("Sub <SPACE>");
        }
        //Assignment token
        else if(scan.hasNext(String.valueOf(ASSIGN_OP))){
            System.out.println("Assign <SPACE>");
        }

        //Multiplication token
        else if(scan.hasNext(String.valueOf(MULT_OP))){
            System.out.println("MUL <SPACE>");
        }
        //Increment token 
        //Giving errors due to metacharacters '++'
        //else if(scan.hasNext(Pattern.compile([++]))){
        //    System.out.println("INC <SPACE>");
       // }

        //Decrement token
        else if(scan.hasNext(DEC_OP)){
            System.out.println("DEC <SPACE>");
        }
        //Modulo Operator token
        else if(scan.hasNext("%")){
            System.out.println("DEC <SPACE>");
        }
        //Logical 'AND' token
        else if(scan.hasNext("&&")){
            System.out.println("AND <SPACE>");
        }
        //Logical 'OR' token
        else if(scan.hasNext("||")){
            System.out.println("OR <SPACE>");
        }
        //Logical 'NOT' token
        else if(scan.hasNext("!")){
            System.out.println("NOT <SPACE>");
        }
        //Open Code Block token
        else if(scan.hasNext(String.valueOf(CLOSE_OP))){
            System.out.println("DEC <SPACE>");
        }
        // Close Code Block token
        else if(scan.hasNext("}")){
            System.out.println("DEC <SPACE>");
        }
        //Open Function parameter token
        else if(scan.hasNext(String.valueOf(OPfunct_OP))){
            System.out.println("OPENf <SPACE>");
        }

        //CLOSE Function parameter token
        else if(scan.hasNext(String.valueOf(CLfunt_OP))){
            System.out.println("CLOSEf <SPACE>");
        }


        else {
            System.out.println("That is all...");
        }
    }


}




