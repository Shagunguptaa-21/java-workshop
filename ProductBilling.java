public class ProductBilling {

    //Method 1: Billing for one product
    void bill(int price){
        System.out.println("Total bill for one product: " + price);
    }

    //Method 2: Billing for two products
    void bill(int price1, int price2){
        int total = price1 + price2;
        System.out.println("Total bill for two products: " + total);
    }

    //Method 3: Billing for three products
    void bill(int price1, int price2, int price3){
        int total = price1 + price2 + price3;
        System.out.println("Total bill for three products: " + total);
    }

    public static void main(String[] args) {

        //Step 1: Create object 
        ProductBilling pb = new ProductBilling();

        //Step 2: call overloaded methods
        pb.bill(500);
        pb.bill(500, 300);
        pb.bill(500, 300, 200);
    }
}
