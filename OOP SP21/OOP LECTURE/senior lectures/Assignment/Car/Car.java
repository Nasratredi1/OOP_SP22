public class Car
{
   private String make;
   private String model;
   private String manufacturer;
   public Car (String make, String model, String manufacturer)
   {
      this.make = make;
      this.model = model;
      this.manufacturer = manufacturer;
   }
   public String getMake () 
  {
   return make;
   }
   public String getModel () {
   return model;
   }
   public String getManufacturer () 
  { 
   return manufacturer;
   }
}