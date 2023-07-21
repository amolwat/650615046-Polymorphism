public class Owl extends Animal implements Flyable {

    @Override
    void sound() {
        System.out.println("Hoot hoot!");
    }

    @Override
    public void fly() {
       System.out.println("ฮูกบิน");
    }

    @Override
    public void glide() {
        System.out.println("ฮูกร่อน");
    }

    void eyecontact(){
        System.out.println("จ้อง");
    }


    
}
