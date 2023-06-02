package objects.one;

/* Let's make a class that can do things next to just storing data. Imagine I was making a program to solve a water
jug puzzle (https://www.futurelearn.com/info/courses/recreational-math/0/steps/43519).
The jug would have methods like fill (from a tap or such), pourInto() to pour into another jug, and empty()
A jug would have a capacity (how many litres it can contain) as well as contents (its current contents)

// Step 1: add the fields (capacity and contents; let make them both int for the game, a real jug would likely
// have double as volume and contents; measurements are almost always best modeled as doubles, but this is a math
// puzzle, so it doesn't have to be too realistic). The volume is final, the contents are not
// Anyway, this step won't compile as we have an uninitialized final variable, but no constructor yet.
class JugStep1  {
    private final int capacity;

    private int contents;
}
 */

// Step 2A: Add the constructor (Alt+Ins)
class JugStep2A {
    private final int capacity;

    private int contents;

    public JugStep2A(int capacity, int contents) {
        this.capacity = capacity;
        this.contents = contents;
    }
}

// Step 2B: add getters (may be useful for this game, to know how large each jug is and how much is in it)
class JugStep2B {
    private final int capacity;

    private int contents;

    public JugStep2B(int capacity, int contents) {
        this.capacity = capacity;
        this.contents = contents;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getContents() {
        return contents;
    }
}

// Step 2C: You don't "set" the contents of a jug directly, you pour liquids in and out of them. This is also an
// introduction to something you see more often in OO: that you don't set values with simple setter methods, because
// there are rules and mechanisms and so-called "invariants" (things that must always be true). Such that the capacity
// must always be positive, and the contents between zero and the capacity (inclusive). In fact, it may be a good
// idea to adjust the constructor to let it create empty jugs, and check the capacity. Then I'll add the fill, empty,
// and pourInto methods
public class Jug {
    private final int capacity;

    private int contents = 0; // start out empty

    public Jug(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("A jug needs to have a capacity greater than zero.");
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getContents() {
        return contents;
    }

    public void fill() {
        contents = capacity;
    }

    public void empty() {
        contents = 0;
    }

    public void pourInto(Jug otherJug) {
        int capacityRemainingInOtherJug = otherJug.capacity - otherJug.contents;
        if (contents > capacityRemainingInOtherJug) {
            otherJug.contents += capacityRemainingInOtherJug;
            contents -= capacityRemainingInOtherJug;
        } else {
            otherJug.contents += contents;
            contents = 0;
        }
    }
}






