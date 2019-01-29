public class Cat {
    //напишите тут ваш код
    String name = null;
    int age = 99;
    int weight = 35;
    String address = null;
    String color;
    
    public Cat (String name){
        this.name = name;
        this.age = age;
        this.weight = weight;
        //this.address = address;
        this.color = color;    
    }
    
     public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        //this.address = address;
        this.color = color;
    }
    
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        //this.address = address;
        this.color = color;
    }
    
    public Cat(int weight, String color){
        //this.name = name;
        this.age = age;
        this.weight = weight;
        //this.address = address;
        this.color = color;
    }
    
     public Cat(int weight, String color, String address){
        //this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }
    
    


    public static void main(String[] args) {

    }
}
