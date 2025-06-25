public class student{
    int id;
    String name;
    double marks;

public student(int id, String name, double marks)
{
    this.id=id;
    this.name=name;
    this.marks=marks;
}
@Override
public String toString() {
    return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
}
}