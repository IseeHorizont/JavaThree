import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> {
    private ArrayList<T> list;

    public ArrayList<T> getList() {
        return list;
    }

    public Box(){
        this.list = new ArrayList<T>();
    }

    public void addInBox(T obj){
        list.add(obj);
    }

    public void printContentOfBox(){
        for (T item: list) {
            System.out.print(item + " ");
        }
    }

    public float getWeightOfBox(){
//        float total = 0;
//        for (T item : list){
//            total += item.getWeight();
//        }
//        return total;
        /* или так */
        return getList().get(0).weight * list.size();
    }

    public boolean compareBoxes(Box secondBox){
        if(this.getWeightOfBox() == secondBox.getWeightOfBox()){
            return true;
        }
        return false;
    }

    public void addInOtherBox(Box<? extends Fruit> otherBox){
        if(getList().get(0).getClass().equals(otherBox.getList().get(0).getClass())){
            list.addAll((Collection<? extends T>) otherBox.getList());
            System.out.println("Содержимое коробки успешно добавлено");
        }else{
            System.out.println("Содержимое коробок не совпадает!");
        }
    }


}
