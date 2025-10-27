public class Student extends Person {
    private int studyCredits;
    
    public Student(String name, String address) {
        super(name, address);
        this.studyCredits = 0;
    }
    public String credits() {
        return "Study credits " + String.valueOf(this.studyCredits);
    }
    public int study() {
        return this.studyCredits += 1;
    }
    @Override
    public String toString() {
        return super.toString() + "\n  " + this.credits();
    }
}
