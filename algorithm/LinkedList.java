package algorithm;

// StationListクラス
class StationList {
	public String name; // 駅名
	public int next; // ポインタ
}

// 連結リストを操作するクラスの定義
public class LinkedList {

	// 連結リストの実体となる配列（要素数を最大10個とする）
	public static StationList[] list = new StationList[10];

	// 先頭ポインタ
	public static int top;

	// 初期状態の連結リストを作成するメソッド
	// インスタンス化
	public static void initStationList() {
		// Javaではインスタンス生成が必要
		for(int i = 0; i < list.length; i++) {
			list[i] = new StationList();
		}

		// 駅名とポインタを設定する
		list[0].name = "新大阪";
		list[0].next =  -1;
		list[1].name = "名古屋";
		list[1].next =  3;
		list[2].name = "東京";
		list[2].next =  4;
		list[3].name = "京都";
		list[3].next =  0;
		list[4].name = "新横浜";
		list[4].next =  1;

		// 先頭のポインタを設定する
		top = 2;
	}

	// 連結リストの要素を表示する
	public static void printStationList() {
		int idx = top;
		while(idx != -1) {
			System.out.printf("[" + list[idx].name + "]→");
			idx = list[idx].next;
		}
		System.out.println();
	}

	// 連結リストに要素を挿入する
	public static void insertStationList(int insIdx, String insName, int preIdx) {
		list[insIdx].name = insName;
		list[insIdx].next = list[preIdx].next;
		list[preIdx].next = insIdx;
	}

	// 連結リストの要素を削除する
	public static void deleteStationList(int delIdex, int preIdv) {
		list[preIdv].next = list[delIdex].next;
	}

	public static void main(String[] args) {
		// 初期状態の連結リストを作成して表示する
		initStationList();
		printStationList();

		// 連結リストに要素を追加して表示する
		insertStationList(5, "品川", 2);
		printStationList();

		// 連結リストから要素を削除して表示する
		deleteStationList(5, 2);
		printStationList();
	}
}
