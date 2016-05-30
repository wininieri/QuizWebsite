import java.util.ArrayList;

/**
 * Virtually the same as the question-response type
 * stores the index of the blank in the question
 * blank space appears after the index number of words
 * for example 'One of President Lincoln’s most famous speeches was the __________ Address.' has
 * index at 9.
 * if blank is at the start of the question (before any words), index = 0
 */
public class FillBlank extends QuestionResponse {

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index = -1;



}
