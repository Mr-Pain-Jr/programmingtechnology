package pr2;

public class Node {
    private int value;
    private int priority;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
