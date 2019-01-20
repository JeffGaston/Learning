class SumArrayElements{
   public static void main(String[] args){
      int bucky[]={21,16,86,21,3};
      int sum=0;
      
      for(int x: bucky){
         sum+= x;
      }
      System.out.println("The sum of these numbers is " +sum);
   }
}