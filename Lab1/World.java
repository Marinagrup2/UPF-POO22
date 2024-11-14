import java.awt.*;


public class World {

    private int width;
    private int height;
    private Agent[] agents = new Agent[10];
    private int margin = 30;
    private int numerA;

    private Vec2D randomPos ( ) {
        double x = margin + Math.random()*(width - 2 * margin);
        double y = margin + Math.random()*(height - 2 * margin);
        return new Vec2D (x, y);
    }

    private double randomRadius ( ){
        return 5 + Math.random()*(margin - 5);
    }

    
    public World(int w, int h, int cap){
        width = w;
        height = h;
        numerA = cap;

        for(int i = 0; i < agents.length; i++){
            Agent a = new Agent(randomPos(), randomRadius());
            agents[i] = a;
            agents[i].setTarget(randomPos());
            agents[i].setSpeed(1);
        }
        
    }

    public void add (Agent a){
        agents[this.numerA] = a;
        

    }

    public void simulationStep(){
        for(int i = 0; i < numerA; i++){
            if(agents[i].reachedTarget()== true){
                agents[i].setTarget(randomPos());
            }else{
                agents[i].updatePosition();
            }

        }

    }

    public void manageCollisions(){

        for(int i = 0; i < 10; i++ ){
            for(int j = 0; j < 10; j++){
                agents[i].setTarget(randomPos());
                agents[j].setTarget(randomPos());

            }
        }


    }

    public void paint(Graphics g) {
        for(int i =0; i < 10; i++){
            agents[i].paint(g);
        }
    }
}
