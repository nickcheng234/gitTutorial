/**
 * Created by ethan on 2017-02-07.
 */
public class Instructor extends Person {
    String title;
    Course favCourse;
    boolean fulltime;

    public Instructor(String name, String emailAddress, String title, Course favCourse, boolean fulltime){
        super(name,emailAddress);
        this.title=title;
        this.favCourse = favCourse;
        this.fulltime = fulltime;

    }

    public String toString(){
        return String.format("Name: %s\nTitle: %s\nEmail: %s", this.name, this.title, this.emailAddress);
    }
}
