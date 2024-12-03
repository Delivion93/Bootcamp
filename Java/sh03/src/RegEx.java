public class RegEx {

    public static void main(String[] args) {
        emailValidation("artem@gmail.com");
        emailValidation("artem@hotmail.com.es");
        emailValidation("artem@asd123");
    }

    public static void emailValidation(String email){
        String regEx = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if(email.matches(regEx)){
            System.out.println(email+" is a valid email");
        }
        else{
            System.out.println(email+" is not valid email");
        }
    }
}
