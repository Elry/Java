package av1;
public class Av1GetSet {
    private String Number = " ";
    private String Description = "";
    private short Quantity = 0;
    private float UnityPrice = 0;
    
    public Av1GetSet(){ }
    
    public Av1GetSet(String cNumber, String cDescription, short cQuantity, float cUnityPrice){
        Number = cNumber;
        Description = cDescription;
        Quantity = cQuantity;
        UnityPrice = cUnityPrice;
    }
    
    public void setNumber(String sNumber){
        Number = sNumber;
    }
    public String getNumber(){
        return Number;
    }
    
    public void setDescription(String sDescription){
        Description = sDescription;
    }
    public String getDescription(){
        return Description;
    }
    
    public void setQuantity(short sQuantity){
        Quantity = sQuantity;
    }
    public short getQuantity(){
        return Quantity;
    }
    
    public void setUnityPrice(float sUnityPrice){
        UnityPrice = sUnityPrice;
    }
    public float getUnityPrice(){
        return UnityPrice;
    }
    
    public float getTotal(){
        if (UnityPrice < 0 || Quantity  < 0){
            return 0;
        }else{
            return Quantity * UnityPrice;
        }
    }
}
