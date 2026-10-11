package Demo1;

public class Test {

    private static String SCOPE = "Scope";
    public static void main(String[] args) {
        Scopes scopes = Scopes.High;
        System.out.println(scopes.getDescription());
        System.out.println(Test.SCOPE);
    }
}
