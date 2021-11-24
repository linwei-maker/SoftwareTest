import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.iterators.ListIteratorWrapper;
import org.apache.commons.collections.list.AbstractLinkedList;

import java.util.Collection;
import java.util.LinkedList;

public class TestMain {

    public static void main(String[] args) {
        TestMain myTest = new TestMain();
        myTest.testAdd();
        myTest.testRemove();
        myTest.testContains();
    }

    public void testAdd()
    {
        MyTreeList list = new MyTreeList();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }

    public void testRemove()
    {
        MyTreeList list = new MyTreeList();
        list.add(1);
        list.add(2);
        list.remove(1);
        System.out.println(list);
    }

    public void testContains()
    {
        MyTreeList list = new MyTreeList();
        list.add(1);
        list.add(2);
        System.out.println(list.contains(2));
    }


}
