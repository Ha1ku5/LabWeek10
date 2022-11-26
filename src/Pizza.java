public class Pizza {
    private enum sizes {Small, Meduim, Large}
    private sizes size;
    private int meatCount;
    private int vegCount;
    private boolean isVegan;

    //default constructor for when no params are passed
    public Pizza(){
        size = sizes.Meduim;
        meatCount = 0;
        vegCount = 0;
        isVegan = false;
    }

    //constructor for when parameters are passed
    public Pizza(String size, int meatCount, int vegCount, boolean isVegan){
        this.meatCount = meatCount;
        this.vegCount = vegCount;
        this.isVegan = isVegan;
        if(size.equalsIgnoreCase("small")){
            this.size = sizes.Small;
        } else if(size.equalsIgnoreCase("medium")){
            this.size = sizes.Meduim;
        } else if(size.equalsIgnoreCase("large")){
            this.size = sizes.Large;
        } else {
            System.out.println("Unavailable pizza size! Check your input.");
        }
    }

    //calculates the cost of the pizza
    //based on toppings and size
    public double calcCost(){
        double cost = 0;
        if(size == sizes.Small){
            cost += 10;//Small pizza
        } else if (size == sizes.Meduim){
            cost += 12;//Med pizza
        } else {
            cost += 14;//Large pizza
        }

        cost += vegCount;
        if(isVegan){
            cost += 2;
        } else {
            cost += meatCount * 2;
        }

        return cost;
    }

    public String getDescription(){
        String veganStatus = "";
        if(isVegan)
            veganStatus = " vegan";
        return "A " + size.toString() + veganStatus + " pizza with "
                + vegCount + " veggies and, "
                + meatCount + " meats, costing "
                + calcCost() + " dollars.";
    }

    //setter methods
    public void setMeat(int meatCount){
        if(meatCount >= 0) {
            this.meatCount = meatCount;
        } else {
            System.out.println("Meat amount not changed, you cannot have negative toppings");
        }
        //my IDE suggested to make my if/else statement into a oneliner and I really dislike it.
        isVegan = meatCount == 0;
    }
    public void setVeg(int vegCount){
        if(vegCount >= 0) {
            this.vegCount = vegCount;
        } else {
            System.out.println("Veg amount not changed, you cannot have negative toppings");
        }
    }

    //getter methods
    public int getMeat(){
        return meatCount;
    }
    public int getVeg(){
        return vegCount;
    }
    public String getSize(){
        if(size == sizes.Small){
            return "small";
        } else if(size == sizes.Meduim){
            return "meduim";
        } else{
            return "large";
        }
    }
    public boolean isVegan(){
        return isVegan;
    }







}
