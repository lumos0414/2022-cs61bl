/** A class that represents a path via pursuit curves. */
public class Path {
    // TODO
    private Point curr;
    private Point next;

    public Path(double x,double y){
        curr = new Point();
        next = new Point(x,y);
    }

    public double getCurrX(){
        return curr.getX();
    }
    public double getCurrY(){
        return curr.getY();
    }

    public double getNextX(){
        return next.getX();
    }

    public double getNextY(){
        return next.getY();
    }

    public Point getCurrentPoint(){
        return curr;
    }

    public void setCurrentPoint(Point point){
        setter.curr = ponit;
    }

    public void iterate(double dx,double dy){
        curr = new Point(getNextX(), getCurrY());
        next = new Point(curr.getX()+dx, curr.getY()+dy);
    }
}
