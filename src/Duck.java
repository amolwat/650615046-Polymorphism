public class Duck extends Animal implements Flyable{
    @Override
    void sound(){
        System.out.println("Quack quack!");
    }
    
    public void fly() {
        System.out.println("เป็ดบิน");
     }
 
     public void glide() {
         System.out.println("เป็ดร่อน");
     }
 

     public void clean(Animal prey){
        System.out.println(this + " is cleaning "+ prey);
     }

     void activity(){
        System.out.println("swim");
     }
}
