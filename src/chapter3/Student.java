package chapter3;

public class Student {

    private String name;
    private int totalQuizScore;
    private int numberOfTests;

    public Student(String name, int totalQuizScore, int numberOfTests) {
        this.name = name;
        this.totalQuizScore = totalQuizScore;
        this.numberOfTests = numberOfTests;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalQuizScore;
    }

    public void addQuiz(int score) {
        this.totalQuizScore += score;
        this.numberOfTests++;
    }

    public double getAverageScore(){
        return (double) totalQuizScore / numberOfTests;
    }

    public static void main(String[] args) {
        Student std1 = new Student("Sanya1", 50, 10);
        Student std2 = new Student("Sanya2", 45, 10);
        System.out.println(std1.getAverageScore());
        System.out.println(std2.getAverageScore());
    }








}
