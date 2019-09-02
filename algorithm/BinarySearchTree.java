package algorithm;

// BSTクラスの定義
class BST {
	public int data; // 要素の値
	public int left; // 左側の要素にたどるポインタ
	public int right; // 右側の要素にたどるポインタ
}

// ２分探索木を操作するクラスの定義
public class BinarySearchTree {
	// ２分探索木の実体となる配列（要素数を最大10個とする）
	public static BST[] tree = new BST[10];

	// 根の要素の添字（連結リストの先頭ポインタ）
	public static int rootIdx = 0;

	// 次に格納する要素の添字
	public static int newIdx = 0;

	// ２分探索木に要素を追加するメソッド
	public static void addBST(int data) {
		int currentIdx; // 現在たどっている要素の添字
		boolean addFlg; // 追加が完了したことを示すフラグ

		// 物理的な位置に追加する
		tree[newIdx].data = data;
		tree[newIdx].left = -1;
		tree[newIdx].right = -1;

		// 根のデータでないなら、論理的な位置にポインタを設定する
		if (newIdx != rootIdx) {
			currentIdx = rootIdx;
			addFlg = false;

			do {
				// より小さい場合は左側をたどる
				if (data < tree[currentIdx].data) {
					// 左側が末端なら、そこに追加する
					if (tree[currentIdx].left == -1) {
						tree[currentIdx].left = newIdx;
						addFlg = true;
					}
					// 左側が末端でないなら、さらに左側の要素をたどる
					else {
						currentIdx = tree[currentIdx].left;
					}
				}
				// より大きい場合は、右側をたどる
				else {
					// 右側が末端なら、そこに追加する
					if (tree[currentIdx].right == -1) {
						tree[currentIdx].right = newIdx;
						addFlg = true;
					}
					// 右側が末端でないなら、さらに右側の要素をたどる
					else {
						currentIdx = tree[currentIdx].right;
					}
				}
			} while (addFlg == false);
		}
		// 次に格納する要素の為に添字を1増やしておく
		newIdx++;
	}

	// 二分探索木の実体の配列を物理的な順序で表示するメソッド
	public static void printPhysicalBST() {
		int i;

		for (i = 0; i < newIdx; i++) {
			System.out.printf("tree[%d]:data = %d, left = %d, right = %d\n",
					i, tree[i].data, tree[i].left, tree[i].right);
		}
	}

	// 二分探索木の実体の配列を論理的な順序で表示するメソッド
	public static void printLogicalBST(int currentIdx) {

		if (currentIdx != -1) {
			System.out.printf("tree[%d]:data = %d, left = %d, right = %d\n",
					currentIdx, tree[currentIdx].data, tree[currentIdx].left, tree[currentIdx].right);

			// 再帰呼び出し
			printLogicalBST(tree[currentIdx].left);
			printLogicalBST(tree[currentIdx].right);
		}
	}

	// 二分探索木で要素を探索するメソッド
	public static int searchBST(int x) {
		int idx; // 見つかった要素の添字
		int currentIdx; // 現在たどっている要素の添字

		idx = -1;
		currentIdx = rootIdx;

		while (currentIdx != -1) {
			if (tree[currentIdx].data == x) {
				idx = currentIdx;
				break;
			} else if (tree[currentIdx].data > x) {
				currentIdx = tree[currentIdx].left;
			} else {
				currentIdx = tree[currentIdx].right;
			}
		}
		return idx;
	}

	// Mainメソッド
	public static void main(String[] args) {
		for (int i = 0; i < tree.length; i++) {
			tree[i] = new BST();
		}
		// 二分探索木を構築して、物理的な順序で表示する
		addBST(4);
		addBST(6);
		addBST(5);
		addBST(2);
		addBST(3);
		addBST(7);
		addBST(1);
		printPhysicalBST();
		System.out.println("------------------------------------------");
		printLogicalBST(rootIdx);

		System.out.println();

		// 二分探索木を探索する
		System.out.printf("「5」の探索結果 = %d\n", searchBST(5));
		System.out.printf("「8」の探索結果 = %d\n", searchBST(8));
	}

}
