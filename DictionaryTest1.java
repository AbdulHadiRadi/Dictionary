class DictionaryTest1
{
 public static void main(String[] args)
 {
  Dictionary dict = new Dictionary();
  String module;
  dict.add("ECS510","ADSOOF");
  dict.add("ECS414","OOP");
  dict.add("ECS505","Software Engineering");
  dict.add("ECS607","Data Mining");
  //dict.result();
  System.out.println("Number of modules is: "+dict.size());
  try {
     module = dict.equiv("ECS510");
     System.out.println("The module with code ECS505 is: "+module);
     if(dict.contains("ECS607"))
        {
         module=dict.equiv("ECS607");
         System.out.println("The module with code ECS607 is: "+module);
        }
     else
        System.out.println("There is no module with code ECS410");
     if(dict.same("ECS414","OOP"))
        System.out.println("The module with code ECS414 is: OOP");
     else
        System.out.println("The module with code ECS414 is not OOP");
     dict.remove("ECS510");
     //dict.result();
     module=dict.equiv("ECS510");
     System.out.println("The module with code ECS510 is: "+module);
    }
  catch(NotFoundException e)
    {
     module=e.getMessage();
     System.out.println("There is no module with code "+module);
    }
 }
}
