class Core2Web{
	public static void main(String[] args){
		String str = new String("Core2Web");
		String newStr ="";
		for(int i=str.length()-1;i>=0;i--){
			newStr = newStr + str.charAt(i);
		}
		System.out.println(newStr);
	}
}
