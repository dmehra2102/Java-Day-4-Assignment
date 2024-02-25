package question2;

public class Main {
    public static  void main(String[] args){
        Product[] productList = new Product[5];
        productList[0] = new Product(11,220,2);
        productList[1] = new Product(9,300,1);
        productList[2] = new Product(6,256,2);
        productList[3] = new Product(8,430,1);
        productList[4] = new Product(13,520,3);


        System.out.println("Total amount spent : " + getTotalAmount(productList));
        System.out.println("The PID of product with Highest Price is :" + findProductPIDOfHighestPrice(productList));
    }

    public static int getTotalAmount(Product[] productList){
        int totalAmount = 0;
        for(int i = 0; i< productList.length-1 ; i++){
            totalAmount += productList[i].price * productList[i].quantity;
        }

        return totalAmount;
    }

    public static int findProductPIDOfHighestPrice(Product[] productList){
        int maxPidIndex = 0;
        for(int j=1;j < productList.length;j++){
            if(productList[maxPidIndex].price < productList[j].price){
                maxPidIndex = j;
            }
        }

        return productList[maxPidIndex].pid;
    }
}
