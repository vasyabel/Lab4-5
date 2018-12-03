public class MyBuilder{
    public static void main(String[] args){

        Architector architector = new Architector();
        architector.setWorker(new Painter());
        PartOfHouse part = architector.build();
        System.out.println(part.getBricks());
    }
}

class Architector{

    private Worker worker;

    public void setWorker(Worker worker){
        this.worker = worker;
        worker.createPartOfHouse();
        worker.paint();
        worker.drive();
    }
	


    public PartOfHouse build(){
        return worker.getPart();
    }
}

class PartOfHouse{

    private boolean bricks;
    private boolean walls;

    public void setBricks(boolean bricks){
        this.bricks = bricks;
    }
    public boolean getBricks(){
        return this.bricks;
    }

    public void setWalls(boolean walls){
        this.walls = walls;
    }
}

abstract class Worker{

    PartOfHouse part;

    public void createPartOfHouse(){
        part = new PartOfHouse();
    }

    abstract void drive();
    abstract void paint();

    public PartOfHouse getPart(){
        return part;
    }
}

class Driver extends Worker{
    public void drive(){
        part.setBricks(true);
    }
    public void paint(){
        part.setWalls(false);
    }
}

class Painter extends Worker{
    public void drive(){
        part.setBricks(false);
    }
    public void paint(){
        part.setWalls(true);
    }
}