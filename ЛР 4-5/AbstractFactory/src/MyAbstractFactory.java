public class MyAbstractFactory{
    public static void main(String[] args){

        String projectName = "Cottage";

        HouseCreator creator = null;

        if(projectName.equals("Cottage")){
            creator = new CottageCreator();
        }
        if(projectName.equals("Flat")){
            creator = new FlatCreator();
        }

        House newHouse = creator.create();
        newHouse.build();
    }
}

interface HouseCreator{
    House create();
}

class CottageCreator implements HouseCreator{
    public House create(){
        return new Cottage();
    }
}
class FlatCreator implements HouseCreator{
    public Flat create(){
        return new Flat();
    }
}

interface House{
    void build();
}

class Cottage implements House{
    public void build(){
        System.out.println("Cottage is building");
    }
}

class Flat implements House{
    public void build(){
        System.out.println("Flat is building");
    }
}
