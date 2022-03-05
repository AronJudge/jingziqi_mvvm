package com.xiangxue.mvx.viewmodel;


import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableField;

import com.xiangxue.mvx.model.Board;
import com.xiangxue.mvx.model.Player;

public class JingziqiViewModel {

    private Board model;

    public final ObservableArrayMap<String, String> cells = new ObservableArrayMap<>();
    public final ObservableField<String> winner = new ObservableField<>();

    public JingziqiViewModel() {
        model = new Board();
    }

    public void onResetSelected() {
        model.restart();
        winner.set(null);
        cells.clear();
    }

    public void onClickedCellAt(int row, int col) {
        Player playerThatMoved = model.mark(row, col);
        if(playerThatMoved != null) {
            cells.put("" + row + col, playerThatMoved == null ? null : playerThatMoved.toString());
            winner.set(model.getWinner() == null ? null : model.getWinner().toString());
        }
    }
}
