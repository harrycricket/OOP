
package data;

public class Dog {
   
    public String name;
    private int yob;
    private double weight;

    public Dog(String name, int yob, double weight) {
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
    
    // ta chủ động đưa nhiều info ra
    public void bark() {
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                name, yob, weight);
    }
    
    // 1 object bất kì sẽ có nhiều info để mô tả
    // show info là hành động ta chủ động đưa ra hoặc tự genarate
    // theo template có sẵn
    // template có sẵn trên Java giúp mình k cần code

    @Override  // khác Overload, dính đến kế thừa
    // cả 2 thằng đều có liên quan đến 1 khái niệm POLYMORPHISM - tính đa hình 
    public String toString() {
        // return "Dog{" + "name = " + name + ", yob = " + yob + ", weight = " + weight + '}';
        // được quyền độ lại vì chỉ cần trả về chuỗi chứa info thôi
        // String tmpMsg = String.format("|%-10s|%4d|%4.1f|",
        //                        name, yob, weight);
        // return tmpMsg;
        
        return   String.format("|%-10s|%4d|%4.1f|",
                             name, yob, weight); 
    }
    
    // Hàm gắn với việc xử lí info của object 
    // Ai nhiều info, ng đó xử lí 
    public int getAge() {
        return 2022 - yob;
    }
    // viết code kiểu này gọi là hard-code, năm sau phải sửa 
    // muốn đúng chuẩn: lấy giờ hệ thống windows - yob;
}
