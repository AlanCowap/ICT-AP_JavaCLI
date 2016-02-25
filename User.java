/** 
 *  A simple class to store state and information on a User
 *  e.g. for a Twitter account
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */

//import java.lang.*; //implicitly imported

class User{

	//State
	private String userName;
	private String passWord;
	private String displayName;
	private String emailAddress;
	private String[] tweets;
	//private Tweet[] tweets;

	//Behaviour
	public void setDisplayName(String newDisplayName){
		this.displayName = newDisplayName;
	}

	public String getDisplayName(){
		return this.displayName;
	}

	public void generateNewPassWord(){}		

}


/*
class Tweet{
	String content;
	long uid;
	Date posting;
	int retweets;
	int favourited;
	int numViews;
}

*/
