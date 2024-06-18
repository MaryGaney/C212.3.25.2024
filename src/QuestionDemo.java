import java.util.Scanner;

public class QuestionDemo {
    public static void main(String[] args) {
        Question q = new Question();
        q.setText("Which movie won an oscar this year for best picture?");
        q.setAnswer("Oppenheimer");

        Scanner in = new Scanner(System.in);
        q.display();
        String ans = in.nextLine();
        System.out.println(q.checkAnswer(ans));
    }
}
