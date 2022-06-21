import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    public int counterForFirstBall = 0;
    public int counterForSecondBall=0;
    public int counterForThirdBall=0;
    public int counterForFourthBall=0;
    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ballOneMovement();
        ballTwoMovement();
        ballThreeMovement();
        ballFourMovement();
    }

    private void ballTwoMovement() {
        ellipse(counterForSecondBall,2*(HEIGHT/5),DIAMETER,DIAMETER);
        counterForSecondBall=counterForSecondBall+2;
    }
    private void ballFourMovement()
    {
        ellipse(counterForFourthBall,4*(HEIGHT/5),DIAMETER,DIAMETER);
        counterForFourthBall=counterForFourthBall+4;
    }
    private void ballThreeMovement()
    {
        ellipse(counterForThirdBall,3*(HEIGHT/5),DIAMETER,DIAMETER);
        counterForThirdBall=counterForThirdBall+3;
    }
    private void ballOneMovement() {
        ellipse(counterForFirstBall,HEIGHT/5,DIAMETER, DIAMETER);
        counterForFirstBall++;
    }
}
