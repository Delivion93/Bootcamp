package exeptions;

public class IncorrectNifFormatExeption extends RuntimeException {

    public IncorrectNifFormatExeption(){
        super("Incorrect NIF format");
    }
    public IncorrectNifFormatExeption(String message) {
        super(message);
    }
}
