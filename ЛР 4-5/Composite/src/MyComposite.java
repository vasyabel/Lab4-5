import java.util.ArrayList;
import java.util.List;

public class MyComposite{
    public static void main(String args[]){
        House foundation1 = new Foundation();
        House foundation2 = new Foundation();

        House wall1 = new Walls();
        House wall2 = new Walls();
        House wall3 = new Walls();
        House wall4 = new Walls();

        House roof1 = new Roof();
        House roof2 = new Roof();

        Composite composite = new Composite();
        Composite composite1 = new Composite();

        composite.addComponent(foundation1);
        composite.addComponent(wall1);
        composite.addComponent(wall2);
        composite1.addComponent(roof1);

        composite1.addComponent(foundation2);
        composite1.addComponent(wall3);
        composite1.addComponent(wall4);
        composite1.addComponent(roof2);

        foundation1.build();
    }
}

interface House{
    void build();
}

class Foundation implements House{
    public void build(){
        System.out.println("Foundation is built");
    }
}

class Walls implements House{
    public void build(){
        System.out.println("Walls are built");
    }
}

class Roof implements House{
    public void build(){
        System.out.println("Roof is built");
    }
}

class Composite implements House{
    private List<House> components = new ArrayList<>();

    public void addComponent(House component){
        components.add(component);
    }
    public void removeComponent(House component){
        components.remove(component);
    }

    public void build() {
        for(House component: components){
            component.build();
        }
    }
    public List getComponents(){
        return this.components;
    }

    public int getListSize(){
        return components.size();
    }
}