class DiscountForFee {
    public static void main(String[] args) {
       int fee = 125000;
       int discountPercent =10;

       //calculating the discountable money 
   
       int discount = fee * 10/100;

       //calculating fee after discount
       int totalFee = fee-discount;
        System.out.println("The discount amount is INR "+discount+ "  and final discounted fee is INR" +totalFee);
       
    }
}