package javaCodeTesting;

class NumberHolder {
	public int anInt;
	public float aFloat;
}

class NumberHolderDisplay {
	public static void main(String[] args) {
		NumberHolder aNumberHolder = new NumberHolder();
		aNumberHolder.anInt = 1;
		aNumberHolder.aFloat = 2.3f;
		System.out.println(aNumberHolder.anInt);
		System.out.println(aNumberHolder.aFloat);
	}
}