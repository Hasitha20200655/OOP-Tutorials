package Question6;

public class Vertex implements Node{
    int x;
    int y;

    Vertex(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.println("x: " + x + ", y: " + y);
    }
}
