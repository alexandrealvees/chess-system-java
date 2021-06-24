package aplicattion;

import java.util.prefs.BackingStoreException;

import bordgame.Board;

public class Program {

	public static void main(String[] args) {

		Board board = new Board(8, 8);
		System.out.println(board);

	}
}
