import java.util.Scanner;

public class TweetDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";
      String wholeTweet = "";
   
      System.out.println("Enter abbreviation from tweet \nOr a whole tweet");
      origTweet = scnr.next();
      wholeTweet = scnr.nextLine();
    if(origTweet.length() <= 140){
      if (origTweet.indexOf("LOL")!= -1) {
         System.out.println("LOL = laughing out loud");
      }
      
        else if (origTweet.indexOf("LLO")!= -1 || origTweet.indexOf("OLL")!= -1) {
         System.out.println("Did you mean LOL?");
         System.out.println("LOL = laughing out loud");    
      }
      
      else if (origTweet.indexOf("BFN")!= -1) {
         System.out.println("BFN = bye for now");
      }
      
        else if (origTweet.indexOf("FBN")!= -1 || origTweet.indexOf("FNB")!= -1 || origTweet.indexOf("NFB")!= -1) {
         System.out.println("Did you mean BFN?");
         System.out.println("BFN = bye for now");   
      }
      else if (origTweet.indexOf("FTW")!= -1) {
         System.out.println("FTW = for the win");
      }
      
       else if (origTweet.indexOf("TFW")!= -1 || origTweet.indexOf("TWF")!= -1 || origTweet.indexOf("WTF")!= -1) {
         System.out.println("Did you mean FTW?");
         System.out.println("FTW = for the win");   
      }
      
      else if (origTweet.indexOf("IRL")!= -1) {
         System.out.println("IRL = in real life");
      }
      
       else if (origTweet.indexOf("RIL")!= -1 || origTweet.indexOf("RLI")!= -1 || origTweet.indexOf("LRI")!= -1) {
         System.out.println("Did you mean IRL?");
         System.out.println("IRL = in real life");   
      }
      else if (origTweet.indexOf("LMK")!= -1) {
         System.out.println("LMK = Let Me Know");
      }
      
       else if (origTweet.indexOf("MLK")!= -1 || origTweet.indexOf("MKL")!= -1 || origTweet.indexOf("KML")!= -1) {
         System.out.println("Did you mean LMK?");
         System.out.println("LMK = Let Me Know");   
      }
      
      else if (origTweet.indexOf("IK")!= -1) {
         System.out.println("IK = I Know");
      }
       
       else if (origTweet.indexOf("KI")!= -1) {
         System.out.println("Did you mean IK");
         System.out.println("IK = I Know");
      }
      
      else if (origTweet.indexOf("RN")!= -1) {
         System.out.println("RN = Right Now");
      }
       else if (origTweet.indexOf("NR")!= -1) {
         System.out.println("Did you mean RN");
         System.out.println("RN = Right Now");
      }
      else if (origTweet.indexOf("OMG")!= -1) {
         System.out.println("OMG = Oh My God");
      }
      
       else if (origTweet.indexOf("MOG")!= -1 || origTweet.indexOf("MGO")!= -1 || origTweet.indexOf("GMO")!= -1) {
         System.out.println("Did you mean OMG?");
         System.out.println("OMG = Oh My God");   
      }
      else {
         System.out.println("Sorry, don't know that one.");
      }
}   
   else{
   System.out.println("More than 140 characters.");
   } 

      return;
   }
}
