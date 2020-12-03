package uni.fmi.ui.models;

public class CommentPopup {

	private String text;
	private String message;
	private boolean isTextValid;
	private boolean isTextLong;
	

	public void addText(String input) {
		this.text = input;
	}
	
	public void clickPostButton() {
		
		if(text==null||text.isEmpty()) {
			isTextValid=false;
		}
		else if(text.length()>250) {
			isTextValid=false;
			isTextLong=true;
		}
		else {
			isTextValid=true;
		}
		if(isTextValid) {
			message="Коментарът ви е публикуван успешно!";
			
		}
		else if(isTextLong==true){	
			message="Превишена дължина на коментар!";
		}
		else {
			message = "Въведете коментар!";
		}
	}
	public String getMessage() {
		return message;
	}
	public void tooLong() {
		//text="";			//Not practical
		isTextValid=false;
		isTextLong=true;
	}
	
}
