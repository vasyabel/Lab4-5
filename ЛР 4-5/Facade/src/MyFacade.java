import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyFacade{
    public static void main(String[] args){

        Architector architector = new Architector();
        architector.startWorking();
    }
}

class Architector{
    List<Object> workers = new ArrayList<>();
    Driver d = new Driver();
    Painter p = new Painter();
    Builder b = new Builder();

    public void startWorking(){
        workers.add(d);
        workers.add(p);
        workers.add(b);
        d.drive();
        p.paint();
        b.build();
    }

    public List<Object> getWorkers(){
        return this.workers;
    }
}

class Driver{
    public void drive(){
        System.out.println("Start driving");
    }
}

class Painter{
    public void paint(){
        System.out.println("Start painting");
    }
}

class Builder{
    public void build(){
        System.out.println("Start building");
    }
}