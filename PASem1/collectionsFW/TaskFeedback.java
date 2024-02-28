package collectionsFW;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Feedback {
    int feedbackId;
    String courseName;
    int facultyId;
    int feedbackRating;

    public Feedback(int feedbackId, String courseName, int facultyId, int feedbackRating) {
        super();
        this.feedbackId = feedbackId;
        this.courseName = courseName;
        this.facultyId = facultyId;
        this.feedbackRating = feedbackRating;
    }

    @Override
    public String toString() {
        return "Feedback Id=" + feedbackId + ", Course Name=" + courseName + ", Faculty Id=" + facultyId
                + ", Rating=" + feedbackRating;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public int getFeedbackRating() {
        return feedbackRating;
    }

    public void setFeedbackRating(int feedbackRating) {
        this.feedbackRating = feedbackRating;
    }
}

class College {
    List<Feedback> li = new ArrayList<>();

    public void addFeedback() {
    	
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Feedback ID");
        int fei = sc.nextInt();
        
        System.out.println("Enter Course Name");
        String cn = sc.next();
        
        System.out.println("Enter Faculty ID");
        int fi = sc.nextInt();
        
        System.out.println("Enter Feedback Rating");
        int fr = sc.nextInt();
        
        Feedback t = new Feedback(fei, cn, fi, fr);
        li.add(t);
    }

    public String viewallFeedback(String course) {
        for (Feedback f : li) {
            if (f.getCourseName().equals(course))
                return f.toString();
        }
        return "Course not found";
    }
}

public class TaskFeedback {

    public static void main(String[] args) {
    	College c = new College();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of entries: ");
        int x=in.nextInt();
        
        for(int i=1;i<=x;i++)
        {
        	System.out.println("Entry number "+i);
        	c.addFeedback();
        }
        
        System.out.println("Enter course search key");
        String checker = in.next();
        in.close();
        String out = c.viewallFeedback(checker);
        System.out.println(out);
    }
}
