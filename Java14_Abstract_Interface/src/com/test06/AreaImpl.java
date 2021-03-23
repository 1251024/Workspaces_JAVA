package com.test06;

public abstract class AreaImpl implements Area {

	private String result;
	
	@Override
	public void print() {
		//super.PRINT X->super:부모 "객체"
		//Area.PRINT = "abcd"; X -> static final

		//자바에서 일반적으로 변수는 카멜 표기법으로 표현
		//상수는 대문자로 표기함(대문자는 상수구나)
		//클래스가 아니라서
		System.out.println(Area.PRINT + result);
	}

	@Override
	public abstract void make();

	public void setResult(String result) {
		this.result = result;
	}
	
}
