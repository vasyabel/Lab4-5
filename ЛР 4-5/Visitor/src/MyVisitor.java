import java.util.ArrayList;
import java.util.List;

public class MyVisitor{
    public static void main(final String[] args) {
        final House house= new House();

        house.accept(new HouseElementVisitor1());
        house.accept(new HouseElementVisitor2());
    }
}

interface HouseElement {
    void accept(HouseElementVisitor visitor);

    int valueOfVisiting();
}
interface HouseElementVisitor {
    String visit(Foundation f);
    String visit(Walls w);
    String visit(Roof r);
    String visit(House h);

}

class House implements HouseElement {
    List<HouseElement> elements;

    public House() {
        this.elements = new ArrayList<>();
        elements.add(new Foundation());
        elements.add(new Walls());
        elements.add(new Walls());
        elements.add(new Roof());
    }

    public void accept(HouseElementVisitor visitor) {
        for (HouseElement elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
    public int getValueOfVisiting(){
        return elements.get(3).valueOfVisiting();
    }
    public int valueOfVisiting(){return 0;}
}

class Foundation implements HouseElement {
    public void accept(HouseElementVisitor visitor) {
        visitor.visit(this);}
    public int valueOfVisiting(){return 3;}
}

class Roof implements HouseElement {
    public void accept(HouseElementVisitor visitor) {
        visitor.visit(this);
    }

    public int valueOfVisiting() {
        return 5;
    }
}

class Walls implements HouseElement {
    public void accept(HouseElementVisitor visitor) {
        visitor.visit(this);
    }

    public int valueOfVisiting() {
        return 7;
    }
}

class HouseElementVisitor1 implements HouseElementVisitor {
    public String visit(House house) {
        return "Building house";
    }

    public String visit(Walls walls) {
        return "Painting walls";
    }

    public String visit(Foundation foundation) {return "Filling foundation";
    }

    public String visit(Roof roof) {
        return "Covering roof";
    }
}

class HouseElementVisitor2 implements HouseElementVisitor {
    public String visit(House house) {
        return "Building house2";
    }

    public String visit(Walls walls) {
        return "Painting walls2";
    }

    public String visit(Foundation foundation) {
        return "Filling foundation2";
    }

    public String visit(Roof roof) {
        return "Covering roof2";
    }
}
