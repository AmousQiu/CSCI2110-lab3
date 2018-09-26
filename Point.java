public class Point<T> {
    private T xpos;
    private T ypos;

    Point(T xpos, T ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public void setXpos(T xpos) {
        this.xpos = xpos;
    }

    public void setYpos(T ypos) {
        this.ypos = ypos;
    }

    public T getXpos() {
        return this.xpos;
    }

    public T getYpos() {
        return this.ypos;
    }

    public String toString() {
        return "xpos: " + xpos + " ypos: " + ypos;
    }
}
