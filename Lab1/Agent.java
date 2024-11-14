import java.awt.*;

public class Agent {
    
    private Vec2D pos;
    private Vec2D dir ;
    private double radius;
    private Vec2D target;
    private double speed;

    public Agent(Vec2D v,double r){
        pos = v;
        radius = r;
    }

    public void setTarget(Vec2D t){

        this.target = t;
        dir = new Vec2D(target);
        dir.subtract(pos);
        dir.normalize();

    }

    public void setSpeed(double s){
        this.speed = s;
    }

    public void updatePosition(){

        Vec2D vector = new Vec2D(speed*dir.getX(), speed*dir.getY());
        pos.add(vector);
        //pos = pos + speed*dir
        
    }



    public boolean reachedTarget(){

        Vec2D vector2 = new Vec2D(pos.getX()-target.getX(), pos.getY()-target.getY());
        
        if(vector2.length() < radius){
            return true;
        }else{
            return false;
        }
        

    }

    public boolean isColliding(Agent a){
        
        Vec2D vector = new Vec2D(dir);
        vector.subtract(a.dir);
        if(vector.length() <= radius + a.radius ){
            return true;
        }else {
            return false;
        }
    }



    public void paint(Graphics g) {
        int x = ( int ) (pos.getX( ) - radius) ;
        int y = ( int ) (pos.getY() - radius) ;
        int d = ( int ) ( 2 * radius) ;
        g.setColor(Color.RED) ;
        g.fillOval(x, y, d, d) ;
        }




    

}
