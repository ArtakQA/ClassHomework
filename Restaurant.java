import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    private List<String> menu;
    private List<String> reviews;
    public Restaurant (String name, String location) {
        this.name = name;
        this.location = location;
        this.menu = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }
    public void  addMenuItem(String item) {
        menu.add(item);
    }
    public void  addReview(String review) {
        reviews.add(review);
    }
    public void displayReviews() {
        System.out.println(name +" Restaurant's reviews" + ", which is located in " + location);
        for (String review : reviews) {
            System.out.println(review);
        }
    }
}
class DemoRestaurant {
    public static void main(String[] args) {
        Restaurant Celler = new Restaurant("Celler de Can Roca", "Girona, Spain");
        Celler.addReview("This cozy restaurant has left the best impressions! Hospitable hosts, delicious dishes," +
                " beautiful presentation, wide wine list and wonderful dessert. I recommend to everyone! " +
                "I would like to come back here again and again.");
        Celler.addReview("It’s a great experience. The ambiance is very welcoming and charming. Amazing wines, " +
                "food and service. Staff are extremely knowledgeable and make great recommendations.");
        Celler.displayReviews();
    }
}
