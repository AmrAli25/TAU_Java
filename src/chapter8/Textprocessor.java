package chapter8;

public class Textprocessor {
    public static void main(String[] args) {
//        countWords("I love Test Automation University");
//        reverseString("Hello TAU");
        addSpaces("HeyWorldIt'sMeAmr");
    }

    /**
     * The fun will count the letters of the text by
     * splitting the array and tokenize it
      * @param text full string to be split
     */
   public static void countWords(String text){
       var words = text.split(" ");
       int numOfWords = words.length;
       System.out.printf("Your text contains %d Words%n", numOfWords);
       for (String word : words) {
           System.out.println(word);
       }
   }

    /**
     * Print a reversed text
     * @param text the text to be reversed
     */
   public static void reverseString(String text){
       for (int i = text.length()-1; i>=0; i--)
           System.out.print(text.charAt(i));
   }

    /**
     * Add spaces to text before capital letters
     * @param text jumbled text
     */
   public static void addSpaces(String text){
       var modifiedText = new StringBuilder(text);
       for (int i = 0; i<modifiedText.length(); i++){
           if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
               modifiedText.insert(i," ");
               i++;
           }
       }
       System.out.print(modifiedText);

   }

}
