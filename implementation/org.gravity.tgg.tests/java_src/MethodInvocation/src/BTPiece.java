public class BTPiece implements BTMessage {
  private final int piece_number;
  private final int piece_offset;
  
  
  public BTPiece( ) {
	  piece_number = 0;
	  piece_offset = 1;
  }
  
  
  
  public int getPieceNumber() {  return piece_number;  }
  
  public int getPieceOffset() {  return piece_offset;  }
  
}
