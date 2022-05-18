const keyMapping = {
  1: ["a", "b", "c"],
  2: ["d", "e", "f"],
  3: ["g", "h", "i"],
  4: ["j", "k", "l"]
};

function possibleCombinations(combination, keyMapping, l, ans = "") {
  if (ans.length == l) {
    return [ans];
  }
  const pressedKey = combination.split("");
  let result = [];
  for (let j = 0; j < keyMapping[pressedKey[0]].length; j++) {
    let unParsedKey = pressedKey.filter((item, index) => index != 0).join("");
    result = [
      ...result,
      ...possibleCombinations(
        unParsedKey,
        keyMapping,
        l,
        ans + keyMapping[pressedKey[0]][j]
      ),
    ];
  }
  return result;
}
const combination = "24";
console.log(possibleCombinations(combination, keyMapping, combination.length));
