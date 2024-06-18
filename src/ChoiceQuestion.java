import java.util.ArrayList;

public class ChoiceQuestion extends Question{
    private ArrayList<String> choices;

    public ChoiceQuestion(){
        choices = new ArrayList<>();
    }

//    public ChoiceQuestion(String text){
//        super(text);
//        choices = new ArrayList<>();
//    }

    /**
     * adds choices for the choice question
     * mark the correct one
     * @param s
     * @param correct
     */
    public void addChoice(String s, boolean correct){
        this.choices.add(s);
        if(correct){
            setAnswer(s);
        }
    }

    /**
     * display method for choice question
     * overrides the display method of question
     */
    public void display(){
        //display the question text
        super.display();
        //display the choices
        for(String c: choices){
            System.out.println(c);
        }
    }
}
