public class Palindromo {
    public static void main(String[] args) {
        System.out.println("revolver is polindrom? - "+isPolindrom("revolver"));
        System.out.println("radar is polindrom? - "+isPolindrom("radar"));
    }

    public static boolean  isPolindrom(String text){
        if(text.length()%2==0){
            return false;
        }
        text=text.toLowerCase();
        int midle = text.length()/2;
        for(int i=0;i<midle;i++){
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
