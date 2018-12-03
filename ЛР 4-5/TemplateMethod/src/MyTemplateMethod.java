public class MyTemplateMethod {
    public static void main(String[] args) {
        Worker builder1 = new Builder1();
        builder1.work();

        Worker builder2 = new Builder2();
        builder2.work();
    }
}

abstract class Worker {

    int bricks, foundations, hours;

    final void work() {
        build();
        relax();
        System.out.println(salary());
    }

    abstract void build();

    abstract void relax();

    abstract int salary();
}

class Builder1 extends Worker{
    void build(){
        System.out.println("I'm building roof");
        bricks++;
    }
    void relax() {
        System.out.println("I'm relaxing at home");
        hours += 5;
    }
    int salary(){
        return bricks*100 - hours*10;
    }
}
class Builder2 extends Worker{
    void build(){
        System.out.println("I'm building foundation");
        foundations++;
    }
    void relax() {
        System.out.println("I'm relaxing at work");
        hours += 7;
    }
    int salary(){
        return foundations*200 - hours*20;
    }
}