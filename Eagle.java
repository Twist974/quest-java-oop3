public class Eagle extends Bird implements Fly {


	private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

   

    public boolean isFlying() {
        return flying;
    }
    
    public void setFlying(boolean flying) {
		this.flying = flying;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

    @Override
    public String sing() {
        return "Screech!";
    }

	@Override
	public void takeOff() {
			System.out.println(this.getName() + " is already flying.");
		}
	

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " lands on the ground");
	}

	@Override
	public void ascend(int meters) {
		// TODO Auto-generated method stub
		this.setAltitude(this.altitude + meters);
		System.out.println(getName() + " flies upward, altitude : " + this.altitude );
	}

	@Override
	public void descend(int meters) {
		// TODO Auto-generated method stub
		this.setAltitude(this.altitude - meters);
		System.out.println(getName() + " flies downward, altitude : " + this.altitude );
	}

	@Override
	public void glide() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " glides into the air");
	}



	@Override
	public int getAltitude() {
		// TODO Auto-generated method stub
		return 400;
	}
}
