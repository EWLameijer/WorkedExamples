package objects.one;


import java.math.BigDecimal;


// Example 2
// If I'm a florist and I need to make a bouquet, I need to know at least three things about flowers:
// their color, their diameter, and their price. Probably their name too...
// If a flower must provide those services (telling name, color, diameter and price)
// for that, it NEEDS to know those values (so also fields for name, color, diameter, price of itself.
// This means that I need to create fields too.
// I also wish to create a constructor, as name, color and diameter (and likely price) are known when I make
// a new flower object.
// Note that the price can change, though, so I would need a setter for that.

// Step 1: Create the field (name, color, diameterInMm, price). All are fixed/'final' EXCEPT price.
/* Of course, this code won't compile, as there are final fields which should be initialized by a constructor
(which is not there yet!)
class FlowerStep1 {
    private final String name;

    private final Color color;

    private final double diameterInMm;

    private BigDecimal price;
} */

// Step 2A: create a constructor (Alt+Ins)
class FlowerStep2A {
    private final String name;

    private final Color color;

    private final double diameterInMm;

    private BigDecimal price;

    public FlowerStep2A(String name, Color color, double diameterInMm, BigDecimal price) {
        this.name = name;
        this.color = color;
        this.diameterInMm = diameterInMm;
        this.price = price;
    }
}

// Step 2B: Create the getters (again, Alt+Ins helps!)
class FlowerStep2B {
    private final String name;

    private final Color color;

    private final double diameterInMm;

    private BigDecimal price;

    public FlowerStep2B(String name, Color color, double diameterInMm, BigDecimal price) {
        this.name = name;
        this.color = color;
        this.diameterInMm = diameterInMm;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public double getDiameterInMm() {
        return diameterInMm;
    }

    public BigDecimal getPrice() {
        return price;
    }
}


// Step 2C: Create the setters - or the setter, only one needed, for the price (again, Alt+Ins helps!)
// Note that step 3 is not necessary, as there are no other methods required
class Flower {
    private final String name;

    private final Color color;

    private final double diameterInMm;

    private BigDecimal price;

    public Flower(String name, Color color, double diameterInMm, BigDecimal price) {
        this.name = name;
        this.color = color;
        this.diameterInMm = diameterInMm;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public double getDiameterInMm() {
        return diameterInMm;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal newPrice) {
        if (newPrice.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("A price cannot be 0 or below!");
        this.price = newPrice;
    }
}
