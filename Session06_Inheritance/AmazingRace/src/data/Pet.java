
package data;

/**
 *
 * @author Huynh Van Phuot
 */
public abstract class Pet {
    // chứa nhân tử chung của đám Con
    protected String name;
    protected int yob;
    protected double weight;

    public Pet() {
    }

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    // hành động của mỗi đứa Con cụ thể, khác nhau ở mỗi Con
    // xử lí khác nhau! --> chạy là 1 ý tưởng chung chung mà Pet cần có
    // là 1 thứ đi cùng Pet nhưng cụ thể thì tùy từng đứa
    // abstract method
    // cái gì mà k cụ thể khi đề cập, nói chung chung --> abstract
    public abstract double run();
    
    // mỗi đứa gáy, sủa thành tích theo kiểu khác nhau
    public abstract void showRecord();
    
}