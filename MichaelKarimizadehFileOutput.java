import java.io.*;
import java.util.Scanner;
import java.text.*;

public class MichaelKarimizadehFileOutput{
  public static void main(String[] args){
    //Exercise 1
    /*
    Scanner sc=new Scanner(System.in);
    int column;
    int row;
    System.out.print("Enter the number of columns for an array:\t");
    column=sc.nextInt();
    System.out.print("Enter the number of rows for an array:\t");
    row=sc.nextInt();
    String[][] dims= new String [column][row];
    try{
      BufferedWriter out = new BufferedWriter(new FileWriter("StarTable.txt")); 
      for(int i=0;i<column;i++){
        for(int j=0;j<row;j++){
          dims[column-1][row-1]="*";
          out.write(dims[column-1][row-1]+"\t");
        }
        out.newLine();
      }
      out.close();
    }
    catch(IOException iox){
      System.out.println("Problem with files" );
    }
    */

    //Exercise 2
    /*
    int[][] scores=new int [10][5];
    try{
    BufferedReader in = new BufferedReader(new FileReader("marks.txt"));
    String input="";
    for(int i=0;i<10;i++)
    {
    for(int j=0;j<5;j++)
    {input = in.readLine();
     scores[i][j]= Integer.parseInt(input);
      }}
     in.close();
           }
     catch(IOException iox){
       System.out.println("Problem reading the file");
     }
     try{
       BufferedWriter out = new BufferedWriter(new FileWriter("result.txt")); 
       Double avg;
       Double[] stuAvg=new Double[10];
       Double highestAvg=0.0;
       int highestAvgStu=0;
       Double testAvg;
       for(int i=0;i<10;i++){
         out.write("Student "+(i+1)+" Average:");
         out.newLine();
         avg=0.0;
         for(int j=0;j<5;j++){
           avg=avg+scores[i][j];
         }
         stuAvg[i]=avg/5.0;
         out.write(stuAvg[i]+ " ");
         out.newLine();
         out.newLine();
       }
       for(int i=0;i<10;i++){
         if(stuAvg[i]>highestAvg){
           highestAvg=stuAvg[i];
           highestAvgStu=i+1;
         }
       }
       out.write("Student "+highestAvgStu+" has the highest average");
       out.newLine();
       out.newLine();
       for(int i=0;i<5;i++){
         out.write("Test"+(i+1)+" Average:");
         out.newLine();
         testAvg=0.0;
         for(int j=0;j<10;j++){
           testAvg=testAvg+scores[j][i];
         }
         testAvg=testAvg/10.0;
         out.write(testAvg+" ");
         out.newLine();
         out.newLine();
       }
       out.close();
     }
     catch (IOException iox) {
       System.out.println("Problem with files" );
     }
     */
    
    //Exercise 1
    /*
    try{
    BufferedReader in = new BufferedReader(new FileReader("line.txt"));
    String input="";
    input=in.readLine();
    while(input!=null){
      System.out.println(input);
      input=in.readLine();
    }
     in.close();
           }
     catch(IOException iox){
       System.out.println("Problem reading the file");
     }
     */
    
    //Exercise 2
    /*
    try{
      BufferedReader in = new BufferedReader(new FileReader("marks.txt"));
      String input="";
      int sum=0;
      input = in.readLine();
      while(input!=null){
       sum=sum+Integer.parseInt(input);
        input = in.readLine();
      }
      System.out.println(sum);
      in.close();
     }
     catch(IOException iox){
       System.out.println("Problem reading the file");
     }
     */

     //Exercise 3
     /*
     try{
      BufferedReader in = new BufferedReader(new FileReader("PrintAllChar.txt"));
      String input="";
      int sum=0;
      input = in.readLine();
      while (input != null) {
        for (int i = 0; i < input.length(); i++) {
         if(!(input.charAt(i)==' ')){
          if((input.charAt(i)=='\\')){
           if((input.charAt(i+1)=='r')||(input.charAt(i+1)=='n')){
             i=i+1;
           }
          }
          else{
            System.out.println(input.charAt(i));
          }
         }
        }
        input = in.readLine();
      }  
      in.close();
     }
     catch(IOException iox){
       System.out.println("Problem reading the file");
     }
     */

     //Exercise 4
     /*
     try{
      BufferedReader in = new BufferedReader(new FileReader("reverse.txt"));
      String input="";
      String[] words;
      int sum=0;
      input = in.readLine();
      words=new String[Integer.parseInt(input)];
      for(int i=0;i<words.length;i++){
        input = in.readLine();
        words[i]=input;
      }
      for(int i=0;i<words.length;i++){
        System.out.println(words[words.length-i-1]);
      }
      in.close();
     }
     catch(IOException iox){
       System.out.println("Problem reading the file");
     }
     */
  }
}