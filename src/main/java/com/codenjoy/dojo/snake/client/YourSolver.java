package com.codenjoy.dojo.snake.client;

import com.codenjoy.dojo.client.Solver;
import com.codenjoy.dojo.client.WebSocketRunner;
import com.codenjoy.dojo.services.Direction;

public class YourSolver implements Solver<Board> {

  @Override
  public String get(Board board) {
    SmartSnake ss = new SmartSnake(board);
    Direction solved = ss.solve();
    return solved.toString();
  }

  public static void main(String[] args) {
    WebSocketRunner.runClient(
            "http://167.71.44.71/codenjoy-contest/board/player/geqag1x7qs4c6mqeajag?code=6727047553447645701",
        new YourSolver(),
        new Board()
    );
  }
}
