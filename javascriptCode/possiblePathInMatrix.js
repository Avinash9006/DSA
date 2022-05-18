const Matrix = [
  [1, 1, 1],
  [1, 1, 1],
  [1, 1, 1],
];

function possiblePathOnlyUpAndDown(
  Matrix,
  xDestination,
  yDestination,
  x,
  y,
  path = ""
) {
  if (xDestination == x && yDestination == y) {
    path = path + " -> ";
    process.stdout.write(path);
    return;
  }
  if (x + 1 < Matrix.length)
    possiblePathOnlyUpAndDown(
      Matrix,
      xDestination,
      yDestination,
      x + 1,
      y,
      path + "R"
    );
  if (y + 1 < Matrix.length)
    possiblePathOnlyUpAndDown(
      Matrix,
      xDestination,
      yDestination,
      x,
      y + 1,
      path + "B"
    );
  if (x + 1 < Matrix.length && y + 1 < Matrix.length) {
    possiblePathOnlyUpAndDown(
      Matrix,
      xDestination,
      yDestination,
      x + 1,
      y + 1,
      path + "D"
    );
  }
}

function noOfPaths(Matrix, xDestination, yDestination, x, y) {
  if (xDestination == x && yDestination == y) {
    return 1;
  }
  let left =
    x + 1 < Matrix.length
      ? noOfPaths(Matrix, xDestination, yDestination, x + 1, y)
      : 0;
  let right =
    y + 1 < Matrix.length
      ? noOfPaths(Matrix, xDestination, yDestination, x, y + 1)
      : 0;

  let D =
    x + 1 < Matrix.length && y + 1 < Matrix.length
      ? noOfPaths(Matrix, xDestination, yDestination, x + 1, y + 1)
      : 0;

  return left + right + D;
}

function possiblePathAllDirection(
  Matrix,
  xDestination,
  yDestination,
  x,
  y,
  path = ""
) {
  const l = Matrix.length;
  if (x == xDestination && y == yDestination) {
    path = path + " -> ";
    process.stdout.write(path);
    return;
  }
  if (Matrix[x][y] == 0) return;
  Matrix[x][y] = 0;
  if (x + 1 < l && Matrix[x + 1][y] == 1)
    possiblePathAllDirection(
      Matrix,
      xDestination,
      yDestination,
      x + 1,
      y,
      path + "R"
    );
  if (y + 1 < l && Matrix[x][y + 1] == 1)
    possiblePathAllDirection(
      Matrix,
      xDestination,
      yDestination,
      x,
      y + 1,
      path + "D"
    );
  if (x - 1 > -1 && Matrix[x - 1][y] == 1)
    possiblePathAllDirection(
      Matrix,
      xDestination,
      yDestination,
      x - 1,
      y,
      path + "L"
    );
  if (y - 1 > -1 && Matrix[x][y - 1] == 1)
    possiblePathAllDirection(
      Matrix,
      xDestination,
      yDestination,
      x,
      y - 1,
      path + "U"
    );
  Matrix[x][y] = 1; // Back tracking
}
console.log("Path Not Using Back Tracking");
possiblePathOnlyUpAndDown(Matrix, 2, 2, 0, 0);
console.log("");
console.log("Path Using Back Tracking");
possiblePathAllDirection(Matrix, 2, 2, 0, 0);
