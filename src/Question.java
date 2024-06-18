/**
 * question with a text and answer
 */
public class Question {
    private String text;
    private String answer;

    /**
     * no argument constructor
      */
    public Question(){
        this.text = "";
        this.answer = "";
    }

    public String getAnswer() {
        return answer;
    }

    public String getText() {
        return text;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * display the question
     */
    public void display(){
        System.out.println(this.text + "?");
    }

    /**
     * compares the provided answer with the actual answer
     * @param s: the provided answer
     * @return: the boolean value
     */
    public boolean checkAnswer(String s){
        return this.answer.equalsIgnoreCase(s);
    }

}
