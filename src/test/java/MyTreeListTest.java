import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyTreeListTest {


    @Test
    public void contains() {
        MyTreeList list = new MyTreeList();
        list.add(1);
        list.add(2);
        assertEquals(true,list.contains(2));
    }

    @Test
    public void add() {
        MyTreeList list = new MyTreeList();
        list.add(1);
        list.add(2);
        assertEquals(2,list.size());
    }

    @Test
    public void set() {
    }

    @Test
    public void remove() {
        MyTreeList list = new MyTreeList();
        list.add(1);
        list.add(2);
        list.remove(0);
        assertEquals(0,list.indexOf(2));
    }

}