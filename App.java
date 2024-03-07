public class App {
    public static void main(String[] args) throws Exception {
        Product[] productList = new Product[0];
        productList = add(productList, "apple", 2, 3);
        productList = add(productList, "banana", 3.5, 1);
        productList = add(productList, "papaya", 2.5, 5);
        productList = add(productList, "avocado", 8.5, 3);
        productList = insert(productList, 2, "guava", 3, 2);
        show(productList);

    }

    public static Product createProduct(String productName, double productPrice, int productQuantity){
        return new Product(productName, productPrice, productQuantity);
    }

    public static Product[] add(Product[] productList, String productName, double productPrice, int productQuantity  ){

        Product newProduct = createProduct(productName, productPrice, productQuantity);

        int productListLength = productList.length;
        Product[] tempProductList = productList;
        productList = new Product[productListLength+1];
        int i;
        for(i=0; i<productListLength; i++){
            productList[i] = tempProductList[i];
        }
        productList[i] = newProduct;
        return productList;
    }

    public static void show(Product[] productList){
        int productListLength = productList.length;
        int i;

        for(i=0; i<productListLength; i++){
            System.out.println(productList[i].getName() + " is $" + productList[i].getPrice() + ".");
        }
        return;
    }

    public static Product[] insert(Product[] productList, int position, String productName, double productPrice, int productQuantity ){

        Product newProduct = createProduct(productName, productPrice, productQuantity);

        Product[] tempProductList = productList;
        int productListLength = productList.length;
        productList = new Product[productListLength+1];
        int i=0, j=0;
        for(; i<=productListLength; i++, j++){
            
            if(i==position){
                productList[i] = newProduct;
                j--;
                continue;
            }
            productList[i] = tempProductList[j];
        }
        return productList;
    }
}
