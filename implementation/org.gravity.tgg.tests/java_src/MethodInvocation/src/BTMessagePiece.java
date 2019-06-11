public class BTMessagePiece extends MessageAdapter {
  private final BTPiece piece;
  
  protected BTMessagePiece(p.Message core_msg) {
    super( core_msg );
    piece = (BTPiece)core_msg;
  }
  
  
  public int getPieceNumber() {  return piece.getPieceNumber();  }
  
  public int getPieceOffset() {  return piece.getPieceOffset();  }
  
}
