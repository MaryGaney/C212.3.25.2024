import java.util.Scanner;

public class ChoiceQuestionDemo {

    //polymorphic, can take 2 different objects, related through inheritance, can pass parent and child class and work
    //with both of them
    //display -> dynamic method lookout, at runtime checks what type of object is there
    //not what type of reference is there
    public static void presentQuestion(Question cq){
        Scanner in = new Scanner(System.in);

        cq.display();
        String ans = in.nextLine();
        System.out.println(cq.checkAnswer(ans));
    }

    public static void main(String[] args) {
        ChoiceQuestion cq = new ChoiceQuestion();

        cq.setText("Which movie won an oscar for best picture this year");
        cq.addChoice("Oppenheimer", true);
        cq.addChoice("Barbie", false);
        cq.addChoice("Poor Things", false);
        cq.addChoice("American Fiction", false);


        presentQuestion(cq);

        ChoiceQuestion cq1 = new ChoiceQuestion();

        cq1.setText("What is the meaning of life");
        cq1.addChoice("42", true);
        cq1.addChoice("Pain", false);
        cq1.addChoice("Living", false);
        cq1.addChoice("Happiness", false);

        presentQuestion(cq1);

        Question q = new Question();
        q.setText("Which movie won an oscar this year for best picture");
        q.setAnswer("Oppenheimer");

        presentQuestion(q);

    }
}
