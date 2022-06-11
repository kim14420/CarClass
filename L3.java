package exam7;

public class L3 extends Car implements Tem {

	@Override
	public int getTempGage() {
	// 엔진온도를 리턴 한다.
	// 10 주행시 엔진온도 3 증가

		return this.getDistance() / 10 * 3;
		
	}

	@Override
	public void go(int distance) {
	// 10 주행시 현재 주유량 2 감소 
	
		int tem = this.getOilSize();
		int spendOil = distance / 10 * 2;
		
		if (tem >= spendOil) {
			tem = tem - spendOil;
			this.setOilSize(tem);
			
			
			int dist = this.getDistance();
			this.setDistance(dist +distance);
		}
		else {
			System.out.println("연로가 모자랍니다.");
		}
		tem = tem - distance / 10;
		
		
	}

	@Override
	public void setOil(int oilSize) {
	// 현재 주유랑 증가
	
	int tem = this.getOilSize();
	int maxOilSize = this.getOilTank();
	if (tem + oilSize > maxOilSize) {
		this.setOil(maxOilSize);
	}
	else {
		tem = tem + oilSize;
		this.setOilSize(tem);
	}
	
	
	}

	@Override
	public String toString() {
		return  getName() + "\t\t" + getEngineSize() + "\t\t" + getOilTank()
				+ "\t\t" + getOilSize() + "\t\t" + getDistance() + "\t\t";
	}

	


}
