package bank7;
public enum EnumPlayingCards {
	HEART('♥'),
	CLUB('♣'),
	DIAMOND('♦'),
	SPADE('♠');
	private char symbol;
	private EnumPlayingCards(char symbol) {
		this.symbol=symbol;}
	public char getSymbol() {
		return symbol;}
	public static void main(String[]args) {
		System.out.println(EnumPlayingCards.HEART.getSymbol());
		System.out.println(EnumPlayingCards.CLUB.getSymbol());
		System.out.println(EnumPlayingCards.DIAMOND.getSymbol());
		System.out.println(EnumPlayingCards.SPADE.getSymbol());
		System.out.println(EnumPlayingCards.HEART.ordinal());
		//System.out.println(EnumPlayingCards.CLUBS.ordinal());
	}}
