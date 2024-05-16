public class Vertex {
    private char label; //label (E.G. 'A')
    private boolean wasVisited;

    public Vertex(char lab) {
        label = lab;
        wasVisited = false;
    }

    //Setter dan getter
    public void setLabel(char label) {
        this.label = label;
    }

    public char getLabel() {
        return this.label;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

    public boolean getWasVisited() {
        return this.wasVisited;
    }
}
