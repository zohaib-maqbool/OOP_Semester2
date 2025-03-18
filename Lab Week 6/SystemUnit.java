public class SystemUnit{
	
	
	private String cpuName;
	private int RAM ;
	private int Disksize;
	private String Processor;
	private String LCDmodel;
	
	public SystemUnit(String cpuName,int RAM,int Disksize,String Processor,String LCDmodel){

		this.cpuName=cpuName;
		this.RAM=RAM;
		this.Disksize=Disksize;
		this.Processor=Processor;
		this.LCDmodel=LCDmodel;

	}

	public void setcpuName(String cpuName){
		this.cpuName=cpuName;
	}

	public String getcpuName(){
		return cpuName;
	}

	public void setRAM(int RAM){
		this.RAM=RAM;
	}

	public int getRAM(){
		return RAM;
	}

	public void setDisksize(int Disksize){
		this.Disksize=Disksize;
	}

	public int getDisksize(){
		return Disksize;
	}

	public void setProcessor(String Processor){
		this.Processor=Processor;
	}

	public String getProcessor(){
		return Processor;
	}

	public void setLCDmodel(String LCDmodel){
		this.LCDmodel=LCDmodel;
	}

	public String getLCDmodel(){
		return LCDmodel;
	}

	public String toString(){
		return String.format("System Specifications:\nCPU name:%s \nRAM size:%d MBs \nDisk size:%d GBs \nProcessor:%s \nLCD Model:%s",cpuName,RAM,Disksize,Processor,LCDmodel);
	}



}