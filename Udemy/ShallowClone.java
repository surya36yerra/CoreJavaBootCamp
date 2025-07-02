package Udemy;

public class ShallowClone implements Cloneable {
    private String name;
    private String Course;

    public ShallowClone(String name, String course) {
        this.name = name;
        Course = course;
    }

@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
}


class Course{
        private String course;
}

}
