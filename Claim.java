package Assignments.Day3;


//Base class for Claims
public abstract class Claim {
   final int id;
   final double amount;
   final String type;
   
   public Claim(int id,double amount,String type) {
	   this.id=id;
	   this.amount=amount;
	   this.type=type;
   }
   public int getId() {
	   return id;
   }
   public double getAmount() {
	   return amount;
   }
   public String getType() {
	   return type;
   }
   public abstract void process();
}

//Subclass for Health Claims
class HealthClaim extends Claim{
	public HealthClaim(int id,double amount) {
		super(id,amount,"Health");
	}
	@Override
	public void process() {
		System.out.println("Processing Health Claim:"+getId());
	}
}
//Subclass for Auto Claims
class AutoClaim extends Claim{
	public AutoClaim(int id,double amount) {
		super(id,amount,"Auto");
	}
	@Override
	public void process() {
		System.out.println("Processing Auto Claim:"+getId());
	}
}
