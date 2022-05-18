function moveUpAndDown(x, y, memo = {}, path = "") {
  const key = x + "," + y;
  if (key in memo) {
    return memo[key];
  }
  if (x == 1 && y == 1) {
    return 1;
  }
  if (x == 0 || y == 0) return 0;
  memo[key] = {};
  memo[key] =
    moveUpAndDown(x - 1, y, memo, path + "D") +
    moveUpAndDown(x, y - 1, memo, path + "R");
  return memo[key];
}

console.log(moveUpAndDown(3, 3));
