public class App {
    public static void main(String[] args) throws Exception {
        Cow ngua = new Cow();
        Duck donald = new Duck();
        Pig piglet = new Pig();
        Owl hedwig = new Owl();
        PekingDuck daisy = new PekingDuck();
        // donald.clean(ngua);
        // donald.clean(piglet);
        // donald.clean(hedwig);
        donald.clean(new Cow());
        daisy.clean(donald);

    

        
    }
}
