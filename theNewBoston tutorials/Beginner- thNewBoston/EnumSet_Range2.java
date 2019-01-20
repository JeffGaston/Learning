public enum EnumSet_Range2{
   bucky("nice", "22"),
   kelsey("cutie", "10"),
   julia("bigmistake", "12"),
   nicole("Italian", "13"),
   candy("different", "14"),
   erin("iwish", "16");
   
   private final String desc;
   private final String year;
   
   EnumSet_Range2(String description, String birthday){
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