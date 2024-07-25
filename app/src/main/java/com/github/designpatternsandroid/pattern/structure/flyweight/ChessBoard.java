package com.github.designpatternsandroid.pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 棋盘类
 * 说明：假设我们在开发一个棋牌游戏（比如象棋）。一个游戏厅中有成千上万个“房间”，每个房间对应一个棋局。棋局要保存每个棋
 * 子的数据，比如：棋子类型（将、相、士、炮等）、棋子颜色（红方、黑方）、棋子在棋局中的位置。利用这些数据，我们就能显示
 * 一个完整的棋盘给玩家。具体的代码如下所示。其中，ChessPiece 类表示棋子，ChessBoard 类表示一个棋局，里面保存了象
 * 棋中 32 个棋子的信息。为了记录每个房间当前的棋局情况，我们需要给每个房间都创建一个 ChessBoard 棋局对象。因为游戏
 * 大厅中有成千上万的房间（实际上，百万人同时在线的游戏大厅也有很多），那保存这么多棋局对象就会消耗大量的内存。这个时候，
 * 享元模式就可以派上用场了。
 * @date: 2024/7/25 17:41
 */
public class ChessBoard {
    private Map<Integer, ChessPiece> chessPieces = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(
                ChessPieceUnitFactory.getChessPiece(1), 0,0));
        chessPieces.put(1, new ChessPiece(
                ChessPieceUnitFactory.getChessPiece(2), 1,0));
        //...省略摆放其他棋子的代码...
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        //...省略...
    }
}
