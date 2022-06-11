package exam7;

public class L2 extends Car implements Tem {

	
	public int getTempGage() {
		// 엔진온도를 리턴 한다.
		// 10 주행시 엔진온도 2 증가

			return this.getDistance() / 10 * 2;
			
		}

		@Override
		public void go(int distance) {
		// 10 주행시 현재 주유량 1.5 감소
		
			double tem = this.getOilSize();
			double spendOil = (distance / 10) * 1.5;
			
			if (tem >= spendOil) {
				tem = tem - spendOil;
				this.setOilSize((int)tem);
				
				
				int dist = this.getDistance();
				this.setDistance(dist + distance);
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

