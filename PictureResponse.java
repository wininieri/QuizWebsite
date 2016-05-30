import java.util.ArrayList;

/**
 * Similar to question-response type, except the url for the image used is also stored
 */
public class PictureResponse extends QuestionResponse {

    private String pic_URL = "";

    public String getPic_URL() {
        return pic_URL;
    }

    public void setPic_URL(String pic_URL) {
        this.pic_URL = pic_URL;
    }
}
