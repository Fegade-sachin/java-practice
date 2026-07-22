package arrays.array_program_practice;
/*38. Removing spaces in a string
Program to identify and remove all white spaces in a given string of characters.*/
public class RemoveSpaces
{
	public static void main(String[] args) {
        String input = "Java   Stream   API   Example";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                s.append(input.charAt(i));
            }
        }
        System.out.print(s.toString());
    }
}
