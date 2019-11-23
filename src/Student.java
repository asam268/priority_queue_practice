public class Student implements Comparable<Student>{

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        if(this.cgpa > o.cgpa)
            return -1;
        else if(this.cgpa < o.cgpa)
            return 1;
        else {
            if (this.cgpa == o.cgpa) {
                if (this.name.equalsIgnoreCase(o.name))
                    return this.id - o.id;
                else
                    return this.name.compareTo(o.name);
            }
            else
                return 0;
        }
    }

    @Override
    public String toString(){
        return this.name + " " + cgpa + " " + id;
    }
}
