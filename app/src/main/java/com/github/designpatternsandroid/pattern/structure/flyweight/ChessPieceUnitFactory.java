package com.github.designpatternsandroid.pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 享元类的工厂类
 * @date: 2024/7/25 17:41
 */
public class ChessPieceUnitFactory {
    private static final Map<Integer, ChessPieceUnit> pieces = new HashMap<>();

    static {
        pieces.put(1, new ChessPieceUnit(1, "車", ChessPieceUnit.Color.BLACK));
        pieces.put(2, new ChessPieceUnit(2,"馬", ChessPieceUnit.Color.BLACK));
        //...省略摆放其他棋子的代码...
    }

    public static ChessPieceUnit getChessPiece(int chessPieceId) {
        return pieces.get(chessPieceId);
    }
}
