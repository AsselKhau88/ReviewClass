package review3;

public class SwitchStatements {
    public static void main(String[] args) {

        String color="GreEn"; // GREEN, Green< greEN, GreEN

        switch (color){ // we can say( color.toLowerCase()) it converts
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown color, action is also unknown");
        }
    }
}
