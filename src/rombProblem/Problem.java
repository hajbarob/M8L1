package rombProblem;

public class Problem implements IntA, IntATwo{

    @Override
    public void a() {
        IntATwo.super.a();
    }

    public static class Test{
        public static void main(String[] args) {
            Problem problem = new Problem();
            problem.a();
        }
    }
}
