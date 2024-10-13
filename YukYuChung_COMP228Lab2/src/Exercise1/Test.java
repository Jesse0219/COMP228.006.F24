package Exercise1;
import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private String[] questions = {
            "1. Which of the following tools support the software-development process, including editors for writing and editing programs and debuggers for locating logic errors—errors that cause programs to execute incorrectly?",
            "2. What is the main function of a Java compiler?",
            "3. Which one of the following symbols indicates a single line comment in Java application source code?",
            "4. Which of the following components does a Java application need to have at least one of?",
            "5. Which of the following Java program units defines a group of related objects?"
    };

    private String[][] options = {
            {
                    "A. Java Integrated Development Environments (IDE)",
                    "B. Java Development Kit (JDK)",
                    "C. Java Virtual Machine (JVM)",
                    "D. Java Application Programming Interfaces (API)"
            },
            {
                    "A. It translates the Java source code into bytecodes that represent the tasks to execute.",
                    "B. It executes the bytecodes",
                    "C. It places the program in memory to execute it",
                    "D. It examines the bytecodes to ensure that they are valid and do not violate Java’s security restrictions."
            },
            {
                    "A. //",
                    "B. /*",
                    "C. \\",
                    "D. ##"
            },
            {
                    "A. Non-static Method",
                    "B. Class",
                    "C. Instance variable",
                    "D. Local variable"
            },
            {
                    "A. Java default constructor",
                    "B. Java package",
                    "C. Java method",
                    "D. Java Class"
            }
    };

    private char[] answers = {'A', 'A', 'A', 'B', 'D'};

    private int correctAnswer = 0;
    private int wrongAnswer = 0;
    private Random rand = new Random();

    // Method to simulate the questions
    private void simulateQuestion(int questionNumber) {
        String question = questions[questionNumber];
        String[] optionArray = options[questionNumber];

        String questionDisplay = question+"\n";
        for(int i=0; i<optionArray.length; i++) {
            questionDisplay += optionArray[i]+"\n";
        }
        String userAnswer = JOptionPane.showInputDialog(null, questionDisplay.toString(), "Multiple Choice Test",JOptionPane.QUESTION_MESSAGE);
        checkAnswer(userAnswer,questionNumber);
    }
    //method to check the answer vaild or not
    private void checkAnswer(String userAnswer, int questionNumber) {
        //To check the useAnswer is not null and has at least one character
        if(userAnswer!=null && userAnswer.length()>0) {
            // take the first character for answer and make sure it is uppercase
            char userAnswerChar = userAnswer.toUpperCase().toCharArray()[0];
            if (userAnswerChar ==answers[questionNumber]){
                correctAnswer++;
                JOptionPane.showMessageDialog(null, generateMessage(true));
            }else{
                wrongAnswer++;
                JOptionPane.showMessageDialog(null, generateMessage(false)+"\nThe correct answer was " + answers[questionNumber]);
            }

        }else{
            wrongAnswer++;
            JOptionPane.showMessageDialog(null, "No answer provided\nThe correct answer was " +
                    answers[questionNumber]);
        }
    }
    //method generateMessage to user about their input
    private String generateMessage(boolean correctOrNot) {
        String message;
        //1-4 randomly to send the message base on userAnswer
        switch( rand.nextInt( 4 ) ) {
            case 0:
                if(correctOrNot) {
                    message ="Excellent!";
                }else{
                    message ="No. Please try again.";
                }
                break;
                case 1:
                if(correctOrNot) {
                        message ="Good!";
                }else{
                        message ="Wrong. Try once more.";
                }
                break;
                case 2:
                if(correctOrNot) {
                    message ="Keep up the good work!";
                }else{
                    message ="Don't give up!";
                }
                break;
                case 3:
                if(correctOrNot) {
                    message ="Nice work!";
                }else{
                    message ="No. Keep trying.";
                }
                break;
                default:
                message = "";
                break;
        }
        return message;
    }

    //Method inputAnswer
    public void inputAnswer() {
        for(int i=0; i<questions.length; i++) {
            simulateQuestion(i);
        }

        //Final result
        int totalQuestions = questions.length;
        double percentage=(double)correctAnswer/totalQuestions * 100;
        String result = "Times Up!\n" +
        "Correct Answer: " + correctAnswer + "\n" +
                "Wrong Answer: " + wrongAnswer + "\n" +
                "Percentage: " + String.format("%.2f",percentage)+"%";
        JOptionPane.showMessageDialog(null, result);
    }

    }