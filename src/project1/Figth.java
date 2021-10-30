package project1;

import java.util.*;

public class Figth {

	Guide gd = new Guide();
	Scanner in = new Scanner(System.in);

	List<ChterDTO> fight(List<MonsterDTO> mList, List<ChterDTO> cList) {
		boolean figth = true;

		while (figth) {
			System.out.println("1.공격||2.회복");
			int figth2 = in.nextInt();
			if (figth2 == 1) {

				int chHp = 0;
				int mHp = 0;

				chHp = cList.get(0).setHp(cList.get(0).getHp() - (mList.get(0).getAtt() - cList.get(0).getDep()));
				cList.get(0).setHp(chHp);
				if (cList.get(0).setHp(chHp) <= 0) { // 주인공 체력 -가 안나오게끔
					cList.get(0).setHp(0);
				}
				System.out.println(cList.get(0).getId() + "의Hp:" + cList.get(0).getHp());

				mHp = mList.get(0).setHp(mList.get(0).getHp() - (cList.get(0).getAtt() - mList.get(0).getDep()));
				mList.get(0).setHp(mHp);
				if (mList.get(0).setHp(mHp) <= 0) { // 주인공 체력 -가 안나오게끔
					mList.get(0).setHp(0);
				}
				System.out.println(mList.get(0).getName() + "의Hp:" + mList.get(0).getHp());

				if (mList.get(0).getHp() <= 0) {
					gd.mEnd();
					figth = false;

				} else if (cList.get(0).getHp() <= 0) {
					gd.cEnd();
					figth = false;

				}
			} else if (figth2 == 2) {
				int chHpp = 0;
				int potion = 0;

				chHpp = cList.get(0).setHp(cList.get(0).getHp() + 50);
				cList.get(0).setHp(chHpp);
				if (cList.get(0).setHp(chHpp) >= 150) {
					System.out.println("체력이 +50회복됐습니다.");
					cList.get(0).setHp(150);
				}
				System.out.println("현재체력:" + cList.get(0).getHp());

				potion = cList.get(0).setPotion(cList.get(0).getPotion() - 1);
				cList.get(0).setPotion(potion);

				if (cList.get(0).getPotion() >= 2) {
					System.out.println("이미 최대 체력입니다.");
					System.out.println(cList.toString());
				}

			}

			break;
		}
		return cList;
	}
}
