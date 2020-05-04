public class NumberGenerator implements Runnable {
    private String name;
    public NumberGenerator(){};
    public NumberGenerator(String name){
        this.name = name;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + hashCode());
            }
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
