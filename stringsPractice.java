public class stringsPractice {
    public static void main(String[] args) {
        // String s = "SACHIN TENDULKAR";
        // int len = s.trim().length();
        //System.out.println(len);      
        //System.out.println("A" == "A");  

        // String fName = "James";
        // String lName = "Gosling";
        // System.out.println(fName  = lName);

        String str = "Good";
        change(str);
        System.out.println(str);
    }
    private static void change(String s){
        s.concat("_Morning");
    }
}
