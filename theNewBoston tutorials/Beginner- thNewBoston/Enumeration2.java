public enum Enumeration2{
   bucky("nice", "22"),
   kelsey("cutie", "10"),
   julia("bigmistake", "12");
   
   private final String desc;
   private final String year;
   
   Enumeration2(String description, String birthday){
      desc = description;
      year= birthday;
   }
   
   public String getDesc(){
      return desc;
   }
   
   public String getYear(){
      return year;
   }
}