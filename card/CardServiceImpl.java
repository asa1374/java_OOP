package card;

public class CardServiceImpl implements CardService{

	@Override
	public CardBean bet(String kind, int number) {
		CardBean card = new CardBean();
		card.setKind(kind);
		card.setNumber(number);
		return card;
	}

}
