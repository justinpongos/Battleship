import javax.swing.JOptionPane;
public class Battleship {
	public static void main(String[]args) {
		int row = Integer.parseInt(JOptionPane.showInputDialog("How many rows would you like?"));
		int col = Integer.parseInt(JOptionPane.showInputDialog("How many column's would you like?"));
		
		int[][] gameBoard = new int[row][col];
		String[][] o = new String[row][col];
		
		for(int r = 0; r < gameBoard.length; r++) {
			for(int c = 0; c < gameBoard[0].length; c++) {
				gameBoard[r][c] = (int)(Math.random()*100 + 1);
			}//end for 1
		}//end for 2
		
		int randrow = (int)(Math.random() * row);
		int randcol = (int)(Math.random() * col);
		
		gameBoard[randrow][randcol] = 0;
		
		for(int r = 0; r < gameBoard.length; r++) {
			for(int c = 0; c < gameBoard[0].length; c++) {
				System.out.print(gameBoard[r][c] + " ");
			}//end for 1
			System.out.println("\n");
		}//end for 2
		
		for(int r = 0; r < gameBoard.length; r++) {
			for(int c = 0; c < gameBoard[0].length; c++) {
				o[r][c] = "x";
			}//end for 1
		}//end for 2
		
		for(int r = 0; r < gameBoard.length; r++) {
			for(int c = 0; c < gameBoard[0].length; c++) {
				System.out.print(o[r][c] + " ");
			}//end for 1
				System.out.println("\n");
		}//end for 2
		
		int x = 0;
		
		while (x == 0) {
			int b = Integer.parseInt(JOptionPane.showInputDialog("Please enter an X coordinate"));
			int a = Integer.parseInt(JOptionPane.showInputDialog("Please enter an Y coordinate"));
		
			if (gameBoard[a][b] == 0) {
				System.out.println("You Sunk My Battleship!!!");
				x++;
			}//end if
			
			else {
				o[a][b] = "M";
				int roffby = a-randrow;
				int coffby = b-randcol;
				
				if(roffby < 0) {
					roffby = roffby * -1;
				}//end if
				
				if(coffby < 0) {
					coffby = coffby * -1;
				}//end if
				
				System.out.println("You were off by " + roffby + " rows and " + coffby + " columns");
			}//end else
			for(int r = 0; r < gameBoard.length; r++) {
				for(int c1 = 0; c1 < gameBoard[0].length; c1++) {
					System.out.print(o[r][c1] + " ");
				}//end for 1
				System.out.print("\n");
			}//end for 2
		}//end while
	}//end main
}//end class
