package com.github.designpatternsandroid.pattern.structure.flyweight;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 棋子类
 * @date: 2024/7/25 17:41
 */
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit unit, int positionX, int positionY) {
        this.chessPieceUnit = unit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    // 省略getter、setter方法
}
