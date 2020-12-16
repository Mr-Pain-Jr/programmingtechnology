package pr2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueWithPriorityTest {

    QueueWithPriority queueWithPriority1;
    QueueWithPriority queueWithPriority2;

    @Before
    public void setUp() throws Exception {
        queueWithPriority1 = new QueueWithPriority(5);
        queueWithPriority2 = new QueueWithPriority(5);
    }

    @Test
    public void testQueue1() {
        Node expectedFirstPeek = new Node(6343);
        Node expectedLastPeek = new Node(21);
        queueWithPriority1.add(expectedLastPeek);
        queueWithPriority1.add(new Node(53435));
        queueWithPriority1.add(new Node(42346743));
        queueWithPriority1.add(expectedFirstPeek);
        Assert.assertEquals(expectedFirstPeek, queueWithPriority1.peek());
        queueWithPriority1.poll();
        queueWithPriority1.poll();
        Assert.assertEquals(expectedLastPeek, queueWithPriority1.peek());
    }

    @Test
    public void testQueue2() {
        Node expectedFirstPeek = new Node(9);
        Node expectedSecondPeek = new Node(662356565);
        Node expectedThirdPeek = new Node(425);
        Node expectedFourthPeek = new Node (20000);
        Node expectedFifthPeek = new Node(12);
        queueWithPriority2.add(expectedFifthPeek);
        queueWithPriority2.add(expectedFourthPeek);
        queueWithPriority2.add(expectedThirdPeek);
        queueWithPriority2.add(expectedSecondPeek);
        queueWithPriority2.add(expectedFirstPeek);
        Assert.assertEquals(expectedFirstPeek, queueWithPriority2.peek());
        Assert.assertEquals(expectedSecondPeek, queueWithPriority2.peek());
        Assert.assertEquals(expectedThirdPeek, queueWithPriority2.peek());
        Assert.assertEquals(expectedFourthPeek, queueWithPriority2.peek());
        Assert.assertEquals(expectedFifthPeek, queueWithPriority2.peek());
    }

}