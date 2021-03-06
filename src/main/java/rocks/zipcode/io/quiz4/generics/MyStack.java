package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {

    private Stack<SomeType> stacks = new Stack<>();

    public MyStack() {

        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {
        return stacks.isEmpty();
    }

    public void push(SomeType i) {
        stacks.push(i);
    }

    public SomeType peek() {
        if (stacks.size() == 0) {
            return null;
        } else {
            return stacks.peek();
        }

        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SomeType pop() {
        return stacks.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}

