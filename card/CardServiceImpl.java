package card;

public class CardServiceImpl implements CardService{

	@Override
	public CardBean join(String kind, int number) {
		CardBean bean = new CardBean();
		bean.setKind(kind);
		bean.setNumber(number);
		return bean;
	}
}
