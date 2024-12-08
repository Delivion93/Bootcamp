package ex08;

import ex04.FreshProduct;
import ex04.Product;
import ex04.RefrigeratedProduct;

import java.util.List;
import java.util.ArrayList;


public class SortingProducts {

    private static final int MAX_DAYS_OF_EXPIRATION=12;

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Shoes",50));
        productList.add(new Product("Iphone",1200));
        productList.add(new Product("Laptop",1000));
        productList.add(new Product("Nisan",22000));
        productList.add(new FreshProduct("Apple",1,4));
        productList.add(new FreshProduct("Cookies",8,12));
        productList.add(new FreshProduct("Beer",3,2));
        productList.add(new RefrigeratedProduct("Peas",2.5f,5));
        productList.add(new RefrigeratedProduct("Pizza",5,7));
        productList.add(new RefrigeratedProduct("Nuggets",8,3));
        productList.add(new RefrigeratedProduct("Waffles",3,12));
        productList.add(new RefrigeratedProduct("Lasagna",12,4));


        productList.sort((p1,p2)-> Float.compare(p1.getPrice(),p2.getPrice()));

        float totalToBuy=0;
        int furthestDrawer=0;
        int indexOfFurthestDrawer=0;
        int minExpiration=MAX_DAYS_OF_EXPIRATION;
        int indexOfMinExpiration=0;
        for (Product product : productList) {
            System.out.println("Product number "+product.getId());
            float amountToBuyFive = product.byu(5);
            totalToBuy+=amountToBuyFive;
            if(product instanceof RefrigeratedProduct){
                RefrigeratedProduct p = (RefrigeratedProduct)product;
                if(p.getDrawerNumber()>furthestDrawer){
                    furthestDrawer= p.getDrawerNumber();
                    indexOfFurthestDrawer=productList.indexOf(p);
                }
            }
            if(product instanceof FreshProduct){
                FreshProduct p = (FreshProduct) product;
                if(p.getDaysOfExpiration()<minExpiration){
                    minExpiration=p.getDaysOfExpiration();
                    indexOfMinExpiration=productList.indexOf(p);
                }
            }
        }
        System.out.println("total amount for the purchase of 5 units of each product: "+totalToBuy);
        System.out.println("The refrigerated product has the farthest drawer is: "+productList.get(indexOfFurthestDrawer).getName());
        System.out.println("the fresh product closest to expiration "+productList.get(indexOfMinExpiration).getName());

    }
}
