package com.tns.application;
import com.tns.framework.NormalAcc;

		public class GSNormalAcc extends NormalAcc {
			
//			Constructor
			public GSNormalAcc(int AccNo, String accNm, float charges, boolean isPrime) {
				super(AccNo, accNm, charges, isPrime);
			}

			
			@Override
			public void bookProduct(float f) {
				super.bookProduct(f);
			}

			@Override
			public String toString() {
				return "Welcome to GoShopping\n" + super.toString();
			}

			public void getAccNm() {
				// TODO Auto-generated method stub
				
			}

			public void getAccNo() {
				// TODO Auto-generated method stub
				
			}

			public void getCharges() {
				// TODO Auto-generated method stub
				
			}

			public void getDeliveryCharge() {
				// TODO Auto-generated method stub
				
			}

		
	}


