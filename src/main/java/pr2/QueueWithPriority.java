package pr2;

public class QueueWithPriority {
    private Node[] mass;
    private int counter;
    private int lastIndex = 0;
    private int currentMaxPrior = 1;


    public QueueWithPriority(int length) {
        mass = new Node[length];
        counter = 0;
    }

    public void add(Node n) {
        if (mass[0] == null) {
            mass[0] = n;
            n.setPriority(currentMaxPrior);
        } else {
            for (Node node : mass) {
                if (node != null) {
                    if (findFirstNum(n) > findFirstNum(node)) {
                        n.setPriority(currentMaxPrior + 1);
                        node.setPriority(currentMaxPrior);
                    }
                    mass[counter] = n;
                } else {
                    continue;
                }
            }
        }
        counter++;
    }

    public void poll() {
        mass[counter] = null;
        counter--;
    }

    public Node peek() {
        Node result = mass[counter - 1];
        mass[mass.length-1] = null;
        counter--;
        return result;
    }

    private int findFirstNum(Node n) {
        String s = Integer.toString(n.getValue());
        char[] toFind = s.toCharArray();
        char found = toFind[0];
        String toParse = String.valueOf(found);
        int firstnum = Integer.parseInt(toParse);
        return firstnum;
    }

    @Override
    public String toString() {
        String toString = "";
        for (Node n : mass) {
            if (n != null) {
                String add = String.valueOf(n.getValue());
                toString += add + " ";
            }
        }
        return toString;
    }
}
