// Anonymous Classes
// Anonymous classes are a way to extend the existing classes on the fly.

// The @Override annotation is used to make your code easier to understand, 
// because it makes it more obvious when methods are overridden.

// The modification is applicable only to the current object, and not the class itself.
// So if we create another object of that class, the start method's implementation will be the one defined in the class.


// You are a store manager.
// You are offering a 10% discount on all items in the store. Today, you have had a total of two customers. 
// To the first, you honored the 10% discount on all purchased items. The second customer, however, purchased a lot of items and you want to give him a bigger discount -- 20% -- to show your appreciation.
// Complete the program by creating two Purchase objects - 1 for the regular customer, and 1 for a special one, and override the totalAmount() method for the special customer on the fly to set the proper 20% discount.

package soloLearn.java.practice;

class Purchase {
    int price;

    public int totalAmount(int price) {
        return price - (price * 10) / 100; // 10% discount for regular customers
    }
}

public class ex8_anonClasses {
    public static void main(String[] args) {
        Purchase customer = new Purchase();
        
        // create a special customer and override the totalAmount() method
        Purchase specialCustomer = new Purchase() {
            @Override
            public int totalAmount(int price) {
                return price - (price * 20) / 100; // 20% discount for the special customer
            }
        };

        System.out.println(customer.totalAmount(1000));     // regular customer with 10% discount
        System.out.println(specialCustomer.totalAmount(100000)); // special customer with 20% discount
    }
}