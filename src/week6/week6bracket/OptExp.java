package structure;

public class OptExp {
	private String exp;
	private int expSize;
	private char testCh, openPair;
	
	public boolean testPair(String exp) {
		this.exp = exp;
		LinkedStack S = new LinkdsStack();
		expSize = this.exp.length();
		for(int i = 0; i <exp.Size; i++) {
			testCh = this.exp.charAt(i);
			switch(testCh) {
			case '(' :
			case '{' :
			case '[' :
				S.push(testCh); 
				break;
			case ')' :
			case '}' :
			case ']' :
				if(S.isEmpty()) return false;
				else {
					openPair = S.pop();
					if((openPair == '(' && testCh != ')') ||
					   (openPair == '{' && testCh != '}') ||
					   (openPair == '[' && testCh != ']') ))
					   return false;
					else 
						break;
				}
			}
		}
		if (S.isEmty()) return true;
		else
			return false;
	}
}
