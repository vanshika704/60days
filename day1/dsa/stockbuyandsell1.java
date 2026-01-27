public class stockbuyandsell1 {
    public static void main(String[] args) {
        int minPrice =Integer.MAX_VALUE;
        int maxProfit = 0;
        int prices [] = new int []{7,1,5,3,6,4};
        for(int price: prices){
            minPrice = Math.min(minPrice , price);
maxProfit = Math.max(maxProfit , price-minPrice);
        }
        System.out.println(maxProfit); 
    }
}
